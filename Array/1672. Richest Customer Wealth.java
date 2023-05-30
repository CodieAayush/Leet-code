class Solution {
    public int maximumWealth(int[][] accounts) {
        
int wealth = 0;
for(int i=0; i<accounts.length; i++){
int maxWealth =0;
for(int j=0; j<accounts[0].length; j++){
maxWealth += accounts[i][j];
}
if(wealth < maxWealth){
wealth = maxWealth;
}
}
return wealth;
}
} 
