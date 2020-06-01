package com.dong.findjob.utils;

import java.io.File;

public class FileSrcUtils {

	private static int counter=0;
	
	public static int getCounter(String path) {
		File file=new File(path);
		if(!file.isDirectory()) {
			System.out.println(file.getName()+"   vvvvvvvvvvv"+file.getParentFile());
			return 1;
		}
		File[] files=file.listFiles();
		for(File dirs:files) {
			counter+=getCounter(dirs.toPath().toString());
		}
		return counter;
	}
	
	public static void main(String[] args) {
		String path="C:\\Users\\jzy\\Desktop\\开发";
//		System.out.println(getCounter(path));
		File file=new File(path);
		System.out.println(file.getName());
		tree(file,1);
		
	}
	
	public static void tree(File f,int level) {
		String preStr = "";
		for(int i=0;i<level;i++) {
			preStr += "--";
		}
		File[] childs = f.listFiles();
		for(int i=0;i<childs.length;i++) {
			System.out.println(preStr + childs[i].getName());
			if(childs[i].isDirectory()){
				tree(childs[i],level + 1);
			}
		}
	}

}
