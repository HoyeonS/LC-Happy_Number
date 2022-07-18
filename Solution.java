class Solution {
    public int translate(int input) {
        int result = 0;
        int n = input;
        while(n != 0)
        {
            result += (n % 10) * (n % 10);
            n /= 10;
        }
        return result;
    }
    public boolean isHappy(int n) {
        int var = n;
        ArrayList<Integer> seen = new ArrayList<Integer>();
        while(true) {
            seen.add(var);
            var = translate(var);
            if(var == 1)
                return true;
            if(seen.contains(var))
                return false;
            
        } //loop
        
    }
}