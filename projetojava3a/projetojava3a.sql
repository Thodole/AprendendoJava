-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: projetojava3a
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `projetojava3a`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `projetojava3a` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;

USE `projetojava3a`;

--
-- Table structure for table `atendente`
--

DROP TABLE IF EXISTS `atendente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atendente` (
  `matr` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`matr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atendente`
--

LOCK TABLES `atendente` WRITE;
/*!40000 ALTER TABLE `atendente` DISABLE KEYS */;
INSERT INTO `atendente` (`matr`, `nome`) VALUES (1,'João da Silva'),(2,'Maria da Silva'),(3,'Pedro da Silva');
/*!40000 ALTER TABLE `atendente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fisica`
--

DROP TABLE IF EXISTS `fisica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fisica` (
  `cpf` varchar(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `idade` int(11) NOT NULL,
  `Atendente_matr` int(11) NOT NULL,
  PRIMARY KEY (`cpf`),
  KEY `fk_Fisica_Atendente_idx` (`Atendente_matr`),
  CONSTRAINT `fk_Fisica_Atendente` FOREIGN KEY (`Atendente_matr`) REFERENCES `atendente` (`matr`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fisica`
--

LOCK TABLES `fisica` WRITE;
/*!40000 ALTER TABLE `fisica` DISABLE KEYS */;
INSERT INTO `fisica` (`cpf`, `nome`, `idade`, `Atendente_matr`) VALUES ('11111111111','Francisco de Sousa',20,3),('22222222222','Francisca de Sousa',25,3),('33333333333','Geraldo de Sousa',30,2),('44444444444','Geralda de Sousa',40,1);
/*!40000 ALTER TABLE `fisica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `juridica`
--

DROP TABLE IF EXISTS `juridica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `juridica` (
  `cnpj` varchar(6) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `idade` int(11) NOT NULL,
  `Atendente_matr` int(11) NOT NULL,
  PRIMARY KEY (`cnpj`),
  KEY `fk_Juridica_Atendente1_idx` (`Atendente_matr`),
  CONSTRAINT `fk_Juridica_Atendente1` FOREIGN KEY (`Atendente_matr`) REFERENCES `atendente` (`matr`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `juridica`
--

LOCK TABLES `juridica` WRITE;
/*!40000 ALTER TABLE `juridica` DISABLE KEYS */;
INSERT INTO `juridica` (`cnpj`, `nome`, `idade`, `Atendente_matr`) VALUES ('101010','ABC Produtos',2,1),('202020','Distribuidora Real',4,1),('303030','Atacadão Vende Mais',6,2),('404040','Atacadão Vende Menos',10,3);
/*!40000 ALTER TABLE `juridica` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-25 14:28:58
