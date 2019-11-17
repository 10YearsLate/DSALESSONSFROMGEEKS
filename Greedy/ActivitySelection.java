import java.util.*;

public class ActivitySelection{

  public static void main(String[] args){
  
    int no_of_acty=3;
    pair[] activities=new pair[no_of_acty];
    
    activities[0]=new pair(12,25);
    activities[1]=new pair(10,20);
    activities[2]=new pair(20,30);
    
    Arrays.sort(activities,pair);
    
    System.out.println(activities);
  
  }
}

class pair implements comparator<pair>{
  int start;
  int end;
  
  pair(int start,int end){
    this.start=start;
    this.end=end;
  }
  @override
  public int compare(pair a,pair b){
    if (a.end==b.end) return 0;
    if(a.end>b.end) return 1;
    if(a.end<b.end) return -1;
    return 0;
  }
}
