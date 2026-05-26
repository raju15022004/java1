class vaimethod{
  int x=get();
  int get(){
    System.out.println(x);
    return 20;
  }
  vaimethod(){
    System.out.println(x);
    }
    public static void main(String[] args){
      new vaimethod();
    }
  }

