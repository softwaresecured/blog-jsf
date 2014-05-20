JSF, Spring, JPA CRUD blog application
---

The web application using JSF 2, PrettyFaces, Spring and JPA.

#### Used frameworks
- Spring
- JPA/Hibernate
- Apache Tomcat 7 server
- [PrettyFaces](http://ocpsoft.org/prettyfaces/) pour pretty URLs.
- [Zurb Foundation 5](http://foundation.zurb.com/)

#### TODO's

- fix post id initialization/skip for new and edit actions
- tests


Run `mvn clean install` to download all the dependencies and initialize the project.


To run on Tomcat server:

- either copy the generated `war` (it is in the project's **target** directory) into Tomcat's webapp folder
- or deploy it in a standard way via Tomcat's application manager interface.
- or run the project directly from your favorite IDE (usually via `Project-Run` menu).

#### Gotchas

JSF processes all the actions as POST requests. So all the `posting`tags like `h:commandLink` or `h:commandButton`should be placed
inside a `h:form` element, that requires some extra work with CSS. That's why the links to delete a post are not so nicely aligned :).
