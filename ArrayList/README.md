
Ưu điểm:
---

Chạy rất tốt đối với các chức năng không làm thay đổi kích thước của mảng như get, replace, size,... (O(1) ~ O(nlogn))

Nhược điểm: 
---

Chạy không tốt đối với các chức năng làm thay đổi kích thước của mảng như add, insert, remove... (O(logn) ~ O(n))

Tóm tắt các chức năng của MyArray
---

MyArray(): (Constructor) Tạo một mảng với kích thước bằng 0

MyArray(int value): (Constructor) Tạo một mảng với kích thước bằng value

MyArray(int[] arr): (Constructor) Tạo một mảng chứa tất cả các phần tử trong arr

add(int value): Thêm một giá trị value vào cuối mảng

addLast(int value): Thêm một giá trị value vào cuối mảng

addFirst(int value): Thêm một giá trị value vào đầu mảng

insert(int value, int index): Chèn một value tại index

int get(int index): Lấy giá trị tại index

replace(int value, int index): Thay đổi giá trị tại index bằng value

removeAt(int index): Xóa một giá trị tại index

remove(int value): Xóa một value trong mảng

int size(): Trả về kích thước của mảng = index cuối + 1

sort(): Sắp xếp mảng theo giá trị tăng dần

sort(boolean isSortAscending): Sắp xếp mảng theo giá trị tăng dần (isSortAscending=true) hoặc giảm dần (isSortAscending=false)

int indexOf(int value): Trả về index đầu tiên chứa value. -1 nếu không có value trong mảng

int lastIndexOf(int value): Trả về index cuối cùng chứa value. -1 nếu không có value trong mảng

boolean contains(int value): Trả về true nếu có value trong mảng và ngược lại

clear(): Xóa tất cả phần tử trong mảng

String toString(): Trả về mảng
