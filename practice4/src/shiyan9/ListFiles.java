package shiyan9;

import java.io.File;

public class ListFiles {

    public static void listFiles(String directoryName, int indent) {
        File directory = new File(directoryName);

        // 获取目录中的所有文件和子目录
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                // 打印缩进以便于阅读
                for (int i = 0; i < indent; i++) {
                    System.out.print(" ");
                }
                // 打印文件或目录的名称
                System.out.println(file.getName());

                // 如果当前文件是目录，递归调用 listFiles 方法
                if (file.isDirectory()) {
                    listFiles(file.getAbsolutePath(), indent + 2);
                }
            }
        } else {
            System.out.println("目录不存在或无法读取：" + directoryName);
        }
    }

    public static void main(String[] args) {
        // 从用户输入获取目录路径
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入要列出文件的目录路径: ");
        String path = scanner.nextLine();
        scanner.close();

        listFiles(path, 0);
    }
}

