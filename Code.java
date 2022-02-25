class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        int count=0;
        String str="";
      for(int k=0;k<s.length();k++)
      {   
            int flag=0;
            str=str+s.charAt(k);
          
      for(int i=k+1;i<s.length();i++)
      {
        
          for(int j=k;j<i;j++)
          {
              if(s.charAt(i)==s.charAt(j))
              {
                  flag=1;
                  break;
              }
          }
          if(flag==0)
          {
              str=str+s.charAt(i);
           
          }
          else
          {
              break;
          }
        }
          
          count=Math.max(count, str.length());
          str="";
      }
        return count;
    }
}
