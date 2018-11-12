/*
    118. Pascal's Triangle
*/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(numRows <= 0) return result;
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> newRow = new ArrayList<Integer>();
            List<Integer> preRow = result.get(i-1);
            
            newRow.add(1);
            for(int j = 1; j < i; j++){
                newRow.add(preRow.get(j-1) + preRow.get(j));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
}