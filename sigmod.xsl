<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="SigmodRecord">

<html>
<body>
<h2>Articles</h2>
    
<table border="1">
      
<tr bgcolor="#OOFFFF">
  
<th>Volume</th>           
<th>Number</th>
	
<th>Title</th>
	
<th>Start Page</th>
	
<th>End Page</th>
	
<th>Page Length</th>
      
</tr>
      
<xsl:for-each select="/SigmodRecord/issue/articles/article">
      
<tr>
  
<td><xsl:value-of select="../../volume"/></td> 
<td><xsl:value-of select="../../number"/></td>    
<td><xsl:value-of select="title"/></td> 
<td><xsl:value-of select="initPage"/></td> 
<td><xsl:value-of select="endPage"/></td> 
<td><xsl:value-of select="((endPage)-(initPage))+1"/></td> 
</tr>     
</xsl:for-each>
    
</table>
  
</body>
  
</html>

</xsl:template>
</xsl:stylesheet>
