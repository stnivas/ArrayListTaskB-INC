import java.util.Scanner;
import java.util.ArrayList;

 public class CustomArrayList{
 	  Scanner input=new Scanner(System.in);
 	
     public  void  custom(){
        ArrayList<Object> list=new ArrayList<Object>();
 	  
 	  for(int run=0; run<2;run++){
 	     System.out.println("enter your number");
 	     int number=input.nextInt();
 	     list.add(number);
 	     }
 	   for(int run=0; run<3;run++){
 	    System.out.println("enter your name");
 	    String name =input.next();
 	    list.add(name);
 	     }
 	    CustomArrayList  obj1=new CustomArrayList();
 	    CustomArrayList obj2=new CustomArrayList();
 
 	     list.add(obj1);
             list.add(obj2);
             
             System.out.println("arraylist:"+list);
             int len=list.size();
             System.out.println("arraylist size"+len);
         }
    public static void main(String[] args){
       
                 CustomArrayList obj=new CustomArrayList();
                 obj.custom();
             
                }
                
             }
                 
            
    
