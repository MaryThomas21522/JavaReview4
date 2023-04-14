package review2;

public class IfElseIf {
    public static void main(String[] args) {


        /*
        Create a world cup program.
        Year is 2022 host country
        If year is 2018
        If year is 2014
         */

        int worldCup=2010;//= is an assigning operator to a variable worldCup2022 //you change the value here to get a different print out
        //ex: worldCup=2018 will have the output of Host Country is Russia
        /*ex: worldCup=2010 will not print anything because there isn't a condition of 2010.
        It will only print if we added else block to say something like "No such data available"
                        else {"No such Data available"}
         */
        //do not use relational operator (ex: =) when you are working with a String.
        //only use relational operator is for numeric code not for String
        //Use the word .equals()
        //Case sensitive inside the () for String


        if(worldCup==2022){//if is always code in Boolean so = will not be valid //you will need equality ==
            System.out.println("Host Country is Qatar");
        } else if (worldCup==2018) {
            System.out.println("Host Country is Russia");
        } else if (worldCup==2014) {
            System.out.println("Host Country is Brazil");
        }else {
            System.out.println("Host Country is Unknown");
        }

    }
}
