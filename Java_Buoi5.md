# **[JAVA] - Buổi 5**

## **1. Giới thiệu về Java Swing**
- Là một phần của Java Foundation Classes (JFC) được sử dụng để tạo các ứng dụng window-based
- Được xây dựng trên API AWT (Abstract Windowing Toolkit) và được viết hoàn toàn bằng Java
- Gói `javax.swing` cung cấp các lớp cho java swing API như JButton, JTextField, JTextArea, JRadioButton, JCheckbox, JMenu, JColorChooser
- Tuân theo mô hình MVC

## **2. Hệ thống phân cấp của API java swing**

![](https://viettuts.vn/images/java-swing/phan-cap-cac-lop-java-swing.jpg)

**Các phương thức thường dùng của lớp Component**

| Phương thức      | Mô tả |
| ----------- | ----------- |
| public void add(Component c)      | thêm một thành phần vào thành phần khác       |
| public void setSize(int width, int height)   | thiết lập kích thước của thành phần        |
| public void setLayout(LayoutManager m)	| thiết lập trình quản lý bố cục (layout) cho thành phần  |
| public void setVisible(boolean b)	|  thiết lập khả năng hiển thị của thành phần, mặc định là false (ẩn) |

## **3. Ví dụ về Java Swing, JFrame**
- Có hai cách để tạo khung (Frame):
    - Tạo đối tượng của lớp JFrame
    - Kế thừa lớp JFrame
- Code của Swing có thể được viết bên trong hàm main(), constructor hoặc bất kỳ phương thức nào khác

**Cách 1**

```java
public class JavaSwing {
    JFrame f;
    public JavaSwing() { // constructor
        f = new JFrame();// tạo thể hiện của JFrame
        JButton b = new JButton("click");// tạo thể hiện của JButton
        b.setBounds(130, 50, 100, 40);
        f.add(b);// thêm button vào JFrame
        f.setSize(400, 200);// thiết lập kích thước cho của sổ
        f.setLayout(null);// không sử dụng trình quản lý bố cục
        f.setVisible(true);// hiển thị cửa sổ
    }
}
```
**Cách 2**

```java
public class JavaSwing extends JFrame {// kế thừa lớp JFrame
    public JavaSwing() { // constructor
        JButton b = new JButton("click");// tạo button
        b.setBounds(130, 50, 100, 40);
        add(b);// thêm button vào JFrame
        setSize(400, 200);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JavaSwing();
    }
}
```
## **4. Một số lớp trong Java Swing**

### **JFrame**
JFrame là một container(Nơi chứa và sắp xếp các component khác của Java Swing, có thể là các container khác) trong ứng dụng Java Swing, nó được dùng để chứa và sắp xếp các phần con như Button, Label, TextField…

[JFrame](https://www.javatpoint.com/java-jframe)

### **JTextField**

JTextField là một component cho phép nhập và chỉnh sữa đoạn văn bản trên cùng một dòng vì thế nó thường phù hợp cho việc nhập, chỉnh sửa các thông tin dạng ngắn gọn, còn những thông tin dài hơn thì chúng ta có thể sử dụng JTextArea cho phép nhập, chỉnh sửa dữ liệu trên nhiều dòng.

[JTextField](https://www.javatpoint.com/java-jtextfield)

### **JButton**
Lớp JButton trong Java Swing được sử dụng để tạo một nút có thể click, tạo một sự kiện (event) khi được nhấn. Kế thừa lớp AbstractButton

[JButton](https://www.javatpoint.com/java-jbutton)

### **JPanel**
JPanel trong Java Swing được sử dụng để tạo ra các container nơi chứa các phần tử khác. Nhiệm vụ chính của JPanel là tổ chức các thành phần, nhiều bố cục khác nhau có thể được thiết lập trong JPanel giúp tổ chức các thành phần tốt hơn, tuy nhiên nó không có thanh tiêu đề như JFrame.

[JPanel](https://www.javatpoint.com/java-jpanel)

### **JMenu**
Lớp JMenu trong Java biểu diễn thành phần pull-down menu mà được triển khai từ một thanh trình đơn. Để tạo một menu trong Java Swing chúng ta phải sử dụng các class sau:
- JMenuBar – Tạo một menu bar.
- JMenu – Tạo menu.
- JMenuItem – Các phần tử con trong JMenu.
- JMenuItemListener – Tạo các trình xử lý sự kiện.

[JMenu](https://www.javatpoint.com/java-jmenuitem-and-jmenu)

### **JLabel**
Lớp JLabel trong Java Swing có thể hiển thị hoặc text, hoặc hình ảnh hoặc cả hai. Các nội dung của Label được gán bởi thiết lập căn chỉnh ngang và dọc trong khu vực hiển thị của nó. Theo mặc định, các label được căn chỉnh theo chiều dọc trong khu vực hiển thị. Theo mặc định, text-only label là căn chỉnh theo cạnh, image-only label là căn chỉnh theo chiều ngang.

[JLabel](https://www.javatpoint.com/java-jlabel)

### **JComboBox**
JComboBox là một thành phần của Java Swing kế thừa từ JComponent class, nó cho phép hiển thị một popup menu gồm một danh sách các phần tử là các tuỳ chọn, người dùng có thể chọn một trong số những tuỳ chọn này. JComboBox có thể chỉnh sửa hoặc read-only tùy thuộc vào sự lựa chọn của lập trình viên.

[JComboBox](https://www.javatpoint.com/java-jcombobox)