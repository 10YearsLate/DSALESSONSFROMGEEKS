public class island{

    private int[][] m={{1, 1, 0, 0, 0},
                   {0, 1, 0, 0, 1},
                   {1, 0, 0, 1, 1},
                   {0, 0, 0, 0, 0},
                   {1, 0, 1, 0, 1} };

    int count=0;

    public static void main(String[] args){
        
        island i=new island();
        for(int j=0;j<5;j++){
            for(int k=0;k<5;k++){
                if(i.find(j,k)) i.count++;
                System.out.println();
                System.out.println();
                
            }
        }
        
        System.out.println(i.count);
    }

    private boolean find(int a,int b) {
        boolean found=false;
        if(a>=5 || b>=5) return found;
        if(a<0||b<0) return found;
        if(m[a][b]==-1) return found;
        if(m[a][b]==1){
            found=true;
            m[a][b]=-1;
            System.out.println(a+ " "+b);
            
            find(a+1,b);
            find(a,b+1);
            find(a+1,b+1);
            find(a-1,b);
            find(a,b-1);
            find(a-1,b-1);
            find(a-1,b+1);
            find(a+1,b-1);

        }
        return found;
    }
}