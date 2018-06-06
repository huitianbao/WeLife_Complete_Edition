package edu.jlxy.Servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;

import edu.jlxy.Module.entity.FileEntity;
import edu.jlxy.Module.table.impl.FileImpl;
import edu.jlxy.util.SeprateSrc;

public class UploadServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory(10 * 1024, new File("e:/temp"));

			ServletFileUpload upload = new ServletFileUpload(factory);

			upload.setHeaderEncoding("utf-8");

			List<FileItem> list = upload.parseRequest(request);

			FileImpl impl = new FileImpl();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

			List<FileEntity> fileList = new ArrayList<FileEntity>();

			if (list != null) {
				FileEntity fileEntity = null;

				for (FileItem item : list) {
					if (item.isFormField()) {

						fileEntity.setInfo(item.getString("utf-8"));
						fileList.add(fileEntity);

						impl.saveFile(fileEntity, null, null); // ======================================================================================
					} else {
						fileEntity = new FileEntity();

						String uuid = UUID.randomUUID().toString();
						String fileName = item.getName();

						fileName = uuid + fileName.substring(fileName.lastIndexOf("."));

						/*
						String baseDir ="C:/Users/lqllq/Workspaces/MyEclipse 2016/WeLife/WebRoot/uploadimages";
						*/
						
						String  baseDir = "C:\\Users\\lqllq\\Workspaces\\MyEclipse 2016\\WeLife\\WebRoot\\uploadimages" ;  //属性里面的
						

						String subDir = makeDirectory(fileName);

						String finalDir = baseDir + "/" + subDir;
						// e:/tomcat6/webapps/day22/upload/10/8
						

						long size = item.getSize();
						String contentType = item.getContentType();
						FileUtils.copyInputStreamToFile(item.getInputStream(), new File(finalDir + fileName));

						item.delete();

						fileEntity.setName(fileName);

						String sizeStr = "";
						if (size >= 1024 && size < 1024 * 1024) {
							sizeStr = (size / 1024.0) + "KB";
						} else if (size > 1024 * 1024 && size <= 1024 * 1024 * 1024) {
							sizeStr = (size / (1024 * 1024.0)) + "MB";
						} else if (size >= 1024 * 1024 * 1024) {
							sizeStr = (size / (1024 * 1024.0 * 1024)) + "GB";
						} else {
							sizeStr = size + "B";
						}
						fileEntity.setSize(sizeStr);
						fileEntity.setType(contentType);
						fileEntity.setAddTime(sdf.format(new Date()));

						// 在这之前需要对路径进行 整形
						SeprateSrc seprateSrc = new SeprateSrc();
						String realpath = baseDir + "/" + subDir + fileName;
						
						SeprateSrc seprateSrc2=new SeprateSrc();
					    String[] list_base_dir=seprateSrc2.seprate1(baseDir);
					
					
						String[] list_sub_dir=seprateSrc2.seprate2(subDir);
						
						String htb_path="/"+list_base_dir[5]+"/"+list_base_dir[7]+"/"+list_sub_dir[0]+"/"+list_sub_dir[1]+"/"+fileName;
						fileEntity.setFile_path(htb_path);
						
						
//						
//						System.out.println("base dir is  "+baseDir);
//						System.out.println("subdir is " +subDir);
//						System.out.println("final dir is  "+finalDir);
//						System.out.println("the real path is  "+realpath);
//						System.out.println("    ==========the htb path is "+htb_path);

						// 1  分离base dir  \
//						SeprateSrc seprateSrc2=new SeprateSrc();
//						String[] list_base_dir=seprateSrc2.seprate1(baseDir);
//						
//						
//						String[] list_sub_dir=seprateSrc2.seprate2(subDir);
						
						
						
						
						
						
						
					}
				}

				request.setAttribute("fileList", fileList);
				//request.getRequestDispatcher("/PersonalPage.jsp").forward(request, response);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		 response.sendRedirect("PersonalPage.jsp");
		// request.getRequestDispatcher("/PersonalPage.jsp").forward(request, response);

	}

	private String makeDirectory(String fileName) {

		int code = fileName.hashCode();

		int first = code & 0xF;

		int second = code & (0xF >> 1);
		return first + "/" + second + "/";
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
