class Solution {
    public int maximumWealth(int[][] accounts) {
       int  maxWealth = 0;
        for(int i=0;i<accounts.length;i++){
            int currentSum = 0;
            for(int j=0;j<accounts[i].length;j++){
                currentSum += accounts[i][j];
            }
            if(currentSum>maxWealth){
                maxWealth=currentSum;
            }
               
        
        }
        return maxWealth;
        
    }
}