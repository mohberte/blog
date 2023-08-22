#  A Restful Blog 

A Rest Api Blog with an embedded frontend to display the data
![blog-front](https://github.com/mohberte/blog/assets/111369661/61eda1de-ea39-40a5-b68b-30632702e2a7)
This project is a blog application with a REST API built in Java. 
It includes three resources: `Profile`, `Post`, and `Comment`. 
The front-end interface is built with JSP and can be accessed when the project is loaded onto a server.
There is an inbuilt local database class that gets intanciated at the start and lets you test the application.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or higher
- Maven
- A web server (such as Tomcat)

### Installing

1. Clone the repository:

2. Navigate to the project directory:

3. Build the project with Maven:
mvn clean package


4. Deploy the resulting `.war` file to your web server.

5. Access the front-end interface by visiting `http://localhost:8080/blog` in your web browser.

## Using the API

The REST API is available at `http://localhost:8080/blog/webapi/`.

### Endpoints
![blog-profiles](https://github.com/mohberte/blog/assets/111369661/62936ad9-1dc5-4ab5-975d-c4531e2f2b90)
- `/profiles`:
  - `GET`: Retrieve a list of all profiles
- `/profiles/{name}`:
  - `GET`: Retrieve a specific profile by name
- `/posts`:
  - `GET`: Retrieve a list of all posts
- `/posts/{postId}`:
  - `GET`: Retrieve a specific post by ID
- `/posts/{postId}/comments`:
  - `GET`: Retrieve a list of all the comments
- `/posts/{postId}/comments/{commentId}`:
  - `GET`: Retrieve a specific comment on a post

### Example Requests

Retrieve a list of all profiles:

curl -X GET http://localhost:8080/blog/webapi/profiles


### A blog Post accessed from the Front-End interface:

http://localhost:8080/blog/postServlet?id=1

![blog-entry](https://github.com/mohberte/blog/assets/111369661/efdff0e5-ff90-4611-8793-215019a13feb)

