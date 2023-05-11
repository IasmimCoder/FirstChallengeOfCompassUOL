CREATE TABLE Endereco (
  address_id SERIAL NOT NULL ,
  CEP VARCHAR(8),
  endereco VARCHAR(100),
  complemento VARCHAR(50),
  bairro VARCHAR(50),
  cidade VARCHAR(50),
  estado VARCHAR(2),
  pais VARCHAR(50),
  PRIMARY KEY (address_id)
);

CREATE TABLE Pessoa (
  person_id SERIAL NOT NULL,
  nome VARCHAR(50),
  age INT,
  telefone VARCHAR (15),
  altura FLOAT,
  email VARCHAR(50),
  cpf VARCHAR (11),
  data_nascimento DATE,
  address_id INT,
  PRIMARY KEY (person_id),
  FOREIGN KEY (address_id) REFERENCES Endereco(address_id)
);