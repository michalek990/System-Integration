<?php
$servername = "localhost";
$username = "sakila2";
$password = "pass";
$database = "sakila";
$conn = new mysqli($servername, $username, $password,
$database);
if ($conn->connect_error) {
    die("Database connection failed: " . $conn->connect_error);
   }
    echo "Databse connected successfully, username " .
   $username . "<br><br>";
    $sql = "INSERT INTO actors VALUES (,'JOHNNY','DEPP',)";
    $conn->query($sql);
    $sql ="DELETE FROM actors WHERE fist_name='JOHNNY' and last_name='DEPP'";
    echo "SQL done";
    $conn->close();
?>