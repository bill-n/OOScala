package io.turntabl.scalagettingstarted

import sun.util.calendar.LocalGregorianCalendar.Date

object  TLCStudent extends App {

  class TLCStudent(val fName: String,
                   val lName: String,
                   val ID: Int,
                   val roleDesc: String,
                   val url: String = "https://github.com/bill-n/OOScala"
                  ) {
    override def toString= s"Student first name is $fName and last name is $lName and ID is $ID and role is $roleDesc"
  }



}




