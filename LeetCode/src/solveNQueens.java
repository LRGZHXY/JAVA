import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<List<String>> result=new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard=new char[n][n];
        for(char[] c:chessboard){
            Arrays.fill(c,'.');
        }
        backTracking(chessboard,n,0);
        return result;
    }

    public void backTracking(char[][] chessboard,int n,int row){
        if(row==n){
            result.add(Array2List(chessboard));
            return;
        }
        for(int j=0;j<n;j++){
            if(isValid(chessboard,row,j,n)){
                chessboard[row][j]='Q';
                backTracking(chessboard,n,row+1);
                chessboard[row][j]='.';
            }
        }
    }

    public List Array2List(char[][] chessboard){
        List<String> path=new ArrayList<>();
        for(char[] c:chessboard){
            path.add(String.copyValueOf(c));
        }
        return path;
    }

    public boolean isValid(char[][] chessboard,int row,int col,int n){
        for(int i=row;i>=0;i--){
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}