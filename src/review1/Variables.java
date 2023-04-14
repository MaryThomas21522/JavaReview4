package review1;

public class Variables {

    public static void main(String[] args) {

        /*
        Variables Syntax
        dataType name;
         */
        //declare a variable and initialize it
        //Java reads statement from top to down and then left to right
        String name="Zak";

        String lastName; //this is called declaration and only happens once no duplicates
        lastName="Smith";//initialize or assign the value;

        int age;//declare a variable here; we declared a box
        age=21;//we initialize/assigned a value here
        age=22;//we reassigned or update a value here

        System.out.println(age);//output will read the update variable

        String street, city, state;//I can declare three variable
        street="123";
        city="Dream City";
        state="Wonderful State";
        state="Different State";

        System.out.println(state);


    }
}
