import java.util.ArrayList;

public class TestTwo {

   /* public static void main(String[] args) {
    	TestOne obj = new TestOne();
    	obj.s = "It's modified!";
        System.out.println(obj.s);

    }*/

	   public static void main(String[] args) {
	       ArrayList names = new ArrayList<String>();
	       names.add("John");
	       names.add("John");
	       names.add("Roman");
	       names.add(5);
	       
	       int ss;
	       
	        for(int i = 0; i < args.length; i++) {
	            System.out.println(args[i]);
	        }	       
	        
	        System.out.println(args.length);
	        //System.out.println(ss);
	   }	
}
