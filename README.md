# WeLife_Complete_Edition
这是一个完整的 j2ee的网站







一、网页简介
本网站为生活社区类网站，用户可以在网站中可以撰写日记，记录每天生活中的点点滴滴，也可以与好友互动，分享生活中的新鲜事。
二、开发工具及开发语言
网站使用myeclipse作为开发工具，使用jsp+servlet架构后台数据保持采用JDBC方法。前端网页采用html+css，使用到少量JavaScript。
三、项目概述
此部分将简要介绍网站中一些java和jsp文件功能。
1.jsp页面
①HomePage 为网站主页，用于显示所有用户的动态信息
②PersonalPage 为个人页面，主要显示好友信息、日记信息，以及发表动态信息
③Login 登录界面
④SignUp 注册
⑤Navigation 导航页面，进入网站前的导航界面
⑥AddFriend 添加好友
⑦Diary 发表日记
⑧lookDiaryContent  显示日记内容
⑨Friendedit 设置好友标签
⑩upLoad 上传图片
2.Servlet
   ①AddFriend 添加好友的逻辑操作，从页面获取fid，从usertable中查询结果并反馈，该用户存在且与他不是好友则添加
       ②DeleteDiary：删除选中的日记，根据页面存取的did，从数据库中删除对应的日记，并重新跳回页面更新
③DeleteFriend 删除选中的好友，根据页面存取的fid，uid，从数据库中删除对应的好友信息，并重新跳回页面更新
④Dirary_handle 处理写日记的模块，把日记内容写入数据库
⑤Friendedit 根据页面获取的uid fid以及五个标签更新数据库，返回跟人页面，更新网页
⑥Login 登录合法性判断
⑦SearchFriend 根据页面获取的fid，在数据库usertable中搜索该用户，并进行合法性判断该用户是否可以添加，若合法，则更新friendtable表，加入新的好友关系，最后返回页面，更新页面
⑧SendDynamic_handle 发动态处理模块，把动态的内容写入数据库
⑨UpLoadServlet 上传图片处理模块，把文件的相关信息写入数据库
3.Utill
   ①ConnectionFactory 连接工厂，该方法可实现数据库连接
       ②DateUtil_htb,Date_Util 用于获取系统时间，并将获取的时间转换成数据库对应的格式
③ResultSetUtil 用于处理数据库查询结果，其中showResultSet()方法用于将数据库查询内容输出到标准输出，getResultSet()用于将查询得到的ResultSet结果集转化成二维数组存储，isRpeat()方法用于比较结果集中的数据是否有与你指定的值重复，重复则返回true
④SepRateSrc 按照指定字符分离字符串（给UpLoadServlet 使用，获取图片路径）
4.Entity
   这部分的各个实体皆为对数据库表的映射，内部存储对应数据库的属性值
5.Impl
   此部分为对数据库对应表的增删改查操作封装
6.Table
   此部分为Impl中所有方法的接口
三、引用的类库
     java.io.*
     java.sql.*
     Javax.servlet.*
     Java.util.*
     Java.text

 

