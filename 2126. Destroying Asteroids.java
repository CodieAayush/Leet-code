class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long m = mass;
        Arrays.sort(asteroids);
        for (int a : asteroids) 
        {
            if (m < a) 
                return false;
            m += a;
        }
        return true;
    }
}
