public class StringPermutation{

  private void permute(String str,int l,int h){
      
      if(l==h) System.out.println(str+" ");
      else{
        for(int i=l;i<=h;i++){
          swap(str,i,l);
          permute(str,l+1,h);
          swap(str,i,l);
        
        }
      }
  
  }
  
  private void swap(String str,int l,int h){
  
    Char[] ch=str.toCharArray();
    char temp=ch[l];
    ch[l]=ch[h];
    ch[h]=temp;
  }


  public static void main(String[] args){
  
      String str="ABC";
      StringPermutation sp=new StringPermutation();
      sp.permute(str,0,(str.length-1));
      
  }

}
