package src;

public class Person {

    private String name;
    private int age;
    private String gender;
    String[] interest;

     Person(String name, int age,String gender,String[] interest) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }

    public String hello() {
        String results = " ";
        for (String a : interest) {

            if (a == interest[interest.length - 1]) {
                results += "and " + a;

            }
            else if(a==interest[interest.length -2]){
                results += a+ " ";

            } else {
                results += a + ", ";
            }
        }
    return "Hello " + "my name is " + name + " and " + "I am " + age + " years old" + ". " + "My interests are"+results;
    }


}














