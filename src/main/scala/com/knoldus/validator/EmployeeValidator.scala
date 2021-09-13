package com.knoldus.validator
import com.knoldus.models.Employee
import com.knoldus.db.Employees

class EmployeeValidator {

  def employeeIsValid(employee: Employee): Boolean = {
    val empName= new Employees
    for((key,value)<-empName.totalEmp){
      if( value == employee)
        return true
    }
    return false

  }
}

object checkEmployee{
  val emp2: Employee =  Employee("shubhi","gupta",22,22000,"Intern","knoldus","shubhi.gupta@knoldus.com")
  val obj = new EmployeeValidator()
  println(obj.employeeIsValid(emp2))
}

