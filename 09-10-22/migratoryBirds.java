  public static int migratoryBirds(List<Integer> arr) {
    int max=0;
    int[] countArray=new int[arr.size()];
    for(int value:arr){
     countArray[value]++;
     max=Math.max(max,countArray[value]);   
    }
    for(int i=0;i<countArray.length;i++)
    {
        if(countArray[i]==max){
            return i;
        }
    }
    return 0;   
    }
