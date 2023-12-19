import java.util.Scanner;
public class Main {

    public static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        StaffFullTime n1 = new StaffFullTime ("n01","hai1",27,123,"asdad@mail",100000,0,1000000);
        StaffFullTime n2 = new StaffFullTime ("n02","hai2",27,123,"asdad@mail",0,100000,1000000);
        StaffPartTime n3 = new StaffPartTime ("n03","hai3",27,123,"asdad@mail",80);
        StaffPartTime n4 = new StaffPartTime ("n04","hai4",27,123,"asdad@mail",100);

        Staff[] arr = {n1, n2, n3, n4};
        String nameInput;
        int choice = 0;
        do {
            System.out.println ("1.Tính trung bình lương nhân viên cả công ty");
            System.out.println ("2. Tính trung bình lương của nhân viên fulltime");
            System.out.println ("3. Tính trung bình lương của nhân viên parttime");
            System.out.println ("4. Tính tổng lương phải trả cho nhân viên partime");
            System.out.println ("5. Đếm số người có mức lương cao hơn mức lương trung bình toàn công ty");
            System.out.println ("6. Đếm số nhân viên partime có tên được nhập vào từ bàn phím");
            System.out.println ("0. Exit");
            choice = sc.nextInt ();
            switch (choice){
                case 1:
                    System.out.println ("Lương trung bình nhân viên cả công ty " + avgStaff (arr));
                    break;
                case 2:
                    System.out.println ("Lương trung bình nhân viên fulltime "+ avgStaffFullTime (arr));
                    break;
                case 3:
                    System.out.println ("Lương trung bình nhân viên parttime "+ avgStaffPartTime(arr));
                    break;
                case 4:
                    System.out.println ("Tổng lương phải trả cho nhân viên parttime " + totalSalaryPartTime (arr));
                    break;
                case 5:
                    System.out.println ("Số người có lương lớn hơn trung bình là " + countStaffSalaryBiggerAvg (arr));
                    break;
                case 6:
                    System.out.println ("nhập tên muốn tìm");
                    nameInput = sc.nextLine ();
                    System.out.println ("số nhân viên có tên "+ nameInput + " là " + countStaffByName (arr,nameInput));
                    break;
            }
        }while (choice == 0);
    }
    public static double avgStaff(Staff[] arr){
        int sum = ZERO;
        for (Staff i : arr) {
            sum += i.getSalary ();
        }
        return sum/arr.length;
    }
    public static int avgStaffFullTime(Staff[] arr){
        int sum = ZERO;
        int count = ZERO;
        for (Staff i : arr) {
            if(i instanceof StaffFullTime){
                    StaffFullTime staffFull = (StaffFullTime) i;
                    sum += staffFull.getSalary ();
                    count++;
            }
        }
        return sum/count;
    }
    public static int avgStaffPartTime(Staff[] arr){
        int sum = ZERO;
        int count = ZERO;
        for (Staff i : arr) {
            if(i instanceof StaffPartTime){
                    StaffPartTime staffPart = (StaffPartTime) i;
                    sum += staffPart.getSalary ();
                    count++;
            }
        }
        return sum/count;
    }
    public static int totalSalaryPartTime(Staff[] arr){
        int total = ZERO;
        for (Staff i : arr) {
            if(i instanceof StaffPartTime){

                    StaffPartTime staffPart = (StaffPartTime) i;
                    total += staffPart.getSalary ();
            }
        }
        return total;
    }
    public static int countStaffSalaryBiggerAvg(Staff[] arr){
        double avg = avgStaff (arr);
        int count = ZERO;
        for (Staff i:arr) {
            if(i.getSalary () > avg){
                count++;
            }
        }
        return count;
    }
    public static int countStaffByName(Staff[] arr,String nameImput){
        int count = ZERO;
        for (Staff i:arr) {
            String name = i.getFullName ();
            if(name.equals (nameImput)){
                count++;
            }
        }
        return count;
    }
}

