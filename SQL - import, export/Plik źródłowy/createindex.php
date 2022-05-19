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
    $sql = "INSERT INTO actors VALUES (,'NICOLAS','CAGE',)";
    $conn->query($sql);
    $sql ="DELETE FROM actors WHERE fist_name='NICOLAS' and last_name='CAGE'";
    echo "SQL done";
    $conn->close();
?>