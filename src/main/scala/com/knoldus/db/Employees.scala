package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class Employees {
  val emp : Employee = Employee("Deeksha","Tripathi",23,20000,"Intern","Knoldus","deeksha.tripathi@knoldus.com")
  val emp1 : Employee = Employee("Shubhi","Gupta",22,22000,"Intern","Knoldus","shubhi.gupta@knoldus.com")
  val totalEmp : HashMap[String,Employee] = HashMap("emp1"->emp,"emp2"->emp1)
}