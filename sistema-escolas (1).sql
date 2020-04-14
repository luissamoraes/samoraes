-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 14-Abr-2020 às 20:04
-- Versão do servidor: 10.1.29-MariaDB
-- PHP Version: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistema-escolas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `escola`
--

CREATE TABLE `escola` (
  `id` int(11) NOT NULL,
  `escola` varchar(45) COLLATE utf8_general_mysql500_ci NOT NULL,
  `estado` varchar(45) COLLATE utf8_general_mysql500_ci NOT NULL,
  `cidade` varchar(45) COLLATE utf8_general_mysql500_ci NOT NULL,
  `matricula` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Extraindo dados da tabela `escola`
--

INSERT INTO `escola` (`id`, `escola`, `estado`, `cidade`, `matricula`) VALUES
(9, 'ESCOLA ESTADUAL MARIA MORAES', 'MG', 'Juiz de Fora', '2020-02-09'),
(13, 'Cônego', 'MG', 'Matias', '2020-02-02'),
(14, 'Denis Pimenta', 'MG', 'JF', '2020-02-02'),
(15, 'MARIANO PROCOPIO', 'RJ', 'AREAL', '2020-04-05'),
(16, 'MACHADO DE ASSIS', 'RJ', 'AREAL', '2020-04-07'),
(17, 'Denildo', 'mg', 'jf', '2020-04-14'),
(18, 'Gerundia', 'RJ', 'NOVA IGUAÇU', '2020-04-14'),
(19, 'MUNICIPAL SANTO ANTONIO', 'RIO DE JANEIRO', 'AREAL', '2020-04-13'),
(20, 'QUINTINO BOCAIUVA', 'RIO DE JANEIRO', 'RJ', '2020-04-14');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `escola`
--
ALTER TABLE `escola`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `escola`
--
ALTER TABLE `escola`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
