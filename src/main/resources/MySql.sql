/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 5.6.26 : Database - czstest
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`czstest` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `czstest`;

/*Table structure for table `serviceprocess190319` */

DROP TABLE IF EXISTS `serviceprocess190319`;

CREATE TABLE `serviceprocess190319` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `string` varchar(20) DEFAULT NULL COMMENT '测试字符串',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `serviceprocess190319` */

insert  into `serviceprocess190319`(`id`,`string`) values
  (1,'1'),
  (2,'2'),
  (3,'3'),
  (4,'4'),
  (5,'5'),
  (6,'6'),
  (7,'7'),
  (8,'8'),
  (9,'9'),
  (10,'10'),
  (11,'11'),
  (12,'12'),
  (13,'13'),
  (14,'14'),
  (15,'15');

/*Table structure for table `test` */

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `tdate` date DEFAULT NULL,
  `tdatetime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `tdouble` double DEFAULT NULL,
  `tnumber` int(11) DEFAULT NULL,
  `tblob` blob,
  `tlongblob` longblob,
  `ttimestamp` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='camel的测试';

/*Data for the table `test` */

insert  into `test`(`tdate`,`tdatetime`,`tdouble`,`tnumber`,`tblob`,`tlongblob`,`ttimestamp`) values
  ('2019-02-21','2019-02-24 21:15:06',3.3,3,'1blob','12longblob','2019-02-24 21:15:06'),
  ('2019-02-26','2019-02-26 14:00:21',0.7874919380011131,-413022102,'blob','longblob','2019-02-26 14:00:21'),
  ('2019-02-26','2019-02-26 14:00:59',0.3306699376453899,-1657992428,'blob','longblob','2019-02-26 14:00:59'),
  ('2019-02-26','2019-02-26 14:02:18',0.9293822774559599,-2135703626,'blob','longblob','2019-02-26 14:02:18'),
  ('2019-02-26','2019-02-26 14:02:47',0.061921631298860746,-388180562,'blob','longblob','2019-02-26 14:02:47'),
  ('2019-02-26','2019-02-26 14:03:01',0.1299672605535448,1072308755,'blob','longblob','2019-02-26 14:03:01'),
  ('2019-02-26','2019-02-26 14:04:10',0.7274041850830508,-660797922,'blob','longblob','2019-02-26 14:04:10'),
  ('2019-02-26','2019-02-26 14:04:49',0.6811547930460127,2041221149,'blob','longblob','2019-02-26 14:04:49'),
  ('2019-02-26','2019-02-26 14:05:24',0.7793248071409384,-1630100923,'blob','longblob','2019-02-26 14:05:24'),
  ('2019-02-27','2019-02-27 16:58:06',0.31283303112547156,-1857721152,'blob','longblob','2019-02-27 16:58:06'),
  ('2019-02-27','2019-02-27 17:00:40',0.18333266701806838,-366821198,'blob','longblob','2019-02-27 17:00:40'),
  ('2019-02-27','2019-02-27 17:05:44',0.18737383465029755,420412203,'blob','longblob','2019-02-27 17:05:44'),
  ('2019-02-27','2019-02-27 17:14:06',0.3019313590300877,1616178192,'blob','longblob','2019-02-27 17:14:06'),
  ('2019-02-27','2019-02-27 17:51:49',0.778661147835676,1640267394,'blob','longblob','2019-02-27 17:51:49'),
  ('2019-02-27','2019-02-27 17:56:34',0.6267060096508944,1106652537,'blob','longblob','2019-02-27 17:56:34'),
  ('2019-02-27','2019-02-27 17:57:58',0.19406287660187116,1400154467,'blob','longblob','2019-02-27 17:57:58'),
  ('2019-02-27','2019-02-27 18:01:09',0.8022583715786012,1818324162,'blob','longblob','2019-02-27 18:01:09'),
  ('2019-02-27','2019-02-27 18:09:03',0.4031419195382592,-204946208,'blob','longblob','2019-02-27 18:09:03'),
  ('2019-02-27','2019-02-27 18:10:15',0.9575229098668578,-1106589889,'blob','longblob','2019-02-27 18:10:15'),
  ('2019-02-27','2019-02-27 18:10:58',0.8968816524130123,-623664857,'blob','longblob','2019-02-27 18:10:58'),
  ('2019-02-27','2019-02-27 18:12:49',0.9197091593877019,1114829271,'blob','longblob','2019-02-27 18:12:49'),
  ('2019-02-28','2019-02-28 17:03:32',0.9547996985661578,1537403180,'blob','longblob','2019-02-28 17:03:32'),
  ('2019-02-28','2019-02-28 17:38:42',0.5420415805586033,-1332019747,'blob','longblob','2019-02-28 17:38:42'),
  ('2019-03-01','2019-03-01 10:19:08',0.7757443262010489,-741255852,'blob','longblob','2019-03-01 10:19:08'),
  ('2019-03-01','2019-03-01 10:19:22',0.9620791002175945,44170488,'blob','longblob','2019-03-01 10:19:22'),
  ('2019-03-01','2019-03-01 10:19:46',0.4841335003576437,-997113346,'blob','longblob','2019-03-01 10:19:46');

/* Procedure structure for procedure `insert_one` */

/*!50003 DROP PROCEDURE IF EXISTS  `insert_one` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`esb`@`192.168.%` PROCEDURE `insert_one`(
  IN cdate      DATE,
  IN cdatetime  DATETIME,
  IN cdouble    DOUBLE,
  IN cnumber    INT,
  IN cblob      BLOB,
  IN clongblob  LONGBLOB,
  IN ctimestamp TIMESTAMP
)
  BEGIN
    INSERT INTO test (
      tdate,
      tdatetime,
      tdouble,
      tnumber,
      tblob,
      tlongblob,
      ttimestamp
    )
    VALUES
      (
        cdate,
        cdatetime,
        cdouble,
        cnumber,
        cblob,
        clongblob,
        ctimestamp
      );

    SELECT *
    FROM
      test
    WHERE
      tdatetime = cdatetime;


  END */$$
DELIMITER ;

/* Procedure structure for procedure `select_one` */

/*!50003 DROP PROCEDURE IF EXISTS  `select_one` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`esb`@`192.168.%` PROCEDURE `select_one`(
  IN cdatetime datetime,
  IN cdate date,
  IN cdouble DOUBLE,
  IN cint INT,
  IN cblob BLOB,
  IN clongblob LONGBLOB,
  IN ctimestamp TIMESTAMP
)
  BEGIN
    SELECT
      *
    FROM
      test
    WHERE
      tnumber = cint
      AND tdate = cdate
      AND tdatetime = cdatetime
      AND tdouble = cdouble
      AND tblob = cblob
      AND tlongblob = clongblob
      AND ttimestamp = ctimestamp;


  END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
