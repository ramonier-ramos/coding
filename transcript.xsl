<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="Transcript">

<html>
<body>
<h2>My Transcript</h2>
    
<table border="1">
      
<tr bgcolor="#OOFFFF">
  
<th>Course</th>           
<th>Department</th>
	
<th>Number</th>
	
<th>Instructor</th>
	
<th>Title</th>
	
<th>Grade</th>
      
</tr>
      
<xsl:for-each select="Course">
      
<tr>
  
<td><xsl:value-of select="Courses"/></td>    
<td><xsl:value-of select="Department"/></td>
        
<td><xsl:value-of select="Number"/></td>
	
<td><xsl:value-of select="Instructor"/></td>
	
<td><xsl:value-of select="Title"/></td>
	
<td><xsl:value-of select="Grade"/></td>
	
</tr>
      
</xsl:for-each>
    
</table>
  
</body>
  
</html>

</xsl:template>

</xsl:stylesheet>
