public class Skill {

    String skill_desc;
    String skill_rating;

    public Skill() {

    }

    public Skill(String skill, String skill_rating) {
        this.skill_desc = skill;
        this.skill_rating = skill_rating;
    }

    public String getSkill() {
        return skill_desc;
    }

    public void setSkill(String skill) {
        this.skill_desc = skill;
    }

    public String getSkill_rating() {
        return skill_rating;
    }

    public void setSkill_rating(String skill_rating) {
        this.skill_rating = skill_rating;
    }
}
