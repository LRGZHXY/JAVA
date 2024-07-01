package shiyan9;

import java.io.*;

public class FileCopy {

    public static void copyFile(String sourceFile, String destFile) {
        File source = new File(sourceFile);
        File destination = new File(destFile);

        if (!source.exists() || !source.isFile()) {
            System.err.println("源文件不存在或不是一个文件: " + sourceFile);
            return;
        }

        if (destination.isDirectory()) {
            System.err.println("目标路径是一个目录，请提供文件路径: " + destFile);
            return;
        }

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("文件复制成功。");
        } catch (IOException e) {
            System.err.println("发生IOException: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("请输入源文件路径: ");
        String sourceFile = scanner.nextLine();

        System.out.print("请输入目标文件路径: ");
        String destFile = scanner.nextLine();

        scanner.close();

        copyFile(sourceFile, destFile);
    }
}


