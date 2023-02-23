## **[JAVA] - Buổi 4**

## **1. Package trong Java**

- `package` : trong Java là 1 nhóm các classes, interfaces, sub-packages tương tự nhau
- 2 loại : package được `dựng sẵn` (java, lang, awt, javax, swing, net, io, util, sql...) và package do `người dùng định nghĩa`
- Có 3 cách để truy cập package từ package bên ngoài:
    - Khai báo import package.*;
    ```java
    import food.*;
    Pizza myFood = new Pizza();
    ```
    - Khai báo import package.classname;
    ```java
    import food.Pizza;
    Pizza myFood = new Pizza();
    ```
    - Sử dụng tên đầy đủ.
    ```java
    food.Pizza myFood = new food.Pizza();
    ```

## **2. Exception Handling**

- Trong java, `exception` (ngoại lệ) là một sự kiện làm gián đoạn luồng bình thường của chương trình. 
- Hệ thống cấp bậc của các lớp ngoại lệ trong Java

<p align="center">
    <img src="https://viettuts.vn/images/java/exception-handling/exception-handling-trong-java.png">

- Có hai loại ngoại lệ chính là: `checked` và `unchecked`
- `Checked Exception` : 
    - Các lớp extends từ lớp `Throwable` ngoại trừ `RuntimeException` và `Error` được gọi là checked exception
    - vd : `Exception`, `SQLException`,... 
    - Các ngoại lệ checked exception được kiểm tra tại compile-time.
- `Unchecked Exception` :
    - Các lớp extends từ `RuntimeException` được gọi là unchecked exception 
    - vd : `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`,... 
    - Các ngoại lệ unchecked được kiểm tra tại runtime.
    
<p align="center">
    <img src="https://lh5.googleusercontent.com/WqqNoyFEkZXfmZBBQjgIutY72_BUV6_By_BAe7Ih9u36HfelS3nTWQEYtdRUkQS32Tuhg9P9CUXo-jgvOpkO84vLm2viI4Od0BNustwONdMm7DKZnKC6kyVHyRJbsESLIPV4uBU">

- 5 từ khóa xử lý ngoại lệ : try, catch, finally, throw, throws

### **2.1. Khối lệnh try**
- Được sử dụng để chứa một đoạn code có thế xảy ra một ngoại lệ
- Phải được khai báo trong phương thức.
- Sau một khối lệnh try phải khai báo khối lệnh catch hoặc finally hoặc cả hai.
- Nếu một câu lệnh trong try có lỗi thì try dừng ngay lập tức và nhảy vào khối catch tương ứng.
### **2.2. Khối lệnh catch**
- Khối catch trong java được sử dụng để xử lý các Exception
- Phải được sử dụng sau khối try.
- Có thể sử dụng nhiều khối catch với một khối try duy nhất.
### **2.3. Khối lệnh finally**
- Được sử dụng để đóng kết nối, đóng stream,...
- Luôn được thực thi dù Exception có xảy ra hay không hoặc khi gặp lệnh return trong khối try.
- Được khai báo sau khối lệnh try hoặc catch.
- Một khối try thì chỉ được 1 khối finally.
- Khối finally không được thực thi nếu có System.exit hoặc chương trình gặp lỗi chết.
### **2.4 Từ khóa throw**
- Dùng để ném ra một Exception cụ thể.
- Thường dùng cho Exception mà người dùng tự định nghĩa.
```java
throw new java.io.IOException("device error"); 
```
### **2.5 Từ khóa throws**
- Dùng để khai báo một Exception.
- Dùng để đánh dấu một method có chứa throw.
```java
return_type method_name() throws exception_class_name {
// method code
}
```
## **3. Custom exception**
- Tạo custom exception `IncorrectFileNameException` :

```java
public class IncorrectFileNameException extends Exception { 
    public IncorrectFileNameException(String errorMessage) {
        super(errorMessage);
    }
}
```
- Sử dụng custom exception:
```java
try (Scanner file = new Scanner(new File(fileName))) {
    if (file.hasNextLine())
        return file.nextLine();
} catch (FileNotFoundException e) {
    if (!isCorrectFileName(fileName)) {
        throw new IncorrectFileNameException("Incorrect filename : " + fileName );
    }
    //...
}
```