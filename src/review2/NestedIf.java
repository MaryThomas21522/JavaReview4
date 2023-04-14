package review2;

public class NestedIf {
    public static void main(String[] args) {

        /*
        Declare 2 variables for DL and a Car
        If you have DL then I will check if you have a car

         */

        boolean driverLicense=false;
        boolean car=true;

        if(driverLicense){//outer if
            System.out.println("Let's check if you have a car");

            if(car){//Nested if //Nested if is depended on the outer if
                System.out.println("You can drive to work");

            }else{//can have an else inside a Nested if
                System.out.println("You will need to take a bus or uber");
            }

        }else {//this is the else aka:false for the outer if
            System.out.println("You should get a DL");
        }

    }
}
