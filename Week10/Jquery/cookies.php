<!DOCTYPE html>
<html>
<head>
<title> PHP Cookies EXAMPLE </title>
</head>

<?php
$cookie_name="uname";
$cookie_value="Varadharajan";
setCookie($cookie_name,$cookie_value,time()+(86400*30),"/");
$cookie_name="lab";
$cookie_value="WebLab";
setCookie($cookie_name,$cookie_value,time()+(86400*30),"/");
$cookie_name="Week";
$cookie_value="9";
setCookie($cookie_name,$cookie_value,time()+(86400*30),"/");

//86400=1day
?>
<body>
<?php
if(!isset($_COOKIE["uname"])||!isset($_COOKIE["lab"])||!isset($_COOKIE["Week"]))
{
	echo "Cookies not set properly";
	
}
else
{
echo "Cookies set properly";
echo "<br/>Username:".$_COOKIE["uname"]."<br/> Lab:".$_COOKIE["lab"]."<br/> Week:".$_COOKIE["Week"];
}
?>
<p><strong>Note:For the very first time cookies will not be set</strong></p>
</body>
</html>