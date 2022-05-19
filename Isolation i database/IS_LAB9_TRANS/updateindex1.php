<?php
$servername = "localhost";
$username = "sakila1";
$password = "pass";
$database = "sakila";
$conn = new mysqli($servername, $username, $password,
$database);
if ($conn->connect_error) {
    die("Database connection failed: " . $conn->connect_error);
   }
    echo "Databse connected successfully, username " .
   $username . "<br><br>";
    $sql = "UPDATE actor SET first_name = 'BURT' WHERE
   first_name = 'BOB'";
    $conn->query($sql);
    echo "Table actor updated";
    $conn->close();
?>