# Write your MySQL query statement below
select unique_id,name 
from Employees e
LEFT JOIN EmployeeUNI eu ON e.id = eu.id ;


