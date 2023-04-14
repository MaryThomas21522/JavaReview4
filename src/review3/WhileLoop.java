package review3;

public class WhileLoop {
    public static void main(String[] args) {

        int time=9;


        while(time>7){
            System.out.println("Hi");
            time --;//- - means will decrease the time variable by one until it is not greater than 7
        }
        System.out.println("Value of time= "+time);//Output: Hi Hi Value of time=7
    }
}
