class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsHash = new HashSet<Integer>();
        for(int i : nums){
            if(!numsHash.add(i)){
                return true;
            }
        }
        return false;
    }
}