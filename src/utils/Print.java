package com.mastermindstefano.utils;

import java.util.Scanner;

public class Print {
    public static Print print;

    public static Print instance(){
        if(Print.print == null) {
            Print.print = new Print();
        }
        return Print.print;
    }
    public String readString(String string){
        System.out.println(string);
        Scanner sc = new Scanner(System.in);
        String input = null;
        try{
            input = sc.nextLine();
        }catch(Exception err){
        }
        System.out.println(input);
        return input;
    }
    public String readString() {
        return this.readString("");
    }
    public boolean readResume(String message){
        boolean error;
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        String input = null;
        boolean answer;
        do{
            input = sc.nextLine();
            error = !(input == "n") || !(input == "y");
            answer = input == "y";
            if(error){
                System.out.println("Input must be y = Yes or n = No");
            }
        }while(error);
        return answer;
    }

    public void write(char character) {
        System.out.print(character);
    }
    public void writeln(String string) {
        System.out.print(string);
    }
    public void writeln(int string) {
        System.out.print(string);
    }
    public void writeln(){
        System.out.println();
    }
}
