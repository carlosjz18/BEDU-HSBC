# Sesión 03 ⚙️

BEDU: Developer Engineering
- Modulo 02: Java SE Básico
- Sesion 03: Introducción a Spring Boot

## Contenido

- Ejemplo 01
- Ejemplo 02
- Ejemplo 03
- Reto 01
- Reto 02
- Reto 03

## Evidencias 🗂️

- `@GetMapping("/saludo/{nombre}")`  

  ![endpoint-get-saludo](./img/endpoint-get-saludo.png)  

- `@PostMapping("/saludo")`  

  ![endpoint-post-saludo](./img/endpoint-post-saludo.png)


## Commands

### Maven:

Para correr el proyecto utiliza una de las siguientes formas:

#1

`mvn spring-boot:run`

Con maven wrapper

`./mvnw spring-boot:run`

#2

`mvn package`

`java -jar .\target\sesion3-0.0.1-SNAPSHOT.jar`

### Plugin Maven

Gracias al plugin `spring-boot-maven-plugin` declarado en el `pom.xml` es posible construir el proyecto en un `jar` con todas las dependencias necesarias, ya que sin este solo se construiría con las clases compiladas, cuando ejecutamos `mvn package` el plugin por debajo ejecuta el comando `mvn spring-boot:repackage` que es con el cual se añaden las dependencias (.jars) necesarias del proyecto.

`mvn package` = `mvn clean package spring-boot:repackage`

#### spring-boot:repackage

Repackage existing JAR and WAR archives so that they can be executed from the command line using java -jar. With layout=NONE can also be used simply to package a JAR with nested dependencies (and no main class, so not executable).

### Utilidades

Comando básico para ver el contenido de un fichero `jar`

`jar -tf .\target\sesion3-0.0.1-SNAPSHOT.jar`

Puedes utilizar la opción verboso, `v`, para producir información adicional sobre el tamaño de los ficheros, y las fechas de modificación.

`jar -tfv .\target\sesion3-0.0.1-SNAPSHOT.jar`

#### Referencias:
https://docs.spring.io/spring-boot/docs/current/maven-plugin/reference/htmlsingle/

https://www.baeldung.com/spring-boot-repackage-vs-mvn-package

## Construido con 🛠️

* [Java 11]() Lenguaje utilizado
* [Maven]() Tool Build
* [Spring/Spring Boot]() Java Framework
* [IntelliJ IDEA]() IDE utilizado

## Autor ✒️

* **Carlos Jaimez** - *Código inicial* - [carlosjz18](https://github.com/carlosjz18)