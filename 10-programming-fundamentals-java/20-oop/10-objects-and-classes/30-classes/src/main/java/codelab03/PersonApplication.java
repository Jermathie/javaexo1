package codelab03;

public class PersonApplication {

    public static void main(String[] args) {
        Person myPersonWithAge10 =  new Person(10);
        Person myPersonWithAge12 =  new Person(12);
        Person myPersonWithAge13 =  new Person(13);
        Person myPersonWithAge17 =  new Person(17);
        Person myPersonWithAge18 =  new Person(18);

        System.out.println(myPersonWithAge10.calculateAllowance());
        System.out.println(myPersonWithAge12.calculateAllowance());
        System.out.println(myPersonWithAge13.calculateAllowance());
        System.out.println(myPersonWithAge17.calculateAllowance());
        System.out.println(myPersonWithAge18.calculateAllowance());
    }


}
