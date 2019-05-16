/*
SQLyog Ultimate v8.32 
MySQL - 5.7.18 : Database - db_red_packet
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_red_packet` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_red_packet`;

/*Table structure for table `t_red_packet` */

DROP TABLE IF EXISTS `t_red_packet`;

CREATE TABLE `t_red_packet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `send_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `total` int(11) NOT NULL,
  `unit_amount` decimal(10,0) NOT NULL,
  `stock` int(11) NOT NULL,
  `version` int(11) NOT NULL DEFAULT '0',
  `note` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_red_packet` */

insert  into `t_red_packet`(`id`,`user_id`,`send_date`,`total`,`unit_amount`,`stock`,`version`,`note`) values (1,1,'2019-05-16 11:11:52',50000,'10',5000,0,'每人10元');

/*Table structure for table `t_user_red_packet` */

DROP TABLE IF EXISTS `t_user_red_packet`;

CREATE TABLE `t_user_red_packet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `red_packet_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `amount` decimal(10,0) NOT NULL,
  `grab_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `note` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48287 DEFAULT CHARSET=utf8;

/*Data for the table `t_user_red_packet` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
