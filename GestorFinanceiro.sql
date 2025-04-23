CREATE DATABASE GestorFinanceiro;
USE GestorFinanceiro;

-- Criar tabela de Usuários
CREATE TABLE Usuario (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(250) NOT NULL
);

-- Criar tabela de Transações (Receita e Despesas)
CREATE TABLE Transacao (
	id INT Primary KEY AUTO_INCREMENT,
    usuario_id INT,
    tipo VARCHAR(20) NOT NULL, -- Receita ou Despesa
    categoria VARCHAR(50) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    descricao VARCHAR(255),
    data DATE NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);