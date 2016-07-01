-- phpMyAdmin SQL Dump
-- version 3.5.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 01, 2016 at 04:06 PM
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
-- Table structure for table `banks`
--

CREATE TABLE IF NOT EXISTS `banks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `bank` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=37 ;

--
-- Dumping data for table `banks`
--

INSERT INTO `banks` (`id`, `created_at`, `updated_at`, `created_by`, `updated_by`, `status`, `bank`) VALUES
(1, '2016-07-01 17:57:17', '2016-07-01 17:57:17', NULL, NULL, 1, 'BDO Unibank'),
(2, '2016-07-01 17:57:23', '2016-07-01 17:57:23', NULL, NULL, 1, 'Metropolitan Bank and Trust Company'),
(3, '2016-07-01 17:57:27', '2016-07-01 18:05:14', NULL, NULL, 1, 'Bank of the Philippine Islands (BPI)'),
(4, '2016-07-01 17:57:31', '2016-07-01 18:05:50', NULL, NULL, 1, 'Landbank of the Philippines'),
(5, '2016-07-01 17:57:35', '2016-07-01 17:57:35', NULL, NULL, 1, 'Philippine National Bank '),
(6, '2016-07-01 17:57:40', '2016-07-01 18:05:34', NULL, NULL, 1, 'Development Bank of the Philippines (DBP)'),
(7, '2016-07-01 17:57:43', '2016-07-01 17:57:43', NULL, NULL, 1, 'Security Bank'),
(8, '2016-07-01 17:57:46', '2016-07-01 17:57:46', NULL, NULL, 1, 'Chinabank'),
(9, '2016-07-01 17:57:50', '2016-07-01 17:57:50', NULL, NULL, 1, 'Rizal Commercial Banking Corporation'),
(10, '2016-07-01 17:57:54', '2016-07-01 17:57:54', NULL, NULL, 1, 'Union Bank of the Philippines'),
(11, '2016-07-01 17:57:58', '2016-07-01 17:57:58', NULL, NULL, 1, 'Citibank'),
(12, '2016-07-01 17:58:02', '2016-07-01 17:58:02', NULL, NULL, 1, 'United Coconut Planters Bank '),
(13, '2016-07-01 17:58:06', '2016-07-01 17:58:06', NULL, NULL, 1, 'EastWest Bank'),
(14, '2016-07-01 17:58:10', '2016-07-01 17:58:10', NULL, NULL, 1, 'The Hongkong and Shanghai Banking Corporation'),
(15, '2016-07-01 17:58:13', '2016-07-01 17:58:13', NULL, NULL, 1, 'Philtrust Bank'),
(16, '2016-07-01 17:58:17', '2016-07-01 17:58:17', NULL, NULL, 1, 'Asia United Bank'),
(17, '2016-07-01 17:58:20', '2016-07-01 17:58:20', NULL, NULL, 1, 'Bank of Commerce'),
(18, '2016-07-01 17:58:24', '2016-07-01 17:58:24', NULL, NULL, 1, 'Maybank Philippines, Inc.'),
(19, '2016-07-01 17:58:28', '2016-07-01 17:58:28', NULL, NULL, 1, 'Philippine Bank of Communications '),
(20, '2016-07-01 17:58:31', '2016-07-01 17:58:31', NULL, NULL, 1, 'Standard Chartered Bank'),
(21, '2016-07-01 17:58:34', '2016-07-01 17:58:34', NULL, NULL, 1, 'The Bank of Tokyo-Mitsubishi UFJ, Ltd.'),
(22, '2016-07-01 17:58:40', '2016-07-01 17:58:40', NULL, NULL, 1, 'Philippine Veterans Bank'),
(23, '2016-07-01 17:58:43', '2016-07-01 17:58:43', NULL, NULL, 1, 'Robinsons Bank'),
(24, '2016-07-01 17:58:46', '2016-07-01 17:58:46', NULL, NULL, 1, 'Deutsche Bank'),
(25, '2016-07-01 17:58:48', '2016-07-01 17:58:48', NULL, NULL, 1, 'ANZ'),
(26, '2016-07-01 17:58:51', '2016-07-01 17:58:51', NULL, NULL, 1, 'JPMorgan Chase'),
(27, '2016-07-01 17:58:57', '2016-07-01 17:58:57', NULL, NULL, 1, 'Mizuho Bank, Ltd.'),
(28, '2016-07-01 17:59:01', '2016-07-01 17:59:01', NULL, NULL, 1, 'ING Group N.V.'),
(29, '2016-07-01 17:59:05', '2016-07-01 17:59:05', NULL, NULL, 1, 'BDO Private Bank'),
(30, '2016-07-01 17:59:08', '2016-07-01 17:59:08', NULL, NULL, 1, 'CTBC Bank'),
(31, '2016-07-01 17:59:13', '2016-07-01 17:59:13', NULL, NULL, 1, 'Bank of China'),
(32, '2016-07-01 17:59:16', '2016-07-01 17:59:16', NULL, NULL, 1, 'Bank of America, N.A.'),
(33, '2016-07-01 17:59:19', '2016-07-01 17:59:19', NULL, NULL, 1, 'Mega International Commercial Bank'),
(34, '2016-07-01 17:59:24', '2016-07-01 17:59:24', NULL, NULL, 1, 'Korea Exchange Bank'),
(35, '2016-07-01 17:59:27', '2016-07-01 17:59:27', NULL, NULL, 1, 'Bangkok Bank'),
(36, '2016-07-01 17:59:30', '2016-07-01 18:00:18', NULL, NULL, 1, 'Al-Amanah Islamic Investment Bank of the Philippines');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
