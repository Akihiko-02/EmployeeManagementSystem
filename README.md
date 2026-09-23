# Employee Management System (EMS)

A simple Employee Management System built with **Spring Boot** and **React**.

This project focuses on the basic **CRUD (Create, Read, Update, Delete)** operations for managing employee information.

## Features

* Add new employee
* View employee list
* Update employee information
* Delete employee
* REST API integration between React and Spring Boot

## Technologies

### Backend

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* REST API
* MySQL

### Frontend

* React
* JavaScript
* HTML
* CSS
* Axios

### Tools

* IntelliJ IDEA
* MySQL
* Postman
* Git & GitHub

## Project Structure

```text
EMS
├── ems-backend
│   └── Spring Boot REST API
│
└── ems-frontend
    └── React Application
```

## CRUD Operations

| Operation | Description                  |
| --------- | ---------------------------- |
| Create    | Add a new employee           |
| Read      | Display employee information |
| Update    | Update employee information  |
| Delete    | Delete an employee           |

## Employee Information

The system manages basic employee information such as:

* Employee ID
* First Name
* Last Name
* Email

## API Endpoints

| Method | Endpoint              | Description        |
| ------ | --------------------- | ------------------ |
| GET    | `/api/employees`      | Get all employees  |
| GET    | `/api/employees/{id}` | Get employee by ID |
| POST   | `/api/employees`      | Create employee    |
| PUT    | `/api/employees/{id}` | Update employee    |
| DELETE | `/api/employees/{id}` | Delete employee    |

## Database

This project uses **MySQL** as the database.

Example database configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=your_password
```

## How to Run

### Backend

1. Clone the repository.

```bash
git clone https://github.com/Akihiko-02/EMS.git
```

2. Open the backend project in IntelliJ IDEA.

3. Configure your MySQL database in `application.properties`.

4. Run the Spring Boot application.

The backend will run on:

```text
http://localhost:8080
```

### Frontend

1. Open the frontend folder.

2. Install dependencies.

```bash
npm install
```

3. Start the React application.

```bash
npm run dev
```

The frontend will run on:

```text
http://localhost:5173
```

## Purpose

This project was created to practice building a simple full-stack web application using **Spring Boot, React, REST API, JPA, and MySQL**.

## Author

**Akihiko-02**

GitHub: https://github.com/Akihiko-02


---


# Employee Management System (EMS)

**Spring Boot** と **React** を使用して開発した、シンプルな従業員管理システムです。

従業員情報の基本的な **CRUD（Create / Read / Update / Delete）** 機能を実装しています。

## 機能

* 従業員の登録
* 従業員一覧の表示
* 従業員情報の更新
* 従業員の削除
* React と Spring Boot REST API の連携

## 使用技術

### Backend

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* REST API
* MySQL

### Frontend

* React
* JavaScript
* HTML
* CSS
* Axios

### Tools

* IntelliJ IDEA
* MySQL
* Postman
* Git & GitHub

## プロジェクト構成

```text
EMS
├── ems-backend
│   └── Spring Boot REST API
│
└── ems-frontend
    └── React Application
```

## CRUD機能

| 操作     | 内容          |
| ------ | ----------- |
| Create | 新しい従業員を登録   |
| Read   | 従業員情報を取得・表示 |
| Update | 従業員情報を更新    |
| Delete | 従業員情報を削除    |

## 従業員情報

以下の基本的な従業員情報を管理します。

* Employee ID
* First Name
* Last Name
* Email

## APIエンドポイント

| Method | Endpoint              | 内容        |
| ------ | --------------------- | --------- |
| GET    | `/api/employees`      | 全従業員を取得   |
| GET    | `/api/employees/{id}` | IDで従業員を取得 |
| POST   | `/api/employees`      | 従業員を登録    |
| PUT    | `/api/employees/{id}` | 従業員情報を更新  |
| DELETE | `/api/employees/{id}` | 従業員を削除    |

## データベース

データベースには **MySQL** を使用しています。

`application.properties` の設定例：

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=your_password
```

## 起動方法

### Backend

1. リポジトリを Clone します。

```bash
git clone https://github.com/Akihiko-02/EMS.git
```

2. Backend プロジェクトを IntelliJ IDEA で開きます。

3. `application.properties` に MySQL の接続情報を設定します。

4. Spring Boot アプリケーションを起動します。

Backend:

```text
http://localhost:8080
```

### Frontend

1. Frontend フォルダに移動します。

2. 必要なパッケージをインストールします。

```bash
npm install
```

3. React アプリケーションを起動します。

```bash
npm run dev
```

Frontend:

```text
http://localhost:5173
```

## プロジェクトの目的

Spring Boot、React、REST API、JPA、MySQL を使用したフルスタックWebアプリケーションの基本的な開発を学ぶために作成しました。

特に、CRUD処理とFrontend・Backend間のAPI連携を中心に実装しています。

## Author

**Akihiko-02**

GitHub: https://github.com/Akihiko-02

