import java.util.Scanner;
import java.util.Random;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  
import java.util.Calendar;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("            ------------------------------------");
	    System.out.println("           * WELCOME TO MOBILE REPAIRING CENTER *");
            System.out.println("      ------------------------------------");
	    mobile m = new mobile();
	    System.out.println("Please select your type of service :\n1.REQUEST SERVICE\n2.TOKEN NUMBER\n3.UPDATE\n4.REPORT\n0.EXIT\n");
         
         Scanner s = new Scanner(System.in);
         int choice = s.nextInt();
         if(choice==1)
         {
	    m.request();
         }
        else if(choice==2)
         {
	    m.token();
         }
        else if(choice==3)
         {
	    m.cost();
         }
        else if(choice==4)
        {
        m.request();
        m.cost();
	    m.report();
        }
        else
        {
            System.out.println("Thank you and visit again");
        }
	}
}

class mobile{
    String name,date;
    String phone,email,cost;
    String mob,model,issue;
    ArrayList<String> arr=new ArrayList<String>();
    
void request(){
    Scanner sc = new Scanner(System.in);
    System.out.println("REQUEST SERVICE");
    System.out.println("Enter name:");
    name = sc.nextLine();
    System.out.println("Enter phone number:");
    phone = sc.nextLine();
    System.out.println("Enter Email Id:");
    email = sc.nextLine();
    System.out.println("MOBILE DETAILS");
    System.out.println("Enter mobile name:");
    mob = sc.nextLine();
    System.out.println("Enter model type:");
    model = sc.nextLine();
    System.out.println("Issue:");
    issue = sc.nextLine();
    System.out.println("In Date:");
    date=sc.nextLine();
}
	        
void token(){
    Random objGenerator = new Random();
    for (int iCount = 1; iCount<=1; iCount++){
    int randomNumber = objGenerator.nextInt(100);
    System.out.println("_____________________");
    System.out.println("Your Token Number is: "+randomNumber);
    System.out.println("_____________________");
    }
}

void cost(){
   Scanner sc = new Scanner(System.in);
   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
   Calendar c=Calendar.getInstance();
   String strDate,issues;
   System.out.println("CHOOSE THE SERVICE");
   System.out.println("WHAT'S THE ISSUE?");
   System.out.println("\n1-Display \n2-Battery problem \n3-Storage Issue \n4-Phone crashing  \n5-Camera malfunction  \n6-speaker problem \n7-hardware issues \n8-Other issues");
   System.out.println("Enter your choice");
   int choice=sc.nextInt();
    switch(choice)
    {
        case 1:
            System.out.println("You have chosen Display issue");
            c.setTime(new Date());
            c.add(Calendar.DATE,2);
            strDate = formatter.format(c.getTime());  
            cost="Rs.5000/-";
            System.out.println("Total cost: "+cost);
            arr.add(strDate);
            arr.add(cost);
            break;
           
        case 2:
            System.out.println("You have chosen Battery problem");
            c.setTime(new Date());
            c.add(Calendar.DATE,5);
            strDate = formatter.format(c.getTime());  
            cost="Rs.2500/-";
            System.out.println("Total cost: "+cost);
            arr.add(strDate);
            arr.add(cost);
            break;
           
        case 3:
            System.out.println("You have chosen Storage Issue");
            c.setTime(new Date());
            c.add(Calendar.DATE,3);
            strDate = formatter.format(c.getTime());  
            cost = "RS.1000/-";
            System.out.println("Total cost: "+cost);
            arr.add(strDate);
            arr.add(cost);
            break;
           
        case 4:
            System.out.println("You have chosen phone crashing");
            c.setTime(new Date());
            c.add(Calendar.DATE,7);
            strDate = formatter.format(c.getTime());  
            cost= "RS.3000/-";
            System.out.println("Total cost: "+cost);
            arr.add(strDate);
            arr.add(cost);
            break;
           
        case 5:
            System.out.println("You have chosen Camera malfunction");
            c.setTime(new Date());
            c.add(Calendar.DATE,8);
            strDate = formatter.format(c.getTime());  
            cost= "RS.3500/-";
            System.out.println("Total cost: "+cost);
            arr.add(strDate);
            arr.add(cost);
            break;
           
        case 6:
            System.out.println("You have chosen speaker problem ");
            c.setTime(new Date());
            c.add(Calendar.DATE,4);
            strDate = formatter.format(c.getTime());  
            cost= "RS.1500/-";
            System.out.println("Total cost: "+cost);
            arr.add(strDate);
            arr.add(cost);
            break;
           
        case 7:
            System.out.println("You have chosen hardware issues");
            c.setTime(new Date());
            c.add(Calendar.DATE,6);
            strDate = formatter.format(c.getTime());  
            cost= "RS.2000/-";
            System.out.println("Total cost: "+cost);
            arr.add(strDate);
            arr.add(cost);
            break;
        case 8:
            System.out.println("Please enter your issue:");
            Scanner s = new Scanner(System.in);
            issues=s.nextLine();
            c.setTime(new Date());
            c.add(Calendar.DATE,10);
            strDate = formatter.format(c.getTime());  
            cost= "Cost will be updated soon";
            System.out.println(cost);
            arr.add(strDate);
            arr.add(cost);
            break;
    }
    
    }
	    void report(){
	    System.out.println("-----------------");
	    System.out.println("      REPORT    ");
	    System.out.println("-----------------");
	    System.out.println("Customer name: "+name);
	    System.out.println("Customer phone number: "+phone);
	    System.out.println("Customer Email Id: "+email);
	    System.out.println("Mobile name: "+mob);
	    System.out.println("Model type: "+model);
	    System.out.println("Description of issue: "+issue);
	    System.out.println("In Date: "+date);
	    System.out.println("Out date: "+arr.get(0));
	    System.out.println("Total cost: "+arr.get(1));
	    System.out.println("            *Thank you and visit again*           ");
	    }
	}
