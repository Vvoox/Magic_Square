package com.example.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello , this program show the Magic Square , that give as sum of every lines of column or diago number 15 \n");
    int biblo[]=new int[]{1,2,3,4,5,6,7,8,9};

    System.out.println("\t   |   "+biblo[1]+"   |   "+biblo[8]+"   |   "+biblo[3]+"  |  =>  "+15);
    System.out.println("\t   |   "+biblo[6]+"   |   "+biblo[4]+"   |   "+biblo[2]+"  |  =>  "+15);
    System.out.println("\t   |   "+biblo[5]+"   |   "+biblo[0]+"   |   "+biblo[7]+"  |  =>  "+15);
    System.out.println("\t  //   ||      ||     ||  \\\\       ");
    System.out.println("\t "+15+"     "+15+"      "+15+"     "+15+"    "+15+"          ");

    }
}
