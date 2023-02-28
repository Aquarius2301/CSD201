Queue (hàng đợi) giống như cơ chế của FIFO, tức là cái nào vào trước thì ra trước

Các bạn có thể tự làm nó vì nó rất đơn giản (làm bằng array hay node đều được) vì nó chỉ có hai chức năng chính là 
thêm giá trị vào cuối queue và lấy giá trị tại đầu queue

Các chức năng queue
---

Queue(): (Constructor) Tạo một queue với kích thước bằng 0

Queue(int size): (Constructor) Tạo một queue với tất cả các giá trị bằng 0

Queue(int[] arr): (Constructor) Tạo một queue với tất cả phần tử trong mảng arr

add(int value): Thêm một value vào cuối queue

peek(): Lấy giá trị đầu queue

poll(): Lấy giá trị đầu queue và xóa giá trị đó

boolean isEmpty(): Kiểm tra queue có rỗng hay không

int size(): Lấy kích thước của queue
