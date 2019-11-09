public class StringPermutation{

  private void permute(String str,int l,int h){

      if(l==h) System.out.println(str+" ");
      else{
        for(int i=l;i<=h;i++){
          str=swap(str,i,l);
          permute(str,l+1,h);
          str=swap(str,i,l);

        }
      }

  }

  private String swap(String str,int l,int h){

    char[] ch=str.toCharArray();
    char temp=ch[l];
    ch[l]=ch[h];
    ch[h]=temp;
    //str=ch.toString();
    return String.valueOf(ch);

  }


  public static void main(String[] args){

      String str="ABC";
      StringPermutation sp=new StringPermutation();
      sp.permute(str,0,(str.length()-1));

  }

}
