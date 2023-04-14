package review3;

public class SwitchStatement {

    public static void main(String[] args) {

        String color="red"; //RED, REd, ReD, rED you can use the noted switch below

        switch (color) {//like if statement but cleaner

            //switch(color.toLowerCase(red)){}   //this means it will convert whatever written to lowercase
            //switch(color.toUpperCase()){}  //this mean it will convert whatever written to uppercase

            case"red":
                System.out.println("Stop");
                break;//key word for get out of block code
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
            default://this is like else code
                System.out.println("Unknown color, action is also unknown");
        }

    }
}
