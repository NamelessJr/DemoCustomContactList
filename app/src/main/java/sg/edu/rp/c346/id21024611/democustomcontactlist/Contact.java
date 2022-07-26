package sg.edu.rp.c346.id21024611.democustomcontactlist;

public class Contact {
    private String name;
    private int countryCode;
    private int PhoneNum;
    private char gender;
    public Contact(String name, int countryCode, int PhoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.PhoneNum = PhoneNum;
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getPhoneNum() {
        return PhoneNum;
    }
    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }
    public int getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
