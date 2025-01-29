import java.util.Scanner;
import java.util.Scanner.*;

public class TicTacToe {
    private String[][] board;
    private String currentPlayer;
    private Scanner scanner = new Scanner(System.in);
    private String currentPlayerSymbol;

    public TicTacToe() {
        board = new String[3][3];
    }
    public void start(){
        System.out.println("Enter the symbol for the human player (X or O)");
        currentPlayerSymbol = scanner.nextLine();
        while(!boardIsFull()){
            printBoard();
            humanMoves();
            // AiMoves();
            // printBoard();
        }
    }
    private void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    private void humanMoves(){

        System.out.println("Place your mark (row)");
        currentPlayer = scanner.nextLine();
        int row = Integer.parseInt(currentPlayer)-1;
        System.out.println("Place your mark (column)");
        currentPlayer = scanner.nextLine();
        int col = Integer.parseInt(currentPlayer)-1;

        if(board[row][col] == null){
            board[row][col] = currentPlayerSymbol;
        }else{
            System.out.println("That position is already taken. Please choose another position.");
        }
    }

    private boolean boardIsFull(){
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){
                if(board[i][j] == null){
                    return false;
                }
            }
        }
        return true;
    }
    private void AiMoves(){

    }
}
