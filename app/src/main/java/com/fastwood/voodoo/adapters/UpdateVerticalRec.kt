package com.fastwood.voodoo.adapters

import com.fastwood.voodoo.models.HomeVerModel
import java.text.FieldPosition

interface UpdateVerticalRec {
    fun callBack(position: Int, list: ArrayList<HomeVerModel>)
}