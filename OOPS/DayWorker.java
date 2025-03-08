public class DayWorker {
    String name;
    String job;
    double[] wages;

    // Parameterized constructor
    public DayWorker(String name, String job) {
        this.name = name;
        this.job = job;
        this.wages = new double[10]; // Initialize array for 10 days
    }

    // Setter method for wages
    public void setWages(double[] wages) {
        if (wages.length == 10) {
            this.wages = wages;
        } else {
            System.out.println("Error: Wages array must contain 10 elements.");
        }
    }

    // Method to find highest wage
    public double highestWage() {
        double highest = wages[0];
        for (double wage : wages) {
            if (wage > highest) {
                highest = wage;
            }
        }
        return highest;
    }

    // Method to find lowest wage
    public double lowestWage() {
        double lowest = wages[0];
        for (double wage : wages) {
            if (wage < lowest) {
                lowest = wage;
            }
        }
        return lowest;
    }

    // Method to calculate average wage
    public double averageWage() {
        double sum = 0;
        for (double wage : wages) {
            sum += wage;
        }
        return sum / wages.length;
    }

    // Method to display worker details
    public void displayDetails() {
        System.out.println("Worker: " + name);
        System.out.println("Job: " + job);
        System.out.println("Highest Wage: $" + String.format("%.2f", highestWage()));
        System.out.println("Lowest Wage: $" + String.format("%.2f", lowestWage()));
        System.out.println("Average Wage: $" + String.format("%.2f", averageWage()));
        System.out.println();
    }

    public static void main(String[] args) {
        // Create three instances of DayWorker
        DayWorker worker1 = new DayWorker("John Doe", "Carpenter");
        DayWorker worker2 = new DayWorker("Jane Smith", "Electrician");
        DayWorker worker3 = new DayWorker("Mike Johnson", "Plumber");
        worker1.name = "Arpit";

        // Set wages for each worker
        worker1.setWages(new double[]{120.50, 130.00, 115.75, 140.25, 125.00, 135.50, 122.75, 128.00, 133.25, 138.50});
        worker2.setWages(new double[]{145.00, 150.25, 140.75, 155.50, 148.00, 152.75, 147.25, 151.00, 153.50, 149.75});
        worker3.setWages(new double[]{135.25, 140.50, 130.75, 145.00, 138.25, 142.75, 137.50, 141.00, 143.25, 139.75});

        // Display details for each worker
        worker1.displayDetails();
        worker2.displayDetails();
        worker3.displayDetails();
    }
}