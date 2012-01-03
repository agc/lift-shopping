package com.shopping.snippet

import com.shopping._
import model._
import net.liftweb._

import util._
import Helpers._
import http._
import common._

import scala.xml._

class ViewItem {

  var id = S.param("id") openOr ""

  var item = try {
    Item.findByKey(id.toLong)
  } catch {
    case e:NumberFormatException => Empty
  }

  def view(html : NodeSeq): NodeSeq = {
    item map ({ i =>
      bind("item", html,
        "name" -> i.name,
        "amount" -> i.amount
      )
    }) openOr Text("Invalid Item")

  }
}