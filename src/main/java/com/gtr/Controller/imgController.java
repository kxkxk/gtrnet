package com.gtr.Controller;

import com.gtr.Service.Img.ImgService;
import com.gtr.Service.RQ.RQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import com.gtr.tools.longStringDeal;
@RequestMapping("/Img")
public class imgController {
    longStringDeal deal = new longStringDeal();
    @Autowired
    ImgService imgService;
    @Autowired
    RQService rqService;
    @RequestMapping("/UserImg")
    @ResponseBody
    public String userHead(String Uname, int Uid,MultipartFile pfile) throws IllegalStateException, IOException {
        System.out.println("文件原名称：" + pfile.getOriginalFilename());
        String oldName=pfile.getOriginalFilename();
        oldName.valueOf(System.currentTimeMillis());
        String newName= UUID.randomUUID().toString().replace("-","")
                +oldName.substring(oldName.lastIndexOf("."));

        String realPath="classpath:static/img";
        File folder=new File(realPath+"/"+Uname);
        if(!folder.exists()) //如果文件夹不存在，则创建文件夹，如果存在，不重复创建
            folder.mkdirs(); //创建文件夹

        pfile.transferTo(new File(folder,newName));
        imgService.addUserHead(Uid,Uname+"/"+newName);
        //返回上传的图片的路径，用于在页面上显示图片
        return Uname+"/"+newName;
    }

    @RequestMapping("/HouseImg")
    @ResponseBody //处理ajax请求的方法添加@ResponseBody注解
    public String pageImg(int Hid,MultipartFile pfile) throws IllegalStateException, IOException{
        System.out.println("文件原名称：" + pfile.getOriginalFilename());

        String oldName=pfile.getOriginalFilename();
        oldName.valueOf(System.currentTimeMillis());
        String newName= UUID.randomUUID().toString().replace("-","")
                +oldName.substring(oldName.lastIndexOf("."));

        String realPath="classpath:static/img";
        String today = deal.currentDate();
        File folder=new File(realPath+"/"+today);
        if(!folder.exists()) //如果文件夹不存在，则创建文件夹，如果存在，不重复创建
            folder.mkdirs(); //创建文件夹

        pfile.transferTo(new File(folder,newName));
        imgService.addHouseImg(Hid,today+"/"+newName);
        //返回上传的图片的路径，用于在页面上显示图片
        return today+"/"+newName;
    }
    @RequestMapping("RQImg")
    @ResponseBody //处理ajax请求的方法添加@ResponseBody注解
    public String RQImg(int RQid,MultipartFile pfile) throws IllegalStateException, IOException{
        System.out.println("文件原名称：" + pfile.getOriginalFilename());

        String oldName=pfile.getOriginalFilename();
        oldName.valueOf(System.currentTimeMillis());
        String newName= UUID.randomUUID().toString().replace("-","")
                +oldName.substring(oldName.lastIndexOf("."));

        String realPath="classpath:static/img";
        String RQname = rqService.findRQ(RQid).getRQname();
        File folder=new File(realPath+"/"+ RQname);
        if(!folder.exists()) //如果文件夹不存在，则创建文件夹，如果存在，不重复创建
            folder.mkdirs(); //创建文件夹

        pfile.transferTo(new File(folder,newName));
        rqService.insertRQImg(RQid,RQname +"/"+newName);
        //返回上传的图片的路径，用于在页面上显示图片
        return RQname +"/"+newName;
    }
}
