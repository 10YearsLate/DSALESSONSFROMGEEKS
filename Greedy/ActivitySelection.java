import java.util.*;

public class ActivitySelection{

  public static void main(String[] args){
  
    int no_of_acty=3;
    int count=0;
    pair[] activities=new pair[no_of_acty];
    
    activities[0]=new pair(12,25);
    activities[1]=new pair(10,20);
    activities[2]=new pair(20,30);
    
    Arrays.sort(activities,new pair());
    
    pair prev=new pair(-1,-1);
    for(pair a: activities){
            if(prev.end<=a.start){
                System.out.println(a.start+" "+a.end);
                prev=a;
                count++;

            }

    }
    System.out.print("Total number of Activities can be scheduled "+count);
  }
}

class pair implements Comparator<pair>{
  int start;
  int end;
  
  pair(int start,int end){
    this.start=start;
    this.end=end;
  }
  
    public pair() {
    }

    @Override
  public int compare(pair a,pair b){
    if (a.end==b.end) return 0;
    if(a.end>b.end) return 1;
    if(a.end<b.end) return -1;
    return 0;
  }
}
