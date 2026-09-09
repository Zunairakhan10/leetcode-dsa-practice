class Solution {
    public long countCommas(long n) {
        long count  = 0;
        long start = 1000;
        long commasPerNumber = 1;
        while(start<=n){
            long end = start * 1000 -1;
            if(end>n){
                end = n;
            }
            long numbers = end - start +1;
            count += numbers * commasPerNumber;
            start *= 1000;
            commasPerNumber++;
        }
        

    return count;    
    }
}