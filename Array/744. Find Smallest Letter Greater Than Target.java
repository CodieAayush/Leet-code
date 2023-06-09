class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    int s=0;
    int l= letters.length-1;
    while ( s <= l ){
    int mid = s + (l - s) / 2;
    if ( target < letters[mid]){
      l = mid -1;
    }
    else{
      s = mid + 1;
    }
    }
     System.gc();
     System.out.println(s % letters.length);
return letters[s % letters.length];
}
}
