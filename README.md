Demo project for Spring Boot with Hexagonal Architecture and Clean Code
=======================================================================

## 📁 Estructura del Proyecto
```
├── build.gradle
├── settings.gradle
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── hexagonal_architeture
│   │   │           └── SpringApp
│   │   │               ├── application
│   │   │               │   ├── port
│   │   │               │   │   ├── in
│   │   │               │   │   │   ├── CreateUserUseCase.java
│   │   │               │   │   │   └── GetUserUseCase.java
│   │   │               │   │   └── out
│   │   │               │   │       └── UserRepositoryPort.java
│   │   │               │   └── service
│   │   │               │       └── UserService.java
│   │   │               ├── domain
│   │   │               │   ├── model
│   │   │               │   │   └── User.java
│   │   │               │   └── service
│   │   │               │       └── UserValidationService.java
│   │   │               ├── infrastructure
│   │   │               │   ├── controller
│   │   │               │   │   └── dto
│   │   │               │   │       ├── UserController.java
│   │   │               │   │       ├── UserRequest.java
│   │   │               │   │       └── UserResponse.java
│   │   │               │   └── persistence
│   │   │               │       ├── JpaUserRepositoryAdapter.java
│   │   │               │       ├── SpringDataUserRepository.java
│   │   │               │       └── UserEntity.java
│   │   │               ├── ServletInitializer.java
│   │   │               └── SpringAppApplication.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── hexagonal_architeture
│                   └── SpringApp
│                       └── SpringAppApplicationTests.java
```

