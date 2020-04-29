package com.xmh.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.xmh.service.MealService;


@Controller
public class UploadController {
	@Autowired
	private MealService mealService;
	
	@RequestMapping("/upload")
	@ResponseBody
	public Map<String, String> upload(@RequestParam("mealId")Integer mealId,@RequestParam(value = "file")MultipartFile file ,HttpServletRequest request) throws IllegalStateException, IOException {
		
		Map<String, String> map = new HashMap<String, String>();
		//文件上传位置/DesWeb/WebContent/WEB-INF/img/meal
		String uploadPath = "G:/worker/eclipse-workspace/DesWeb/WebContent/WEB-INF/img/meal";
		System.out.println(file);
		//文件原始名称
		String originalFileName = file.getOriginalFilename();
		//新文件名
		//String newFileName =String.valueOf(System.currentTimeMillis())+originalFileName.substring(originalFileName.lastIndexOf("."));
		//创建文件夹
		File dir=new File(uploadPath,originalFileName);
		//新文件
		//判断文件目录是否存在
		if (!dir.getParentFile().exists()) {
			dir.getParentFile().mkdirs();
		}
		System.out.println(dir);
		//写入磁盘
		file.transferTo(dir);
		//完整的URL
		File filepath = new File(uploadPath+ File.separator +originalFileName);
		String fileString = filepath.getPath();
		System.out.println(fileString);
		boolean flag = mealService.submitImg(mealId,fileString);
		if (flag) {
			map.put("result", "success");
			return map;
		}
		
		return null;

	}
}
