create database loja_virtual;

use loja_virtual;

create table filme(
id int primary key auto_increment,
nome varchar(50),
descricao varchar(100),
ano date);

insert into filme values(1, 'Mudança de hábito', 'Comedia musical', '1992-10-30');
insert into filme values(2, 'Mudança de hábito 2', 'Comedia', '1993-12-10');
insert into filme values(3, 'Pride and Prejudice', 'Drama', '2006-02-10');
insert into filme values(4, 'Titanic', 'Drama', '1988-01-16');
insert into filme values(5, 'It', 'Terror', '1990-11-18');
insert into filme values(6, 'Jumanji', 'Fantasia', '1996-03-29');
insert into filme values(7, 'Adoráveis Mulheres', 'Drama', '1994-12-21');
insert into filme values(8, 'Junior', 'Comedia', '1994-12-23');
insert into filme values(9, 'Romeu e Julieta', 'Drama', '1996-01-10');
insert into filme values(10, 'Operação cupido', 'Comedia', '1998-02-12');
insert into filme values(11, 'Jardim Secreto', 'Drama', '1993-08-13');
insert into filme values(12, 'As patricinhas de Beverly Hills', 'Comedia', '1995-07-19');
insert into filme values(13, 'Um lugar chamado Notting Hill', 'Comedia', '1999-07-30');
insert into filme values(14, 'Uma linda mulher', 'Comedia', '1990-07-27');
insert into filme values(15, 'Matilda', 'Fantasia', '1997-01-24');
insert into filme values(16, 'Gênio indomavel', 'Drama', '1998-02-20');
insert into filme values(17, 'A vida é bela', 'Drama', '1999-02-05');
insert into filme values(18, 'Free Willy', 'Drama', '1993-09-24');
insert into filme values(19, 'Stuart Little', 'Comedia', '2000-01-14');
insert into filme values(20, 'Tomates verdes fritos', 'Drama', '1992-04-10');

alter table filme rename column ano to data_lacamento;
