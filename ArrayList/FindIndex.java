import java.util.Scanner;
import java.util.ArrayList;

public class FindIndex{
  Scanner input=new Scanner(System.in);
  
   	public void calculate(){
   	 ArrayList<String> list=new ArrayList<String>();
   	 for(int run=0; run<4; run++){
   	 System.out.println("enter the name");
   	 String name=input.next();
   	 list.add(name);
   	 }
   	 
   	list.indexOf("nivas");
   	System.out.println("arrayList:"+list);
   	int len = list.size();
   	System.out.println("arrayList size:"+len);
   	System.out.println(list.indexOf("nivas"));
   	 }
   	 public static void main(String[] args){
   	  
   	 FindIndex obj=new FindIndex();
   	 obj.calculate();
   	 }
   	 }
   	 
