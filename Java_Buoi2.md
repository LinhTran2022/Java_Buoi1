# **[JAVA] - Buổi 2**

## **1. Collection và Collections**

### **1.1 Phân biệt Collection và Collections**
**Collection**
- `Collection` trong java là một root interface trong hệ thống cấp bậc Collection. 
- Java Collection cung cấp nhiều interface (Set, List, Queue, Deque,...) và các class (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet,...)

**Collections**

- `Collections` trong java là một khuôn khổ cung cấp một kiến trúc để lưu trữ và thao tác tới nhóm các đối tượng
- Có thể thực hiện các thao tác trên dữ liệu như tìm kiếm, phân loại, chèn, xóa,... sử dụng Java Collections.

<p align="center">
    <img src="https://viettuts.vn/images/java/java-collection/colection-vs-collections-trong-java.png">

### **1.2 Hệ thống cấp bậc Collection**
Gói `java.util` chứa tất cả các lớp và interface của Collection.

<p align="center">
    <img src="https://static.javatpoint.com/images/java-collection-hierarchy.png">

**Iterable interface** : chứa dữ liệu thành viên Iterator interface

**Iterator interface** : cung cấp phương tiện để lặp đi lặp lại các thành phần từ đầu đến cuối của một collection.

**Phương thức của Iterator interface**
| Phương thức | Mô tả       | 
| ----------- | ----------- |
| public boolean hasNext()  |  Trả về true nếu iterator còn phần tử kế tiếp phần tử đang duyệt |
| public object next() | trả về phần tử hiện tại và di chuyển con trỏ trỏ tới phần tử tiếp theo | 
| public void remove() | loại bỏ phần tử cuối được trả về bởi Iterator. Nó hiếm khi được sử dụng. | 

### **1.3 Một số method của Interface Collection**

Các method này sẽ được các Interface con kế thừa lại

| Phương thức | Mô tả       | 
| -------------- | ------------- |
| boolean add(Object element) | Được sử dụng để chèn một phần tử vào collection |
| boolean addAll(Collection c) | Được sử dụng để chèn các phần tử collection được chỉ định vào collection gọi phương thức này |
| boolean remove(Object element) | Được sử dụng để xóa phần tử từ collection |
| boolean removeAll(Collection c) | Được sử dụng để xóa tất cả các phần tử của collection được chỉ định từ collection gọi phương thức này |
| boolean retainAll(Collection c) | Được sử dụng để xóa tất cả các thành phần từ collection gọi phương thức này ngoại trừ collection được chỉ định |
| int size() |  Trả lại tổng số các phần tử trong collection |
| void clear() | Loại bỏ tổng số của phần tử khỏi collection |
| boolean contains(Object element) | Được sử dụng để tìm kiếm phần tử |
| boolean containsAll(Collection c) | Được sử dụng để tìm kiếm collection được chỉ định trong collection |
| Iterator iterator() | Trả về một iterator |
| Object[] toArray() | Chuyển đổi collection thành mảng (array) |
| boolean isEmpty() | Kiểm tra nếu collection trống |
| boolean equals(Object element) | So sanh 2 collection |
| int hashCode() | Trả về số hashcode của collection |

### **1.4 Một số method của Collections**

Collections chỉ chứa static method

| Phương thức | Mô tả       | 
| ----------- | ----------- |
| void sort() | sắp xếp collections |
| min(), max() | trả về phần tử nhỏ nhất /lớn nhất trong Collection |
| int binarySearch() | tìm kiếm nhị phân một giá trị |
| void reverse() | đảo ngược collections |
| void copy() | sao chép tất cả các phần tử từ một danh sách này sang một danh sách khác |
| int frequency() | trả về số lượng các phần tử có trong bộ sưu tập được chỉ định bằng đối tượng được chỉ định |
| int indexOfSubList() | trả về vị trí bắt đầu của lần xuất hiện đầu tiên của danh sách mục tiêu được chỉ định trong danh sách nguồn quy định, hoặc -1 nếu không tìm thấy đối tượng chỉ định |

## **2. Một số Collection phổ biến**

#### **2.1 List**
- `List` là một interface trong java. Nó chứa các phương thức để chèn và xóa các phần tử dựa trên chỉ số index

```java
public interface List<E> extends Collection<E>
```
- Một số phương thức thường dùng

| Phương thức | Mô tả       | 
| ----------- | ----------- |
|void add(int index, Object element) | Được sử dụng để chèn các phần tử vào list tại chỉ số index |
| boolean addAll(int index, Collection c) | Được sử dụng để chèn tất cả các yếu tố của c vào danh sách tại chỉ số index |
| object get(int index) | Được sử dụng để trả về đối tượng được lưu trữ tại chỉ số index trong list |
| object set(int index, Object element) | Được sử dụng để gán phần tử cho vị trí được chỉ định index trong list |
| object remove(int index) | Được sử dụng để xóa các phần tử tại vị trí có chỉ số index và trả về phần tử đã xóa |
| ListIterator listIterator() | Được sử dụng để trả về một Iterator mà bắt đầu từ phần tử đầu tiên của list |
| ListIterator listIterator(int index) | Được sử dụng để trả về một Iterator mà phần tử bắt đầu từ chỉ số index chỉ định |

