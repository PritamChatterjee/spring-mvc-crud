# Spring MVC with CRUD Operations

A simple Spring MVC project demonstrating basic **CRUD (Create, Read, Update, Delete)** operations using JSP, Servlets, Spring Framework, and a relational database MySQL.

---

## 🚀 Features

- Create new records (e.g., users, employees, products)
- Read/list all records
- Update existing records
- Delete records
- JSP-based front-end using Spring MVC pattern
- DAO-based architecture for database interaction

---

## 📁 Project Structure

```
SpringMVC-CRUD/
├── src/
│   ├── main/
│   │   ├── java/com/example/controller/
│   │   ├── java/com/example/dao/
│   │   ├── java/com/example/model/
│   │   ├── java/com/example/service/
│   │   └── webapp/WEB-INF/views/
├── webapp/
│   └── index.jsp
├── applicationContext.xml
├── dispatcher-servlet.xml
├── pom.xml
└── README.md
```

---

## 🧾 Technologies Used

- Java 8+
- Spring MVC
- JSP, JSTL
- Hibernate (optional)
- MySQL
- Maven
- Tomcat

---

## ✅ Example Code Snippets

### 🎯 Model (Employee.java)

```java
public class Employee {
    private int id;
    private String name;
    private String email;

    // Getters and setters
}
```

### 🔁 DAO Interface

```java
public interface EmployeeDAO {
    void save(Employee emp);
    List<Employee> list();
    void update(Employee emp);
    void delete(int id);
    Employee get(int id);
}
```

### 🎮 Controller

```java
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", employeeService.listAll());
        return "index";
    }

    @RequestMapping("/new")
    public String showNewEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "new_employee";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/";
    }
}
```

---

## 🛠️ Running the Project

1. Clone the repo:
```bash
git clone https://github.com/pritam2chatterjee/SpringMVC-CRUD.git
cd SpringMVC-CRUD
```

2. Configure the database connection in `applicationContext.xml`.

3. Build and deploy using Maven:
```bash
mvn clean install
```

4. Deploy the WAR to Tomcat and run the application.

---

## 🧾 License

This project is licensed under the [MIT License](LICENSE).

---

## 🤝 Contributions

Contributions are welcome! Feel free to fork the repo and submit a pull request.

---

## 📧 Contact

For queries, contact [your-email@example.com](mailto:your-email@example.com)

---

Happy Coding! 🌱
