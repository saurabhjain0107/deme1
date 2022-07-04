package com.bridgelabz.basics.deme1;

public class Sumzero {
public static void main(String[] args) {
            int[] arr  = {3, -1, -7, -4, -5, 9, 10};


            for (int i = 0; i< arr.length-2 ; i++) {
                int a = arr[i];
                for (int j = i + 1; j<arr.length-1; j++) {
                    int b = arr[j];
                    for (int k = j + 1; k < arr.length; k++) {
                        int c = arr[k];
                        int sum = a + b + c;
                        if (sum == 0) {
                            System.out.println(arr[i] + "," +arr[j]+  "," +arr[k]);

                        }

                    }
                }

            }
        }
    }

