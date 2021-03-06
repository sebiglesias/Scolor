package com.tsunderebug.scolor.otf.types

import com.tsunderebug.scolor.Font
import com.tsunderebug.scolor.table.SectionDataType
import spire.math.{UByte, UInt, UShort}

case class UInt16(value: UShort) extends SectionDataType {

  override def getBytes(f: Font): Array[UByte] = {
    Array(((value.toShort & 0xFF00) >> 8).toByte, (value.toShort & 0x00FF).toByte).map(UByte(_))
  }

  override def length(f: Font): UInt = UInt(2)

  /**
    * Gets data sections if this data block has offsets
    *
    * @param f The font
    * @return an array of Data objects
    */
  override def getData(f: Font) = Array()
}