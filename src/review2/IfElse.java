package review2;

public class IfElse {
    public static void main(String[] args) {


        int age=18;

        if(age>=18){// only = because we are working on a operational
            //do not use relational operator (ex: =) when you are working with a String.
            //only use relational operator is for numeric code not for String
            //Use the word .equals()
            //Case sensitive inside the () for String
            System.out.println("You can get a DL");
        }else {
            System.out.println("You're too young to drive");
        }

        System.out.println("   ------------------   ");

        String expected="Best seller";

        if(expected.equals("Best Sellers")){
            System.out.println("Test Passes");
        }else {//else don't need a condition //if we need a condition //ex: else {code goes here} //ex: if(condition){code goes here}
            //else if(condition){code goes here}
            System.out.println("Test Fail");
        }

    }
}
