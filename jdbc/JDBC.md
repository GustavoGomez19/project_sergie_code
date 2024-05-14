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