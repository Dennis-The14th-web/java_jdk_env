package randomJavaClasses.src.main.java;
import java.util.*;

public class ArrayChessBoard {
    public static void main(String[] args){
        /*
        Let's build a chessboard with a 2 diminsional array
        java gives us the opportunity of creating a multi-deminsional array
        How sweet, that is why we are using a nested for loop to iterate on these arrays.
        */

        int boardDim = 8;
        char[][] board = new char[boardDim][boardDim];
        boolean isWhite = false;

        for(int y = 0; y < board.length; y++) 
        {
            isWhite = !isWhite;

            for(int x = 0; x < board[y].length; x++) 
            {
                if(isWhite) board[y][x] = 'W';
                if(!isWhite) board[y][x] = 'B';
                isWhite = !isWhite;
            }
        }

        for(int i = 0; i < board.length; i++)
        {
           System.out.println(Arrays.toString(board[i]));
        }
    }
}