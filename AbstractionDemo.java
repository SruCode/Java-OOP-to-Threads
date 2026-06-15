/*
 * Abstraction Example in Java
 *
 * Concepts Demonstrated:
 * 1. Abstract Class
 * 2. Abstract Method
 * 3. Concrete Method in Abstract Class
 * 4. Method Overriding
 * 5. Runtime Polymorphism
 */

public class AbstractionDemo {

    public static void main(String[] args) {

        WeatherReport dailyReport =
                new DailyReport("Monday", "Sunny");

        WeatherReport weeklyReport =
                new WeeklyReport("Warm and Sunny Throughout the Week");

        System.out.println("=== Daily Weather Report ===");
        dailyReport.showReport();

        System.out.println();

        System.out.println("=== Weekly Weather Report ===");
        weeklyReport.showReport();
    }
}

// Abstract Class
abstract class WeatherReport {

    // Abstract Method
    abstract void showReport();

    // Concrete Method
    void reportGenerated() {
        System.out.println("Report generated successfully.");
    }
}

// Daily Weather Report
class DailyReport extends WeatherReport {

    private String day;
    private String weatherCondition;

    public DailyReport(String day, String weatherCondition) {
        this.day = day;
        this.weatherCondition = weatherCondition;
    }

    @Override
    void showReport() {
        System.out.println("Day: " + day);
        System.out.println("Weather Condition: " + weatherCondition);
        reportGenerated();
    }
}

// Weekly Weather Report
class WeeklyReport extends WeatherReport {

    private String summary;

    public WeeklyReport(String summary) {
        this.summary = summary;
    }

    @Override
    void showReport() {
        System.out.println("Summary: " + summary);
        reportGenerated();
    }
}
