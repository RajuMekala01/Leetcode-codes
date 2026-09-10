# Write your MySQL query statement below
select en.unique_id,e.name from Employees e left join Employeeuni en on e.id=en.id;