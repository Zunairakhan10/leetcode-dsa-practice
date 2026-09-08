class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;
        int carry = 0;

        while (i >= 0 || k > 0 || carry > 0) {

            int digit = k % 10;
            k = k / 10;

            if (i >= 0) {
                digit += num[i];
                i--;
            }

            digit += carry;

            result.add(digit % 10);
            carry = digit / 10;
        }

        Collections.reverse(result);

        return result;
    }
}
        

