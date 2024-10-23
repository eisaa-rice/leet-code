package arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = { {1993, 1999}, {2000, 2010} };
        System.out.println("ANSWER: " + maximumPopulation(logs) + "\n"); // 1993

        int[][] moreLogs = { {1950,1961}, {1960,1971}, {1970,1981} };
        System.out.println("ANSWER: " + maximumPopulation(moreLogs) + "\n"); // 1960


        int[][] saveMe = { {2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014} };
        System.out.println("ANSWER: " + maximumPopulation(saveMe) + "\n"); // 2005

    } // main

    public static int maximumPopulation(int[][] logs) {
        if (logs.length == 1) {
            return logs[0][0];
        }

        int earliestYear = 9999;
        int population = -1;

        // birthday is the current year we're checking
        for (int i = 0; i < logs.length; i++) {
            int currPopulation = 0;

            // check every birth-year in the logs
            for (int j = 0; j < logs.length; j++) {
                // inclusive range [birth_i, death_i - 1]
                if ((logs[j][0] <= logs[i][0]) && (logs[i][0] < (logs[j][1]))) {
                    // System.out.println(logs[j][0] + " " + logs[j][1] + " " + birthday);

                    currPopulation++;
                }
            } // for
            // System.out.println(currPopulation + " " + logs[i][0] + "\n");

            // if it has a higher population, straight up replacement
            // if population matches, the year has to be earlier
            if (currPopulation > population || (currPopulation == population && logs[i][0] < earliestYear)) {
                population = currPopulation;
                earliestYear = logs[i][0];
            }
        } // while

        return earliestYear;
    } // maximumPopulation
}