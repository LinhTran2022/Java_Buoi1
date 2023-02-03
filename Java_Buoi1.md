# **[JAVA] - Buổi 1**
## **1. Syntax cơ bản**
### **1.1 Nhập xuất**

- Nhập : 
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in); // create a sacnner object
String name = sc.nextLine();
```
- Xuất : Có 3 cách xuất : print, println, printf
- print : không xuống dòng
- println : tự động nhảy xuống dòng sau khi in
- printf (giống c++)
```java 
System.out.print("Hello Linh\n");
String s = "Khanh Linh";
System.out.println("My phone number is: " + x + "\n" + "My name is: " + s); // print many datatype in 1 print func using +
```
### **1.2 Variables : biến**
- Có 3 kiểu biến trong java, bao gồm biến `local` (biến địa phương), biến `instance` (biến toàn cục) và biến `static`
- Một số ví dụ khai báo biến ;

```java
int x = 123456;
long y = 162753734973198L; // using long need to end with L
float z = 0.4395f; // using float need to end with f so it does not confuse with double
double t = 3.14; // double does not need .x behind
boolean a = true;
char b = 'B';
String s = "Khanh Linh"; // every reference datatype begin with capital letter
```
- Biến local :
    - Biến local được khai báo trong các phương thức, hàm contructor, trong các block.
    - Biến local được tạo bên trong các phương thức, contructor, block và sẽ bị phá hủy khi kết thúc các phương thức, contructor và block.
    - Không được sử dụng "access modifier" khi khai báo biến local.
- Biến instance ;
    - Biến instance được khai báo trong 1 class, bên ngoài các phương thức, constructor và các block.
    - Biến instance được tạo khi một đối tượng được tạo bằng việc sử dụng từ khóa “new” và sẽ bị phá hủy khi đối tượng bị phá hủy.
    - Được sử dụng "access modifier" khi khai báo biến instance, mặc định là "default".
- Biến static :
    - Biến static được khai báo trong một class với từ khóa "static", phía bên ngoài các phương thức, constructor và block.
    - Sẽ chỉ có duy nhất một bản sao của các biến static được tạo ra dù tạo bao nhiêu đối tượng từ lớp tương ứng.
    - Biến static được truy cập thông qua tên của class chứa nó, với cú pháp: TenClass.tenBien.
    - Trong class, các phương thức sử dụng biến static bằng cách gọi tên của nó khi phương thức đó cũng được khai báo với từ khóa "static".
### **1.3 Toán tử : giống C++**
- Toán tử số học : + - * / % ++ --
- Toán tử quan hệ : ==, !=, >, <, >=, <=
- toán tử logic : && || !

### **1.4 Conditions**
- Syntax giống C++
- if, else if, else

```java
if (conditions){
    //code
}
```
### **1.5 Loop**
- while, do while cú pháp giống C++
- Vòng lặp for :
    - for loop
    ```java
    for (khoi_tao_bien ; check_dieu_kien ; tang/giam_bien) {  
        // code
    } 
    ```
    - for each loop : vòng lặp for cải tiến
    ```java
    for (Type var : array) { 
        //code
    }
    ```
    ```java
    for (String i : fruit){ // fruit is an array of string
        System.out.println(i);
    }
    ```
    - for loop gán nhãn
    ```java
    ten_nhan:
    for (khoi_tao_bien ; check_dieu_kien ; tang/giam_bien) {  
        // code
    }  
    ```
    ```java
    public class LabeledForExample {
        public static void main(String[] args) {
            aa: for (int i = 1; i <= 3; i++) {
                bb: for (int j = 1; j <= 3; j++) {
                    if (i == 2 && j == 2) {
                        break aa;
                    }
                    System.out.println(i + " " + j);
                }
            }
        }
    }
    ```
    ```
    1 1
    1 2
    1 3
    2 1
    ```
### **1.6 Array**
```java
//Array
String[] animal = {"Cat", "Dog", "Fish"}; // liet ke luon phan tu
String[] food = new String[3];  // tao array co n phan tu
for (int i = 0; i < 3; i++){
    System.out.print("Enter food name: ");
    food[i] = sc.nextLine();
}
        
