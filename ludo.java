public class ludo{
public static void main(String[] args){
int pos1=0;
int pos2=0;
System.out.println("Welcome to Snake and Ladder Game\nInitial position of Player1 is "+pos1+"\nInitial position of Player2 is "+pos2);
int diceRoll1=0;
int diceRoll2=0;

while(pos1!=100){
diceRoll1++;
int ladder=1;
while(ladder==1){
int diceNum =(int)Math.floor(Math.random()*10)%6+1;
int opt =(int)Math.floor(Math.random()*10)%3;
switch(opt){
case 0: ladder=0;break;
case 1: pos1=pos1+diceNum;break;
case 2: ladder=0;pos1=pos1-diceNum;break;
}
if (pos1<0)
{pos1=0;}
else if(pos1>100)
{pos1=pos1-diceNum;}}
}


while(pos2!=100){
diceRoll2++;
int lad=1;
while(lad==1){
int diceNum =(int)Math.floor(Math.random()*10)%6+1;
int opt =(int)Math.floor(Math.random()*10)%3;
switch(opt){
case 0: lad=0;break;
case 1: pos2=pos2+diceNum;break;
case 2: lad=0;pos2=pos2-diceNum;break;
}
if (pos2<0)
{pos2=0;}
else if(pos2>100)
{pos2=pos2-diceNum;}
}
}
if(diceRoll1>diceRoll2) System.out.println("Player 1 won");
else
System.out.println("Player2 Won");
}}