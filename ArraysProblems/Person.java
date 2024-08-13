package ArraysProblems;

// Java Program to demonstrate
// Java Encapsulation

// Person Class
class Person {
    // Encapsulating the name and age
    // only approachable and used using
    // methods defined

    private int age=8;
    public void increaseage(int a){
        System.out.println(a);
        a+=1;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.increaseage(p.age);
        System.out.println("after increment"+p.age);

    }
}

// Driver Class
