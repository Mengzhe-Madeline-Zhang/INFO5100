package TicTacToe;

import java.util.Arrays;
import java.util.Scanner;
 
public class TicTacToe {
  public static void main(String[] args) {
    TTTgame ttt = new TTTgame();
    ttt.runGame();
 
  }
}
 
class TTTgame{
  private char[][] gameBoard = new char[3][3]; // create a 3*3 array to represent chess board
  private int size = 0; //total chess number 
  private final int CAPACITY = 9; 
 
  TTTgame(){
    for(char[] line : gameBoard){ //initialize the chess board
      Arrays.fill(line, ' ');
    }
  }
 
  // start method
  public void runGame(){
    System.out.println("©°©¤©¤©¤©Ð©¤©¤©¤©Ð©¤©¤©¤©´");
    System.out.println("©¦ 1 ©¦ 2 ©¦ 3 ©¦");
    System.out.println("©À©¤©¤©¤©à©¤©¤©¤©à©¤©¤©¤©È");
    System.out.println("©¦ 4 ©¦ 5 ©¦ 6 ©¦");
    System.out.println("©À©¤©¤©¤©à©¤©¤©¤©à©¤©¤©¤©È");
    System.out.println("©¦ 7 ©¦ 8 ©¦ 9 ©¦");
    System.out.println("©¸©¤©¤©¤©Ø©¤©¤©¤©Ø©¤©¤©¤©¼");
    System.out.println("X is your chess, O is your computer's chess");
    System.out.println("Please enter placement (1-9) to place your chess");
    Scanner in = new Scanner(System.in);
  
    // Build class with methods to set the chess into right position
    class Play{ 
      int cpuPlay(){
          cpuType();
 
        printGameBroad();
        if(checkWinner() == -1) {
          System.out.println("CPU wins! Sorry:(");
          return -1;
        }else if (size == CAPACITY){
          System.out.println("CAT!");// check if the game has ended in a tie
          return -1;
        }
        return 0;
      }
      
      int playerPlay(){
        int pos;
        while(true){
          System.out.print("Please enter: ");
          pos = in.nextInt();
          if(pos < 1
              || pos > 9
              || gameBoard[(pos - 1) / 3][(pos - 1) % 3] != ' '){
            System.out.println("Please enter another placement£¡");// check placement if it is valid
            continue;
          } else {
            gameBoard[(pos - 1)/3][(pos - 1) % 3] = 'X';
            size++;
            break;
          }
        }
 
        if(checkWinner() == 1){
          printGameBroad();
          System.out.println("Congratulations you won!");
          return -1;
        } else if(size == CAPACITY){
          printGameBroad();
          System.out.println("CAT!"); // check if the game has ended in a tie
          return -1;
        }
        return 0;
      }
    }
 
    Play play = new Play();
// player start to play firstly
      while(true){
        if(play.playerPlay() == -1)
          return;
 
        if(play.cpuPlay() == -1)
          return;
      }
    }

 
  // computer select a random position atomically to type
  private void cpuType(){
    int l, c;
    while(true){
      l = (int)(Math.random() * 3);
      c = (int)(Math.random() * 3);
      if(gameBoard[l][c] == ' '){
        gameBoard[l][c] = 'O';
        break;
      }
    }
    size++;
  }
 
  private void printGameBroad(){
    System.out.println("©°©¤©¤©¤©Ð©¤©¤©¤©Ð©¤©¤©¤©´");
    System.out.println("©¦ " + gameBoard[0][0] + " ©¦ " + gameBoard[0][1] + " ©¦ " + gameBoard[0][2] + " ©¦");
    System.out.println("©À©¤©¤©¤©à©¤©¤©¤©à©¤©¤©¤©È");
    System.out.println("©¦ " + gameBoard[1][0] + " ©¦ " + gameBoard[1][1] + " ©¦ " + gameBoard[1][2] + " ©¦");
    System.out.println("©À©¤©¤©¤©à©¤©¤©¤©à©¤©¤©¤©È");
    System.out.println("©¦ " + gameBoard[2][0] + " ©¦ " + gameBoard[2][1] + " ©¦ " + gameBoard[2][2] + " ©¦");
    System.out.println("©¸©¤©¤©¤©Ø©¤©¤©¤©Ø©¤©¤©¤©¼");
  }
 
 // judge success
  private enum Route{
    LINE,    
    COLUMN,     
    RIGHT_DIAGONAL,
    LEFT_DIAGONAL; 
  }
  
//Check whether getting 3 chess in a row, column, or diagonal
  private int calculate(Route route, int i){ 
    switch (route){
      case LINE:
        return gameBoard[i][0] + gameBoard[i][1] + gameBoard[i][2];
      case COLUMN:
        return gameBoard[0][i] + gameBoard[1][i] + gameBoard[2][i];
      case RIGHT_DIAGONAL:
        return gameBoard[0][0] + gameBoard[1][1] + gameBoard[2][2];
      case LEFT_DIAGONAL:
        return gameBoard[0][2] + gameBoard[1][1] + gameBoard[2][0];
    }
    return 0;
  }
 
// check if either player or CPU has won 
// returning -1 means CPU wins; returning 1 means player wins; returning 0 means game continuance
  private int checkWinner(){
    for(int i = 0; i < 3; i++){
      if(calculate(Route.LINE, i) == 237 || calculate(Route.COLUMN, i) == 237)
        return 1;
      if(calculate(Route.LINE, i) == 126 || calculate(Route.COLUMN, i) == 126)
        return -1;
    }
    if(calculate(Route.LEFT_DIAGONAL, 0) == 237 || calculate(Route.RIGHT_DIAGONAL, 0) == 237)
      return 1;
    if(calculate(Route.LEFT_DIAGONAL, 0) == 126 || calculate(Route.RIGHT_DIAGONAL, 0) == 126)
      return -1;
    return 0; 
  }

}