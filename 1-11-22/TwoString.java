class TwoString{
 
  public static String twoStrings(String s1, String s2) {
      HashMap<Character,Integer> map1= new HashMap<>();
      int count=0;
      for(char c:s2.toCharArray())
          map1.put(c, map1.getOrDefault(c, 0)+1);
      for(int i=0;i<s1.length();i++)
      {
        if(map1.containsKey(s1.charAt(i))) {
            count++;
        } 
      }
      return  count!=0?"YES":"NO";
      }
  public static void main(String[] args) {
      String s1="hello";
      String s2="world";
      twoStrings(s1,s2);
    }
}
