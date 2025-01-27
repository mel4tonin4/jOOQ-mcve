/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.scala


import java.util.Arrays
import java.util.List

import org.jooq.Catalog
import org.jooq.Table
import org.jooq.UDT
import org.jooq.impl.SchemaImpl
import org.jooq.mcve.scala.tables.MyTable
import org.jooq.mcve.scala.udt.MyUdt


object Mcve {

  /**
   * The reference instance of <code>mcve</code>
   */
  val MCVE = new Mcve
}

/**
 * This class is generated by jOOQ.
 */
class Mcve extends SchemaImpl("mcve", DefaultCatalog.DEFAULT_CATALOG) {

  /**
   * The table <code>mcve.my_table</code>.
   */
  lazy val MY_TABLE = MyTable.MY_TABLE

  override def getCatalog: Catalog = DefaultCatalog.DEFAULT_CATALOG

  override def getTables: List[Table[_]] = {
    return Arrays.asList[Table[_]](
      MyTable.MY_TABLE)
  }

  override def getUDTs: List[UDT[_]] = {
    return Arrays.asList[UDT[_]](
      MyUdt.MY_UDT)
  }
}
