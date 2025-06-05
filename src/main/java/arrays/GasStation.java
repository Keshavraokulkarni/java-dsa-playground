package arrays;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0, currTank = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalTank += diff;
            currTank += diff;
            // If the current tank is negative, we cannot start from 'start'
            if (currTank < 0) {
                start = i + 1; // Try starting from the next station
                currTank = 0;
            }
        }
        // If total gas is at least equal to total cost, return start index; otherwise, return -1.
        return totalTank >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        GasStation gs = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int startStation = gs.canCompleteCircuit(gas, cost);
        if(startStation != -1) {
            System.out.println("Start at station: " + startStation);
        } else {
            System.out.println("No solution exists to complete the circuit.");
        }
    }
}
