package nodePalindromeAndRainwater;

public class RainwaterMain {
    public static void main(String[] args) {
        /**
         * elevationMap:
         *               []~~~~~~~~[]
         *       []~~~~~~[]        []
         *       []      []        []
         *   []~~[]  []  []    []  []
         * [][][][][][][][]    [][][]
         * ==========================
         * should be 26 units from totalWater
         */
        int[] elevationMap = {1, 2, 1, 4, 1, 2, 1, 5, 0, 0, 2, 1, 5};
        System.out.println("Total amount of water accumulated: " + totalWater(elevationMap) + " units");
    }

    /**
     * This method iterates over every element in the array,
     * finds the maximum elevation from the left of the number
     * (also checks itself), the maximum elevation from 
     * the right of the number, then the minimum elevation of
     * those two max elevations is chosen and the current number
     * of the array is subtracted from it, then that difference 
     * is added to the total units of water.
     */
    static int totalWater(int[] elevationMap) {

        int totalUnits = 0;

        //for each index of the array
        for(int i = 0; i < elevationMap.length; i++) {

            int maxLeft = 0, maxRight = 0;

            //find the max from the left of an elevation,
            //including itself
            for(int j = 0; j <= i; j++) {
                if (elevationMap[j] > maxLeft) {
                    maxLeft = elevationMap[j];
                }
            }

            //find the max from the right of an elevation
            for(int k = i; k < elevationMap.length; k++) {
                if (elevationMap[k] > maxRight) {
                    maxRight = elevationMap[k];
                }
            }

            //find the min. of the 2 elevations, subtract
            //by the value/height of the elevation
            if (maxLeft < maxRight) {
                totalUnits += maxLeft - elevationMap[i];
            } else {
                totalUnits += maxRight - elevationMap[i];
            }

        }

        return totalUnits;

    }//end totalWater

}
