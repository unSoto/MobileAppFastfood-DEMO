package com.fastwood.voodoo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.models.HomeHorModel
import com.fastwood.voodoo.models.HomeVerModel


class HomeHorAdapter(
    private val context: Context,
    private val list: ArrayList<HomeHorModel>,
    private val updateVerticalRec: UpdateVerticalRec,

    private var check: Boolean = true,
    private var select: Boolean = true,
    private var row_index: Int = -1,
) : RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val iconIV: ImageView = view.findViewById(R.id.hor_img)
        val titleTV: TextView = view.findViewById(R.id.hor_text)

        val cardView: CardView = itemView.findViewById(R.id.cardView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.home_horizontal_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.iconIV.setImageDrawable(ContextCompat.getDrawable(context, data.image))
        holder.titleTV.text = data.name

        val homeVerModels: ArrayList<HomeVerModel> = ArrayList()

        if (check) {


            homeVerModels.add(HomeVerModel(R.drawable.ver_img1,
                "Пепперони",
                "30 мин.",
                "4.9",
                "450 руб."))
            homeVerModels.add(HomeVerModel(R.drawable.ver_img2,
                "4 сыра",
                "40 мин.",
                "4.0",
                "500 руб."))
            homeVerModels.add(HomeVerModel(R.drawable.ver_img3,
                "4 сезона",
                "25 мин.",
                "3.9",
                "590 руб."))
            homeVerModels.add(HomeVerModel(R.drawable.ver_img4,
                "Маргарита",
                "25 мин.",
                "5.0",
                "490 руб."))

            updateVerticalRec.callBack(position, homeVerModels)
            check = false
        }



        holder.cardView.setOnClickListener {
            row_index = position;
            notifyDataSetChanged()

            if (position == 0) {
                homeVerModels.add(HomeVerModel(R.drawable.ver_img1,
                    "Пепперони",
                    "30 мин.",
                    "4.9",
                    "450 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.ver_img2,
                    "4 сыра",
                    "40 мин.",
                    "4.0",
                    "500 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.ver_img3,
                    "4 сезона",
                    "25 мин.",
                    "3.9",
                    "590 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.ver_img4,
                    "Маргарита",
                    "25 мин.",
                    "5.0",
                    "490 руб."))

                updateVerticalRec.callBack(position, homeVerModels)
            }
            if (position == 1) {
                homeVerModels.add(HomeVerModel(R.drawable.burger1,
                    "Чизбургер Junior",
                    "15 мин.",
                    "5.0",
                    "209 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.burger2,
                    "Гамбургер Junior",
                    "15 мин.",
                    "4.7",
                    "179 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.burger3,
                    "Горячая цыпа",
                    "15 мин.",
                    "4.1",
                    "209 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.burger4,
                    "Комбо х2",
                    "20 мин.",
                    "4.3",
                    "469 руб."))

                updateVerticalRec.callBack(position, homeVerModels)
            }
            if (position == 2) {
                homeVerModels.add(HomeVerModel(R.drawable.jar1,
                    "Картофель фри",
                    "10 мин.",
                    "5.0",
                    "79 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.jar2,
                    "Филе Комбо",
                    "15 мин.",
                    "4.0",
                    "399 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.jar3,
                    "Ножки Комбо",
                    "15 мин.",
                    "4.3",
                    "289 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.jar4,
                    "Жаренные крылышки",
                    "15 мин.",
                    "4.2",
                    "289 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.jar5,
                    "Жаренные крылышки",
                    "15 мин.",
                    "3.1",
                    "389 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.jar6,
                    "Жаренные крылышки",
                    "15 мин.",
                    "4.7",
                    "389 руб."))

                updateVerticalRec.callBack(position, homeVerModels)
            }
            if (position == 3) {
                homeVerModels.add(HomeVerModel(R.drawable.desert1,
                    "Шоколадный",
                    "30 мин.",
                    "4.9",
                    "600 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.desert2,
                    "Медово-ореховый",
                    "30 мин.",
                    "4.9",
                    "600 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.desert3,
                    "Белый шоколад",
                    "30 мин.",
                    "4.9",
                    "600 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.desert4,
                    "Твороженный",
                    "30 мин.",
                    "4.9",
                    "600 руб."))

                updateVerticalRec.callBack(position, homeVerModels)
            }
            if (position == 4) {
                homeVerModels.add(HomeVerModel(R.drawable.water1,
                    "Coca-Cola",
                    "5 мин.",
                    "4.9",
                    "120 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.water2,
                    "Pepsi",
                    "5 мин.",
                    "5.0",
                    "120 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.water3,
                    "Капучино",
                    "5 мин.",
                    "4.9",
                    "170 руб."))
                homeVerModels.add(HomeVerModel(R.drawable.water4,
                    "Чай с лимоном",
                    "5 мин.",
                    "4.3",
                    "60 руб."))

                updateVerticalRec.callBack(position, homeVerModels)
            }
        }

        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg)
                select = false
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg)
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg)
            }
        }
    }
}


