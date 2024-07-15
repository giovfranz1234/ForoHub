# 🌟 ForoHub 🌟

La API se despliega localmente en:
* URL: http://localhost:8080

##  Autorización
La API requiere autorización mediante tokens JWT.

##  Tecnologías Utilizadas
- Java 🔧
- Maven 🔧
- Spring Boot 🔧
- Spring Data JPA 🔧
- MySQL 🔧
- JWT (JSON Web Tokens) 🔧

## 🌟 Endpoints
### Tópicos (`topico-controller`)

- **Actualizar un tópico**
    - `PUT /topico/{id}`
    - Body: `DatosActualizarTopico`

- **Crear un nuevo tópico**
    - `POST /topico`
    - Body: `DatosRegistroTopico`

- **Listar todos los tópicos**
    - `GET /topico`
    - Respuesta: `List<PageDatosListadoTopico>`

- **Listar un topico por "ID"**
    - `GET /topico/{id}`
    - Respuesta: `PageDatosListadoTopico`

- **Eliminar un tópico (lógico)**
    - `DELETE /topico/{id}`

### Autenticación (`autenticacion-controller`)

- **Iniciar sesión (login)**
    - `POST /login`
    - Body: `DatosAutenticacionUsuario`
    - Respuesta: `DatosJWTtoken`

## Autores

 Giovanni Roque