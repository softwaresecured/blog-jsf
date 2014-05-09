JSF, Spring, JPA CRUD blog application
---

The web application using JSF 2, Spring and JPA.

#### Used frameworks
- Spring
- JPA/Hibernate
- Apache Tomcat 7 server
- [Zurb Foundation 5](http://foundation.zurb.com/)

#### TODO

- add domain classes
- bean


Run `mvn clean install` to download all the dependencies and initialize the project.


To run on Tomcat server:

- either copy the generated `war` (it is in the project's **target** directory) into Tomcat's webapp folder
- or deploy it in a standard way via its Tomcat's application manager interface.
- or run the project directly from your favorite IDE (usually via `Project-Run` menu).
