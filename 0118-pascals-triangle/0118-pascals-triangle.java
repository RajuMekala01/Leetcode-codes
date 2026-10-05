class Solution {
    public List<List<Integer>> generate(int numRows) {
        List< List<Integer> >arr=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(1);
        arr.add(temp);
        
        for(int i=1;i<numRows;i++){
             ArrayList<Integer> tempRow=new ArrayList<>();
            tempRow.add(1);
            
            for(int j=1;j<i;j++){
             int val=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                tempRow.add(val);
            }
                
            tempRow.add(1);
            arr.add(tempRow);
        }
        return arr;
        
    }
}