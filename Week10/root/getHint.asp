<%
response.expires=-1;
dim a(30)
a(1)="Anna"
a(2)="Bryan"
a(3)="Crsitiano Ronaldo"
a(4)="Deulofeu"
a(5)="Erling"
a(6)="Faulkner"
a(7)="Gerard Pique"
a(8)="Herald"
a(9)="Irwing"
a(10)="Javier Martinez"
a(11)="Kaka"
a(12)="Luka Modric"
a(13)="Messi"
a(14)="Neymar"
a(15)="Ozil"
a(16)="Pep Guardiola"
a(17)="Queuing"
a(18)="Ronaldo Lima"
a(19)="Sergio Ramos"
a(20)="Tolisso"
a(21)="Unfolded"
a(22)="Vincius Jr."
a(23)="Xhaka"
a(24)="Yilmathez"
a(25)="Zinedine Zidane"

q=ucase(request.querystring("q"))
if len(q)>0 then
   hint=""
   for i=1 to 25
      if q=ucase(mid(a(i),1,len(q))) then
	     if hint="" then 
		    hint=a(i)
		 else
		    hint=hint&","&a(i)
		 end if
      end if
   end for	  
end if

if hint="" then
   response.write("no suggestion")
else
   response.write(hint)
end if   

%>