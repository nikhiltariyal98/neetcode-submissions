class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i :nums)
        {
            if(hs.containsValue(i))
            {
                return true;
            }
            else
            {
                hs.put(i,i);
            }
        }
        return false;
        
    }
}