public class peration1 {

  public static void main(String[] args) {
    User user=getUser();

    if(user !=null){
      Address address=user.address;
      if(address !=null){
        String city=address.city;
        if(city !=null){
          System.out.println(city);
        }

      }
    }

  }



private static User getUser(){
  Address a=new Address();
  a.city="Delhi";

  User u = new User();
u.address = a;
return u;
}
}

class User{
  Address address;
}

class Address{
  String city;
}
