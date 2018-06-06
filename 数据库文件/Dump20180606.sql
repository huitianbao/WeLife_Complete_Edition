-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: welife
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `deliver`
--

LOCK TABLES `deliver` WRITE;
/*!40000 ALTER TABLE `deliver` DISABLE KEYS */;
INSERT INTO `deliver` VALUES (1,2,1,'2018-04-20'),(1,3,3,'2018-04-22'),(2,5,2,'2018-04-24'),(4,2,4,'2018-04-29'),(4,3,5,'3918-06-23'),(5,3,6,'3918-06-23'),(5,4,7,'3918-06-23'),(6,4,8,'3918-06-23');
/*!40000 ALTER TABLE `deliver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `diary`
--

LOCK TABLES `diary` WRITE;
/*!40000 ALTER TABLE `diary` DISABLE KEYS */;
INSERT INTO `diary` VALUES (3,3,'t3','cccccccccccc333333','2018-05-27 13:47:31',NULL),(4,3,'t4','ccccccccc444444444444','2018-05-27 13:48:48',NULL),(5,3,'ggg','jjj','2018-05-28 13:25:58',NULL),(6,3,'t8','cccccccc8888888888','2018-05-28 13:34:11',NULL),(7,3,'t9','ccccccccc99999999999','2018-05-28 13:36:49',NULL),(8,3,'t10','ccccccccc10','2018-05-28 13:38:07',NULL),(9,3,'t12','c12','2018-05-28 15:08:50',NULL),(14,1,'程嘉喜欢惠天宝','假的','2018-06-04 11:09:38',NULL),(15,1,'哈哈哈哈','哈哈哈哈或或或','2018-06-04 13:49:46',NULL),(17,2,'2号','2号真的帅','2018-06-05 06:00:15',NULL);
/*!40000 ALTER TABLE `diary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dynamictable`
--

LOCK TABLES `dynamictable` WRITE;
/*!40000 ALTER TABLE `dynamictable` DISABLE KEYS */;
INSERT INTO `dynamictable` VALUES (1,'哈哈哈','我是大帅比哟热天好儿童画热天好我图网二二个',NULL),(2,'事实上','大叔大婶大所',NULL),(3,'好人二级页山东高速','就为仁由己然后让他去而过人前人后4贴 ',NULL),(4,' 未提货人他给我提供我',' 而已经让他 而且请问如何让他好气儿',NULL),(5,'而我国',' 而且他会极为高危儿个人温柔为 ',NULL),(6,'阿斯顿撒多撒','敖德萨多所',NULL);
/*!40000 ALTER TABLE `dynamictable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `file`
--

LOCK TABLES `file` WRITE;
/*!40000 ALTER TABLE `file` DISABLE KEYS */;
INSERT INTO `file` VALUES (2,'dc73969f-ad9b-4ebe-98b4-fed5959b2f76.gif','649.900390625KB','image/gif','2018-06-04 07:06:14','/WeLife/uploadimages/10/2/dc73969f-ad9b-4ebe-98b4-fed5959b2f76.gif',''),(3,'95c94bd1-800e-4149-90b5-3d67712ad4e8.jpg','170.7265625KB','image/jpeg','2018-06-04 07:08:51','/WeLife/uploadimages/9/1/95c94bd1-800e-4149-90b5-3d67712ad4e8.jpg',''),(4,'b0981891-1be4-4d1e-bdcf-df06b365d7c1.jpg','1.916015625KB','image/jpeg','2018-06-04 08:57:39','/WeLife/uploadimages/7/7/b0981891-1be4-4d1e-bdcf-df06b365d7c1.jpg',''),(5,'7769f8f3-39ab-4f00-a718-200eaec4d43e.jpg','1.876953125KB','image/jpeg','2018-06-04 09:02:59','/WeLife/uploadimages/13/5/7769f8f3-39ab-4f00-a718-200eaec4d43e.jpg',''),(6,'aaed4b5b-315d-402e-8d1b-dd0bfd05f123.jpg','12.1875KB','image/jpeg','2018-06-04 09:03:48','/WeLife/uploadimages/3/3/aaed4b5b-315d-402e-8d1b-dd0bfd05f123.jpg',''),(7,'7aefe619-e137-4a17-ac73-53cc6399bebe.jpg','2.083984375KB','image/jpeg','2018-06-04 09:06:14','/WeLife/uploadimages/13/5/7aefe619-e137-4a17-ac73-53cc6399bebe.jpg',''),(8,'a5dfd4be-0fcf-4651-9cd8-63803296e729.jpg','9.11328125KB','image/jpeg','2018-06-05 12:08:18','/WeLife/uploadimages/13/5/a5dfd4be-0fcf-4651-9cd8-63803296e729.jpg',''),(9,'beb793b7-e85a-4166-a138-c72fea63fb80.jpg','9.11328125KB','image/jpeg','2018-06-05 12:09:22','/WeLife/uploadimages/8/0/beb793b7-e85a-4166-a138-c72fea63fb80.jpg',''),(10,'2df41345-1796-46be-818e-b698bcf0b929.jpg','20.7265625KB','image/jpeg','2018-06-05 01:54:30','/WeLife/uploadimages/14/6/2df41345-1796-46be-818e-b698bcf0b929.jpg',''),(11,'c5c91653-3d24-40ac-b33d-894f1ca22577.jpg','48.26171875KB','image/jpeg','2018-06-05 01:59:04','/WeLife/uploadimages/0/0/c5c91653-3d24-40ac-b33d-894f1ca22577.jpg',''),(12,'ff6ad526-da40-42e9-9920-26b66db14b4a.jpg','1.876953125KB','image/jpeg','2018-06-05 02:23:30','/WeLife/uploadimages/14/6/ff6ad526-da40-42e9-9920-26b66db14b4a.jpg',''),(13,'66deda2c-97c5-47f3-afc3-1b37abbf73e8.jpg','12.1875KB','image/jpeg','2018-06-05 02:29:27','/WeLife/uploadimages/6/6/66deda2c-97c5-47f3-afc3-1b37abbf73e8.jpg','');
/*!40000 ALTER TABLE `file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `friendtable`
--

LOCK TABLES `friendtable` WRITE;
/*!40000 ALTER TABLE `friendtable` DISABLE KEYS */;
INSERT INTO `friendtable` VALUES (1,2,'doctor','mother','sdffff','sddasdas','ddsadasd'),(1,3,'dasdas','asdas','sadasd','sadas','dsa'),(1,4,'mother','teacher','woman','hh','null'),(1,5,NULL,NULL,NULL,NULL,NULL),(1,6,NULL,NULL,NULL,NULL,NULL),(1,7,NULL,NULL,NULL,NULL,NULL),(2,1,NULL,NULL,NULL,NULL,NULL),(2,4,'mother','teacher','computer','null','null'),(3,1,NULL,NULL,NULL,NULL,NULL),(3,5,NULL,NULL,NULL,NULL,NULL),(4,1,NULL,NULL,NULL,NULL,NULL),(4,2,NULL,NULL,NULL,NULL,NULL),(5,1,NULL,NULL,NULL,NULL,NULL),(5,3,NULL,NULL,NULL,NULL,NULL),(6,1,NULL,NULL,NULL,NULL,NULL),(7,1,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `friendtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `notetable`
--

LOCK TABLES `notetable` WRITE;
/*!40000 ALTER TABLE `notetable` DISABLE KEYS */;
INSERT INTO `notetable` VALUES (1,'g ewth wjtrwr jtwr weh weth ertjw'),(2,' 输入今天当然斗鱼眼睛的 就'),(3,' 可以发收入提升软件提示软硬件打印机的'),(4,' 发图看但既然他海典软件反弹的体验就'),(5,'sadsadsaas'),(6,'sadsadsaas'),(7,'sadsadsaas'),(8,'sadsadsaas');
/*!40000 ALTER TABLE `notetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `senddynamic`
--

LOCK TABLES `senddynamic` WRITE;
/*!40000 ALTER TABLE `senddynamic` DISABLE KEYS */;
INSERT INTO `senddynamic` VALUES (1,1,'程嘉是真的帅','护手霜','/WeLife/uploadimages/0/0/5efd346c-ce11-4876-be17-33bb2a03cc1e.gif','2018-06-04 19:05:36'),(1,2,'惠天宝真帅','哈哈哈哈','/WeLife/uploadimages/10/2/dc73969f-ad9b-4ebe-98b4-fed5959b2f76.gif','2018-06-04 19:06:20'),(1,3,'高建平','帅','/WeLife/uploadimages/9/1/95c94bd1-800e-4149-90b5-3d67712ad4e8.jpg','2018-06-04 19:09:06'),(1,4,'牛逼','牛逼牛逼','/WeLife/uploadimages/9/1/95c94bd1-800e-4149-90b5-3d67712ad4e8.jpg','2018-06-04 20:57:11'),(1,5,'撒大声地','撒大声地撒打算的撒','/WeLife/uploadimages/7/7/b0981891-1be4-4d1e-bdcf-df06b365d7c1.jpg','2018-06-04 20:57:46'),(1,6,'惠天宝真帅2','其味无穷二无群','/WeLife/uploadimages/13/5/7769f8f3-39ab-4f00-a718-200eaec4d43e.jpg','2018-06-04 21:03:18'),(1,7,'3231232','213123123','/WeLife/uploadimages/3/3/aaed4b5b-315d-402e-8d1b-dd0bfd05f123.jpg','2018-06-04 21:03:55'),(1,8,'坎坎坷坷','郭德纲的非官方的','/WeLife/uploadimages/13/5/7aefe619-e137-4a17-ac73-53cc6399bebe.jpg','2018-06-04 21:06:22'),(1,9,'213','1231','/WeLife/uploadimages/8/0/beb793b7-e85a-4166-a138-c72fea63fb80.jpg','2018-06-05 00:09:31'),(1,10,'牛逼神色','阿斯加德哈讲课大赛的','/WeLife/uploadimages/14/6/2df41345-1796-46be-818e-b698bcf0b929.jpg','2018-06-05 13:54:40'),(2,11,'this is 2','2号真的帅','/WeLife/uploadimages/0/0/c5c91653-3d24-40ac-b33d-894f1ca22577.jpg','2018-06-05 13:59:30'),(1,12,'其味无穷','我去二群翁无群','/WeLife/uploadimages/14/6/ff6ad526-da40-42e9-9920-26b66db14b4a.jpg','2018-06-05 14:23:34'),(1,13,'sads','sadasds','/WeLife/uploadimages/6/6/66deda2c-97c5-47f3-afc3-1b37abbf73e8.jpg','2018-06-05 14:29:31');
/*!40000 ALTER TABLE `senddynamic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `share`
--

LOCK TABLES `share` WRITE;
/*!40000 ALTER TABLE `share` DISABLE KEYS */;
INSERT INTO `share` VALUES (1,1,'2018-10-20 13:33:00'),(2,2,'2018-10-20 13:34:00'),(2,3,'2018-08-20 13:35:00'),(3,6,'2018-10-20 03:34:00'),(4,4,'2017-08-20 13:35:00'),(4,5,'2017-08-20 13:25:00');
/*!40000 ALTER TABLE `share` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `usertable`
--

LOCK TABLES `usertable` WRITE;
/*!40000 ALTER TABLE `usertable` DISABLE KEYS */;
INSERT INTO `usertable` VALUES ('1','123','cj',40,''),('10','123','luqili',20,'doctor'),('111','111','rrr',555,'rrr'),('2','123','myb',20,''),('3','123','htb',12,''),('4','123','lql',50,''),('5','123','gjp',30,''),('6','123','11',11,'11'),('7','6','shabi',10,'日猪'),('8','123','sdas',20,'asdas'),('9','123','123',123,'123');
/*!40000 ALTER TABLE `usertable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-06  9:11:53
