package org.thecodevillage.intro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elkibet on 9/23/2017.
 */
public class MyCollections {
    //hashmap
    //List
    //Array
    //ArrayList
    //LinkedList


    public static void main(String[] args){
        int marks[] = new int[10];
        marks[0] = 40;
        marks[1] = 60;
       marks[2] = 70;
        marks[3] = 90;
        marks[4] = 90;
        marks[5] = 90;
        marks[6] = 90;
        marks[7] = 90;
        marks[8] = 90;
        marks[9] = 90;

        int sum=0;

        int arrayLength = marks.length;

        System.out.println("$$"+arrayLength);

        for (int count=0; count < marks.length; count++){
            System.out.println("Item "+count+"\t Value: "+marks[count]);
//            sum = sum+marks[count];
            sum += marks[count];
            //sum-=marks[count]
            System.out.println("Sum:: "+sum);
        }

        int counter = 0;
        while(counter < marks.length){
            System.out.println("Marks##"+marks[counter]);
            counter++;
//            if (marks[counter] > 70)
//                System.out.println("Excellent!!");
        }

        //do while
        int i =11;
        do{
            if (i > marks.length){
                System.out.println("That Position does not exist!!");
                System.out.println("Haiko");
            } else {
                System.out.println("Marks Do While##"+marks[i]);
                i++;
            }

        } while (i < marks.length);


        /**
         * Lists
         */
        String grade="D";


        switch (grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Good");
                break;
            default:
                System.out.println("Unknown Grade");

        }

        if(grade.equalsIgnoreCase("A"))
            System.out.println("Excellent");
        else if (grade.equals("B"))
            System.out.println("Good");


        /**
         * List
         */
        List<Integer> myList=new ArrayList<>();
        myList.add(50);
        myList.add(65);
        myList.add(30);
        myList.add(77);
        myList.add(90);

        System.out.println("MyList##"+myList.get(0));
        System.out.println("MyList##"+myList.size());


        for(Integer yourVar: myList){
            System.out.println("MyList##"+yourVar);
        }

        for (int z=0; z < myList.size(); z++){
            System.out.println("MyList ODD/EVEN##"+myList.get(z));
            if(myList.get(z)%2==0)
                System.out.println("Even No##"+myList.get(z));

            if(myList.get(z)%2!=0)
                System.out.println("ODD No##"+myList.get(z));
        }

        int[] test = {3,4,5};

        Car toyota=new Car();
        toyota.setName("Ractis");
        toyota.setColor("Red");


        Car vitz=new Car();
        vitz.setName("Vitz");
        vitz.setColor("Orange");

        Car subaru=new Car();
        subaru.setName("Forester");
        subaru.setColor("Green");

        List<Car> myCars=new ArrayList<>();
        myCars.add(toyota);
        myCars.add(vitz);
        myCars.add(subaru);

        for(Car myCar: myCars){
            System.out.println("Name:" + myCar.getName()+"\tColor: " +myCar.getColor());
        }






    }
}
