
Ưu điểm:
---

Chạy rất tốt đối với các chức năng chỉ lấy giá trị hoặc thay đổi giá trị trong mảng như get, replace,...

Đơn giản, dễ làm chỉ cần array là được (các bạn có thể tự làm)

Nhược điểm: 
---

Vì sử dụng array nên sẽ chạy không tốt đối với các chức năng làm thay đổi kích thước của mảng như add, insert, remove...

Tóm tắt các chức năng của MyArray
---

MyArray(): (Constructor) Tạo một mảng với kích thước bằng 0 (O(1))

MyArray(int value): (Constructor) Tạo một mảng với kích thước bằng value (O(1))

MyArray(int[] arr): (Constructor) Tạo một mảng chứa tất cả các phần tử trong arr (O(n))

add(int value): Thêm một giá trị value vào cuối mảng (O(n))

addLast(int value): Thêm một giá trị value vào cuối mảng (O(n))

addFirst(int value): Thêm một giá trị value vào đầu mảng (O(n))

insert(int value, int index): Chèn một value tại index (O(logn)~O(n))
 
int get(int index): Lấy giá trị tại index (O(1))

replace(int value, int index): Thay đổi giá trị tại index bằng value (O(1))

removeAt(int index): Xóa một giá trị tại index (O(logn)~O(n))

remove(int value): Xóa một value trong mảng (O(n)~O(nlogn))

int size(): Trả về kích thước của mảng = index cuối + 1 (O(1))

sort(): Sắp xếp mảng theo giá trị tăng dần  (O(nlogn))

sort(boolean isSortAscending): Sắp xếp mảng theo giá trị tăng dần (isSortAscending=true) hoặc giảm dần (isSortAscending=false) (O(nlogn))

int indexOf(int value): Trả về index đầu tiên chứa value. -1 nếu không có value trong mảng (O(logn)~O(n))

int lastIndexOf(int value): Trả về index cuối cùng chứa value. -1 nếu không có value trong mảng (O(logn)~O(n))

boolean contains(int value): Trả về true nếu có value trong mảng và ngược lại (O(logn)~O(n))

clear(): Xóa tất cả phần tử trong mảng (O(1))

String toString(): Trả về mảng
