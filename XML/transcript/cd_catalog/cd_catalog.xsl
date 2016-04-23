<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="CATALOG">
  
<html>
  
<body>
  
<h2>My CD Collection</h2>
    
<table border="1">
      
<tr bgcolor="#9acd32">
        
<th>Title</th>
        
<th>Artist</th>
	
<th>Year</th>
	
<th>Price</th>
	
<th>Company</th>
	
<th>Country</th>
      
</tr>
      
<xsl:for-each select="CD">
      
<tr>
        
<td><xsl:value-of select="TITLE"/></td>
        
<td><xsl:value-of select="ARTIST"/></td>
	
<td><xsl:value-of select="YEAR"/></td>
	
<td><xsl:value-of select="PRICE"/></td>
	
<td><xsl:value-of select="COMPANY"/></td>
	
<td><xsl:value-of select="COUNTRY"/></td>
      
</tr>
      
</xsl:for-each>
    
</table>
  
</body>
  
</html>

</xsl:template>

</xsl:stylesheet>
