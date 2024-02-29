public class CaloriesBurned {
    public static double calculateCaloriesBurned(double minutes, double caloriesPerMinute) {
        return caloriesPerMinute * minutes;
    }
  
    public static void main(String[] args) {
        int[] minutesList = {10, 15, 20, 25, 30};
        double caloriesPerMinute = 4.2;

        System.out.println("Minutes\tCalories Burned");
        System.out.println("------------------------");
  
        for (double minutes : minutesList) {
            double caloriesBurned = calculateCaloriesBurned(minutes, caloriesPerMinute);
            System.out.printf("%.0f\t%.1f\n", minutes, caloriesBurned);
        }
    }
  }
  