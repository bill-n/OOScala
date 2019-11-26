package io.turntabl.scalagettingstarted

import sun.util.calendar.LocalGregorianCalendar.Date
import io.turntabl.grades.Grades

object  TLCStudent extends App {

  class TLCStudent(val fName: String,
                   val lName: String,
                   val ID: Int,
                   val roleDesc: String,
                   val entranceyr:Int,
                   val url: String = "https://github.com/bill-n/OOScala"
                  ) {
    def sameYear(s: TLCStudent) = entranceyr ==  s.entranceyr
    def TopGrade(subject:String, grade:String) = Grades(subject, grade)
    def TOS()=if (entranceyr < 2019) 2019 - entranceyr else "Cant compute"
    override def toString= s"Student first name is $fName and last name is $lName and ID is $ID and role is $roleDesc entrance year is $entranceyr"

  }



}




