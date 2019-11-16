import java.util.*;

public class rotallorange{

    
    
    static Queue<pair> Q=new LinkedList<pair>();
    public static void main(String[] args){

        int count=0;

        int[][] m={ {2, 1, 0, 2, 1},
                     {0, 0, 1, 2, 1},
                     {1, 0, 0, 2, 1}};

        /*int[][] m={ {2, 1, 0, 2, 1},
                    {1, 0, 1, 2, 1},
                    {1, 0, 0, 2, 1} };

                    */

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(m[i][j]==1){
                    try{
                    if(m[i-1][j]==0){
                        System.out.print("Not possible");
                        return;
                    }
                }catch(Exception e){}
                try{
                    if(m[i+1][j]==0){
                        System.out.print("Not possible");
                        return;
                    }
                }catch(Exception e){}
                try{
                    if(m[i][j-1]==0){
                        System.out.print("Not possible");
                        return;
                    }
                }catch(Exception e){}
                try{
                    if(m[i][j+1]==0){
                        System.out.print("Not possible");
                        return;
                    }
                }catch(Exception e){}

                }
                if(m[i][j]==2){
                    Q.add(new pair(i,j));
                }
            }
            
        }
        Q.add(new pair(Integer.MAX_VALUE,Integer.MAX_VALUE));
        boolean rot=true;
        while(rot){
            rot=false;
            for(int i=0;i<m.length;i++){
                for(int j=0;j<m[i].length;j++){
                    if(m[i][j]==2){
                        if(rotadjacent(i,j,m)) rot=true;;
                    }
                 }
             } 
             count++;
        }
        if(count>0)System.out.print(count);
        else System.out.print("All oranges cannot be rotten");
    
    }

    private static boolean rotadjacent(int i, int j, int[][] m) {
        boolean f=false;
        try{
            if(m[i-1][j]==1) {
                Q.add(new pair(i-1,j));
                m[i-1][j]=2;
                f=true;
             }
            }
            catch(Exception e){}

            try{
            if(m[i+1][j]==1) {
                Q.add(new pair(i+1,j));
                m[i+1][j]=2;
                f=true;
             }
            }
            catch(Exception e){}

            try{
            if(m[i][j-1]==1) {
                Q.add(new pair(i,j-1));
                m[i][j-1]=2;
                f=true;
             }
            }
            catch(Exception e){}
            try{
            if(m[i][j+1]==1) {
                Q.add(new pair(i,j+1));
                m[i][j+1]=2;
                f=true;
             }
            }
            catch(Exception e){}



        return f;
    }

  
}

class pair{
    int row;
    int column;

    pair(int a,int b){
        this.row=a;
        this.column=b;
    }
}