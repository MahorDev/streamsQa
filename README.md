# Java Collections & Stream API Practice

A set of independently runnable Java practice exercises covering Collections,
Stream API, advanced stream operations, and employee-domain stream problems.

## Project structure

```text
Java_Collections_Stream_Practice/
├── README.md
├── .gitignore
└── src/
    └── streams/
        ├── Employee.java
        ├── PhoneBook.java
        ├── Section1_Collections_01.java
        ├── ...
        ├── Section2_StreamBasics_01.java
        ├── ...
        ├── Section3_AdvancedStreams_01.java
        ├── ...
        ├── Section4_EmployeeStreams_01.java
        └── ...
```

## How to run in IntelliJ IDEA

1. Open this folder as a project.
2. Mark `src` as the Sources Root if IntelliJ does not detect it automatically.
3. Open any question class.
4. Run its `main()` method.

Every exercise is kept in a separate class so the questions can be practiced
and executed independently.

## Java version

The code uses modern Java Stream APIs such as `Stream.toList()`. Java 17+
is recommended.

## Sections

- **Section 1:** Basic Collection operations
- **Section 2:** Fundamental Stream API operations
- **Section 3:** Advanced Stream aggregations and grouping
- **Section 4:** Object-oriented Stream operations using an Employee model
