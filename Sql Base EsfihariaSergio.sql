/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  daniel
 * Created: 30/06/2016
 */

create table Cliente(
	IdCliente int primary key not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	Nome varchar (40),
	Endereco varchar(40),
	Complemento varchar (10),
	Numero int,
	Telefone varchar (20),
	Celular varchar (20));

create table Produto(
	IdProduto int primary key not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	Nome varchar (20),
	IdSabor int,
	IdTipo int
);

create table  Sabor (
	IdSabor int not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	Nome varchar (20)
);

create table Tipo (
	IdTipo int not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	Nome varchar (20)
);

create table Pedido (
	IdPedido int not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
IdCliente int not null,
CONSTRAINT fkIdCliente FOREIGN KEY (IdCliente) REFERENCES Cliente

);

create table ItemDoPedido(
	IdItemdoPedido int not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	IdPedido int not null,
	IdProduto int not null,
	Qtde int not null,
	ValorTotal double not null,
	constraint fkIdPedido FOREIGN KEY (IdPedido) references Pedido,
	constraint fkIdProduto foreign key (IdProduto) references Produto	
);

create table Preco(
        IdPreco int not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	IdProduto int not null,
	ValorUnitario double
);
