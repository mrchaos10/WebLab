<?php
$mysqli=new mysqli("localhost","root","lAvv6rLBFHUhOtlh","employee");
if($mysqli->connect_error)
{
	exit('Couldnt connect at the moment');
}
$q=$_REQUEST["q"];
$sql="SELECT employeeid,name,password,department from employeedetails";
$stmt=$mysqli->prepare($sql);
//$stmt->bind_param("s",$GET["q"]);
$stmt->execute();
$stmt->store_result();
$stmt->bind_result($eid,$name,$pwd,$department);
$stmt->fetch();
$stmt->close();

echo "<table border=\"1\"> <tr><th>EmployeeId</th><th>Name</th><th>Password</th><th>Department</th></tr>";
echo"<tr><td>".$eid."</td><td>".$name."</td><td>".$pwd."</td><td>".$department."</td></tr>";
echo "</table>";

?>
