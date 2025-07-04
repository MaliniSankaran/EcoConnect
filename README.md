# EcoConnect

EcoConnect is a Java-based healthcare ecosystem management platform designed to streamline and optimize operations across hospitals, labs, emergency units, pharmacies, insurance companies, and suppliers. The application provides role-based access for administrators, doctors, patients, lab assistants, emergency admins, pharmacy admins, and supplier admins, supporting efficient collaboration and centralized data management.

---

## Project Overview

Healthcare organizations face challenges in managing complex workflows, ensuring data accuracy, and providing seamless access to services for all stakeholders. EcoConnect addresses these challenges by integrating multiple healthcare entities into a single, secure, and user-friendly platform.

---

## Core Features

- **Multi-Organization Support:**  
  Manage hospitals, labs, emergency units, pharmacies, insurance companies, and suppliers within a unified system.

- **Role-Based Access and Permissions:**  
  Fine-grained roles for administrators, doctors, patients, lab assistants, emergency admins, pharmacy admins, and supplier admins.

- **Hospital Module:**  
  - Hospital admins add doctors and patients, manage inventory, and order medicines from pharmacies and suppliers.
  - Doctors manage and review patient prescriptions.
  - Patients book appointments, request lab tests, seek emergency help, and choose insurance plans.

- **Lab Module:**  
  - Lab assistants view and fulfill lab requests, and publish test results.

- **Insurance Module:**  
  - Insurance companies add and manage insurance plans and orders.

- **Emergency Services:**  
  - Emergency admins serve requests and review emergency history.

- **Pharmacy Module:**  
  - Pharmacy admins manage medicine inventory and process orders.

- **Supplier Module:**  
  - Supplier admins manage inventory and handle requests from hospitals.

- **Secure Admin Validation:**  
  - Centralized admin authentication using a MySQL database for heightened security and credential validation.

- **Enhanced User Experience:**  
  - **JDate File Chooser:** For streamlined and precise date selection in the interface.
  - **Data Visualization:** Organizational count charts using JFreeChart for quick insights into the number of labs, suppliers, emergency units, pharmacies, hospitals, and insurance companies.

---

## System Architecture

- **Frontend:** Java Swing GUI
- **Backend:** Java (Object-Oriented Design)
- **Database:** MySQL (used only for admin authentication)
- **Visualization:** JFreeChart (for organizational statistics)
- **Date Selection:** JDateChooser

---

## Key Benefits

- **Efficiency:** Streamlined workflows and centralized data reduce operational overhead.
- **Accuracy:** Centralized records ensure accurate prescriptions, test results, and inventory management.
- **Accessibility:** Patients can access appointments, lab tests, emergency help, and insurance from one platform.
- **Cost-Effectiveness:** Optimized inventory and process automation lower operational costs.

---

## Getting Started

### Prerequisites

- Java JDK 8 or above
- MySQL Server (for admin authentication)
- [JFreeChart](https://www.jfree.org/jfreechart/) library (for data visualization)
- [JDateChooser](https://toedter.com/jcalendar/) library (for date selection)
- A Java IDE (e.g., Eclipse, NetBeans, IntelliJ IDEA)

### Setup Instructions

1. **Clone the Repository**
    ```
    git clone https://github.com/MaliniSankaran/EcoConnect.git
    cd EcoConnect
    ```

2. **Configure Admin Authentication Table**
    - Create a MySQL database and a table for storing admin credentials.
    - Insert admin user data as needed for login validation.
    - Update the database connection details in `Mainframe.java` or the relevant configuration file to match MySQL setup.
    - **Note:** The MySQL database is used solely for secure admin login validation. All other application data is managed in-memory or via Java objects.

3. **Add Library Dependencies**
    - Download and add the JFreeChart and JDateChooser JAR files to your project's classpath.

4. **Run the Application**
    - Open the project in your Java IDE.
    - Build and run the main application class (typically `Mainframe.java`).
    - Log in using the appropriate credentials for your role (admin, doctor, patient, etc.).

---

## Usage Overview

- **Admins:** Add and manage healthcare enterprises, users, and permissions.
- **Doctors:** View and update patient prescriptions.
- **Patients:** Book appointments, request lab tests, seek emergency help, and select insurance plans.
- **Lab Assistants:** Process lab requests and publish results.
- **Emergency Admins:** Respond to emergency requests and view historical data.
- **Pharmacy Admins:** Manage medicine inventory and process orders.
- **Supplier Admins:** Maintain inventory and fulfill hospital requests.

---

## Data Visualization

- **Organizational Count Chart:**  
  Visualizes the number of labs, suppliers, emergency units, pharmacies, hospitals, and insurance companies for quick data comprehension and reporting.  
  _Implemented using JFreeChart._

---

## Security

- **Centralized Admin Validation:**  
  All admin credentials are securely validated against the MySQL database to prevent unauthorized access.  
  _No other application data is stored in the database._

---

## Example Screens & Innovations

- **JDate File Chooser:**  
  Streamlines date selection for appointments and record-keeping.
- **JFreeChart Organizational Chart:**  
  Provides visual summaries of system entities for administrators.

---

## Additional Resources

- [JFreeChart Tutorial](https://www.youtube.com/watch?v=7LpvxC69qvg)
- [JDateChooser Documentation](https://toedter.com/jcalendar/)
- [SQL Server Setup Guide](https://www.youtube.com/watch?v=goM8I9iVOIw) _(for general SQL knowledge; EcoConnect uses MySQL for admin authentication only)_

---


