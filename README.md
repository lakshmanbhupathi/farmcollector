# farmcollector

Application with complete solution

Technology stack:

- Java 17
- Spring boot 3.2.5.RELEASE
- Spring JPA
- H2 embedded database
- PostMan
- gradle 8.7 (build tool)
- Github
- Intellij Idea 24.01

Instructions:

0. Make sure JDK 17 installed
1. Please install latest gradle  8.7 ( gradle wrapper gets it anyway by Intellij)
2. Open project as gradle project from Intellij Idea(for eclipse please install gradle plugin prior to import).
3. Run FarmCollectorApplication.main(), now web application will be up on http://localhost:8080)
4. Install POSTMAN from chrome app store
5. import FarmCollector.postman_collection.json collection into postman
6. Now you can run API's from already made API requests in Postman.
7. Please hit /api/planted API before hitting /api/harvest API 
8. After Data population with can you this link http://localhost:8080/crops check report on crops

Instructions to run test cases:

`cd {project_dir}`

`gradle test`