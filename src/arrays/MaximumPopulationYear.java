package arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
      /*
        int[][] logs = { {1993, 1999}, {2000, 2010} };
        System.out.println("ANSWER: " + maximumPopulation(logs)); // 1993

        int[][] moreLogs = { {1950,1961}, {1960,1971}, {1970,1981} };
        System.out.println("ANSWER: " + maximumPopulation(moreLogs)); // 1960
       */

        int[][] saveMe = { {2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014} };
        System.out.println("ANSWER: " + maximumPopulation(saveMe)); // 2005

    } // main

    public static int maximumPopulation(int[][] logs) {
        if (logs.length == 1) {
            return logs[0][0];
        }

        int earliestYear = -1;

        return earliestYear;
    } // maximumPopulation
}
