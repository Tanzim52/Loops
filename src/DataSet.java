class DataSet {
    private double sum;
    private double smallest;
    private double largest;
    private int count;

    // Constructor
    public DataSet() {
        sum = 0;
        smallest = Double.MAX_VALUE;
        largest = Double.MIN_VALUE;
        count = 0;
    }

    // Method to add a value to the dataset
    public void add(double value) {
        sum += value;
        if (value < smallest) {
            smallest = value;
        }
        if (value > largest) {
            largest = value;
        }
        count++;
    }

    // Method to calculate the average
    public double getAverage() {
        return count == 0 ? 0 : sum / count;
    }

    // Method to get the smallest value
    public double getSmallest() {
        return count == 0 ? Double.NaN : smallest;
    }

    // Method to get the largest value
    public double getLargest() {
        return count == 0 ? Double.NaN : largest;
    }

    // Method to calculate the range
    public double getRange() {
        return count == 0 ? 0 : largest - smallest;
    }
}

