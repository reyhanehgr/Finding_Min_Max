/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finding_min_max;

import java.util.Scanner;

///Maximum and minimum of an array
public class Finding_Min_Max {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter a number:");
            arr[i]=scanner.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
            
        }
        System.out.println("min:"+min+" ,"+"max:"+max);
    }
}
