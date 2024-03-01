public class PackageOne implements Package{

    int baseCost;
    int costPerCourse;
    int numIncluded;
    int totalCost;

    PackageOne() {
        baseCost = 10;
        costPerCourse=6;
        numIncluded=2;
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
