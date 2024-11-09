# Research Paper Management System

This project is a **Research Paper Management System** built using **Java**. It provides a graphical user interface (GUI) for adding, viewing, and deleting research papers. The data is managed using in-memory storage with collections (e.g., `ArrayList`).

## Table of Contents
1. [Introduction](#introduction)
2. [Requirements](#requirements)
3. [Project Setup](#project-setup)
4. [Features](#features)
5. [How to Run](#how-to-run)
6. [Folder Structure](#folder-structure)
7. [Contributing](#contributing)

## Introduction

The **Research Paper Management System** allows users to:
- Add new papers to the system with details such as title, publication year, authors, and associated journals.
- View a list of all papers in the system.
- Delete papers from the system by entering the paper ID.

This system is implemented in Java and provides a simple GUI using **Swing**. The data is temporarily stored in-memory using **ArrayLists** for easy management.

## Requirements

Before running the project, ensure that you have the following installed:
- **Java 8** or higher
- A **Java IDE** (e.g., IntelliJ IDEA, Eclipse) or the **Java Development Kit (JDK)** installed on your machine

## Project Setup

### 1. Clone the repository
Clone this repository to your local machine:

```bash
git clone https://github.com/yourusername/research-paper-management.git
cd research-paper-management
```

### 2. No build tools required
Since this is a simple Java project, you don't need to use any build tools like **Maven** or **Gradle**. All you need to do is import the project into your Java IDE (e.g., IntelliJ IDEA or Eclipse).

- **For IntelliJ IDEA**: Open IntelliJ, select `File -> Open`, and choose the project directory.
- **For Eclipse**: Select `File -> Import -> General -> Existing Projects into Workspace`, and choose the project directory.

Alternatively, you can compile and run the Java code using command line.

## Features

- **Add Paper**: Allows users to add new research papers with details such as title, year, authors, and journal ID.
- **View Papers**: Displays a list of all papers in the system.
- **Delete Paper**: Deletes a paper by its ID.
- **In-Memory Storage**: The data is stored in-memory using **ArrayList**, meaning it will be lost once the application is closed.

## How to Run

1. **Import the Project** into your preferred IDE (IntelliJ, Eclipse, etc.).
2. **Run the `MainFrame.java` class**:
   - In IntelliJ: Right-click on `MainFrame.java` and select **Run**.
   - In Eclipse: Right-click on `MainFrame.java` and select **Run As > Java Application**.

3. Once the application starts, a GUI window will appear, allowing you to:
   - **Add papers** by providing a title and year.
   - **View all papers** stored in the system.
   - **Delete papers** by providing the paper ID.

## Folder Structure

```
/research-paper-management
|-- /src
|   |-- /controllers
|   |   |-- AuthorController.java
|   |   |-- JournalController.java
|   |   |-- PaperController.java
|   |-- /models
|   |   |-- Author.java
|   |   |-- Journal.java
|   |   |-- Paper.java
|   |-- /services
|   |   |-- AuthorService.java
|   |   |-- JournalService.java
|   |   |-- PaperService.java
|   |-- /ui
|   |   |-- MainFrame.java
|-- Main.java
|-- README.md
```

- **/controllers**: Contains the `PaperController.java` class, which handles the logic for adding, viewing, and deleting papers.
- **/models**: Contains the `Paper.java` model, which represents the Paper entity.
- **/ui**: Contains the `MainFrame.java` class, which defines the graphical user interface.

## Contributing

1. Fork this repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Create a new pull request.

We welcome contributions! Please ensure that any new code you add is covered by relevant unit tests.

---

**End of README**