package com.tsunderebug.scolor.table

import com.tsunderebug.scolor.Font
import spire.math.UByte

trait Table extends EnclosingSectionDataType {

  def name: String
  def sections(f: Font): Seq[Section]

  /**
    * The bytes of table data. The data does not have to be padded.
    * @return Table data as a byte array.
    */
  def getBytes(f: Font): Array[UByte]

}
