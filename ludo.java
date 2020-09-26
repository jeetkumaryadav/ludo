public class ludo{
public static void main(String[] args){
int pos=0;
System.out.println("Welcome to Snake and Ladder Game\nYour initial position is "+pos);
int diceRoll=0;
while(pos!=100){
diceRoll++;
int diceNum =(int)Math.floor(Math.random()*10)%6+1;
System.out.println("Dice Number: "+diceNum);
int opt =(int)Math.floor(Math.random()*10)%3;
switch(opt){
case 0: System.out.println("No play");break;
case 1: System.out.println("Move ahead");pos=pos+diceNum;break;
case 2: System.out.println("Move back");pos=pos-diceNum;break;
}
if (pos<0)
{pos=0;}
else if(pos>100)
{pos=pos-diceNum;}
System.out.println("Current Position: "+pos);
}
System.out.println("Dice was Rolled : "+diceRoll+" times to win the game");
}}
