
Ưu điểm:
---

Chạy rất tốt với chức năng thêm, xóa dữ liệu tại index đầu tiên (addFirst(), removeFirst())

Nhược điểm: 
---

Vì đây không phải array nên việc lấy dữ liệu, thay đổi hay những chức năng yêu cầu phải dựa
vào index trở nên khó khăn (vì phải chạy từ đầu list tới cuối list).

Phải dùng có ít nhất hai class

Phải có kiến thức cơ bản về node mới làm được

---

MyArray(): (Constructor) Tạo một list có kích thước bằng 0 

MyArray(int value): (Constructor) Tạo một list với kích thước bằng value 

MyArray(int[] arr): (Constructor) Tạo một list chứa tất cả các phần tử trong arr 

add(int value): Thêm một giá trị value vào cuối list

addLast(int value): Thêm một giá trị value vào cuối list

addFirst(int value): Thêm một giá trị value vào đầu list 

insert(int value, int index): Chèn một value tại index 
 
int get(int index): Lấy giá trị tại index 

replace(int value, int index): Thay đổi giá trị tại index bằng value

removeAt(int index): Xóa một giá trị tại index 

remove(int value): Xóa một value trong list

removeFirst(): Xóa value đầu tiên trong list

removeLast(): Xóa value cuối cùng trong list

int size(): Trả về kích thước của list = index cuối + 1

sort(): Sắp xếp list theo giá trị tăng dần 

sort(boolean isSortAscending): Sắp xếp list theo giá trị tăng dần (isSortAscending=true) hoặc giảm dần (isSortAscending=false)

int indexOf(int value): Trả về index đầu tiên chứa value. -1 nếu không có value trong list

int lastIndexOf(int value): Trả về index cuối cùng chứa value. -1 nếu không có value trong list 

boolean contains(int value): Trả về true nếu có value trong list và ngược lại

clear(): Xóa tất cả phần tử trong list

String toString(): Trả về list
