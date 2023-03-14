# Notibot API
## Autores:
- Andrés Ponce
- Christian Pazmiño
- Anthony Simbaña
- Fredy Pallo
# Introducción
Esta documentación lo ayudará a familiarizarse con los recursos de la API de NotiBot y le mostrará cómo realizar diferentes consultas, para que pueda aprovecharla al máximo.
# Tecnologías
- Apache Tomcat 8.5.87
- Eclipse Link 2.5.2
- Java Persistence API 2.2
- Javax JSON Bind API 1.0
- Jersey 2.31
- Jersey Media JSON Jackson 2.31
- PostgreSQL 14.6
# URL Base
La URL base es el punto de partida de todos los recursos de API disponibles.
Todas las respuestas devolverán datos en JSON.
```bash
http://localhost:8080/NoticiasAPI/rest/
```
# Obtener todos los autores
Puede acceder a la lista de autores mediante el punto final /autores
```bash
GET http://localhost:8080/NoticiasAPI/rest/autores
```
# Obtener un solo autor
Puede obtener un solo autor a través de la identificación como parámetro: /buscarId?id={int}, donde {int} representa al ID en la base de datos del autor a buscar.
```bash
GET http://localhost:8080/NoticiasAPI/rest/autores/buscarID?id={int}
```
# Crear un autor
Puede insertar un autor en la base de datos mediante una solicitud POST donde se defina en el cuerpo de la solicitud el siguiente formato de archivo JSON:
```bash
{
    "nombre": "Nombre del autor",
    "apellido": "Apellido del autor",
    "correo": "Correo electrónico del autor"
}
```
```bash
POST http://localhost:8080/NoticiasAPI/rest/autores/crear
```
El método retornará true si la operación se ha realizado correctamente, y false en caso de que no.
# Actualizar un autor
Puede actualizar un autor en la base de datos mediante una solicitud PUT donde se defina en el cuerpo de la solicitud el siguiente formato de archivo JSON:
```bash
{
    "id": id del Autor a actualizar,
    "nombre": "Nuevo Nombre del autor",
    "apellido": "Nuevo Apellido del autor",
    "correo": "Nuevo Correo electrónico del autor"
}
```
```bash
PUT http://localhost:8080/NoticiasAPI/rest/autores/actualizar
```
El método retornará true si la operación se ha realizado correctamente, y false en caso de que no.
# Borrar un autor
Puede borrar un autor en la base de datos mediante una solicitud DELETE donde en el URL se define el id de la noticia a borrar. La ruta de acceso es /noticias/borrar?id={int}, donde {int} representa al ID en la base de datos de la noticia a borrar.
```bash
DELETE http://localhost:8080/NoticiasAPI/rest/autores/borrar?id={int}
```
# Obtener todas las noticias
Puede acceder a la lista de noticias mediante el punto final /noticias
```bash
GET http://localhost:8080/NoticiasAPI/rest/noticias
```
# Obtener una sola noticia
Puede obtener una sola noticia a través de la identificación como parámetro: /buscarId?id={int}, donde {int} representa al ID en la base de datos de la noticia a buscar.
```bash
GET http://localhost:8080/NoticiasAPI/rest/noticias/buscarId?id={int}
```
# Crear una noticia
Puede insertar una noticia en la base de datos mediante una solicitud POST donde se defina en el cuerpo de la solicitud el siguiente formato de archivo JSON:
```bash
{
    "title": "Título de la noticia",
    "cuerpo": "Cuerpo de la noticia",
    "idAutor": id del autor,
    "fecha": "aaaa-MM-dd"
}
```
```bash
POST http://localhost:8080/NoticiasAPI/rest/noticias/crear
```
El método retornará true si la operación se ha realizado correctamente, y false en caso de que no.
# Actualizar una noticia
Puede actualizar una noticia en la base de datos mediante una solicitud PUT donde se defina en el cuerpo de la solicitud el siguiente formato de archivo JSON:
```bash
{
    "id": id de la noticia a actualizar
    "title": "Nuevo título de la noticia",
    "cuerpo": "Nuevo cuerpo de la noticia",
    "idAutor": Nuevo id del autor,
    "fecha": "aaaa-MM-dd" //Nueva
}
```
```bash
PUT http://localhost:8080/NoticiasAPI/rest/noticias/actualizar
```
El método retornará true si la operación se ha realizado correctamente, y false en caso de que no.
# Borrar una noticia
Puede borrar una noticia en la base de datos mediante una solicitud DELETE donde en el URL se define el id de la noticia a borrar. La ruta de acceso es /noticias/borrar?id={int}, donde {int} representa al ID en la base de datos de la noticia a borrar.
```bash
DELETE http://localhost:8080/NoticiasAPI/rest/noticias/borrar?id={int}
```
# Obtener una lista de noticias de un autor
Puede obtener una lista de noticias a través de la identificación del autor como parámetro: /buscarPorAutorId?idAutor={int}, donde {int} representa al ID en la base de datos del autor.
```bash
GET http://localhost:8080/NoticiasAPI/rest/noticias/buscarPorAutorId?idAutor={int}
```
# Obtener una lista de noticias de un año
Puede obtener una lista de noticias a través del año de publicación como parámetro: /buscarPorYear?year={int}, donde {int} representa el año en entero el cual se busca la noticia.
```bash
GET http://localhost:8080/NoticiasAPI/rest/noticias/buscarPorYear?year={int}
```
# Obtener una lista de noticias por búsqueda de título si contiene
Puede obtener una lista de noticias a través de una subcadena del título como parámetro: /buscarPorTitulo?titulo={String}, donde {String} representa la subcadena a buscar en los títulos de las noticias existentes.
```bash
GET http://localhost:8080/NoticiasAPI/rest/noticias/buscarPorTitulo?titulo={String}
```
