package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        Scanner a= new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int x=a.nextInt();
        Queue abc=new Queue(x);
        System.out.println("Insert alphabets that needs to be stored ");
        for (int j=0 ; j<x; j++){

            char z=a.next().charAt(0);
            System.out.print("storing "+ z);
            abc.put(z);
        }

        System.out.println("Getting alphabets");
        for(int k=0; k<x+1; k++){
            abc.get();

        }



    }
}
