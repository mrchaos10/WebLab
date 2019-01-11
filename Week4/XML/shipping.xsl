<?xml version="1.0" encoding="UTF-8" ?>
<html xml:version="1.0" xmlns:xs="http://www.w3.org/1999/XSL/Transform">
<body style="font-family:sans-serif,font-size:15pt,background-color:#f0f0f0">
<xsl:for-each select="shiporder/shipto">
<h1>Shipping Address </h1>
<div style="background-color:teal;color:white;padding:4px">
<br/>
Name:
<span style="font-weight:bold"> <xsl:value-of select="name" /> </span>
<br/>
Address:
<span style="font-weight:bold"> <xsl:value-of select="address" /> </span>
<br/>
City:
<span style="font-weight:bold"> <xsl:value-of select="city" /> </span>
<br/>
Country:
<span style="font-weight:bold"> <xsl:value-of select="country" /> </span>
<br/>
</div>
</xsl:for-each>

<h1> Shipping Items</h1>
<br/>
<xsl:for-each select="shiporder/item">
<div style="background-color:teal;color:white;padding:4px">
<br/>
<h2> Person Who has ordered </h2>
<span style="font-weight:bold"> <xsl:value-of select="orderperson" /> </span>
<br/>
Title:
<span style="font-weight:bold"> <xsl:value-of select="title" /> </span>
<br/>
Quantity:
<span style="font-weight:bold"> <xsl:value-of select="quantity" /> </span>
<br/>
Price:
<span style="font-weight:bold"> <xsl:value-of select="price" /> </span>
<br/>
Note:
<span style="font-weight:bold"> <xsl:value-of select="note" /> </span>
<br/>
</div>
</xsl:for-each>
</body>
</html>