# Git Learning

## `Định nghĩa`

`Git là một hệ thống quản lý mã nguồn (code) phân tán (Distributed Version Control System - DVCS) được thiết kế để theo dõi các thay đổi trong mã nguồn (thực chất đơn giản chỉ là 1 folder) khi nhiều người cùng làm việc trên dự án phần mềm.`

### 1. **`Phần mềm (System - Hệ thống) Quản lý Phiên bản (Version Control System - VCS)`:**

- **`Khái niệm`**: `Là một phần mềm (có thể gọi là một hệ thống, vì nó bao gồm phần mềm cài trên máy cá nhân và các server chứa repo như github, gitlab, bitbucket) giúp theo dõi sự thay đổi và duy trì lịch sử của mã nguồn
(folder dự án, gọi nhanh là code hoặc source code) trong thời gian phát triển phần mềm`.
- **`Đối tượng quản lý`:** `File và thư mục`.

### 2. **`Quản lý Phiên bản Phân tán (Distributed Version Control System - DVCS)`:**

- **`Khái niệm`**:
  `Mỗi máy tính cá nhân của lập trình viên sẽ đều xem được toàn bộ lịch sử của mã nguồn (source
code), khác với các hệ thống khác như như svn`.
- **`Ưu điểm`**:
  `Cho phép phát triển dự án trên nhiều máy tính cá nhân cùng lúc, trước khi hợp nhất tại remote repository (ví dụ: git@github.com:gernhan/git-learning.git) tại 1 remote server nào đó (ví dụ github.com)`.

### 3. **Repository (`Mỗi dự án sẽ có 1 repository tương ứng trên server`):**

- **Local Repository**: `Một bản sao của toàn bộ dự án nằm trên máy tính cá nhân của mỗi lập
trình viên, chính là folder chứa code`.
- **Remote Repository**: `Một bản sao chung của dự án được lưu trữ trên máy chủ (ví dụ: GitHub,
GitLab), ví dụ: git@github.com:gernhan/git-learning.git`.

### 4. **Commit (`Mốc lưu lại các thay đổi`)**

- **`Khái niệm`
  **: `Ghi lại sự thay đổi trong mã nguồn tại một thời điểm cụ thể. Mỗi commit có một thông điệp mô tả về thay đổi đó`.
- **`Mục đích`
  **: `Duy trì lịch sử, theo dõi thay đổi và tạo ra một điểm kiểm soát có thể quay trở lại`.

### 5. **Branch (`Nhánh`)**

- **`Khái niệm`:** `Một nhánh là một dãy commit liên tiếp, bắt đầu từ một commit cha chung`.
- **`Mục đích`:** `Cho phép phát triển đồng thời nhiều tính năng mà không làm ảnh hưởng đến nhau`.

### 6. **Merge (`Hợp nhất`):**

- **`Khái niệm`:** `Kết hợp các thay đổi từ một nhánh vào nhánh khác`.
- **`Mục đích`:** `Hợp nhất công việc đã được phát triển đồng thời trên các nhánh riêng biệt`.

### 7. **Pull Request** (`Là một yêu cầu được tạo ra nhằm gộp các commit từ 1 nhánh vào 1 nhánh khác, thường sẽ nhờ 1 người khác review (duyệt lại) và merge (hợp nhất) code`):

- **`Khái niệm`**: `Trên các nền tảng như GitHub, GitLab, Pull Request là một yêu cầu được tạo
ra về việc hợp nhất thay đổi từ một nhánh vào nhánh chính (thường là master). Cách tạo 1 pull request thường
thông qua giao diện web của repository`.
- **`Mục đích`**: `Kiểm tra và duyệt lại code trước khi hợp nhất`.

### 8. **Conflict (`Xung đột`):**

- **`Khái niệm`:** `Xảy ra khi hai nhánh cố gắng thay đổi cùng một phần của một tập tin (Ví dụ
cùng thay đổi dòng thứ 10 của 1 file nào đó)`.
- **`Giải quyết`:
  ** `Là quá trình thủ công, lựa chọn thay đổi nào sẽ được giữ lại. Quá trình này gọi là Resolve Conflicts`.

### 9. **Git Ignore:**

- **`Khái niệm`:** `Một tệp tin đặc biệt (`.gitignore`) để chỉ định những tệp và thư mục nào không nên được theo dõi bởi Git`.

### 10. **Tag:**

- **`Khái niệm`:** `Một "đánh dấu" ở một commit cụ thể để đánh dấu một điểm trong lịch sử`.
- **`Mục đích`:** `Được sử dụng để chỉ ra các phiên bản phần mềm (ví dụ: `v1.0`)`.

### `Tóm tắt`:

