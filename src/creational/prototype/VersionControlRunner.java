package creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "First project", "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);
        System.out.println("-----------------");

        badOptionToCopyInstance(master);

        correctMethodToCopyInstance(master);

    }

    private static void correctMethodToCopyInstance(Project master) {
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);
        System.out.println("-----------------");
    }

    private static void badOptionToCopyInstance(Project master) {
        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);
        System.out.println("-----------------");
    }
}
