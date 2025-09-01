public class StaticVsInstance {

    static int staticCount = 0;

    int instanceCount = 0;

    public void increment() {
        staticCount++;
        instanceCount++;
    }

    public void displayCounts(String objectName) {
        System.out.println(objectName + " -> staticCount: " + staticCount + ", instanceCount: " + instanceCount);
    }

    public static void main(String[] args) {
        StaticVsInstance obj1 = new StaticVsInstance();
        obj1.increment();
        obj1.displayCounts("Object 1");

        StaticVsInstance obj2 = new StaticVsInstance();
        obj2.increment();
        obj2.displayCounts("Object 2");

        obj1.displayCounts("Object 1 (again)");
    }
}
