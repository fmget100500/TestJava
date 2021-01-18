import java.util.Scanner;

public class TestOne {
	
	//System.out.println("Конструктор");
	
	//static String name = "tesnName";
    protected String s = "Hello World!";

	static String name;
	
	//name = "tesnName";
	
	public TestOne(){
		
		System.out.println("Конструктор");
		//this.name= "2222tesnName";
	}
	
    public void print() {
        System.out.println(name);
    }
    
    public static void reNameName(String strD) {
    	name = strD;
        System.out.println(name);
    }    
	
    public static void main(String[] args) {
    	int num1 = 355;
    	int num2 = 455;
    	if(num1 > 100 && num2 > 500){
    		System.out.println("Пример работы с типом byte");
    	}
    	
    	TestOne TestOneDD = new TestOne();
    	//TestOneDD.print();
    	//TestOneDD.reNameName("HHajshajsh");
    	TestOneDD.name = "ddd85";
    	
    	
    	TestOne TestTwo = new TestOne();
    	TestTwo.name = "ddd99";
    	
    	System.out.println(TestOneDD.name);
    	System.out.println(TestTwo.name);    
    	
    	TestOne.reNameName("");
    	TestTwo.reNameName("");
    	
    }
    
    
    //TestOneDD
	/*
    public static void main(String[] args) {
        System.out.println("Пример работы с типом byte");
        byte a = 47;
        byte b = (byte) ~a;
        System.out.println(b);
 
        System.out.println("Пример работы с типом short");
        short c = 350;
        short d = (short) ~c;
        System.out.println(d);
 
        System.out.println("Пример работы с типом int");
        int e = 555555555;
        int f = ~e;
        System.out.println(f);
 
        System.out.println("Пример работы с типом long");
        long g = 111112222233333L;
        long h = ~g;
        System.out.println(h);
    }*/
	/*public static void main(String[] args) {
        int[] array = {51,136,387};

        for (int i:array) {
        System.out.println(i);
        }
	}*/

	/*public static void main(String[] args) {
		 
		float num = 5.25f;
 
		System.out.println(Math.round(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.ceil(num));
	}	*/
	/*public static void main(String[] args){
		double a = 20 + Math.random()*40;
		
		System.out.println(a);
	}*/	
	
	   /*public static void main(String[] args) {

	       Scanner sc = new Scanner(System.in);
	       System.out.println("Введите число:");

	       int number = sc.nextInt();

	       System.out.println("Спасибо! Вы ввели число " + number);

	   }*/

}
