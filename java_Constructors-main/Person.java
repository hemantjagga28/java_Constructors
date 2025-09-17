package constructor;

public class Person {
    private String name;
    private int age;
    private String height;

    Person(String name,int age,String height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    Person( Person obj2){
        this.name=obj2.name;
        this.age=obj2.age;
        this.height=obj2.height;
    }
    public void display(){
         System.out.println("The details of the person is:"+name+" age is :"+age+" height is:"+height);
    }
    public static void main(String[] args) {
        Person obj2= new Person("ajay", 21, "5'11");
        Person obj3= new Person(obj2);
        obj3.display();
    }


}
