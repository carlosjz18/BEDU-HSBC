# Sesión 1 ⚙🛠️

Proyecto en Java con build tool Maven.

Contiene:

- Ejemplo 1
- Ejemplo 2
- Ejemplo 3
- Ejemplo 4
- Reto 1
- Reto 2

## Evidencias 🗂️

- Ejemplo 1  
  ![ej1-pomxml](./img/ej1-pomxml.png)

- Ejemplo 2

  `> mvn validate`  
  ![ej2-mvn-validate](./img/ej2-mvn-validate.png)  
  `> mvn compile`  
  ![ej2-mvn-compile](./img/ej2-mvn-compile.png)  
  `> mvn test`  
  ![ej2-mvn-test](./img/ej2-mvn-test.png)  
  `> mvn package`  
  ![ej2-mvn-package](./img/ej2-mvn-package.png)  

- Ejemplo 3  
  ![ej3-ejecutar jar con maven](./img/ej3-ejecutar-jar-con-maven.png)

- Ejemplo 4  
  ![ej4-run-ide](./img/ej4-run-ide.png)

- Reto 1  
  ![reto1](./img/reto1.png)

- Reto 2  
  ![reto2](./img/reto2.png)

## Maven Phases

- `validate:` validate the project is correct and all necessary information is available
- `compile:` compile the source code of the project
- `test:` test the compiled source code using a suitable unit testing framework. These tests should not require the code
  be packaged or deployed
- `package:` take the compiled code and package it in its distributable format, such as a JAR.
- `integration-test:` process and deploy the package if necessary into an environment where integration tests can be run
- `verify:` run any checks to verify the package is valid and meets quality criteria
- `install:` install the package into the local repository, for use as a dependency in other projects locally
- `deploy:` done in an integration or release environment, copies the final package to the remote repository for sharing
  with other developers and projects.

## Construido con 🛠️

* [Java]() Lenguaje utilizado
* [Maven]() Build Tool
* [IntelliJ IDEA]() IDE utilizado

## Autor ✒️

* **Carlos Jaimez** - *Código inicial* - [carlosjz18](https://github.com/carlosjz18)
