class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<>(nums.length);
    for (int i=0; i<nums.length; i++)
        result.add(index[i], nums[i]);
    return result.stream().mapToInt(Integer::intValue).toArray();
}}
