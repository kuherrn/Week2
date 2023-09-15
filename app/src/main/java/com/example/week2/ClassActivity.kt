package com.example.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.week2.databinding.ActivityClassBinding
import com.example.week2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class ClassActivity : AppCompatActivity() {
    private lateinit var binding : ActivityClassBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityClassBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toastButton.setOnClickListener {
            Toast.makeText(this, "This is a toast", Toast.LENGTH_LONG).show()
        }

        binding.snackbarButton.setOnClickListener {
            Snackbar.make(binding.layout, "This is a snackbar message", Snackbar.LENGTH_LONG).show()
        }

        binding.snackbarActionButton.setOnClickListener {
            val snackbar = Snackbar.make(binding.layout, "Should we exit class?", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Click Here", View.OnClickListener {

            })
            snackbar.show()
        }
    }
}