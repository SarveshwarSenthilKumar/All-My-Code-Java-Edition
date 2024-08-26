/*

import java.util.*;
import java.util.Random;

class Main {
  public static void main(String[] args){
    menu();
  }
  public static void menu() {

    clearScreen();

    System.out.println("Welcome to Sarveshwar's Tic-Tac-Toe\n");

    System.out.println("1. Play against robot");
    System.out.println("2. Play against friend");
    System.out.println("3. Quit\n");

    System.out.print("Enter your option(Ex: 1): ");
    Scanner s = new Scanner(System.in);
    String option = s.nextLine();

    if (option.equals("1")){
      robotGame();
    } 
    else if (option.equals("2")){
      personGame();
    }
    else if (option.equals("3")){
      QuitMenu();
    }

  }
  public static void winnerMenu(String[][] places){
    clearScreen();
    String s;
    for (int i = 0; i < places.length; i++){
          System.out.print("| ");
          s = "";
          for (int j = 0; j < places.length; j++){
          s+=(places[i][j] + " | ");
          }

          
          System.out.println(s);
          System.out.println("\n---------------\n");
        }
    System.out.println("You Won!");
    Scanner sc = new Scanner(System.in);
    System.out.print("\nPress enter to continue...");
    sc.nextLine();
    menu();
  }
  public static void Omen(String[][] places){
    clearScreen();
    String s;
    for (int i = 0; i < places.length; i++){
          System.out.print("| ");
          s = "";
          for (int j = 0; j < places.length; j++){
          s+=(places[i][j] + " | ");
          }

          
          System.out.println(s);
          System.out.println("\n---------------\n");
        }
    System.out.println("O Won! The second player won!");
    Scanner sc = new Scanner(System.in);
    System.out.print("\nPress enter to continue...");
    sc.nextLine();
    menu();
  }
  public static void Xmen(String[][] places){
    clearScreen();
    String s;
    for (int i = 0; i < places.length; i++){
          System.out.print("| ");
          s = "";
          for (int j = 0; j < places.length; j++){
          s+=(places[i][j] + " | ");
          }

          
          System.out.println(s);
          System.out.println("\n---------------\n");
        }
    System.out.println("X Won! The first player won!");
    Scanner sc = new Scanner(System.in);
    System.out.print("\nPress enter to continue...");
    sc.nextLine();
    menu();
  }
  public static void tieMenu(String[][] places){
    clearScreen();
    String s;
    for (int i = 0; i < places.length; i++){
          System.out.print("| ");
          s = "";
          for (int j = 0; j < places.length; j++){
          s+=(places[i][j] + " | ");
          }

          
          System.out.println(s);
          System.out.println("\n---------------\n");
        }
    System.out.println("You tied!");
    Scanner sc = new Scanner(System.in);
    System.out.print("\nPress enter to continue...");
    sc.nextLine();
    menu();
  }
  public static void loseMenu(String[][] places){
    clearScreen();
    String s;
    for (int i = 0; i < places.length; i++){
          System.out.print("| ");
          s = "";
          for (int j = 0; j < places.length; j++){
          s+=(places[i][j] + " | ");
          }

          
          System.out.println(s);
          System.out.println("\n---------------\n");
        }
    System.out.println("You lost!");
    Scanner sc = new Scanner(System.in);
    System.out.print("\nPress enter to continue...");
    sc.nextLine();
    menu();
  }
  public static void QuitMenu(){
    clearScreen();
    System.out.println("Goodbye! Hope you enjoyed the program, play again later\n");
    Scanner c = new Scanner(System.in);
    System.out.print("\nPress enter to continue...");
    c.nextLine();
    clearScreen();
  }
  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }  
  public static void robotGame() {
    clearScreen();
    boolean win = false;
    boolean Owin = false;
    int turns = 0;
    String winner = "";
    String[][] places = { {" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "} };
    do{
      clearScreen();
      
      for (int z = 0; z < places.length; z++){
          if (places[z][0].equals("X") && places[z][1].equals("X") && places[z][2].equals("X")){

            win = true;
            break;
            
          }
        }
      for (int z = 0; z < places.length; z++){
          if (places[0][z].equals("X") && places[1][z].equals("X") && places[2][z].equals("X")){

            win = true;
            break;
            
          }        
        }
      
      if (places[0][2].equals("X") && places[1][1].equals("X") && places[2][0].equals("X")){

        win = true;

      }

      if (places[0][0].equals("X") && places[1][1].equals("X") && places[2][2].equals("X")){

        win = true;

      }
      
      for (int z = 0; z < places.length; z++){
          if (places[z][0].equals("O") && places[z][1].equals("O") && places[z][2].equals("O")){

            Owin = true;
            break;
            
          }
        }
      for (int z = 0; z < places.length; z++){
          if (places[0][z].equals("O") && places[1][z].equals("O") && places[2][z].equals("O")){

            Owin = true;
            break;
            
          }        
        }
      
      if (places[0][2].equals("O") && places[1][1].equals("O") && places[2][0].equals("O")){

        Owin = true;
      }

      if (places[0][0].equals("O") && places[1][1].equals("O") && places[2][2].equals("O")){

        Owin = true;

      }

      if (win) {
        winnerMenu(places);
        break;
      }


      if (Owin) {
        loseMenu(places);
        break;
      }

      if (turns >= 4){
        tieMenu(places);
        break;
      }

      String s;

      Random Random = new Random();

      do {
        
        clearScreen();
        
        for (int i = 0; i < places.length; i++){
          System.out.print("| ");
          s = "";
          for (int j = 0; j < places.length; j++){
          s+=(places[i][j] + " | ");
          }

          
          System.out.println(s);
          System.out.println("\n---------------\n");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("You are \"X\"\n");
        System.out.print("Which space do you want(Enter the coordinate(Ex: 1,1)): ");
        
        String space = scan.nextLine();
        String[] coors = space.split(",");

        int row = Integer.parseInt(coors[1])-1;
        int column = Integer.parseInt(coors[0])-1;
        String thisPlace = places[Integer.parseInt(coors[0])-1][Integer.parseInt(coors[1])-1];

        if (places[Integer.parseInt(coors[0])-1][Integer.parseInt(coors[1])-1].equals(" ")){
          places[Integer.parseInt(coors[0])-1][Integer.parseInt(coors[1])-1] = "X";
          break;
        }
      
      } while (true);

      turns += 1;

      for (int z = 0; z < places.length; z++){
          if (places[z][0].equals("X") && places[z][1].equals("X") && places[z][2].equals("X")){

            win = true;
            break;
            
          }
        }
      for (int z = 0; z < places.length; z++){
          if (places[0][z].equals("X") && places[1][z].equals("X") && places[2][z].equals("X")){

            win = true;
            break;
            
          }        
        }
      
      if (places[0][2].equals("X") && places[1][1].equals("X") && places[2][0].equals("X")){

        win = true;

      }

      if (places[0][0].equals("X") && places[1][1].equals("X") && places[2][2].equals("X")){

        win = true;

      }
      
      for (int z = 0; z < places.length; z++){
          if (places[z][0].equals("O") && places[z][1].equals("O") && places[z][2].equals("O")){

            Owin = true;
            break;
            
          }
        }
      for (int z = 0; z < places.length; z++){
          if (places[0][z].equals("O") && places[1][z].equals("O") && places[2][z].equals("O")){

            Owin = true;
            break;
            
          }        
        }
      
      if (places[0][2].equals("O") && places[1][1].equals("O") && places[2][0].equals("O")){

        Owin = true;
      }

      if (places[0][0].equals("O") && places[1][1].equals("O") && places[2][2].equals("O")){

        Owin = true;

      }

      do{
        int result = 0 + Random.nextInt(2 - 0 + 1);
        int result2 = 0 + Random.nextInt(2 - 0 + 1);
        if (win){
          winnerMenu(places);
          break;
        }
        else {
          if (places[result][result2].equals(" ")){
          places[result][result2] = "O";
          break;
        }
        }

        
      }while (true);
      
    } while (true);
  
  }
  public static void personGame() {
    clearScreen();
    boolean win = false;
    boolean Owin = false;
    int turns = 0;
    String winner = "";
    String[][] places = { {" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "} };
    do{
      clearScreen();
      
      for (int z = 0; z < places.length; z++){
          if (places[z][0].equals("X") && places[z][1].equals("X") && places[z][2].equals("X")){

            win = true;
            break;
            
          }
        }
      for (int z = 0; z < places.length; z++){
          if (places[0][z].equals("X") && places[1][z].equals("X") && places[2][z].equals("X")){

            win = true;
            break;
            
          }        
        }
      
      if (places[0][2].equals("X") && places[1][1].equals("X") && places[2][0].equals("X")){

        win = true;
        break;
      }

      if (places[0][0].equals("X") && places[1][1].equals("X") && places[2][2].equals("X")){

        win = true;
        break;
      }
      
      for (int z = 0; z < places.length; z++){
          if (places[z][0].equals("O") && places[z][1].equals("O") && places[z][2].equals("O")){

            Owin = true;
            break;
            
          }
        }
      for (int z = 0; z < places.length; z++){
          if (places[0][z].equals("O") && places[1][z].equals("O") && places[2][z].equals("O")){

            Owin = true;
            break;
            
          }        
        }
      
      if (places[0][2].equals("O") && places[1][1].equals("O") && places[2][0].equals("O")){

        Owin = true;
      }

      if (places[0][0].equals("O") && places[1][1].equals("O") && places[2][2].equals("O")){

        Owin = true;
        break;
      }

      if (win) {
        Xmen(places);
        break;
      }


      if (Owin) {
        Omen(places);
        break;
      }

      if (turns >= 4){
        tieMenu(places);
        break;
      }

      String s;

      Random Random = new Random();

      do {
        
        clearScreen();
        
        for (int i = 0; i < places.length; i++){
          System.out.print("| ");
          s = "";
          for (int j = 0; j < places.length; j++){
          s+=(places[i][j] + " | ");
          }

          
          System.out.println(s);
          System.out.println("\n---------------\n");
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("You are \"X\"\n");

        System.out.print("Which space do you want(Enter the coordinate(Ex: 1,1)): ");
        
        String space = scan.nextLine();
        String[] coors = space.split(",");

        int row = Integer.parseInt(coors[1])-1;
        int column = Integer.parseInt(coors[0])-1;
        String thisPlace = places[Integer.parseInt(coors[0])-1][Integer.parseInt(coors[1])-1];

        if (places[Integer.parseInt(coors[0])-1][Integer.parseInt(coors[1])-1].equals(" ")){
          places[Integer.parseInt(coors[0])-1][Integer.parseInt(coors[1])-1] = "X";
          break;
        }
      
      } while (true);

      do {
          for (int z = 0; z < places.length; z++){
            if (places[z][0].equals("X") && places[z][1].equals("X") && places[z][2].equals("X")){

              win = true;
              break;
              
            }
          }
        for (int z = 0; z < places.length; z++){
            if (places[0][z].equals("X") && places[1][z].equals("X") && places[2][z].equals("X")){

              win = true;
              break;
              
            }        
          }
        
        if (places[0][2].equals("X") && places[1][1].equals("X") && places[2][0].equals("X")){

          win = true;

        }

        if (places[0][0].equals("X") && places[1][1].equals("X") && places[2][2].equals("X")){

          win = true;

        }
        
        for (int z = 0; z < places.length; z++){
            if (places[z][0].equals("O") && places[z][1].equals("O") && places[z][2].equals("O")){

              Owin = true;
              
            }
          }
        for (int z = 0; z < places.length; z++){
            if (places[0][z].equals("O") && places[1][z].equals("O") && places[2][z].equals("O")){

              Owin = true;
              
            }        
          }
        
        if (places[0][2].equals("O") && places[1][1].equals("O") && places[2][0].equals("O")){

          Owin = true;
        }

        if (places[0][0].equals("O") && places[1][1].equals("O") && places[2][2].equals("O")){

          Owin = true;

        }
        clearScreen();
        if (win){
          Xmen(places);
          break;
        }
        
        for (int i = 0; i < places.length; i++){
          System.out.print("| ");
          s = "";
          for (int j = 0; j < places.length; j++){
          s+=(places[i][j] + " | ");
          }

          
          System.out.println(s);
          System.out.println("\n---------------\n");
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("You are \"O\"\n");

        System.out.print("Which space do you want(Enter the coordinate(Ex: 1,1)): ");
        
        String space = scan.nextLine();
        String[] coors = space.split(",");

        int row = Integer.parseInt(coors[1])-1;
        int column = Integer.parseInt(coors[0])-1;
        String thisPlace = places[Integer.parseInt(coors[0])-1][Integer.parseInt(coors[1])-1];

        if (places[Integer.parseInt(coors[0])-1][Integer.parseInt(coors[1])-1].equals(" ")){
          places[Integer.parseInt(coors[0])-1][Integer.parseInt(coors[1])-1] = "O";
          break;
        }
      
      } while (true);

      turns += 1;
      
    } while (true);
    
  }
}
*/

