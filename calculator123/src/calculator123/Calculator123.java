/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator123;

import java.util.Scanner;

/**
 *
 * @author HABIB UR REHMAN
 */
public class Calculator123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:Tufail Zaman\n:Roll No:201166\n(3rd)Semester\nSection(B)\n"
                + "Submitted To:Irshad Sir;");

System.out.print("Please enter your first number: ");
double a = sc.nextInt();

System.out.print("Please enter your second number: ");
double b = sc.nextInt();

// random error fix
sc.nextLine();

// initialize the result variable "c"
double c = 0;

System.out.print("Please enter your function: ");
String func = sc.nextLine();

switch (func) {
// text function is add, subtract ...

default:
System.out.println("The function you have entered has been misspelled or has not yet been implemented!");

case "help":
System.out.println("Functions avaliable: +, -, *, /, ^, sin, cos, tan, mod(%),(WIP)");
break;
case "add":
c = a + b;
break;

case "subtract":
c = a - b;
break;

case "multiply":
c = a * b;
break;

case "divide":
c = a / b;
break;

// same as above except with symbols
case "+":
c = a + b;
break;

case "-":
c = a - b;
break; 

case "*":
c = a * b;
break;

case "/":
c = a / b;
break;

case "sin":
System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
String sinChoice = sc.next();

if (sinChoice.equals("a")) {
a = Math.toRadians(a);
c = Math.sin(a);
}

if (sinChoice.equals("b")) {
b = Math.toRadians(b);
c = Math.sin(b);
}

break;

case "cos":
System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
String cosChoice = sc.next();

if (cosChoice.equals("a")) {
a = Math.toRadians(a);
c = Math.cos(a);
}

if (cosChoice.equals("b")) {
b = Math.toRadians(b);
c = Math.cos(b);
}

break;

case "tan":
System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
String tanChoice = sc.next();

if (tanChoice.equals("a")) {
a = Math.toRadians(a);
c = Math.tan(a);
}

if (tanChoice.equals("b")) {
b = Math.toRadians(b);
c = Math.tan(b);
}
 
break;

case "sqrt":
System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
String sqrtChoice = sc.next();

if (sqrtChoice.equals("a")){
c = Math.sqrt(a);
}
if (sqrtChoice.equals("b")){
c = Math.sqrt(b);
}
break;

case "^":
System.out.print("(a) "+ a + "^" + b + ", or (b) " + b + "^" + a + "? ");
String powerChoice = sc.next();
if (powerChoice.equals("a")){
c = Math.pow(a, b);
}
if (powerChoice.equals("b")){
c = Math.pow(b, a);


}
break;
case "%":
System.out.print("(a) "+ a + "%" + b + ", or (b) " + b + "%" + a + "? ");
String modSymbolChoice = sc.next();
if (modSymbolChoice.equals("a")){
c = a % b;
}
if (modSymbolChoice.equals("b")){
c = b % a;
}
break;

case "mod":
System.out.print("(a) "+ a + " mod " + b + ", or (b) " + b + " mod " + a + "? ");
String modChoice = sc.next();
if (modChoice.equals("a")){
c = a % b;
}
if (modChoice.equals("b")){
c = b % a;
}
break;

}

// TODO for more functions!
System.out.println("Answer: " + c);

}
        // TODO code application logic here
    }
    

