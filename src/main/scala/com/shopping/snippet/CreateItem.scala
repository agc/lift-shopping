package com.shopping.snippet

import com.shopping._
import model._
import net.liftweb._
import common._
import util._

import scala.xml._

class CreateItem {

    def create(html : NodeSeq): NodeSeq = {
        val item = new Item()
        item.toForm(Full("Guardar"), {_.save})
    }

}
