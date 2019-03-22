<?php
$a[]="Anna";
$a[]="Bryan";
$a[]="Crsitiano Ronaldo";
$a[]="Deulofeu";
$a[]="Erling";
$a[]="Faulkner";
$a[]="Gerard Pique";
$a[]="Herald";
$a[]="Irwing";
$a[]="Javier Martinez";
$a[]="Kaka";
$a[]="Luka Modric";
$a[]="Messi";
$a[]="Neymar";
$a[]="Ozil";
$a[]="Pep Guardiola";
$a[]="Queuing";
$a[]="Ronaldo Lima";
$a[]="Sergio Ramos";
$a[]="Tolisso";
$a[]="Unfolded";
$a[]="Vincius Jr.";
$a[]="Xhaka";
$a[]="Yilmathez";
$a[]="Zinedine Zidane";
$q=$_REQUEST["q"];
$hint="";
if($q!="")
{
	$q=strtolower($q);
	$len=strlen($q);
	foreach($a as $name)
	{
	if(stristr($q,strtolower(substr($name,0,$len))))
	{
		if($hint==="")
		{
			$hint=$name;
		}
		else
		{
			$hint=",".$name;
		}
	}
    }
}
echo $hint===""?"no suggestion":$hint;
?>
