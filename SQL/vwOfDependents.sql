Create view vw_DependentsOfProfessors as
SELECT TOP (100) PERCENT Faculty.FacultyID, Faculty.FirstName AS 'Faculty First Name', Faculty.LastName AS 'Faculty Last Name', Dependent.FirstName AS 'Dependent First Name', Dependent.LastName AS 'Dependent Last Name', Relationship
FROM Faculty
INNER JOIN Dependent
		ON Faculty.FacultyID = Dependent.FacultyID
WHERE (Relationship = 'Son'
		OR Relationship = 'Daughter')
ORDER BY Relationship, Faculty.LastName;