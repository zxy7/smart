package com.jinhe.smart.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;




/**
 * @author lazyeraser
 * 文件操作工具
 */
public class FileHelper {

	/**
	 * @param file 文件本体（字节）
	 * @param filePath 目标目录
	 * @param fileName 文件名
	 * @throws IOException
	 * 写入文件
	 */
	public static void writeFile(byte[] file, String filePath, String fileName) throws IOException  {
		FileOutputStream fos = null;	
		try {
			File destDir = new File(filePath);
			if (!destDir.exists()) {
				destDir.mkdir();
			}
			fos = new FileOutputStream(new File(destDir, fileName));
			fos.write(file);
			fos.flush();
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
//		Utils.mPrint("写入文件成功!" + filePath + "/" + fileName);
	}
	
	/**
	 * @param filePath 文件所在目录
	 * @param fileName 文件名
	 * @return 是否存在
	 */
	public static boolean isFileExists(String filePath, String fileName) {
		File destDir = new File(filePath);
		if (!destDir.exists()) {
			return false;
		}
		File file = new File(destDir, fileName);
		return file.exists();
	}
}
