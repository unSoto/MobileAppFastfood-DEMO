package com.fastwood.voodoo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.models.HomeVerModel
import com.google.android.material.bottomsheet.BottomSheetDialog

class HomeVerAdapter(
    private val context: Context?,
    private val list: ArrayList<HomeVerModel>
) : RecyclerView.Adapter<HomeVerAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val iconVer: ImageView = view.findViewById(R.id.ver_img)
        val titleVer: TextView = view.findViewById(R.id.ver_text)
        val timing: TextView = view.findViewById(R.id.timing)
        val rating: TextView = view.findViewById(R.id.rating)
        val price: TextView = view.findViewById(R.id.price)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.home_vertical_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]

        val mName: String = list[position].name
        val mTiming: String = list[position].timing
        val mRating: String = list[position].rating
        val mPrice: String = list[position].price
        val mImage: Int = list[position].image


        holder.iconVer.setImageDrawable(ContextCompat.getDrawable(context!!, data.image))
        holder.titleVer.text = data.name
        holder.timing.text = data.timing
        holder.rating.text = data.rating
        holder.price.text = data.price

        holder.itemView.setOnClickListener {
            var bottomSheetDialog: BottomSheetDialog = BottomSheetDialog(context, R.style.BottomSheetTheme)

            var sheetView: View = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout, null)
            sheetView.findViewById<View>(R.id.add_cart).setOnClickListener{
                Toast.makeText(context,"Добавлено в корзину", Toast.LENGTH_SHORT).show()
                bottomSheetDialog.dismiss()
            }

            var bottomImg: ImageView = sheetView.findViewById(R.id.bottom_img)
            var bottomName: TextView = sheetView.findViewById(R.id.bottom_name)
            var bottomPrice: TextView = sheetView.findViewById(R.id.bottom_price)
            var bottomRating: TextView = sheetView.findViewById(R.id.bottom_rating)

            bottomName.text = mName
            bottomPrice.text = mPrice
            bottomRating.text = mRating
            bottomImg.setImageResource(mImage)

            bottomSheetDialog.setContentView(sheetView)
            bottomSheetDialog.show()
        }

    }

}