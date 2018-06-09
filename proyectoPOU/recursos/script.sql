/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Gonzalo
 * Created: 05-jun-2018
 */
CREATE DATABASE pou_db;
USE pou_db;

CREATE TABLE mascota(
    id INT PRIMARY KEY,
    cansancio INT,
    hambre INT,
    enegia INT,
    higiene
    fecha DATETIME DEFAULT NOW()
);

DELIMITER //
CREATE FUNCTION fn_updateStatus(@)
BEGIN
    UPDATE mascota
END
);
