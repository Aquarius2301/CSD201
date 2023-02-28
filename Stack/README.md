Stack (hàng đợi) giống như cơ chế của LIFO, tức là cái nào vào sau thì ra trước

Các bạn có thể tự làm nó vì nó rất đơn giản (làm bằng array hay node đều được) vì nó chỉ có hai chức năng chính là 
thêm giá trị vào cuối stack và lấy giá trị tại cuối stack

Các chức năng stack
---

Stack(): (Constructor) Tạo một stack với kích thước bằng 0

Stack(int size): (Constructor) Tạo một stack với tất cả các giá trị bằng 0

Stack(int[] arr): (Constructor) Tạo một stack với tất cả phần tử trong mảng arr

push(int value): Thêm một value vào cuối stack

peek(): Lấy giá trị cuối stack

poll(): Lấy giá trị cuối stack và xóa giá trị đó

boolean isEmpty(): Kiểm tra stack có rỗng hay không

int size(): Lấy kích thước của stack
