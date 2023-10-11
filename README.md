# Employee Management System

This is a simple employee management system implemented in Java. It allows you to add, view, search, update, and remove employee records within a company. The system is designed to demonstrate basic object-oriented programming concepts and can be used as a starting point for more complex applications.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Concepts Covered](#concepts-covered)
- [Usage](#usage)

## Features

- **Employee Management**: Add, view, search, update, and remove employee records.
- **Basic UI**: A console-based user interface for interacting with the system.
- **Object-Oriented Design**: Demonstrates key OOP principles such as classes, objects, and encapsulation.
- **Documentation**: Includes JavaDoc comments to explain classes and methods.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed on your system.
- An integrated development environment (IDE) for Java, such as Eclipse or IntelliJ IDEA (optional).

## Getting Started

1. Clone the repository to your local machine:

```shell
git clone https://github.com/Md-Azam-Ansari/employee-management-system.git
```

2. Open the project in your preferred Java IDE (if you're using one).

## Concepts Covered

- **Object-Oriented Programming (OOP)**: The project is structured using classes and objects to represent employees, companies, and the application itself.

- **Encapsulation**: Private attributes and accessor methods (getters and setters) are used to encapsulate the employee's data, ensuring data integrity and control over access.

- **Inheritance**: The project follows the inheritance concept by inheriting from the `Object` class and creating custom classes like `Employee1`, `EmployeeCreation1`, `Company1`, `CompanyApp1`,
  and `AppLauncher1`.

- **ArrayList**: The project utilizes an `ArrayList` to store and manage a dynamic list of employee objects efficiently.

- **User Input**: The project uses the `Scanner` class to accept user input for various operations, enhancing interactivity.

- **Method Implementation**: Methods are defined to perform specific tasks such as adding, searching, updating, and removing employees.

- **Menu-driven Interface**: The user interface is designed around a menu-driven system, allowing users to select actions from a list of options.

- **Exception Handling**: Basic error handling is demonstrated for scenarios like searching for non-existent employees or displaying a menu for invalid input.

## Usage

To run the Employee Management System, follow these steps:

1. Run the `CompanyApp1` class.
2. Use the provided menu to interact with the system. You can:
   - Add new employees.
   - View employee details.
   - Search for employees by ID.
   - Update employee salaries.
   - Delete employee records.
   - View the total number of employees.
   - Exit the application.
