package com.example.java;

import java.util.Scanner;

/**
 * Created by Kashif on 10/17/2017.
 */
public class Functional {

    int row , column;
    public void RowInput(){

        System.out.println("Enter Num of rows");
        Scanner input = new Scanner(System.in);

        do {

            while (!input.hasNextInt()){


                System.out.println("Invalid Input try again");
                input.next();


        }
        row = input.nextInt();
    //    input.close();


        if ((row <=0))
        {

            System.out.println("Please Enter Positive");

        }


       }while ((row <=0)) ;

    }

    public void ColumnInput(){


        System.out.println("Enter Num of column");
        Scanner input = new Scanner(System.in);

        do {


            while (!input.hasNextInt()){

                System.out.println("Invalid Input try again");
                input.next();


            }
            column = input.nextInt();
            //    input.close();


            if ((column <=0))
            {

                System.out.println("Please Enter Positive");

            }


        }while ((column <=0)) ;
       // input.close();

    }





    public void MatrixInput(){

        double[][] Matrix = new double[row][column];
        Scanner input = new Scanner(System.in);

        for (int i=0; i<row; i++){

            for (int j = 0; j<column; j++){

                System.out.println("Enter for Matrix" + "["+i+"]" + "["+j+"]");

                    Matrix[i][j]  = input.nextDouble();


            }
        }


    }

}
