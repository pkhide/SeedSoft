package Member;

/**
 * Created by Prin Kammasitt on 8/12/2557.
 */
public class Member {

    private String memberNUm;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String gender;
    private String password;
    private int age;
    private int totalRewardPoint;

    public Member(String memberNUm, String name, String address, String phoneNumber, String email, String gender, String password, int age, int totalRewardPoint) {
        this.memberNUm = memberNUm;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.age = age;
        this.totalRewardPoint = totalRewardPoint;
    }

    public String getMemberNUm() {
        return memberNUm;
    }

    public void setMemberNUm(String memberNUm) {
        this.memberNUm = memberNUm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotalRewardPoint() {
        return totalRewardPoint;
    }

    public void setTotalRewardPoint(int totalRewardPoint) {
        this.totalRewardPoint = totalRewardPoint;
    }
}
