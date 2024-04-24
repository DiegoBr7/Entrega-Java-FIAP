INSERT INTO TAB_COLABORADOR (CODIGO_COLABORADOR, NOME, EMAIL, SALARIO, DATA_CONTRATACAO) VALUES
  (SQ_COLABORADOR.NEXTVAL, 'Thiago', 'thiagoyama@gmail.com', 1500, TO_DATE('10/10/2010', 'DD/MM/YYYY'));
 
    

SELECT * FROM TAB_COLABORADOR ; 


SELECT * 
  FROM TAB_COLABORADOR 
  WHERE SALARIO < 10000;
  
  SELECT * 
  FROM TAB_COLABORADOR 
  WHERE SALARIO < 3000 AND DATA_CONTRATACAO < TO_DATE('10/10/2015','dd/mm/yyyy');
  
  UPDATE TAB_COLABORADOR 
  SET NOME = 'Thiago Yamamoto' 
  WHERE CODIGO_COLABORADOR = 3;
  
  UPDATE TAB_COLABORADOR 
  SET EMAIL = 'thiago@fiap.com.br', SALARIO = 2000 
  WHERE CODIGO_COLABORADOR = 1;
  
  
  DELETE 
  FROM TAB_COLABORADOR 
  WHERE CODIGO_COLABORADOR = 2;
  
  SELECT * FROM T_CARTAO_CC ;
  
  
  
  //__________________________________________________________________________________________________________
  
  
  CREATE TABLE dt_Departamento(
  
  id number not null primary key ,
  nome VARCHAR2(255) not null   
  
  );
  
  CREATE TABLE  tb_Funcionario(  
  id number not null ,
  nome VARCHAR2(255) not null ,
  salario NUMBER (19,2),
  data_admissao DATE ,
  departamento_id NUMBER NOT NULL , 
  PRIMARY KEY (id) ,
  FOREIGN KEY (departamento_id) REFERENCES dt_Departamento(id)  
  );
  
  
  CREATE Sequence sq_depart start with 1 increment by 1 ; 

  CREATE Sequence sq_fun start with 1 increment by 1 ; 
  
  
insert into dt_departamento (id , nome) values ( sq_depart.nextval , 'Projetos');
insert into dt_departamento (id , nome) values ( sq_depart.nextval , 'Desenvolvimento');
insert into dt_departamento (id , nome) values ( sq_depart.nextval , 'Infra');
insert into dt_departamento (id , nome) values ( sq_depart.nextval , 'Financeiro');
commit;

select * from dt_departamento ;

insert into tb_funcionario (id , nome , d) values ( sq_fun.nextval , 'Projetos');
insert into tb_funcionario (id , nome) values ( sq_fun.nextval , 'Projetos');
insert into tb_funcionario (id , nome) values ( sq_fun.nextval , 'Projetos');
insert into tb_funcionario (id , nome) values ( sq_fun.nextval , 'Projetos');



  //_________________________________________________________________________________________________________ 
  