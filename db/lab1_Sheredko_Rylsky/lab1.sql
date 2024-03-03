-- Dim перед назвами це скоротчено від Dimension :)
USE northwind;
GO
IF NOT EXISTS (
    SELECT [name]
    FROM sys.databases
    WHERE [name] = N'Northwind_Upgrade'
)
CREATE DATABASE Northwind_Upgrade;
GO

USE Northwind_Upgrade;
GO
CREATE TABLE DimCategories (
    CategoryID INT PRIMARY KEY,
    CategoryName NVARCHAR(15),
    Description NTEXT
);
CREATE TABLE DimCustomers (
    CustomerID NCHAR(5) PRIMARY KEY,
    CompanyName NVARCHAR(40),
    City NVARCHAR(15),
    Country NVARCHAR(15)
);
CREATE TABLE DimEmployees (
    EmployeeID INT PRIMARY KEY,
    LastName NVARCHAR(20),
    FirstName NVARCHAR(10),
    City NVARCHAR(15),
    Country NVARCHAR(15)
);
CREATE TABLE DimShippers (
    ShipperID INT PRIMARY KEY,
    CompanyName NVARCHAR(40),
    Phone NVARCHAR(24)
);
CREATE TABLE DimSuppliers (
    SupplierID INT PRIMARY KEY,
    CompanyName NVARCHAR(40),
    City NVARCHAR(15),
    Country NVARCHAR(15)
);
CREATE TABLE DimProducts (
    ProductID INT PRIMARY KEY,
    ProductName NVARCHAR(40),
    SupplierID INT,
    CategoryID INT,
    UnitPrice MONEY,
    UnitsInStock SMALLINT,
    Discontinued BIT,
    -- Foreign keys:
    FOREIGN KEY (SupplierID) REFERENCES DimSuppliers(SupplierID),
    FOREIGN KEY (CategoryID) REFERENCES DimCategories(CategoryID)
);
CREATE TABLE FactSales (
    SaleID INT IDENTITY(1,1) PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    CustomerID NCHAR(5),
    EmployeeID INT,
    OrderDate DATETIME,
    Quantity SMALLINT,
    UnitPrice MONEY,
    Discount REAL,
    -- Foreign keys:
    FOREIGN KEY (ProductID) REFERENCES DimProducts(ProductID),
    FOREIGN KEY (CustomerID) REFERENCES DimCustomers(CustomerID),
    FOREIGN KEY (EmployeeID) REFERENCES DimEmployees(EmployeeID)
);
CREATE INDEX IDX_CustomerID ON FactSales(CustomerID);
CREATE INDEX IDX_EmployeeID ON FactSales(EmployeeID);
CREATE INDEX IDX_ProductID ON FactSales(ProductID);


-- або таким способом можна ще звʼязки вписати

-- ALTER TABLE DimProducts
-- ADD CONSTRAINT FK_DimProducts_DimSuppliers
-- FOREIGN KEY (SupplierID) REFERENCES DimSuppliers(SupplierID),
-- ADD CONSTRAINT FK_DimProducts_DimCategories
-- FOREIGN KEY (CategoryID) REFERENCES DimCategories(CategoryID);
-- GO
--
-- ALTER TABLE FactSales
-- ADD CONSTRAINT FK_FactSales_DimProducts
-- FOREIGN KEY (ProductID) REFERENCES DimProducts(ProductID),
-- ADD CONSTRAINT FK_FactSales_DimCustomers
-- FOREIGN KEY (CustomerID) REFERENCES DimCustomers(CustomerID),
-- ADD CONSTRAINT FK_FactSales_DimEmployees
-- FOREIGN KEY (EmployeeID) REFERENCES DimEmployees(EmployeeID);
-- GO