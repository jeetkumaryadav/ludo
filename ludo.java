public class ludo{
public static void main(String[] args){
int pos=0;
System.out.println("Welcome to Snake and Ladder Game\nYour initial position is "+pos);
int diceNum =(int)Math.floor(Math.random()*10)%6+1;
System.out.println("Dice Number: "+diceNum);
<<<<<<< HEAD
=======
int opt =(int)Math.floor(Math.random()*10)%3;
switch(opt){
case 0: System.out.println("No play");break;
case 1: System.out.println("Move ahead");pos=pos+diceNum;break;
case 2: System.out.println("Move back");pos=pos-diceNum;break;
}

>>>>>>> UC3
}}
