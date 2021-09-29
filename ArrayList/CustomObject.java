import java.util.Scanner;
import java.util.ArrayList;

    public class CustomObject{
    
         public void objects(){
         ArrayList<CustomObject> list=new ArrayList<>();
         CustomObject obj1=new CustomObject();
         CustomObject obj2=new CustomObject();
         list.add(obj1);
         list.add(obj2);
         System.out.println("arrayList:"+list);
         int length=list.size();
         System.out.println("size of list:"+length);
          
	}
	public static void main(String[] args){
	CustomObject call=new CustomObject();
	call.objects();
	
	   
	   }
	   
   } 
