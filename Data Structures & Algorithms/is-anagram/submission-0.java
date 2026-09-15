class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char a:s.toCharArray())
        {
            hs.put(a,hs.getOrDefault(a,0)+1);
        }
        HashMap<Character,Integer> hsp = new HashMap<>();
        for(char a:t.toCharArray())
        {
            hsp.put(a,hsp.getOrDefault(a,0)+1);
        }
        if(hs.equals(hsp))
        {
            return true;
        }
        return false;


    }
}
