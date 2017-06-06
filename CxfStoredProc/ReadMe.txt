Camel Project To Expose stored Procedure as Rest WebService 
=========================================

To Execute the webService:

URL : http://127.0.0.1:9190/employee/

1>  to Get Employee details 

URL : http://127.0.0.1:9190/employee/
Pass headers : id = 3

Expected Result in JSON:

[ {
  "emp_id" : 108,
  "emp_name" : "Alan",
  "dept_id" : 3,
  "salary" : 1150
} ]


2> to Get Employee Name based on emp_id

URL: http://127.0.0.1:9190/employee/103

Expected Result:

[ {
  "emp_name" : "Alan",
} ]


 