#### **2.2 ArrayList**
- Lớp ArrayList trong java là một lớp kế thừa lớp AbstractList và triển khai của List Interface nên nó sẽ có một vài đặc điểm và phương thức tương đồng với List.
- ArrayList được sử dụng như một mảng động để lưu trữ các phần tử.
- Đặc điểm của ArrayList:
> - Lớp ArrayList trong java có thể chứa các phần tử trùng lặp.
> - Lớp ArrayList duy trì thứ tự của phần tử được thêm vào.
> - Lớp ArrayList là không đồng bộ (non-synchronized).
> - Lớp ArrayList cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục.
> - Lớp ArrayList trong java, thao tác chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.
- Cách khởi tạo
```java
ArrayList list = new ArrayList(); 
ArrayList<String> list = new ArrayList<String>(); 
```
- Constructor

| Constructor | Mô tả       | 
| ----------- | ----------- |
| ArrayList() | Được sử dụng để khởi tạo một danh sách mảng trống |
| ArrayList(Collection c) | Được sử dụng để xây dựng một danh sách mảng được khởi tạo với các phần tử của collection c |
| ArrayList(int capacity) | Được sử dụng để xây dựng một danh sách mảng mà có dung lượng ban đầu được chỉ định |

- Một số phương thức thường dùng

| Phương thức | Mô tả       | 
| ----------- | ----------- |
| boolean add(Object o) | Được sử dụng để nối thêm phần tử được chỉ định vào cuối một danh sách |
| void add(int index, Object element) | Được sử dụng để chèn phần tử element tại vị trí index vào danh sách |
| boolean addAll(Collection c) | Được sử dụng để nối tất cả các phần tử trong collection c vào cuối của danh sách, theo thứ tự chúng được trả về bởi bộ lặp iterator |
| boolean addAll(int index, Collection c) | Được sử dụng để chèn tất cả các phần tử trong collection c vào danh sách, bắt đầu từ vị trí index |
| void retainAll(Collection c) | Được sử dụng để xóa những phần tử không thuộc collection c ra khỏi danh sách |
| void removeAll(Collection c) | Được sử dụng để xóa những phần tử thuộc collection c ra khỏi danh sách |
| int indexOf(Object o) | Được sử dụng để trả về chỉ mục trong danh sách với sự xuất hiện đầu tiên của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này |
| int lastIndexOf(Object o) | Được sử dụng để trả về chỉ mục trong danh sách với sự xuất hiện cuối cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này |
| Object[] toArray() | Được sử dụng để trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự |
| Object[] toArray(Object[] a) | Được sử dụng để trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự |
| Object clone() | Được sử dụng để trả về một bản sao của ArrayList |
| void clear() | Được sử dụng để xóa tất cả các phần tử từ danh sách này |
| void trimToSize() | Được sử dụng để cắt dung lượng của thể hiện ArrayList này là kích thước danh sách hiện tại |
| boolean contains(element) | Kết quả trả về là true nếu tìm thấy element trong danh sách, ngược lại trả về false |

#### **2.3 Map**
- Trong java, map được sử dụng để lưu trữ và truy xuất dữ liệu theo cặp `key` và `value`
- Mỗi cặp key và value được gọi là mục nhập (entry)
- Map trong java chỉ chứa các giá trị key duy nhất
- Một số phương thức của Map Interface

| Phương thức | Mô tả       | 
| ----------- | ----------- |
| Object put(Object key, Object value) | được sử dụng để chèn một mục nhập trong map hiện tại |
| void putAll(Map map) | được sử dụng để chèn map chỉ định vào map hiện tại |
| Object remove(Object key)	| được sử dụng để xóa một mục nhập của key được chỉ định |
| Object get(Object key) |	được sử dụng để trả lại giá trị cho khoá được chỉ định |
| boolean containsKey(Object key) | được sử dụng để tìm kiếm key được chỉ định từ map hiện tại |
| Set keySet() | được sử dụng để trả đối tượng Set có chứa tất cả các keys |
| Set entrySet()	| được sử dụng để trả lại đối tượng Set có chứa tất cả các keys và values |

- **Map.Entry Interface** : là một interface con của Map, cung cấp các phương pháp để truy xuất các key và value.

| Phương thức | Mô tả       | 
| ----------- | ----------- |
| Object getKey()	| được dùng để lấy key |
| Object getValue() | được sử dụng để lấy value |

## **3. List và ArrayList**

[https://www.javatpoint.com/list-vs-arraylist-in-java](https://www.javatpoint.com/list-vs-arraylist-in-java)

| List | ArrayList       | 
| ----------- | ----------- |
| Là một interface | Là 1 class |
| Tạo ra 1 danh sách các đối tượng có thể được truy cập bằng index | Tạo ra mảng động có thể được expand nếu cần |
| List kế thừa từ Collection framework | ArrayList kế thừa AbstractArrayList và implement List |
| System.Collection.Generic	| System.Collection |
| Thao tác nhanh hơn | Thao tác trên các object chậm hơn so vs List |

*Nên sử dụng List nếu muốn tận dụng tính đa hình*

## **4. Sort trong Collections**

- Có thể sắp xếp các phần tử của:
    - Các đối tượng String.
    - Các đối tượng của lớp Wrapper.
    - Các đối tượng của lớp do người dùng định nghĩa (User-defined).
- `public void sort(List list)` : được sử dụng để sắp xếp các phần tử của List (với điều kiện các phần tử của List phải là kiểu Comparable. Nghĩa là lớp các phần tử phải được implements giao diện Comparable)
- Cú pháp :
```java
Collections.sort(list); // mặc định là sắp xếp tăng dần
Collections.sort(list, new Comparator<String>() { // thay đổi hàm compare tùy ý
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
});
```