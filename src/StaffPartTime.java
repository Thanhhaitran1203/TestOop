public class StaffPartTime extends Staff{
    public static final int  salaryPartTime = 100000;
    private int  numberOfWorkingHouse;

    public StaffPartTime() {

    }
    public StaffPartTime(String staffCode, String fullName, int age, int numberPhone, String email, int numberOfWorkingHouse) {
        super (staffCode, fullName, age, numberPhone, email);
        this.numberOfWorkingHouse = numberOfWorkingHouse;
    }

    @Override
    public int getSalary() {
        return numberOfWorkingHouse * salaryPartTime;
    }
}
