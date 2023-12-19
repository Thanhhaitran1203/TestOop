public abstract class Staff {
    private String staffCode;
    private String fullName;
    private int age;
    private int numberPhone;
    private String email;

    public Staff() {
    }

    public Staff(String staffCode, String fullName, int age, int numberPhone, String email) {
        this.staffCode = staffCode;
        this.fullName = fullName;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public abstract int getSalary();

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
