package com.example.flappyskull

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class Impostazioni : Fragment(R.layout.fragment_impostazioni) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    val chiudi : Button = view.findViewById(R.id.chiudi)
        chiudi.setOnClickListener{

            val manager = requireActivity().supportFragmentManager
            manager.beginTransaction().remove(this).commit()
            manager.popBackStack()
        }
}

}
