
package com.shopping.model

import net.liftweb._
import common.Empty
import mapper._

class Item extends LongKeyedMapper[Item] with IdPK {

    def getSingleton = Item

    object name extends MappedPoliteString(this, 128)
    object amount extends MappedInt(this)



}

object Item extends Item with LongKeyedMetaMapper[Item]  with CRUDify[Long, Item]   {
  override def showAllMenuLoc = Empty

}