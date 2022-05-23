package com.fastwood.voodoo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fastwood.voodoo.R
import com.fastwood.voodoo.adapters.CartAdapter
import com.fastwood.voodoo.models.CartModel

class MyCartFragment() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_my_cart, container, false)

        var button: Button = view.findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(context,"Заказ отправлен", Toast.LENGTH_SHORT).show()
        }

        var list: List<CartModel>

        var recyclerView: RecyclerView = view.findViewById(R.id.cart_rec)
        recyclerView.layoutManager = LinearLayoutManager(context)
        list = ArrayList()

        list.add(CartModel(R.drawable.ver_img1, "Пепперони", "450"))
        list.add(CartModel(R.drawable.burger2, "Гамбургер Junior", "179"))
        list.add(CartModel(R.drawable.burger3, "Горячая цыпа", "209"))
        list.add(CartModel(R.drawable.jar1, "Картофель фри", "79"))
        list.add(CartModel(R.drawable.jar3, "Ножки Комбо", "289"))
        list.add(CartModel(R.drawable.water2, "Pepsi", "120"))

        var cartAdapter: CartAdapter = CartAdapter(list)
        recyclerView.adapter = cartAdapter

        return view
    }
}