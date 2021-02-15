-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2019 at 02:41 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aplikasisc`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_p`
--

CREATE TABLE `data_p` (
  `NIK` varchar(15) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `gender` varchar(3) NOT NULL,
  `noHp` varchar(20) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `treatment` varchar(50) NOT NULL,
  `jumlah` varchar(8) NOT NULL,
  `tgl_masuk` varchar(20) NOT NULL,
  `tgl_ambil` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_p`
--

INSERT INTO `data_p` (`NIK`, `nama`, `gender`, `noHp`, `alamat`, `treatment`, `jumlah`, `tgl_masuk`, `tgl_ambil`) VALUES
('2928392029222', 'Medeline Widia Andani', 'P', '087765508131', 'BTN Lingkar Permai Blok U.1', 'Lather Care', '2', '2019-04-03', '2019-04-10'),
('887766655666', 'Nura Sita Wira', 'L', '087765567890', 'BTN Sakti Permata Blok U No. 8 ', 'Unyellowing', '6', '2019-07-10', '2019-07-24');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(35) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin123'),
('medeline', '1234'),
('gerry', 'gerry123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_p`
--
ALTER TABLE `data_p`
  ADD PRIMARY KEY (`NIK`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
