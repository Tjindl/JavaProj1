public class PackageTwo implements Package{

    int baseCost;
    int costPerCourse;
    int numIncluded;
    int totalCost;

    PackageTwo() {
        baseCost = 12;
        costPerCourse=4;
        numIncluded=4;
    }

    @Override
    public double costCalculator(int numberOfCourses) {
        if (numberOfCourses > numIncluded) {
            totalCost = baseCost + (numberOfCourses - numIncluded)*costPerCourse;
            return totalCost;
        } else {
            totalCost = baseCost;
            return totalCost;
        }
    }
}
