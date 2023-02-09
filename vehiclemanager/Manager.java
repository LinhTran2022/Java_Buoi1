package vehiclemanager;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager {
    public ArrayList<Vehicle> vehicles = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public static Matcher matcher;
    public static Pattern id_p = Pattern.compile("[a-zA-Z]{2}[0-9]{3}");
    public static Pattern brand_p = Pattern.compile("[a-zA-Z0-9]+");
    public static Pattern year_p = Pattern.compile("[0-9]{4}");
    
    public Manager(){}
    
    public void Menu(){ // finished : 1, 2, 3, 4, 6, 7
        System.out.println("+--------------------MENU--------------------+");
        System.out.println("| 1. Nhap them phuong tien.                  |");
        System.out.println("| 2. In danh sach phuong tien.               |");
        System.out.println("| 3. Tim kiem phuong tien (theo thuoc tinh)  |");
        System.out.println("| 4. Tim kiem phuong tien (theo gioi han)    |");
        System.out.println("| 5. Tim kiem phuong tien theo truong        |");
        System.out.println("| 6. Sap xep phuong tien                     |");
        System.out.println("| 7. Thong ke                                |");
        System.out.println("| 8. Exit                                    |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon: ");
    }
    
    public void Menu1(){
        System.out.println("+--------------------------------------------+");
        System.out.println("| 1. Tim theo ma                             |");
        System.out.println("| 2. Tim theo hang                           |");
        System.out.println("| 3. Tim theo nam san xuat                   |");
        System.out.println("| 4. Tim theo gia                            |");
        System.out.println("| 5. Tim theo mau sac                        |");
        System.out.println("| 6. Exit                                    |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon: ");
    }
    
    public void Menu2(){
        System.out.println("+--------------------------------------------+");
        System.out.println("| 1. Tim theo nam san xuat                   |");
        System.out.println("| 2. Tim theo gia                            |");
        System.out.println("| 3. Exit                                    |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon");
    }
    
    public void Menu3(){
        System.out.println("+--------------------------------------------+");
        System.out.println("| 1. Tim theo nam san xuat                   |");
        System.out.println("| 2. Tim theo gia                            |");
        System.out.println("| 3. Exit                                    |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon");
    }
    
    public void Menu4(){
        System.out.println("+--------------------------------------------+");
        System.out.println("| 1. Thong ke theo so loai  xe               |");
        System.out.println("| 2. Thong ke theo so mau sac                |");
        System.out.println("| 3. Thong ke theo so hang xe                |");
        System.out.println("| 4. Exit                                    |");
        System.out.println("+--------------------------------------------+");
        System.out.println("Nhap lua chon");
    }
    
    public void addVehicle(){
        String id = new String();
        while (true){
            System.out.print("Nhap ma xe: ");
            id = sc.nextLine();
            if (id_p.matcher(id).matches()){
                break;
            }
        }
        String brand = new String();
        while(true){
            System.out.print("Nhap hang xe: ");
            brand = sc.nextLine();
            if(brand_p.matcher(brand).matches()){
                break;
            }
        }
        int p_year;
        while (true){
            System.out.print("Nhap nam san xuat: ");
            p_year = sc.nextInt();
            if (year_p.matcher(String.valueOf(p_year)).matches()){
                break;
            }
        }
        System.out.print("Nhap gia thanh: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap mau xe: ");
        String color = sc.nextLine();
        switch (id.charAt(0)){
            case 'C' -> {
                System.out.print("Nhap kieu dong co: ");
                String typeOfEngine = sc.nextLine();
                System.out.println("Nhap so luong cho ngoi: ");
                int numOfSeat = sc.nextInt();
                Vehicle tmp = new Car(id, brand, p_year,price,color,typeOfEngine,numOfSeat);
                vehicles.add(tmp);
            }
            case 'M' -> {
                System.out.print("Nhap cong suat: ");
                int wattage = sc.nextInt();
                Vehicle tmp1 = new Motobike(id,brand,p_year,price,color,wattage);
                vehicles.add(tmp1);
            }
            case 'L' -> {
                System.out.print("Nhap trong tai: ");
                double load = sc.nextDouble();
                Vehicle tmp2 = new Lorry(id,brand,p_year,price,color,load);
                vehicles.add(tmp2);
            }
        }
    }
    
    public void showListVehicle(){
        System.out.println("+----------------------------------------------------------+");
        System.out.printf("|%6s%-3s|%10s%-5s|%5s%-2s|%10s%-5s|%6s%-2s|\n","ID","","BRAND","","YEAR","","PRICE","","COLOR","");
        System.out.println("+----------------------------------------------------------+");
        int n = vehicles.size();
        for (int i = 0; i < n; i++){
            System.out.printf("|%6s%-3s|%10s%-5s|%5d%-2s|%10d%-5s|%6s%-2s|\n",vehicles.get(i).getId(),"",vehicles.get(i).getBrand(),"",vehicles.get(i).getP_year(),"",vehicles.get(i).getPrice(),"",vehicles.get(i).getColor(),"");
            System.out.println("+----------------------------------------------------------+");
        }
        System.out.printf("| Tong so xe: |%34d%-10s|\n",n,"");
        System.out.println("+----------------------------------------------------------+");
    }
    
    public void showVehicle(Vehicle v){
        if (v instanceof Car){
            System.out.printf("|%6s%-3s|%10s%-5s|%5d%-2s|%10d%-5s|%6s%-2s|%4s%-2s|%3d%-1s|\n",v.getId(),"",v.getBrand(),"",v.getP_year(),"",v.getPrice(),"",v.getColor(),"",((Car) v).getTypeOfEngine(),"",((Car) v).getNumOfSeat(),"");
            System.out.println("+-----------------------------------------------------------------------+");
        }
        else if (v instanceof Motobike){
            System.out.printf("|%6s%-3s|%10s%-5s|%5d%-2s|%10d%-5s|%6s%-2s|%4s%-2s|%3d%-1s|\n",v.getId(),"",v.getBrand(),"",v.getP_year(),"",v.getPrice(),"",v.getColor(),"",((Motobike) v).getWattage(),"");
            System.out.println("+-----------------------------------------------------------------------+");
        }
        else{
            System.out.printf("|%6s%-3s|%10s%-5s|%5d%-2s|%10d%-5s|%6s%-2s|%4s%-2s|%3d%-1s|\n",v.getId(),"",v.getBrand(),"",v.getP_year(),"",v.getPrice(),"",v.getColor(),"",((Lorry)v).getLoad(),"");
            System.out.println("+-----------------------------------------------------------------------+");
        }
    }
    
    public void searchVehicle_1(){
        int pick, stop = 0;
        int n = vehicles.size();
        while(stop == 0){
            Menu1();
            pick = sc.nextInt();
            sc.nextLine();
            switch (pick){
                case 1:
                    System.out.print("Nhap ma: ");
                    String id = sc.nextLine();
                    for (Vehicle v : vehicles){
                        if (v.getId().equals(id)){
                            showVehicle(v);
                        }
                    }
                    break;
                case 2 :
                    System.out.print("Nhap hang: ");
                    String brand = sc.nextLine();
                    for (Vehicle v : vehicles){
                        if (v.getBrand().equals(brand)){
                            showVehicle(v);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap nam san xuat:");
                    int year = sc.nextInt();
                    sc.nextLine();
                    for (Vehicle v : vehicles){
                        if (v.getP_year() == year){
                            showVehicle(v);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhap gia: ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    for (Vehicle v : vehicles){
                        if (v.getPrice() == price){
                            showVehicle(v);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhap mau sac: ");
                    String color = sc.nextLine();
                    for (Vehicle v : vehicles){
                        if (v.getColor().equals(color)){
                            showVehicle(v);
                        }
                    }
                    break;
                case 6:
                    stop = 1;
                    break;
            }
        }
    }
    
    public void searchVehicle_2(){
        int pick, stop = 0;
        int n = vehicles.size();
        while (stop == 0){
            Menu2();
            pick = sc.nextInt();
            switch(pick){
                case 1:
                    System.out.println("Nhap nam san xuat (format : tu_nam  den_nam): ");
                    int year_start = sc.nextInt();
                    int year_end = sc.nextInt();
                    sc.nextLine();
                    for (Vehicle v : vehicles){
                        if (v.getP_year() >= year_start && v.getP_year() <= year_end){
                            showVehicle(v);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhap khoang gia (format : tu_gia_tri  den_gia_tri): ");
                    int price_start = sc.nextInt();
                    int price_end = sc.nextInt();
                    sc.nextLine();
                    for (Vehicle v : vehicles){
                        if (v.getPrice() >= price_start && v.getPrice() <= price_end){
                            showVehicle(v);
                        }
                    }
                    break;
                case 3 :
                    stop = 1;
                    break;
            }
        }
    }
    
    public void sortVehicle(){
        Collections.sort(vehicles, (Vehicle a, Vehicle b) -> {
            if (a.getBrand().equals(b.getBrand())){
                if (a.getPrice() == b.getPrice()){
                    if (a.getP_year()<= b.getP_year()) return 1;
                    else return -1;
                }
                else{
                    if (a.getPrice() <= b.getPrice()) return 1;
                    else return -1;
                }
            }
            else{
                return a.getBrand().compareTo(b.getBrand());
            }
        });
    }
    
    public void statisticize(){
        int pick, stop = 0;
        while (stop == 0){
            Menu4();
            pick = sc.nextInt();
            sc.nextLine();
            switch (pick){
                case 1 -> {
                    Set<String> s = new HashSet<>();
                    for (int i = 0; i < vehicles.size(); i++){
                        s.add(String.valueOf(vehicles.get(i).getId().charAt(0)));
                    }
                    System.out.printf("So loai xe la : %d\n",s.size());
                }
                case 2 -> {
                    Set<String> co = new HashSet<>();
                    for (int i = 0; i < vehicles.size(); i++){
                        co.add(vehicles.get(i).getColor());
                    }
                    System.out.printf("So loai mau la : %d\n",co.size());
                }
                case 3 -> {
                    Set<String> sh = new HashSet<>();
                    for (int i = 0; i < vehicles.size(); i++){
                        sh.add(vehicles.get(i).getBrand());
                    }
                    System.out.printf("So hang xe la : %d\n",sh.size());
                }
                case 4 -> stop  = 1;
            }
        }
    }
    
    public void runProgram(){
        int pick, stop = 0;
        while (stop == 0){
            Menu();
            pick = sc.nextInt();
            switch (pick){
                case 1 -> addVehicle();
                case 2 -> showListVehicle();
                case 3 -> searchVehicle_1();
                case 4 -> searchVehicle_2();
                case 5 -> System.out.println("Chua biet lam");
                case 6 -> sortVehicle();
                case 7 -> statisticize();
                case 8 -> stop = 1;
            }
        }
    }
}

