
/*
This is a text based tic-tac-toe 2-player game.
The first turn is for X.
The coordinates for the tic-tac-toe is as follows:
---------------------
| (1 3) (2 3) (3 3) |
| (1 2) (2 2) (3 2) |
| (1 1) (2 1) (3 1) |
---------------------
Enter the coordinates as per the table given above.
For example, 1 1 or 2 3.
If any other format is used, you will be prompted to enter the coordinates again.
Enjoy the game!
 */


import java.util.Scanner;
import java.util.Arrays;
public class tic_tac_toe_pvp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("This is a two player game." );
        System.out.println ("The first turn is for X." );
        System.out.println ("The coordinates for the tic-tac-toe is as follows:");
        System.out.println("---------------------");
        System.out.println ("| (1 3) (2 3) (3 3) |");
        System.out.println ("| (1 2) (2 2) (3 2) |");
        System.out.println ("| (1 1) (2 1) (3 1) |");
        System.out.println("---------------------");

        char[][] xo_ = new char[3][3];
        int n = 1;
        Boolean _present = false;
        int numX = 0;
        int numO = 0;
        int num_ = 9;
        int x= 0;
        int y =0;
        int x1= 0;
        int y1 =0;
        Boolean repeat = true;
        Boolean xInARow = false;
        Boolean oInARow = false;
        Boolean finalRepeat = true;
        int numdiff = 0;
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){

                xo_[i][j] = '_';

            }
        }
        System.out.println("---------");
        System.out.println("| "+xo_[0][0]+" "+xo_[0][1]+" "+xo_[0][2]+" |");
        System.out.println("| "+xo_[1][0]+" "+xo_[1][1]+" "+xo_[1][2]+" |");
        System.out.println("| "+xo_[2][0]+" "+xo_[2][1]+" "+xo_[2][2]+" |");
        System.out.println("---------");
        //inputting for 1st time

        String inp = "input.nextLine ()";
        while(finalRepeat) {
            //loop start
            //checking
            repeat = true;
            while (repeat) {
                System.out.println("Enter the coordinates as per the table given above: ");
                System.out.println ("For example, 1 1 or 2 3." );
                inp = "input.nextLine ()";
                inp = input.nextLine();
                //checking whether num or not
                for (int u = 0; u < inp.length(); u++) {
                    while (!(Character.isDigit(inp.charAt(u)))) {
                        if (inp.charAt(u) != ' ') {
                            System.out.println("You should enter numbers!");
                            System.out.println("Enter the coordinates: ");
                            inp = input.nextLine();
                            break;
                        }
                        break;
                    }
                }
                x = Integer.parseInt(String.valueOf(inp.charAt(0)));
                y = Integer.parseInt(String.valueOf(inp.charAt(2)));
                //checking whether greater than 3 or not
                //System.out.println(x+" "+y);
                if (x > 3 || y > 3) {
                    continue;
                }
                //changing co-ordinates
                if (x == 1 && y == 3) {
                    x = 0;
                    y = 0;
                } else if (x == 1 && y == 2) {
                    x = 1;
                    y = 0;
                } else if (x == 1 && y == 1) {
                    x = 2;
                    y = 0;
                } else if (x == 2 && y == 3) {
                    x = 0;
                    y = 1;
                } else if (x == 2 && y == 2) {
                    x = 1;
                    y = 1;
                } else if (x == 2 && y == 1) {
                    x = 2;
                    y = 1;
                } else if (x == 3 && y == 2) {
                    x = 1;
                    y = 2;
                } else if (x == 3 && y == 3) {
                    x = 0;
                    y = 2;
                } else if (x == 3 && y == 1) {
                    x = 2;
                    y = 2;
                }

                //checking whether occupied or not
                if (xo_[x][y] == '_') {
                    if (n % 2 != 0) {
                        xo_[x][y] = 'X';
                        numX++;
                        num_--;
                    }

                    //System.out.println("nnot oxcc");
                    else if(n%2 == 0) {
                        xo_[x][y] = 'O';
                        numO++;
                        num_--;
                    }
                    repeat = false;
                }

                else {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }

            }



            //finally printing
            System.out.println("---------");
            System.out.println("| " + xo_[0][0] + " " + xo_[0][1] + " " + xo_[0][2] + " |");
            System.out.println("| " + xo_[1][0] + " " + xo_[1][1] + " " + xo_[1][2] + " |");
            System.out.println("| " + xo_[2][0] + " " + xo_[2][1] + " " + xo_[2][2] + " |");
            System.out.println("---------");
            //System.out.println (x+" "+y );
            //check ending and printing
            n++;

            if (xo_[0][0] == 'X' && xo_[0][1] == 'X' && xo_[0][2] == 'X') {
                xInARow = true;
            } else if (xo_[1][0] == 'X' && xo_[1][1] == 'X' && xo_[1][2] == 'X') {
                xInARow = true;
            } else if (xo_[2][0] == 'X' && xo_[2][1] == 'X' && xo_[2][2] == 'X') {
                xInARow = true;
            } else if (xo_[0][0] == 'X' && xo_[1][0] == 'X' && xo_[2][0] == 'X') {
                xInARow = true;
            } else if (xo_[0][1] == 'X' && xo_[1][1] == 'X' && xo_[2][1] == 'X') {
                xInARow = true;
            } else if (xo_[0][2] == 'X' && xo_[1][2] == 'X' && xo_[2][2] == 'X') {
                xInARow = true;
            } else if (xo_[0][0] == 'X' && xo_[1][1] == 'X' && xo_[2][2] == 'X') {
                xInARow = true;
            } else if (xo_[0][2] == 'X' && xo_[1][1] == 'X' && xo_[2][0] == 'X') {
                xInARow = true;
            }
            //
            if (xo_[0][0] == 'O' && xo_[0][1] == 'O' && xo_[0][2] == 'O') {
                oInARow = true;
            } else if (xo_[1][0] == 'O' && xo_[1][1] == 'O' && xo_[1][2] == 'O') {
                oInARow = true;
            } else if (xo_[2][0] == 'O' && xo_[2][1] == 'O' && xo_[2][2] == 'O') {
                oInARow = true;
            } else if (xo_[0][0] == 'O' && xo_[1][0] == 'O' && xo_[2][0] == 'O') {
                oInARow = true;
            } else if (xo_[0][1] == 'O' && xo_[1][1] == 'O' && xo_[2][1] == 'O') {
                oInARow = true;
            } else if (xo_[0][2] == 'O' && xo_[1][2] == 'O' && xo_[2][2] == 'O') {
                oInARow = true;
            } else if (xo_[0][0] == 'O' && xo_[1][1] == 'O' && xo_[2][2] == 'O') {
                oInARow = true;
            } else if (xo_[0][2] == 'O' && xo_[1][1] == 'O' && xo_[2][0] == 'O') {
                oInARow = true;
            }
            numdiff = numO - numX;
            //finalRepeat = false;
            if (numdiff == 0 || numdiff == -1 || numdiff == 1) {
                //finalRepeat = false;
                if (xInARow && oInARow) {
                    System.out.println("Impossible");
                    break;

                } else if (xInARow && !oInARow) {
                    System.out.println("X wins");
                    break;
                    //finalRepeat = false;
                } else if (oInARow && !xInARow) {
                    System.out.println("O wins");
                    break;
                    //finalRepeat = false;
                } else if (!xInARow && !oInARow && num_ == 0) {
                    System.out.println("Draw");
                    break;
                    //finalRepeat = false;
                }

            } else {
                System.out.println("Impossible");
                finalRepeat = false;
            }
            //loop end
        }

        //
    }
}
