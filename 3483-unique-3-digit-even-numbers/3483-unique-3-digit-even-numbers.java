class Solution {
    public int totalNumbers(int[] digits) {
        
         boolean[] seen = new boolean[1000];
         for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++)
                
            if(
            digits[i]!=0 &&
            i!=j && i!=k && j!=k &&
            digits[k]%2==0){
        
            int number = digits[i] * 100 + digits[j] * 10 + digits[k];
            seen[number]=true;

            }
            
        }
        
    }
    int count = 0;

    for (int i = 100; i <= 999; i++) {
    if (seen[i]) {
        count++;
    }
}

return count;
}
}
         