//2D array
int[][] arr = new int[10][10];
```
### **1.7 Wapper class**
- Lớp Wrapper trong java cung cấp cơ chế để chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và từ đối tượng thành kiểu dữ liệu nguyên thủy.
- Sự chuyển đổi tự động kiểu dữ liệu nguyên thủy thành kiểu đối tượng được gọi là autoboxing và ngược lại được gọi là unboxing.
- Tên của kiểu Wrapper : kiểu nguyên thủy in hoa chữ cái đầu tiên. vs : boolean -> Boolean

```java
//Wrapper class
Boolean t1 = true; // now we can do t1. to see the methods
if (t1 == true){}  // t1 still can be use like a primitive datatype
```
### **1.8 String class**
- Trong java string là một đối tượng biểu diễn một nối tiếp của các ký tự. Lớp java.lang.String được sử dụng để tạo đối tượng string.
- Có 2 cách để tạo đối tượng String:
    - Sử dụng string literal
```java
String s = "hello Linh";
```
    - Sử dụng từ khóa new
```java
String s = new String("hello Linh); 
```
- Một số phương thức:
```java
//String method
name.charAt(0); // return kí tự ở index i
name.equals("name"); // so sánh 2 string
name.equalsIgnoreCase("name"); // so sánh 2 string ko quan tâm viết hoa
name.length();
name.indexOf("c"); 
name.isEmpty();
name.toLowerCase();
name.toUpperCase();
name.replace(b, b);
name.trim(); // delete space
```
### **1.9 Math class**
Các hàm trong Math class
- `Math.max()` lấy số lớn trong hai số
- `Math.min` lấy số nhỏ
- `Math.PI` hằng số PI
- `Math.abs()` trả về giá trị tuyệt đối của tham số
- `Math.ceil()` trả về giá trị double là số làm tròn tăng bằng giá trị số nguyên gần nhất
- `Math.floor()` trả về double là số làm tròn giảm
- `Math.pow` lấy lũy thừa (cơ-số, số mũ)
- `Math.sqrt()` khai căn
- `Math.sin(), Math.cos()` sin và cos của góc đơn vị radian
- `Math.toDegrees()` đổi góc radian thành độ
- `Math.toRadians()` đổi góc đơn vị độ ra radian
## **2. Regex**
- Regular Expression (Biểu thức chính quy) hay gọi tắt là Regex là một dãy các ký tự liên tục, qua nó giúp người sử dụng tìm kiếm hoăc so khớp hoặc các thao tác liên quan tuân theo những quy tắc và cú pháp nhất định.
```java
public class RegexNMDSE {
    public static void main(String[] args) {
       String[] strTest = { "","1602","1998","NMD98","1998d","nmdse"};
       // Kiểm tra xem chuỗi có chứa các chữ cái hay không
       for(String str: strTest){
           System.out.println("Chuỗi " + str + " có chứa các chữ cái: 
                              "+str.matches(".*[a-zA-Z].*"));
       }
    }     
}
```
```
Chuỗi 1602 có chứa các chữ cái: false
Chuỗi 1998 có chứa các chữ cái: false
Chuỗi NMD98 có chứa các chữ cái: true
Chuỗi 1998d có chứa các chữ cái: true
Chuỗi nmdse có chứa các chữ cái: true
```
## **3. Class & Object**
- Một thực thể có trạng thái và hành vi được gọi là đối tượng
- Một lớp là một nhóm đối tượng có các thuộc tính chung. Nó là một mẫu hoặc thiết kế từ đó các đối tượng được tạo ra. Một lớp trong java có thể chứa:
    - Thành viên dữ liệu
    - Constructor
    - Phương thức
    - Khối lệnh
    - Lớp và Interface
 ### **3.1. Encapsulation** 
 Tính đóng gói trong java là kỹ thuật ẩn giấu thông tin không liên quan và hiện thị ra thông liên quan. 
 
 ![Encapsulation](https://viettuts.vn/images/java/tinh-dong-goi-trong-java.jpg "Encapsulation")

 ```java
public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
 ```
 ### **3.2.Inheritance**
 - Kế thừa trong java là sự liên quan giữa hai class với nhau, trong đó có class cha (superclass) và class con (subclass). 
 - Khi kế thừa class con được hưởng tất cả các phương thức và thuộc tính của class cha, và có thể có thêm thuộc tính, phương thức của riêng mình. 
 - Class con chỉ được truy cập các thành viên `public` và `protected` của class cha, không được phép truy cập đến thành viên `private` của class cha.
 - Cú pháp: Sử dụng từ khóa `extends` để kế thừa

```java
class Subclass_name extends Superclass_name {  
   //methods and fields
}
```
- Một số kiểu kế thừa

![Inheritance](https://viettuts.vn/images/java/cac-kieu-ke-thua.jpg "Inheritance")

```java
class Animal {
    void moving(){
        System.out.print("Moving...\n");
    }
}
class Cat extends Animal {
    void sound(){
        System.out.print("meowww~~\n");
    }
}
class babyCat extends Cat {
    void hungry(){
        System.out.print("milkkkk~~\n");
    }
}
public class Java_OOP {
    public static void main(String[] args) {
        Cat cat = new Cat();
        babyCat kitty = new babyCat();
        kitty.moving();
        kitty.sound();
    }   
}
```
```
Moving...
meowww~~
```
- Lưu ý : Đa kế thừa trong java không được support thông qua class (1 class kế thừa nhiều class khác)

 ### **3.3. Polymorphism**
 - Đa hình trong java (Polymorphism) : có thể thực hiện một hành động bằng nhiều cách khác nhau
- Có 2 kiểu của đa hình trong java, đó là đa hình lúc biên dịch (compile) và đa hình lúc thực thi (runtime).
- Có thể thực hiện đa hình trong java bằng cách `nạp chồng phương thức` và `ghi đè phương thức`.
> `Nạp chồng phương thức` trong java xảy ra nếu 1 class có nhiều phương thức có tên giống nhau nhưng khác nhau về kiểu dữ liệu hoặc số lượng các tham số.

> Nếu class con cung cấp sự cài đặt cụ thể cho phương thức đã được cung cấp bởi một class cha của nó được gọi là `ghi đè phương thức`

- Các nguyên tắc ghi đè phương thức trong java:
    - Phương thức phải có tên giống với lớp cha.
    - Phương thức phải có tham số giống với lớp cha.
    - Lớp con và lớp cha có mối quan hệ kế thừa.
 ### **3.4. Common Modifiers**
- Có hai loại Access Modifier trong Java, đó là: `Access Modifier` và `Non-access Modifier`
- `Access Modifer` trong Java xác định phạm vi có thể truy cập của biến, phương thức, constructor hoặc lớp.
- Có 4 phạm vi truy cập của Access Modifier như sau: `private`, `default`, `protected`, `public`

![Common Modifiers](https://media.geeksforgeeks.org/wp-content/uploads/20220504160344/ModifiersTypesInJavapng.jpg "Common Modifiers")

- Có nhiều Non-access Modifier như  `static`, `abstract`, `synchronized`, `native`, `volatile`,...

 ### **3.5. Modifier static**
 - Từ khóa `static` trong Java được sử dụng chính để quản lý bộ nhớ. Chúng ta có thể áp dụng từ khóa static với các biến, các phương thức, các khối, các lớp lồng nhau(nested class). 
 - Từ khóa `static` thuộc về lớp chứ không thuộc về instance(thể hiện) của lớp.

*Biến static*
- Biến static là biến tĩnh,có thể được sử dụng để tham chiếu thuộc tính chung của tất cả đối tượng (mà không là duy nhất cho mỗi đối tượng)
- Sử dụng biến static giúp chương trình của bạn sử dụng bộ nhớ hiệu quả hơn

*Phương thức static*
- Một phương thức static thuộc lớp chứ không phải đối tượng của lớp.
- Một phương thức static gọi mà không cần tạo một instance của một lớp.
- Phương thức static có thể truy cập biến static và có thể thay đổi giá trị của nó.
- Phương thức static không thể sử dụng biến non-static hoặc gọi trực tiếp phương thức non-static.
```java
public class Food {
    String name = "Pizza";
    int size = 12;
    double price = 120.5;
    static boolean eatable = true;
    
    static void buy(){
        System.out.println("Purchased!");
    }
    static void change(){
        eatable = false;
    }
    public static void main(String[] args) {
        Food.buy();
        Food.change();
        System.out.println(Food.eatable);
    }   
}
```
*Khối static*
- Được sử dụng để khởi tạo thành viên dữ liệu static.
- Được thực thi trước phương thức main tại lúc tải lớp.
```java
public class A2 {
    static {
        System.out.println("Khối static: hello !");
    }
 
    public static void main(String args[]) {
        System.out.println("Main: hello !");
    }
}
```

```
Khối static: hello !
Main: hello !
```

 ### **3.6. Interfaces**
- `Interface` trong Java là một bản thiết kế của một lớp
- `Interface` chỉ có các phương thức trừu tượng.
- Một `Interface` trong Java là một tập hợp các phương thức trừu tượng. Một class triển khai một interface, do đó kế thừa các phương thức abstract của interface.
- Viết một interface giống như viết một lớp, nhưng chúng có 2 định nghĩa khác nhau. 
    - Một lớp mô tả các thuộc tính và hành vi của một đối tượng. 
    - Một interface chứa các hành vi mà một class triển khai.

- Ví dụ : Printable Interface chỉ có một phương thức, trình triển khai của nó được cung cấp bởi lớp A.
```java
interface printable {  
void print();  
}    
class A6 implements printable {  
    public void print() {
        System.out.println("Hello");
    }  
   
    public static void main(String args[]){  
        A6 obj = new A6();  
        obj.print();  
    }
}   
```
- Khác biệt giữa interface và class:
    - Không thể khởi tạo một interface.
    - Một interface không chứa bất cứ hàm Contructor nào.
    - Tất cả các phương thức của interface đều là abstract.
    - Một interface không thể chứa một trường nào trừ các trường vừa static và final.
    - Một interface không thể kế thừa từ lớp, nó được triển khai bởi một lớp.
    - Một interface có thể kế thừa từ nhiều interface khác.
 ### **3.7. Abstract Classes**
- Một lớp được khai báo với từ khóa `abstract` là lớp abstract trong Java. Lớp abstract có nghĩa là lớp trừu tượng, nó có thể có các phương thức abstract hoặc non-abtract.
- `Phương thức trừu tượng` : 
    - phương thức được khai báo là abstract và không có trình triển khai.
    - Không có định nghĩa, được theo sau bởi dấu chấm phảy, không có dấu ngoặc nhọn theo sau
    ```java
    abstract void printStatus();
    ```
- Ví dụ : Bike là lớp trừu tượng chỉ chứa một phương thức trừu tượng là run. Trình triển khai của nó được cung cấp bởi lớp Honda.
```java
abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
    void run() {
        System.out.println("running safely..");
    }
 
    public static void main(String args[]) {  
        Bike obj = new Honda4();  
        obj.run();  
    }  
}  
```
```
running safely..
```
