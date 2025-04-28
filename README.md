# 📱 Contact Management System

## 📋 Project Overview
This is a simple **Contact Management System** built in **Java** using **Object-Oriented Programming** principles.  
It allows users to **add**, **view**, **search**, **edit**, and **delete** contacts through a **menu-driven console interface**.

Contacts are stored dynamically using **ArrayList**, and are **sorted alphabetically** by name whenever viewed.

---

## 🛠 Features
- ➕ **Add Contact**: Save a new contact with Name, Phone Number, and optional Email.
- 🔍 **Search Contact**: Search a contact by exact name.
- 🔎 **Search by First Letter**: View all contacts whose name starts with a particular letter.
- ✏️ **Edit Contact**: Modify an existing contact's name, phone number, or email.
- ❌ **Delete Contact**: Remove a contact from the list.
- 📃 **View All Contacts**: See all contacts sorted alphabetically.
- 🚪 **Exit**: Safely exit the application.

---

## ⚙️ Technologies Used
- Java (Core)
- ArrayList (Dynamic storage)
- Comparable Interface (Sorting contacts by name)
- Collections Framework
- Scanner Class (User input handling)

---

## 🏗 Project Structure
- `Contact.java` - Entity class with fields (name, phone, email) and methods.
- `Operations.java` - Service class containing business logic (add, search, edit, delete, view).
- `Database.java` - Repository class to store contacts.
- `Default.java` - Driver class with the `main()` method and menu-based UI.

---

## 🚀 How to Run
1. Clone or download the project.
2. Open it in your favorite Java IDE (e.g., Eclipse, IntelliJ IDEA, VS Code).
3. Navigate to the `Default.java` file.
4. Run the `main()` method.
5. Use the console menu to perform operations.

---

## 📈 Future Enhancements
- File-based storage (using Java File I/O).
- Input validations (e.g., phone number should be 10 digits).
- Graphical User Interface (GUI) version using Java Swing.
- Add user login/signup functionality.
