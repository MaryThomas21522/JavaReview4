package review3;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(" ---------LOGICAL AND -----------");

        boolean loginButtonDisplayed=true;
        boolean loginClickable=true;

        //Logical AND
        if(loginButtonDisplayed && loginClickable){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        System.out.println(" ---------LOGICAL OR -----------");

        boolean pictureDisplayed=true;
        String accountName="Syntax";

        if(pictureDisplayed   ||   accountName.equals("Syntax")){
            System.out.println("Login was successful");
        }else {
            System.out.println("User was not able to login");
        }


        System.out.println(" ---------LOGICAL NOT -----------");
        boolean hungry=!true;
        System.out.println(hungry);//Output: false

        boolean cold=false;
        System.out.println(!cold);//Output: true

        String str="Hello";

        if(!str.equals("Hello")){// ! means when is NOT going to say hello
            System.out.println("Value of the string is NOT hello");
            //Output: no output
        }


        String str1="Bye";

        if(!str1.equals("Hello")){// ! means when is NOT going to say hello
            System.out.println("Value of the string is NOT hello");
            //Output: Value of the string is NOT hello
        }

        boolean confirmSelected=false;

        if(!confirmSelected){
            System.out.println("Let's click on confirm checkbox");
        }
        System.out.println("Click on Pay button");
    }
}
