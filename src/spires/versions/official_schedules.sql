-- phpMyAdmin SQL Dump
-- version 3.5.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 01, 2016 at 04:07 PM
-- Server version: 5.5.15
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_bulletin`
--

-- --------------------------------------------------------

--
-- Table structure for table `official_schedules`
--

CREATE TABLE IF NOT EXISTS `official_schedules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `official` varchar(255) DEFAULT NULL,
  `official_id` varchar(255) DEFAULT NULL,
  `schedule_time_from` datetime DEFAULT NULL,
  `schedule_time_to` datetime DEFAULT NULL,
  `schedule_type` varchar(255) DEFAULT NULL,
  `schedule_address` varchar(255) DEFAULT NULL,
  `parishioner` varchar(255) DEFAULT NULL,
  `parishioner_contact_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `official_schedules`
--

INSERT INTO `official_schedules` (`id`, `created_at`, `updated_at`, `created_by`, `updated_by`, `status`, `official`, `official_id`, `schedule_time_from`, `schedule_time_to`, `schedule_type`, `schedule_address`, `parishioner`, `parishioner_contact_no`) VALUES
(1, '2016-06-28 14:23:51', '2016-06-28 14:26:12', NULL, NULL, 1, 'Rev. Msgr. Julius Perpetuo S. Heruela, PC', '88', '2016-06-28 10:00:00', '2016-06-28 11:00:00', 'Fiesta', 'dauin', 'Charmayne Malco', ''),
(2, '2016-06-28 14:24:24', '2016-06-28 14:24:24', NULL, NULL, 1, 'Rev. Msgr. Julius Perpetuo S. Heruela, PC', '88', '2016-06-28 08:00:00', '2016-06-28 09:30:00', 'Baptism', 'dauin', 'Charmayne Malco', ''),
(3, '2016-06-28 14:27:05', '2016-06-28 14:27:05', NULL, NULL, 1, 'Rev. Msgr. Julius Perpetuo S. Heruela, PC', '88', '2016-06-28 12:00:00', '2016-06-28 13:00:00', 'Baptism', 'bacong', 'Clinton Blaire Aranas', ''),
(4, '2016-06-28 14:27:57', '2016-06-28 14:28:10', NULL, NULL, 1, 'Rev. Msgr. Julius Perpetuo S. Heruela, PC', '88', '2016-06-28 13:10:00', '2016-06-28 14:00:00', 'Baptism', 'zambo', 'Jessa Alviola', ''),
(5, '2016-06-28 14:28:54', '2016-06-28 14:29:19', NULL, NULL, 1, 'Rev. Msgr. Julius Perpetuo S. Heruela, PC', '88', '2016-06-28 15:00:00', '2016-06-28 16:00:00', 'Baptism', 'dumaguete city', 'Ronald Pascua1', ''),
(6, '2016-06-28 14:29:36', '2016-06-28 14:30:27', NULL, NULL, 1, 'Rev. Msgr. Julius Perpetuo S. Heruela, PC', '88', '2016-06-28 18:00:00', '2016-06-28 20:00:00', 'Fiesta', 'manjuyod', 'Charmayne Malco', ''),
(7, '2016-06-28 14:30:07', '2016-06-28 14:30:07', NULL, NULL, 1, 'Rev. Msgr. Julius Perpetuo S. Heruela, PC', '88', '2016-06-28 18:00:00', '2016-06-28 20:00:00', 'Baptism', 'amlan', 'Jessa Alviola', '1212'),
(8, '2016-06-28 14:48:23', '2016-06-28 14:48:33', NULL, NULL, 1, 'Rev. Msgr. Julius Perpetuo S. Heruela, PC', '88', '2016-06-29 08:00:00', '2016-06-29 09:00:00', 'Baptism', 'bacong', 'Charmayne Malco', ''),
(9, '2016-06-28 14:48:55', '2016-06-28 14:48:55', NULL, NULL, 1, 'Rev. Msgr. Julius Perpetuo S. Heruela, PC', '88', '2016-06-29 20:00:00', '2016-06-29 20:30:00', 'Fiesta', 'bacong', 'Cleford Banquerigo', ''),
(10, '2016-06-28 15:12:45', '2016-06-28 15:12:45', NULL, NULL, 1, 'Fr. Matias Rendon', '36', '2016-06-28 08:00:00', '2016-06-28 08:00:00', 'Baptism', 'bacong', 'Charmayne Malco', ''),
(11, '2016-06-28 15:19:11', '2016-06-28 15:19:11', NULL, NULL, 1, 'Fr. Matias Rendon', '36', '2016-06-28 10:00:00', '2016-06-28 10:20:00', 'Baptism', 'dgte', 'Jessa Alviola', ''),
(12, '2016-06-28 15:25:41', '2016-06-28 15:25:41', NULL, NULL, 1, 'Fr. Matias Rendon', '36', '2016-06-29 08:00:00', '2016-06-29 09:00:00', 'Baptism', 'bacong', 'Charmayne Malco', '');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
