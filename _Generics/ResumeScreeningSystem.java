import java.util.*;

abstract class JobRole {
    String title;
    JobRole(String title) {
        this.title = title;
    }
    String getTitle() {
        return title;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String title) {
        super(title);
    }
}

class DataScientist extends JobRole {
    DataScientist(String title) {
        super(title);
    }
}

class ProductManager extends JobRole {
    ProductManager(String title) {
        super(title);
    }
}

class Resume<T extends JobRole> {
    T role;
    Resume(T role) {
        this.role = role;
    }
    T getRole() {
        return role;
    }
}

class ResumeProcessor {
    static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println("Screening: " + r.getTitle());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Software Engineer"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Data Scientist"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Product Manager"));

        List<JobRole> resumeList = new ArrayList<>();
        resumeList.add(seResume.getRole());
        resumeList.add(dsResume.getRole());
        resumeList.add(pmResume.getRole());

        ResumeProcessor.screenResumes(resumeList);
    }
}
