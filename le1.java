class Lakshya{
    int age;
    String name;
    
    int getage() {
        return this.age;
    }
    
    String getname(){
        return this.name;
    }
    void setName(String name)
    {
 
        this.name = name;
    }
    void setage(int age){
        this. age=age;
    }
}


public class Main
{
	public static void main(String[] args) {
		Lakshya obj=new Lakshya();
		obj.setage(21);
		obj.setName("Lakshya Pradhan");
		
		System.out.println(obj.getname()+" "+obj.getage());
	}
}

