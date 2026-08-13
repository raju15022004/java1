import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RecordFilter extends JFrame implements KeyListener {

    JLabel lid;
    JTextField tb;
    JTable ta;
    Connection cn;

    int columns;
    JScrollPane sp;
    DefaultTableModel model;

    public RecordFilter() {

        setSize(500, 400);
        setResizable(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lid = new JLabel("Enter ID/Phone");
        lid.setBounds(100, 50, 100, 27);
        add(lid);

        tb = new JTextField();
        tb.setBounds(210, 50, 150, 27);
        add(tb);

        tb.addKeyListener(this);

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            cn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/orclpdb",
                    "system",
                    "@$Raju@678"
            );

            PreparedStatement ps = cn.prepareStatement(
                    "select * from employee"
            );

            ResultSet rst = ps.executeQuery();

            ResultSetMetaData metaData = rst.getMetaData();

            columns = metaData.getColumnCount();

            model = new DefaultTableModel();

            for (int i = 1; i <= columns; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            ta = new JTable(model);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        sp = new JScrollPane(ta);
        sp.setBounds(50, 100, 400, 150);
        add(sp);

        setVisible(true);
    }

    public void clearTable() {
        model.setRowCount(0);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {

        String str = tb.getText();

        if (str.equals("")) {
            clearTable();
            return;
        }

        try {

            clearTable();

            PreparedStatement ps = cn.prepareStatement(
                    "select * from Employee where eid like ? or phone like ?"
            );

            ps.setString(1, "%" + str + "%");
            ps.setString(2, "%" + str + "%");

            ResultSet rst = ps.executeQuery();

            while (rst.next()) {

                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columns; i++) {
                    row.add(rst.getString(i));
                }

                model.addRow(row);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {

        new RecordFilter();
    }
}
