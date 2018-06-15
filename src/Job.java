import java.util.ArrayList;

public class Job {

    String title;
    String company;
    String start_date;
    String end_date;
    ArrayList<String> Duties;

    public Job() {

    }

    public Job(String title, String company, String start_date, String end_date, ArrayList<String> duties) {
        this.title = title;
        this.company = company;
        this.start_date = start_date;
        this.end_date = end_date;
        this.Duties = (ArrayList<String>) duties.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public ArrayList<String> getDuties() {
        return Duties;
    }

    public void setDuties(ArrayList<String> duties) {
        Duties = duties;
    }
}

