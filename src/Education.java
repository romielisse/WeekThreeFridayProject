public class Education {

    String type_of_degree;
    String name_of_major;
    String school;
    String year_graduated;

    public Education() {

    }

    public Education(String type_of_degree, String name_of_major, String school, String year_graduated) {
        this.type_of_degree = type_of_degree;
        this.name_of_major = name_of_major;
        this.school = school;
        this.year_graduated = year_graduated;
    }

    public String getType_of_degree() {
        return type_of_degree;
    }

    public void setType_of_degree(String type_of_degree) {
        this.type_of_degree = type_of_degree;
    }

    public String getName_of_major() {
        return name_of_major;
    }

    public void setName_of_major(String name_of_major) {
        this.name_of_major = name_of_major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYear_graduated() {
        return year_graduated;
    }

    public void setYear_graduated(String year_graduated) {
        this.year_graduated = year_graduated;
    }
}
