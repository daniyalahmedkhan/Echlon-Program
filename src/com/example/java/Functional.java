package com.example.java;

import java.util.Scanner;

/**
 * Created by Kashif on 10/17/2017.
 */
public class Functional {

    double factor;
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


        for(int i =0; i<row; i++){

            double divider = Matrix[i][i];

            for (int j =0; j<column; j++){

                Matrix[i][j] = (Matrix[i][j] / divider);
            }

          for (int k = i+1; k< row; k++){


              factor = Matrix[k][i];


              for(int j=0;j<column;j++) /* Loop to subtract each element of row from multiple of its first element and row above */
              {
                  Matrix[k][j] = Matrix[k][j] - (Matrix[i][j] * factor);
              }
              //Matrix[k][i]   =  Matrix[k][i]  -  ( Matrix[k][i] * Matrix[i][k-1]);



          }


        }

        for(int i=3;i>=0;i--)		/* Loop for rows */
        {
            for(int k=i-1;k>=0;k--)	/* Loop for remaining row below current row to make elements zero  */
            {
                factor = Matrix[k][i];
                for(int j=0;j<5;j++) /* Loop to subtract each element of row from multiple of its first element and row above */
                {
                    Matrix[k][j] = Matrix[k][j] - (Matrix[i][j] * factor);
                }

            }
        }


        for (int i =0; i<row; i++ ){

                for(int j=0; j<column; j++){

                    System.out.print(Matrix[i][j] + "\t\t");
                }
            System.out.println("");
            }


//        if (!(Matrix[0][0] == 1)){
//
//
//            for (int i =0; i<1; i++ ){
//
//                for(int j=0; j<column; j++){
//                    final double divider;
//                    divider = Matrix[i][j];
//
//
//                    Matrix[i][j] = ( Matrix[i][j] / divider );
//
//                    System.out.println(Matrix[i][j]);
//                }
//
//            }

//        }else {
//
//
//            for (int i=0; i<1; i++){
//
//                for (int j=0; j<5; j++){
//
//
//
//                    Matrix[i+1][j]  =    Matrix[i+1][j]- (Matrix[1][0] * Matrix[i][j]);
//
//                }
//
//            }

      //  }


    }

}

// Change hardcoded loop to row and column so it will work for all echelon
// Check last else condition for R2