# 🛒 Functional Testing Automation — Technocart E-Commerce

An end-to-end functional test automation project for **Technocart**, a real-world industrial e-commerce web application, built using Selenium WebDriver, Java, TestNG, and Maven following the Page Object Model design pattern.

> **By Kavya Mukundan**

---

## 📌 Project Overview

| Field | Details |
|---|---|
| **Application Under Test** | Technocart (E-Commerce Web App) |
| **Testing Type** | Functional Test Automation |
| **Language** | Java |
| **Framework** | Selenium WebDriver + TestNG |
| **Design Pattern** | Page Object Model (POM) |
| **Build Tool** | Maven |
| **Reporting** | Extent Reports |

---

## 🏪 About Technocart

Technocart is an e-commerce platform that provides industrial machines and accessories including tapping machines, hand tools, and other high-quality industrial goods at competitive prices. It offers all standard e-commerce flows including registration, login, product search, cart management, and checkout — making it an ideal candidate for automation testing.

---

## 🎯 Purpose

The primary goal of this project was to automate the functional testing of the Technocart e-commerce web application to ensure a seamless and reliable shopping experience for end users by validating critical workflows such as:

- User Registration
- Login (valid & invalid scenarios)
- Product Search
- Wishlist Management
- Cart Management
- Checkout Process

---

## 🛠️ Tools & Technologies

| Tool | Purpose |
|---|---|
| **Selenium WebDriver** | Automating browser interactions and simulating real user actions |
| **Java** | Primary programming language for all automation scripts |
| **TestNG** | Organizing, managing, and executing test cases + test reports |
| **Maven** | Dependency management and build automation |
| **Page Object Model** | Clean, maintainable, and reusable code architecture |
| **Extent Reports** | Detailed test execution reporting |
| **Excel Utils** | Data driven testing support |

---

## 🏗️ Project Structure

```
Technocart [Technocart master]/
│
├── src/main/java/              # (empty - main source)
├── src/main/resources/
│
├── src/test/java/
│   ├── base/
│   │   └── Technobase.java     # Browser setup, URL loading, object creation
│   ├── excelutilities/
│   │   └── Excelutils.java     # Data driven testing via Excel
│   ├── page/                   # Page classes (web elements + actions)
│   └── test/                   # All test classes and test cases
│
├── src/test/resources/
│
├── Reports/
│   └── Technocartreport.html   # Extent Report (generated after execution)
│
├── screenshots/
│   └── wishlist.jpg            # Screenshots captured during test execution
│
├── src/                        # Source folder
├── target/                     # Maven build output
├── test-output/                # TestNG default output
├── pom.xml                     # Maven dependencies
└── testng.xml                  # TestNG suite configuration
```

---

## ✅ Automated Functionalities

### 👤 User Registration
- Automated complete new user registration flow
- Form filling and validation checks
- Successful account creation verification

### 🔐 Login
- Valid credentials login scenario
- Invalid credentials scenarios using **data driven testing**
- Multiple login test cases via Excel data

### 🔍 Product Search
- Automated product search by keyword
- Verified relevant results displayed correctly

### ❤️ Wishlist Management
- Search and add products to wishlist
- Navigate to wishlist page
- Remove product from wishlist and verify

### 🛒 Add to Cart
- End-to-end process of adding products to cart
- Cart content and quantity update verification

### 💳 Checkout Process
- Full checkout workflow automation
- From cart review to order placement
- All steps verified for errors

---

## ⚠️ Challenges & Solutions

### Challenge 1 — Dynamic Web Elements
> The Technocart application contained several dynamic web elements that were difficult to locate.

**Solution:** Implemented robust XPath and CSS locator strategies. Elements were manually located using the **parent-to-child XPath** method for reliable identification.

---

### Challenge 2 — Image CAPTCHA on Registration
> The registration page requires image CAPTCHA verification which cannot be automated.

**Solution:** Since image CAPTCHA automation is not feasible, the test covers all form filling steps up to CAPTCHA. Manual intervention is documented for this step.

---

### Challenge 3 — Alert Pop-up in Data Driven Login
> Data driven login triggers a "Verify it's you" alert pop-up that does not appear during manual testing — only when fields are auto-filled by automation.

**Solution:** Attempted handling via ChromeOptions and disabling notifications. As a workaround, the alert is manually closed to allow automation to continue. This is a known browser security behaviour.

---

## 📊 Results

- ✅ Significant improvement in testing speed and accuracy by automating repetitive functional test cases
- ✅ Validated smooth end-to-end flow of the application
- ✅ Enhanced test coverage across all key e-commerce workflows
- ✅ Contributed to a more stable and user-friendly platform

---

## 🧠 Key Learnings

- Hands-on experience building a scalable automation framework for a real-world application
- Deepened understanding of **POM design pattern** and best practices in functional test automation
- Strengthened skills in **Selenium WebDriver**, **Java**, and **TestNG**
- Practical exposure to challenges like dynamic elements, CAPTCHA, and browser security alerts

---

## ▶️ How to Run

1. Clone the repository
```bash
git clone https://github.com/kavyamukundan/technocart-automation.git
cd technocart-automation
```

2. Install dependencies via Maven
```bash
mvn clean install
```

3. Run the test suite
```bash
mvn test
```

4. View the Extent Report generated in the `test-output/` folder

---

## 👤 Author

**Kavya Mukundan**
- 🌐 Portfolio: [kavyamukundan.netlify.app](https://kavyamukundan.netlify.app)
- 💼 LinkedIn: [linkedin.com/in/kavyamukundan](https://linkedin.com/in/kavyamukundan)
- 📧 Email: kavyamukundan2832@gmail.com

---

## 📄 License

This project is for portfolio and educational purposes only.  
Technocart is an independent e-commerce web application used for testing practice.
