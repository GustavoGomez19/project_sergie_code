# Java Database Connector (JDBC)
Es una API (Aplication Programming Interface) de Java que proporciona un conjunto de clases e interfaces para interactuar con bases de datos relacionales desde 
aplicaciones Java.

Permite a los desarrolladores escribir código Java para ejecutar consultas SQL, 
insertar, actualizar y eliminar datos de la base de datos. así como recuperar y manipular los resultados de las consultas.

Proporciona una forma estandar y portatil de conectarse a diversas bases de datos. independientemente del sistema operativo o del servidor de base de datos utilizado.

# DAO (Data Access Object)
Es un patron de diseño utilizado en el desarrollo de software para separar la lógica de acceso de datos de la lógica de negocios de una aplicaión.

El proposito principal del DAO es abstraer y encapsular las operaciones de acceso a datos específicas de una fuente de datos, como una base de datos, un archivo o un servicio web, en un conjunto de métodos definidos en una interfaz.

Esto permite que la lógica de negocio de la aplicaión inetractúe con los objetos de acceso a datos a través de interfaces bien definidas, en lugar de acceder directamente a las lógica de acceso a datos.

# Maven
Es una herramienta de gestión de proyectos de código abierto. Proporciona una forma estandarizada de constriur, gestionar y desplegar proyectos de Java.

Utiliza un archivo XML llamado POM (Project Object Model) para describir la estructura del proyecto, sus dependencias, configuraciones de compilación y despliegue, entre otros aspectos.

Se utiliza ampliamente en la comunidad de desarrollo Java debido a su facilidad de uso, su robusta gestión de dependencias y su capacidad para automátizar tareas repetitivas en el desarrollo de software.

# Arquitectura: Cliente - Servidor
Es un modelo de computación distribuida en el que las tareas o funciones de una aplicación están divididas entre dos tipos de programas: el cliente y el servidor.

Facilita la escalabilidad y la distribuición de las tareas de procesamiento en una red, permitiendo que múltiples clientes accedadn y compartan recursos o servcios proporcionados por el servidor de manera eficiente. Además, facilita la modularidad y la actualización de la aplicación, ya que los cambios en la lógica del servidor pueden hacerse sin necesidad de modificar la interfaz del cliente.

## Cliente:
Es la parte de la aplicación que solicita y consume los servicios proporcionados por el servidor. Los clientes suelen ser aplicaciones de usuario final que interactuan con la interfaz de usuario y envían solicitudes al servidor para realizar operaciones específicas.

## Servidor:
Es la parte de la aplicación que recibe las solicitudes del cliente, procesa estas solicitudes y devuelve los resultados adecuados. Los servidores duelen ser programas que se ejecutan en máquinas dedicadas y que están diseñadas para manejar múltiples solicitudes de clientes simultáneamente.

## Spring
Es un framework de aplicaiones Java que proporciona soporte integral para el desarrollo de aplicaciones empresariales. Ofrece una amplia gama de características y módulos que abordan diferentes aspectos del desarrollo de software, incluyendo la inversión de control (IoC), la inyección de dependencias, la gestión transaccional, el desarrollo basado en aspectos (AOP), la seguridad, la persistencia de datos, entre otros.

Spring se integra facilmente con otros framworks y tecnologías, lo que lo convierte en una opción popular para el desarrollo de aplicaciones en Java en una amplia variedad de contextos, desde aplicaciones web hasta servicios RESTful, microservicios y aplicaciones empresariales complejas.

## Hibernate
Es un framework de mapeo objeto-relacional (ORM) para Java que simplifica la interacción con bases de datos relacionales al permitir a los desarrolladores trabajar con objetos Java en lugar de SQL directamente.

Proporciona herramientas para mapear objetos a tablas de bases de datos, gestionar sesiones y transacciones, realizar consultas utilizando HQL (Hibernate Query Language) y gestionar relaciones entre entidades, lo que facilita el desarrollo de aplicaciones al eliminar la necesidad de escribir consultas SQL manualmente y proporcionar una abstracción de la capa de persistencia.

## Persistencia de datos
### 1. Entidades
Son clases que representan onjetos de negocio en una aplicaión. Las entidades están relacionadas con las tablas de las bases de datos. Por ejemplo, se se está construyendo una aplicación de comercio electrónico, se podría tener una entidad 'Producto' que corresponde a la tabla 'productos' en la base de datos.
### 2. Repositorios
Son interfaces o clases que proporcionan métodos para realizar operaciones CRUD en las entidades. Los repositorios actuán como una capa de abstracción entre la lógica de negocio y el almacenamiento de datos, permitiendo a la aplicación interactuar con la base de datos de manera fácil y consitente.
### 3. Servicios
Son clases que encapsulan la lógica del negocio de la aplicación. Los servicios suelen ser responsables de coordinar las operaciones en las entidades y repositorios, aplicando reglas de negocio y realizando operaciones complejas que van más allá de la simple manipulación de datos.
### 4. Controladores
Son componentes responsables de manejar las peticiones HTTP y de interactuar con el usuario. En el contexto de la aplicación web, los controladores redciben solicitudes HTTP, llaman a los servicios correspondientes para procesar la lógica de negocio y devuelven respuestas HTTP adecuadas.

## Modelo Vista Controlador
MVC (Modelo Vista Controlador) en Java es un patrón arquitectónico que divide la aplicación en tres componentes fundamentales: El Modelo, que representa los datos y la lógica del negocio; La Vista, que es la interfaz del usuario; y El Controlador, que actúa como intermediario entre el modelo y la vista, manejando las solicitudes del usuario y coordinando la interacción entre los  otros dos componentes.

Este enfoque facilita la modularidad, la escalabilidad y el mantenimiento del código en una aplicación web.