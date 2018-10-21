<?php
    include('addFeedback.php');
    $SQL = "INSERT INTO team (feedback, name, gender, age) VALUES ('', '4-6 Days', '£75.00')";

    $result = mysql_query($SQL);
    ?>