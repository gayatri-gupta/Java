import java.sql.*;
import java.util.*;
class SqlConAd {
public static String tn;
public static void main(String[] args) {


  try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ak","root","root");

      Statement st = c.createStatement();
      boolean a=true;
      int flag=1;

      while(a){

        System.out.println("Enter 1 to create table,Enter 2 to insert data ,Enter 3 to update table,Enter 4 to display data and Enter 5 to exit");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();

      switch(n){
      case 1:
      if(flag==1){
        flag=0;
        System.out.println("Enter table name");
        Scanner sn = new Scanner(System.in);
        tn = sn.nextLine();
        st.executeUpdate("create table " +tn+ "(Name Varchar(12),Section Varchar(1),roll_no integer(12) primary key)");
        System.out.println("Table Created");
        }
        break;

      case 2:
      System.out.println("Enter Name , Section and roll_no");
      Scanner scn = new Scanner(System.in);
      String naam = scn.nextLine();
      String sect = scn.nextLine();
      int rool = scn.nextInt();
      st.executeUpdate("insert into " + tn +" values('"+naam+"','"+sect+"',"+rool+")");
      System.out.println("Values Inserted");
      break;

      case 3:
      System.out.println("Enter updated Section and roll no");
      Scanner sc = new Scanner(System.in);
      String secti = sc.nextLine();
      int roo = sc.nextInt();
      st.executeUpdate("update " + tn +" set section='"+secti+"' where roll_no ="+roo);
      System.out.println("Values Updated");
      break;

      case 4:
      ResultSet rs = st.executeQuery("Select * from "+ tn);
      while(rs.next()){
      System.out.println(rs.getString(1)+" "+ rs.getString(2)+ " "+ rs.getString(3));
      }
      break;

      case 5:
      System.out.println("Exit");
      a= false;
      c.close();
      break;
      }
    }
  }
    catch(Exception e)
    {
      System.out.println(e);
    }
      }
        }
