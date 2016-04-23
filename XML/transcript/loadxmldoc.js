function loadXMLDoc(dname)
{

if (navigator.appName=="Microsoft Internet Explorer")
  {
  	xmlDoc = new ActiveXObject("Microsoft.XMLDOM")
	xmlDoc.load(dname)
	return xmlDoc;
  }
else
  {
   xhttp=new XMLHttpRequest();
   xhttp.open("GET",dname,false);
   xhttp.send();
   return xhttp.responseXML;
  }
}
 
