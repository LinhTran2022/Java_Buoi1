package quanlybanhang;
import java.io.IOException;
import java.util.Scanner;

public class QuanLyBanHang {

    public static void main(String[] args) throws IOException{
        Manager manager = new Manager();
        System.out.println("=======MENU=======");
        System.out.println("1. Nhap mat hang moi.");
        System.out.println("2. Nhap nhan vien moi.");
        System.out.println("3. Nhap khach hang moi.");
        System.out.println("4. Nhap don hang moi.");
        System.out.println("5. In danh sach mat hang.");
        System.out.println("6. In danh sach nhan vien.");
        System.out.println("7. In danh sach khach hang trong file KH.");
        System.out.println("8. In danh sach khach hang trong file DH.");
        System.out.println("9. Sap xep danh sach don hang theo thoi gian mua.");
        System.out.println("10. Sap xep danh sach don hang theo ID nhan vien.");
        System.out.println("11. Sap xep danh sach don hang theo ten khach hang.");
        System.out.println("12. Tinh luong cho nhan vien.");
        System.out.println("0. Exit");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Nhap lua chon cua ban : ");
            int c = Integer.parseInt(sc.nextLine());
            switch(c){
                case 0 :{
                    break;
                }
                case 1:{
                    manager.themMatHang();
                    break;
                }
                case 2:{
                    manager.themNhanVien();
                    break;
                }
                case 3:{
                    manager.themKhachHang();
                    break;
                }
                case 4:{
                    manager.themDonHang();
                    break;
                }
                case 5:{
                    manager.inDanhSachMatHang();
                    break;
                }
                case 6:{
                    manager.inDanhSachNhanVien();
                    break;
                }
                case 7:{
                    manager.inDanhSachKhachHang();
                    break;
                }
            }
        }
    }
    
}
