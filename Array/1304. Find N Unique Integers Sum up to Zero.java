class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;
        int start = 0; 
        int end = n-1;
        int temp = n/2;

        while(start <= end)
        {
            arr[start] = temp;
            arr[end] = temp * (-1);
            start++;
            end--;
            temp--;
        }
        return arr;
    }
}
