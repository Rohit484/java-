/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHIT PANDEY
 */
public class codeforces {

 char suit;
 char rank;

public codeforces(char r, char s)
{
rank = r;
suit = s;
}
public void menu()

{

}

public void display(codeforces C1)
{
char suit = getSuit(C1);
char rank = getRank(C1);
String suitName = "";
String rankName = "";

if (suit == 'S')
suitName = "Spade";

else if (suit == 'H')
suitName = "Hearts";

else if (suit == 'C')
suitName = "Clubs";

else if (suit == 'D')
suitName = "Diamonds";

if (rank == 'A')
rankName = "Ace";

else if (rank == '2')
rankName = "Two";

else if (rank == '3')
rankName = "Three";

else if (rank == '4')
rankName = "Four";

else if (rank == '5')
rankName = "Five";

else if (rank == '6')
rankName = "Six";

else if (rank == '7')
rankName = "Seven";

else if (rank == '8')
rankName = "Eight";

else if (rank == '9')
rankName = "Nine";

else if (rank == '1')
rankName = "Ten";

else if (rank == 'J')
rankName = "Jack";

else if (rank == 'Q')
rankName = "Queen";

else if (rank == 'K')
rankName = "King";

System.out.println(rankName + " of " + suitName);
}

//This method gives the value of a card
public int getValue(codeforces C1)
{
int value = 0;

if (C1.rank == 'A')
value = 1;

else if (C1.rank == '2')
value = 2;

else if (C1.rank == '3')
value = 3;

else if (C1.rank == '4')
value = 4;

else if (C1.rank == '5')
value = 5;

else if (C1.rank == '6')
value = 6;

else if (C1.rank == '7')
value = 7;

else if (C1.rank == '8')
value = 8;

else if (C1.rank == '9')
value = 9;

else if (C1.rank == '1')
value = 10;

else if (C1.rank == 'J')
value = 10;

else if (C1.rank == 'Q')
value = 10;

else if (C1.rank == 'K')
value = 10;

return value;
}

//This method gives the rank of a card
public char getRank(codeforces C1)
{
return C1.rank;
}

//This method gives the suit of a card
public char getSuit(codeforces C1)
{
return C1.suit;
}
}
