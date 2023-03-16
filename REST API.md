REST stands for Representational State Transfer and it is an architectural style used for building web services. RESTful APIs are used to build scalable and efficient web applications that can communicate with each other over the internet.

The core principles of REST include:

### 1.Client-Server architecture: 
Separation of concerns between the client and the server, which enables both to evolve independently.

### 2.Statelessness: 
Each request from the client to the server should contain all the necessary information required to complete the request. The server does not store any client session information.

### 3.Uniform Interface: 
A uniform interface should be used between the client and the server to simplify communication.

### 4.Cacheability: 
Responses from the server should be cacheable to improve performance.

### 5.Layered system: 
REST allows for the use of intermediary servers, such as load balancers or proxies, which can improve scalability and security.

Here's an example of a REST API in Java using Spring Boot:
```java
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
    
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
    
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

```
In this example, we have a UserController class that handles HTTP requests to the "/api/users" endpoint. The UserController class is annotated with "@RestController" and "@RequestMapping("/api")" to indicate that it is a RESTful controller and all endpoints will start with "/api".

The UserController class has five methods that handle HTTP requests using different HTTP methods (GET, POST, PUT, DELETE) to perform CRUD operations on the User resource. The methods are annotated with "@GetMapping", "@PostMapping", "@PutMapping", "@DeleteMapping" to indicate the HTTP method and endpoint URL.

The methods take in input data in different ways, such as using "@PathVariable" to extract values from the URL, "@RequestBody" to extract data from the request body, or no input data at all. The methods return data in the form of a User object or a list of User objects.

This example illustrates how to create a RESTful API using Spring Boot, but the same principles can be applied to any programming language or framework.