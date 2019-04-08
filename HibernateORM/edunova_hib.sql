-- MySQL dump 10.16  Distrib 10.1.13-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: edunova_hib
-- ------------------------------------------------------
-- Server version	10.1.13-MariaDB

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
-- Table structure for table `grupa`
--

DROP TABLE IF EXISTS `grupa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grupa` (
  `sifra` int(11) NOT NULL,
  `datumPocetka` date DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  `predavac_sifra` int(11) DEFAULT NULL,
  `smjer_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FK2hbmmwjcsmu2xcyehwgiwsnpe` (`predavac_sifra`),
  KEY `FK3w95xhot7y3qf2fk0a35e8fum` (`smjer_sifra`),
  CONSTRAINT `FK2hbmmwjcsmu2xcyehwgiwsnpe` FOREIGN KEY (`predavac_sifra`) REFERENCES `predavac` (`sifra`),
  CONSTRAINT `FK3w95xhot7y3qf2fk0a35e8fum` FOREIGN KEY (`smjer_sifra`) REFERENCES `smjer` (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupa`
--

LOCK TABLES `grupa` WRITE;
/*!40000 ALTER TABLE `grupa` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupa_polaznik`
--

DROP TABLE IF EXISTS `grupa_polaznik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grupa_polaznik` (
  `Grupa_sifra` int(11) NOT NULL,
  `polaznici_sifra` int(11) NOT NULL,
  `grupe_sifra` int(11) NOT NULL,
  KEY `FKniwth93hdrypehcgtbfesc6nu` (`polaznici_sifra`),
  KEY `FK5mypmfim9puqt3xi6ct45hgjt` (`Grupa_sifra`),
  KEY `FKs69bbxl1r46m3kgw8bwr34ny1` (`grupe_sifra`),
  CONSTRAINT `FK5mypmfim9puqt3xi6ct45hgjt` FOREIGN KEY (`Grupa_sifra`) REFERENCES `grupa` (`sifra`),
  CONSTRAINT `FKniwth93hdrypehcgtbfesc6nu` FOREIGN KEY (`polaznici_sifra`) REFERENCES `polaznik` (`sifra`),
  CONSTRAINT `FKs69bbxl1r46m3kgw8bwr34ny1` FOREIGN KEY (`grupe_sifra`) REFERENCES `grupa` (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupa_polaznik`
--

LOCK TABLES `grupa_polaznik` WRITE;
/*!40000 ALTER TABLE `grupa_polaznik` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupa_polaznik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (133588),(133588),(133588),(133588);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operater`
--

DROP TABLE IF EXISTS `operater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operater` (
  `sifra` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `lozinka` char(60) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operater`
--

LOCK TABLES `operater` WRITE;
/*!40000 ALTER TABLE `operater` DISABLE KEYS */;
INSERT INTO `operater` VALUES (10,'tjakopec@gmail.com','Tomislav','$2a$10$wL5pTXnYf1DWsbQqCQ3fteiuOzBZLiDZcTDty3aDyrgJ8nnIqZLuW','Jakopec');
/*!40000 ALTER TABLE `operater` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `polaznik`
--

DROP TABLE IF EXISTS `polaznik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `polaznik` (
  `sifra` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `oib` varchar(255) DEFAULT NULL,
  `spol` bit(1) NOT NULL,
  `brojUgovora` varchar(255) DEFAULT NULL,
  `prezimeGlavno` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `polaznik`
--

LOCK TABLES `polaznik` WRITE;
/*!40000 ALTER TABLE `polaznik` DISABLE KEYS */;
INSERT INTO `polaznik` VALUES (13,'edunova@edunova.hr','Pero','41543578992','\0','22',NULL,'Perić'),(14,'edunova@edunova.hr','Polaznik','98544075463','\0',NULL,NULL,'Prezime'),(15,'edunova@edunova.hr','Polaznik 0','98544075463','\0',NULL,NULL,'Prezime 0'),(16,'edunova@edunova.hr','Polaznik 1','98544075463','\0',NULL,NULL,'Prezime 1'),(17,'edunova@edunova.hr','Polaznik 2','98544075463','\0',NULL,NULL,'Prezime 2'),(18,'edunova@edunova.hr','Polaznik 3','98544075463','\0',NULL,NULL,'Prezime 3'),(19,'edunova@edunova.hr','Polaznik 4','98544075463','\0',NULL,NULL,'Prezime 4'),(20,'edunova@edunova.hr','Polaznik 5','98544075463','\0',NULL,NULL,'Prezime 5'),(21,'edunova@edunova.hr','Polaznik 6','98544075463','\0',NULL,NULL,'Prezime 6'),(22,'edunova@edunova.hr','Polaznik 7','98544075463','\0',NULL,NULL,'Prezime 7'),(23,'edunova@edunova.hr','Polaznik 8','98544075463','\0',NULL,NULL,'Prezime 8'),(24,'edunova@edunova.hr','Polaznik 9','98544075463','\0',NULL,NULL,'Prezime 9'),(25,'edunova@edunova.hr','Polaznik 10','98544075463','\0',NULL,NULL,'Prezime 10'),(26,'edunova@edunova.hr','Polaznik 11','98544075463','\0',NULL,NULL,'Prezime 11'),(27,'edunova@edunova.hr','Polaznik 12','98544075463','\0',NULL,NULL,'Prezime 12'),(28,'edunova@edunova.hr','Polaznik 13','98544075463','\0',NULL,NULL,'Prezime 13'),(29,'edunova@edunova.hr','Polaznik 14','98544075463','\0',NULL,NULL,'Prezime 14'),(30,'edunova@edunova.hr','Polaznik 15','98544075463','\0',NULL,NULL,'Prezime 15'),(31,'edunova@edunova.hr','Polaznik 16','98544075463','\0',NULL,NULL,'Prezime 16'),(32,'edunova@edunova.hr','Polaznik 17','98544075463','\0',NULL,NULL,'Prezime 17'),(33,'edunova@edunova.hr','Polaznik 18','98544075463','\0',NULL,NULL,'Prezime 18'),(34,'edunova@edunova.hr','Polaznik 19','98544075463','\0',NULL,NULL,'Prezime 19'),(35,'edunova@edunova.hr','Polaznik 20','98544075463','\0',NULL,NULL,'Prezime 20'),(36,'edunova@edunova.hr','Polaznik 21','98544075463','\0',NULL,NULL,'Prezime 21'),(37,'edunova@edunova.hr','Polaznik 22','98544075463','\0',NULL,NULL,'Prezime 22'),(38,'edunova@edunova.hr','Polaznik 23','98544075463','\0',NULL,NULL,'Prezime 23'),(39,'edunova@edunova.hr','Polaznik 24','98544075463','\0',NULL,NULL,'Prezime 24'),(40,'edunova@edunova.hr','Polaznik 25','98544075463','\0',NULL,NULL,'Prezime 25'),(41,'edunova@edunova.hr','Polaznik 26','98544075463','\0',NULL,NULL,'Prezime 26'),(42,'edunova@edunova.hr','Polaznik 27','98544075463','\0',NULL,NULL,'Prezime 27'),(43,'edunova@edunova.hr','Polaznik 28','98544075463','\0',NULL,NULL,'Prezime 28'),(44,'edunova@edunova.hr','Polaznik 29','98544075463','\0',NULL,NULL,'Prezime 29'),(45,'edunova@edunova.hr','Polaznik 30','98544075463','\0',NULL,NULL,'Prezime 30'),(46,'edunova@edunova.hr','Polaznik 31','98544075463','\0',NULL,NULL,'Prezime 31'),(47,'edunova@edunova.hr','Polaznik 32','98544075463','\0',NULL,NULL,'Prezime 32'),(48,'edunova@edunova.hr','Polaznik 33','98544075463','\0',NULL,NULL,'Prezime 33'),(49,'edunova@edunova.hr','Polaznik 34','98544075463','\0',NULL,NULL,'Prezime 34'),(50,'edunova@edunova.hr','Polaznik 35','98544075463','\0',NULL,NULL,'Prezime 35'),(51,'edunova@edunova.hr','Polaznik 36','98544075463','\0',NULL,NULL,'Prezime 36'),(52,'edunova@edunova.hr','Polaznik 37','98544075463','\0',NULL,NULL,'Prezime 37'),(53,'edunova@edunova.hr','Polaznik 38','98544075463','\0',NULL,NULL,'Prezime 38'),(54,'edunova@edunova.hr','Polaznik 39','98544075463','\0',NULL,NULL,'Prezime 39'),(55,'edunova@edunova.hr','Polaznik 40','98544075463','\0',NULL,NULL,'Prezime 40'),(56,'edunova@edunova.hr','Polaznik 41','98544075463','\0',NULL,NULL,'Prezime 41'),(57,'edunova@edunova.hr','Polaznik 42','98544075463','\0',NULL,NULL,'Prezime 42'),(58,'edunova@edunova.hr','Polaznik 43','98544075463','\0',NULL,NULL,'Prezime 43'),(59,'edunova@edunova.hr','Polaznik 44','98544075463','\0',NULL,NULL,'Prezime 44'),(60,'edunova@edunova.hr','Polaznik 45','98544075463','\0',NULL,NULL,'Prezime 45');
/*!40000 ALTER TABLE `polaznik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `predavac`
--

DROP TABLE IF EXISTS `predavac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `predavac` (
  `sifra` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `oib` varchar(255) DEFAULT NULL,
  `spol` bit(1) NOT NULL,
  `iban` varchar(255) DEFAULT NULL,
  `prezimeGlavno` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `predavac`
--

LOCK TABLES `predavac` WRITE;
/*!40000 ALTER TABLE `predavac` DISABLE KEYS */;
INSERT INTO `predavac` VALUES (3,'tjakopec@gmail.com','Pero',NULL,'\0',NULL,NULL,'Perić'),(4,'tjakopec@gmail.com','Pero','57257286062','\0',NULL,NULL,'Perić'),(5,'tjakopec@gmail.com','Pero','01617271538','\0',NULL,NULL,'Perić'),(6,'pero@gmail.com','Pero','01617271538','\0','HR1525000098928815743',NULL,'Perić');
/*!40000 ALTER TABLE `predavac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `smjer`
--

DROP TABLE IF EXISTS `smjer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `smjer` (
  `sifra` int(11) NOT NULL,
  `cijena` decimal(19,2) DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  `trajanje` int(11) NOT NULL,
  `upisnina` decimal(19,2) DEFAULT NULL,
  `verificiran` bit(1) NOT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smjer`
--

LOCK TABLES `smjer` WRITE;
/*!40000 ALTER TABLE `smjer` DISABLE KEYS */;
INSERT INTO `smjer` VALUES (1,NULL,'Novi smjer',0,NULL,'\0'),(2,200.00,'Java',0,NULL,'\0'),(11,222.00,'NODDDD',130,3333.00,''),(12,33.00,'hhh',0,0.00,'\0');
/*!40000 ALTER TABLE `smjer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-03 17:11:43
