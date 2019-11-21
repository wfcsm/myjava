package com.mycollection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.*;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class TestIo12 {
    public static void main(String[] args) throws IOException {
//        文件的大小
        long len=FileUtils.sizeOf(new File("aaa.pdf"));
        System.out.println(len);
//        读文件或目录大小
        len = FileUtils.sizeOf(new File("/Users/zyc/IdeaProjects/MyPro06/src/com/mycollection"));
        System.out.println(len);

//        列出子孙级
        Collection<File> files=FileUtils.listFiles(new File("/Users/zyc/IdeaProjects/MyPro06/src/com/mycollection"),
                FileFilterUtils.orFileFilter(new SuffixFileFilter("java"),new SuffixFileFilter("class")) ,
                                                            DirectoryFileFilter.DIRECTORY);
        for(File file:files){
            System.out.println(file);
        }

        String msg = FileUtils.readFileToString(new File("dest.txt"), "utf-8");
        System.out.println(msg);

    }
}
