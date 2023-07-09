class Solution {
public List kidsWithCandies(int[] candies, int extraCandies) {
int n = candies.length;
List result = new ArrayList<>();
int maxcandy =0;
for(int i = 0 ; i<n; i++){
maxcandy = Math.max(maxcandy,candies[i]);
}
for(int i = 0; i<n; i++){
if((candies[i] + extraCandies) >= maxcandy)
result.add(i, true);
else
result.add(i,false);
}
return result;
}
}
