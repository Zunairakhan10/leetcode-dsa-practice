class Solution {
    public int maximumPopulation(int[][] logs) {
            int[] population = new int[101];

        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];

            population[birth - 1950]++;
            population[death - 1950]--;
        }

        int current = 0;
        int max = 0;
        int year = 1950;

        for (int i = 0; i < population.length; i++) {
            current += population[i];

            if (current > max) {
                max = current;
                year = 1950 + i;
            }
        }

        return year;
    }
}
        
    
