<?php
session_start();
?>
<!DOCTYPE html>
<html>
<head>
<title> PHP SESSIONS EXAMPLE </title>
</head>
<body>
<?php
$_SESSION["uname"]="Varadharajan";
$_SESSION["lab"]="Web Lab";
$_SESSION["week"]="Week 9";
echo "Session values set";
echo "<br/>Username:".$_SESSION["uname"]."<br/> Lab:".$_SESSION["lab"]."<br/> Week:".$_SESSION["week"];
?>
</body>
</html>