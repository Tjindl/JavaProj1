public class PackageThree implements Package{

    int baseCost;
    int costPerCourse;
    int numIncluded;
    int totalCost;

    PackageThree() {
        baseCost = 15;
        costPerCourse=3;
        numIncluded=6;
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
