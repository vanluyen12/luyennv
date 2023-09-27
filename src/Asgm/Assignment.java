/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asgm;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Assignment {
    public static void main(String[] args) {    
        int chọn;
        Scanner sc = new Scanner(System.in);
        while (true){
        menu();
        chọn = Integer.parseInt(sc.nextLine());//nhận sự lựa chọn của người dùng
        //chọn gì phục vụ nấy
        switch (chọn){
            case 1:
                System.out.println("Bạn chọn nhập danh sách nhân viên từ bàn phím.");
                bai1();
                break;
                case 2:
                System.out.println("Bạn chọn xuất danh sách nhân viên ra màn hình.");
                bai2();
                break;
                case 3:
                System.out.println("Bạn chọn tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
                bai3();
                break;
                case 4:
                System.out.println("Bạn chọn xóa nhân viên theo mã nhập từ bàn phím.");
                bai4();
                break;
                case 5:
                System.out.println("Bạn chọn cập nhật thông tin nhân viên theo mã nhập từ bàn phím ");
                bai5();
                break;
                case 6:
                System.out.println("Bạn chọn tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
                bai6();
                break;
                case 7:
                System.out.println("Bạn chọn sắp xếp nhân viên theo họ và tên.");
                bai7();
                break;
                case 8:
                System.out.println("Bạn chọn sắp xếp nhân viên theo thu nhập.");
                bai8();
                break;
                case 9:
                System.out.println("Bạn chọn xuất 5 nhân viên có thu nhập cao nhất.");
                bai9();
                break;
                case 0:
                System.out.println("Bạn chọn Thoát");
                System.exit(0);//lện thoát
                break;
                default:
                    System.out.println("Mục bạn chọn không có, vui lòng chọn lại");
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("------------------------------------------------------------------- ");
        System.out.println("|1. Nhập danh sách nhân viên từ bàn phím.                          |");
        System.out.println("|2. Xuất danh sách nhân viên ra màn hình.                          |");
        System.out.println("|3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.            |");
        System.out.println("|4. Xóa nhân viên theo mã nhập từ bàn phím.                        |");
        System.out.println("|5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím          |");
        System.out.println("|6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.          |");
        System.out.println("|7. Sắp xếp nhân viên theo họ và tên.                              |");
        System.out.println("|8. Sắp xếp nhân viên theo thu nhập.                               |");
        System.out.println("|9. Xuất 5 nhân viên có thu nhập cao nhất.                         |");
        System.out.println("|0. Thoát                                                          |");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Mời bạn chọn 1 mục");
    }
    public static void bai1(){
        
    }
    public static void bai2(){
    
    }
    public static void bai3(){
    
    }
    public static void bai4(){
    
    }
    public static void bai5(){
    
    }
    public static void bai6(){
    
    }
    public static void bai7(){
    
    }
    public static void bai8(){
    
    }
    public static void bai9(){
    
    } 
}
