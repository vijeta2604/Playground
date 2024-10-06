 class Person{
    private int age;
    private String name;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

}
public class Person_opps {
    public static void main(String[]args){
        String name;
        int age;
        Person p1=new Person("Vijeta",25);
        System.out.println(p1);
    }

}
