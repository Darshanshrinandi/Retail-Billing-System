# Retail Billing System

A full-stack **Retail Billing System** developed using **Spring Boot**, **Java**, **MySQL**, **React**, and **JWT-based authentication**. The system allows users to manage billing, products, and customers efficiently. It also supports **file upload** for storing images (e.g., product images or invoices) and **Razorpay integration** for handling payments.

---

## 🛠 Tech Stack

- **Backend:** Spring Boot, Java, JWT Authentication, REST API  
- **Frontend:** React.js, HTML, CSS, Axios  
- **Database:** MySQL  
- **Authentication:** JWT (JSON Web Tokens)  
- **File Storage:** Local file system for image uploads  
- **Payment Gateway:** Razorpay  
- **Build & Run Tools:** Maven, npm  

---

## ⚙️ Features

- User authentication using JWT  
- Role-based access control (Admin & Users)  
- Add, update, and remove products  
- Generate and manage invoices  
- Upload and store images (product images or documents)  
- Accept payments via **Razorpay**  
- RESTful APIs for frontend-backend communication  
- Responsive React frontend  

---

## 📂 Project Structure
Retail-Billing-System/
│
├─ backend/ # Spring Boot backend
│ ├─ src/main/java/
│ ├─ src/main/resources/
│ └─ pom.xml
│
├─ frontend/ # React frontend
│ ├─ src/
│ └─ package.json
│
├─ README.md
└─ billing.json.txt

🔐 Authentication

-JWT-based authentication for secure login and access

-Role-based access control (admin can manage everything; users have limited access)

📁 File Upload

-Users can upload images (e.g., product images)

-Files are stored in the local file system and linked to the corresponding entities in the database

💰 Razorpay Payment Integration

-Users can make payments directly from the app

-Backend handles Razorpay orders, payment verification, and updates billing records

-Razorpay keys must be set in application.properties

📦 Build & Deployment

-Backend: mvn clean install

-Frontend: npm run build

-Deployment can be done on any cloud server (AWS, Heroku, etc.)

-File storage handled in local file system

-Razorpay payment integration works in sandbox/test mode and production mode

👨‍💻 Author

Darshan S V

-GitHub: https://github.com/Darshanshrinandi

-Email: darshanshrinandi@gmail.com
