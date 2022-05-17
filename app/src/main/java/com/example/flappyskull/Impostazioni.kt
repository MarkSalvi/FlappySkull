package com.example.flappyskull

import android.content.Context.AUDIO_SERVICE
import android.content.res.ColorStateList
import android.media.AudioManager
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment


class Impostazioni : Fragment(R.layout.fragment_impostazioni) {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val audioManager = requireContext().getSystemService(AudioManager::class.java)
    val chiudi : Button = view.findViewById(R.id.chiudi)
        val mute_volume = 0
        val unmute_volume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        chiudi.setOnClickListener{

            val manager = requireActivity().supportFragmentManager
            manager.beginTransaction().remove(this).commit()
            manager.popBackStack()
        }

    val audio : Button = view.findViewById(R.id.Suoni)
        var volume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)

        if (volume == 0) {
            audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,mute_volume,0);
            audio.backgroundTintList =
                ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.red))
        } else {
            audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,unmute_volume,0);
            audio.backgroundTintList =
                ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.green))
        }


        audio.setOnClickListener{
            var volume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)

            if (volume != 0) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,mute_volume,0);
                audio.backgroundTintList =
                    ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.red))
            } else {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,unmute_volume,0);
                audio.backgroundTintList =
                    ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.green))
            }
      }


        }
}




