-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 16, 2017 at 03:21 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `orphanage`
--

-- --------------------------------------------------------

--
-- Table structure for table `discharge`
--

CREATE TABLE IF NOT EXISTS `discharge` (
  `ID` int(5) NOT NULL,
  `IDNO` varchar(15) NOT NULL,
  `FIRSTNAME` varchar(15) NOT NULL,
  `LASTNAME` varchar(15) NOT NULL,
  `OTHERNAME` varchar(15) NOT NULL,
  `DATEFOUND` varchar(15) NOT NULL,
  `AREA` varchar(50) NOT NULL,
  `TIME` varchar(45) NOT NULL,
  `AGE` varchar(4) NOT NULL,
  `GENDER` varchar(10) NOT NULL,
  `DDate` varchar(15) NOT NULL,
  `DTime` varchar(45) NOT NULL,
  `DBy` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `discharge`
--

INSERT INTO `discharge` (`ID`, `IDNO`, `FIRSTNAME`, `LASTNAME`, `OTHERNAME`, `DATEFOUND`, `AREA`, `TIME`, `AGE`, `GENDER`, `DDate`, `DTime`, `DBy`) VALUES
(1, ' 001', ' Salahuddeen', ' Kazeem', ' Omoiya', '3/4/2014', 'Kaduna\nPolytechnic', '03:31am - 04:00am', ' 1', 'Male', '1/5/2014', '07:31am - 08:00am', 'MUKHTAR   SABIU');

-- --------------------------------------------------------

--
-- Table structure for table `intake`
--

CREATE TABLE IF NOT EXISTS `intake` (
  `ID` int(4) NOT NULL,
  `IDNO` varchar(4) NOT NULL,
  `FIRSTNAME` varchar(15) NOT NULL,
  `LASTNAME` varchar(15) NOT NULL,
  `OTHERNAME` varchar(15) NOT NULL,
  `DATEFOUND` varchar(15) NOT NULL,
  `AREA` varchar(50) NOT NULL,
  `TIME` varchar(50) NOT NULL,
  `AGE` varchar(4) NOT NULL,
  `GENDER` varchar(10) NOT NULL,
  `NATIONALITY` varchar(15) NOT NULL,
  `STATE` varchar(15) NOT NULL,
  `LGA` varchar(20) NOT NULL,
  `STATUS` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `intake`
--

INSERT INTO `intake` (`ID`, `IDNO`, `FIRSTNAME`, `LASTNAME`, `OTHERNAME`, `DATEFOUND`, `AREA`, `TIME`, `AGE`, `GENDER`, `NATIONALITY`, `STATE`, `LGA`, `STATUS`) VALUES
(1, ' 001', ' Salahuddeen', ' Kazeem', ' Omoiya', '3/4/2014', 'Kaduna\nPolytechnic', '03:31am - 04:00am', ' 1', 'Male', 'Nigerian', 'Kaduna', ' Kaduna South', 'Charge');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE IF NOT EXISTS `staff` (
  `ID` int(4) NOT NULL,
  `IDNO` text NOT NULL,
  `FIRSTNAME` text NOT NULL,
  `LASTNAME` text NOT NULL,
  `OTHERNAME` text NOT NULL,
  `GENDER` text NOT NULL,
  `ADDRESS` text NOT NULL,
  `EMAIL` text NOT NULL,
  `PHONE` text NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`ID`, `IDNO`, `FIRSTNAME`, `LASTNAME`, `OTHERNAME`, `GENDER`, `ADDRESS`, `EMAIL`, `PHONE`) VALUES
(1, ' 001', 'MUKHTAR ', ' SABIU', ' KURA', 'KADUNA	KADUNA', 'Male', ' msb4kura@gmail.com', ' 08144737492');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `discharge`
--
ALTER TABLE `discharge`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `intake`
--
ALTER TABLE `intake`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `discharge`
--
ALTER TABLE `discharge`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `intake`
--
ALTER TABLE `intake`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
