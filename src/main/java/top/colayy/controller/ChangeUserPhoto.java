package top.colayy.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class ChangeUserPhoto {

    @RequestMapping("/changeUserPhoto")
    @ResponseBody
    public Map<String,Object> uploadMethod(HttpServletRequest hsr)throws ServletException, IOException {
        //执行成功与否的标签
        boolean mark = false;

        //上传文件环境准备
        //文件  传输到 服务端 ==》服务器存储文件的目录
        String savePath = hsr.getServletContext().getRealPath("/uploadFile");
        System.out.println(savePath);

        //临时目录/缓存目录
        String tempPath = hsr.getServletContext().getRealPath("/tempFile");

        File tmpFile = new File(tempPath);
        if (!tmpFile.exists()){
            tmpFile.mkdir();
        }
        //实现上传
        //Apache文件上传组件中  文件上传工厂
        DiskFileItemFactory factory=new DiskFileItemFactory();
        //设置缓冲区：当上传的文件超过设定缓冲区大小，需要指定一个临时目录，存放上传过程中的流数据
        //阿里OSS   华为OBS
        factory.setSizeThreshold(1024*100);     //100kb
        //绑定上传临时目录
        factory.setRepository(tmpFile);

        //上传前的  流  格式内容准备
        //创建Apache上传组件  上传解析器==》
        ServletFileUpload upload = new ServletFileUpload(factory);
        //进度监听，可有可无
        upload.setProgressListener(new ProgressListener() {
            @Override
            public void update(long haveSize, long totalSize, int i) {
                System.out.println("文件大小为："+totalSize+"，当前已处理："+haveSize);
            }
        });

        //如下较重要配置
        //设定上传文件名的中文编码
        upload.setHeaderEncoding("UTF-8");
        //判定当前请求携带上传数据的流格式是否为formdata形式（普通形式，非Ajax）
        if (!ServletFileUpload.isMultipartContent(hsr)){
            return null;
        }
        //单个文件最大1MB
        upload.setFileSizeMax(1024*1024);
        //设定上传总量10MB
        upload.setSizeMax(1024*1024*10);

        //实现上传流解析
        try {
            List<FileItem> list = upload.parseRequest(hsr);
            for (FileItem item:list){
                //只是文本数据
                if (item.isFormField()){
                    //获取文本域key
                    String name = item.getFieldName();
                    String value = item.getString("UTF-8");
//                    value=new String(value.getBytes("iso-8859-1"),"UTF-8");
                    System.out.println(name+"="+value);
                }else {
                    //获取上传文件名称
                    String fileName = item.getName();
                    System.out.println("文件名称"+fileName);
                    if (fileName==null||fileName.trim().equals("")){
                        continue;
                    }
                    //c:\a\b\c.txt 将此种路径分解
                    fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
                    String fileSuffixName = fileName.substring(fileName.lastIndexOf(".")+1);
                    System.out.println("上传的文件后缀为："+fileSuffixName);

                    //获取上传文件输入流
                    InputStream in = item.getInputStream();
                    //设定真实保存文件名称
                    String saveFileName =makeFileName(fileName);

                    //获取最终存储路径+UUID的文件名称
                    //uploadFile\时间\UUID_xxxx.txt
                    String realSavePath = makePath(savePath);

                    FileOutputStream out = new FileOutputStream(realSavePath+"\\"+saveFileName);

                    //-----这里是存放的路径----
                    String realEndSavePath = realSavePath.substring(realSavePath.lastIndexOf("\\")+1);
//                    System.out.println(realEndSavePath+"\\"+saveFileName);



                    //创建缓冲区
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while ((len=in.read(buffer))!=-1){
                        out.write(buffer,0,len);
                    }
                    out.flush();
                    out.close();
                    in.close();
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

//        返回结果：
        Map<String,Object> param=new HashMap<String,Object>();
        param.put("mark",mark);
        return param;
    }

    //将fileName 设定为UUID_xxxx.txt
    public String makeFileName(String fileName){
        return getSixRandomLetter()+"_"+fileName;
    }

    //设定文件存储路径：按照时间划分
    public String makePath(String savePath){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String datePath = sdf.format(new Date());

        String dir = savePath+"\\"+datePath;
        File file = new File(dir);
        if (!file.exists()){
            file.mkdir();
        }
        return dir;
    }

    //获得随机6位考试码
    public String getSixRandomLetter(){
        //用字符数组的方式随机
        String randomcode = "";
        String model = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] m = model.toCharArray();
        for (int j=0;j<6 ;j++ )
        {
            char c = m[(int)(Math.random()*52)];
            randomcode = randomcode + c;
        }
        return randomcode;
    }
}
