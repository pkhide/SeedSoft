package Trainer;

/**
 * Created by Prin Kammasitt on 8/12/2557.
 */
public class Trainer {
    private String trainerNum;
    private String trainerName;
    private String skill;
    private int age;
    private String gender;
    private String password;

    public Trainer(String trainerNum, String trainerName, String skill, int age, String gender, String password) {
        this.trainerNum = trainerNum;
        this.trainerName = trainerName;
        this.skill = skill;
        this.age = age;
        this.gender = gender;
        this.password = password;
    }

    public String getTrainerNum() {
        return trainerNum;
    }

    public void setTrainerNum(String trainerNum) {
        this.trainerNum = trainerNum;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
