package review2;

public class IfStatement {
    public static void main(String[] args) {

        int age=17;

        if(age>=18){
            System.out.println("You can get driver license");
        }

        String day="Thursday";

        if (day.equals("Thursday")){//Whenever you are using String (something I have to type) I must use
            //do not use relational operator (ex: =) when you are working with a String.
            //only use relational operator is for numeric code not for String
            //Use the word .equals()
            //Case sensitive inside the () for String
            System.out.println("Today I have Review Class at Syntax");
        }
    }

}
