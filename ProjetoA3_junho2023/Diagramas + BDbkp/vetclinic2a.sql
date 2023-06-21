-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21/06/2023 às 03:13
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `vetclinic2a`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `atendente`
--

CREATE TABLE `atendente` (
  `idAtendente` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `atendente`
--

INSERT INTO `atendente` (`idAtendente`, `nome`) VALUES
(1, 'Larissa Silva'),
(2, 'Sophia Silva'),
(3, 'William Barbosa');

-- --------------------------------------------------------

--
-- Estrutura para tabela `canino`
--

CREATE TABLE `canino` (
  `idCanino` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `canino`
--

INSERT INTO `canino` (`idCanino`, `nome`, `idade`) VALUES
(0, '', 0),
(1, 'Punch', 1),
(2, 'Pitucha', 1),
(3, 'Spock', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `consulta`
--

CREATE TABLE `consulta` (
  `idConsulta` int(11) NOT NULL,
  `data` varchar(45) DEFAULT NULL,
  `Procedimento` varchar(45) DEFAULT NULL,
  `Veterinario_idVeterinario` int(11) NOT NULL,
  `Atendente_idAtendente` int(11) NOT NULL,
  `Equino_idEquino` int(11) DEFAULT NULL,
  `Canino_idCanino` int(11) DEFAULT NULL,
  `Felino_idFelino` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `consulta`
--

INSERT INTO `consulta` (`idConsulta`, `data`, `Procedimento`, `Veterinario_idVeterinario`, `Atendente_idAtendente`, `Equino_idEquino`, `Canino_idCanino`, `Felino_idFelino`) VALUES
(1, '20/06/2023 - 14:20', 'Soro e medicação', 1, 1, 1, 0, 0),
(2, '20/06/2023 - 16:40', 'Rotina + escovação', 2, 2, 2, 0, 0),
(3, '20/06/2023 - 18:02', 'Rotina', 3, 3, 3, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `equino`
--

CREATE TABLE `equino` (
  `idEquino` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `equino`
--

INSERT INTO `equino` (`idEquino`, `nome`, `idade`) VALUES
(0, '', 0),
(1, 'Alazão', 5),
(2, 'Pé de Pano', 5),
(3, 'Scadufax', 5);

-- --------------------------------------------------------

--
-- Estrutura para tabela `felino`
--

CREATE TABLE `felino` (
  `idFelino` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `felino`
--

INSERT INTO `felino` (`idFelino`, `nome`, `idade`) VALUES
(0, '', 0),
(1, 'Aroldo', 1),
(2, 'Edgar', 1),
(3, 'Pam', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `veterinario`
--

CREATE TABLE `veterinario` (
  `idVeterinario` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `veterinario`
--

INSERT INTO `veterinario` (`idVeterinario`, `nome`) VALUES
(1, 'Gabriel Perez'),
(2, 'Glauciane Moura'),
(3, 'Saul Medeiros');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `atendente`
--
ALTER TABLE `atendente`
  ADD PRIMARY KEY (`idAtendente`);

--
-- Índices de tabela `canino`
--
ALTER TABLE `canino`
  ADD PRIMARY KEY (`idCanino`),
  ADD UNIQUE KEY `idCanino_UNIQUE` (`idCanino`);

--
-- Índices de tabela `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`idConsulta`),
  ADD KEY `fk_Consulta_Veterinario_idx` (`Veterinario_idVeterinario`) USING BTREE,
  ADD KEY `fk_Consulta_Atendente_idx` (`Atendente_idAtendente`) USING BTREE,
  ADD KEY `fk_Consulta_Equino_idx` (`Equino_idEquino`) USING BTREE,
  ADD KEY `fk_Consulta_Canino_idx` (`Canino_idCanino`) USING BTREE,
  ADD KEY `fk_Consulta_Felino_idx` (`Felino_idFelino`) USING BTREE;

--
-- Índices de tabela `equino`
--
ALTER TABLE `equino`
  ADD PRIMARY KEY (`idEquino`),
  ADD UNIQUE KEY `idEquino_UNIQUE` (`idEquino`);

--
-- Índices de tabela `felino`
--
ALTER TABLE `felino`
  ADD PRIMARY KEY (`idFelino`),
  ADD UNIQUE KEY `idFelino_UNIQUE` (`idFelino`);

--
-- Índices de tabela `veterinario`
--
ALTER TABLE `veterinario`
  ADD PRIMARY KEY (`idVeterinario`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `canino`
--
ALTER TABLE `canino`
  MODIFY `idCanino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=105;

--
-- AUTO_INCREMENT de tabela `equino`
--
ALTER TABLE `equino`
  MODIFY `idEquino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de tabela `felino`
--
ALTER TABLE `felino`
  MODIFY `idFelino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `fk_Consulta_Atendente` FOREIGN KEY (`Atendente_idAtendente`) REFERENCES `atendente` (`idAtendente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Consulta_Canino` FOREIGN KEY (`Canino_idCanino`) REFERENCES `canino` (`idCanino`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Consulta_Equino` FOREIGN KEY (`Equino_idEquino`) REFERENCES `equino` (`idEquino`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Consulta_Felino` FOREIGN KEY (`Felino_idFelino`) REFERENCES `felino` (`idFelino`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Consulta_Veterinario` FOREIGN KEY (`Veterinario_idVeterinario`) REFERENCES `veterinario` (`idVeterinario`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