`Git cung cấp một hệ thống mạnh mẽ để quản lý lịch sử và phiên bản của mã nguồn (source code). Bằng cách sử dụng các khái niệm như repository, commit, branch và merge, Git giúp các nhóm phát triển phần mềm làm việc hiệu quả và duy trì mã nguồn của họ một cách an toàn`.

## `Các lệnh cơ bản` (Git Commands)

`Dưới đây là một danh sách các lệnh Git từ cơ bản đến nâng cao`:

### **`Cơ Bản`:**

1. **`git init`**: `Khởi tạo một repository Git mới`.

2. **`git clone <repository_url>`**: `Sao chép một repository từ xa`.

3. **`git add <file>`**: `Thêm file vào index (staging area) để chuẩn bị commit`.

4. **`git add .`** `hoặc` **`git add -A`**: `Thêm tất cả các thay đổi vào index`.

5. **`git commit -m "message"`**: `Commit các thay đổi đã được thêm vào index với một thông điệp mô tả`.

6. **`git status`**: `Hiển thị trạng thái của các file trong working directory, index và HEAD`.

7. **`git log`**: `Xem lịch sử commit`.

### **`Nhánh và Merge`:**

1. **`git branch`**: `Liệt kê tất cả các nhánh trong repository`.

2. **`git branch <branch_name>`**: `Tạo một nhánh mới`.

3. **`git checkout <branch_name>`**: `Chuyển đổi sang một nhánh khác`.

4. **`git merge <branch_name>`**: `Hợp nhất một nhánh vào nhánh hiện tại`.

5. **`git branch -d <branch_name>`**: `Xóa một nhánh đã được merge`.

6. **`git branch -D <branch_name>`**: `Xóa một nhánh mà không cần kiểm tra đã merge hay chưa`.

### **Remote Repository:**

1. **`git remote add <name> <url>`**: `Thêm một remote repository`.

2. **`git remote -v`**: `Hiển thị danh sách các remote repository`.

3. **`git fetch <remote>`**: `Lấy tất cả các thay đổi từ remote repository, nhưng không hợp nhất vào working directory`.

4. **`git pull <remote> <branch>`**: `Lấy và hợp nhất thay đổi từ remote repository vào working directory`.

5. **`git push <remote> <branch>`**: `Đẩy các thay đổi từ local repository lên remote repository`.

### **`Xem Thay Đổi`:**

1. **`git diff`**: `Xem sự khác biệt giữa working directory và index`.

2. **`git diff --staged`**: `Xem sự khác biệt giữa index và HEAD`.

3. **`git diff <commit_id_1> <commit_id_2>`**: `Xem sự khác biệt giữa hai commit`.

### **`Hoàn Tác và Reset`:**

1. **`git reset <file>`**: `Bỏ một file khỏi index, giữ nguyên thay đổi trong working directory`.

2. **`git reset --hard <commit_id>`**: `Đặt HEAD và index về một commit cụ thể, xóa tất cả các thay đổi chưa commit`.

3. **`git revert <commit_id>`**: `Tạo một commit mới để hoàn tác các thay đổi của một commit cụ thể`.

### **`Tag và Release`:**

1. **`git tag <tag_name>`**: `Đánh dấu một commit với một tag`.

2. **`git tag -a <tag_name> -m "message"`**: `Đánh dấu một commit với một annotated tag (bao gồm thông điệp)`.

3. **`git push --tags`**: `Đẩy tất cả các tags lên remote repository`.

### **Stash:**

1. **`git stash`**: `Ẩn thay đổi chưa commit để làm việc trên một nhánh khác`.

2. **`git stash list`**: `Liệt kê tất cả các stash`.

3. **`git stash apply`**: `Áp dụng thay đổi từ stash mới nhất mà không xóa nó`.

### **`Log và Lịch Sử`:**

1. **`git log`**: `Xem lịch sử commit`.

2. **`git log --oneline`**: `Xem lịch sử commit ngắn gọn`.

3. **`git log --graph --oneline --all`**: `Hiển thị lịch sử commit dưới dạng đồ thị`.

### **Config:**

1. **`git config --global user.name "Your Name"`**: `Thiết lập tên người dùng toàn cầu`.

2. **`git config --global user.email "your.email@example.com"`**: `Thiết lập email người dùng toàn cầu`.

3. **`git config --list`**: `Liệt kê tất cả cấu hình Git`.

### **`Tham Khảo`:**

- [Git Official Documentation](https://git-scm.com/doc)

`Hãy nhớ kiểm tra [tài liệu chính thức của Git](https://git-scm.com/doc) để biết thêm chi tiết và lựa chọn linh hoạt trong việc sử dụng các lệnh này`.
