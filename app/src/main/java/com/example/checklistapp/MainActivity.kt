package com.example.checklistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import com.example.checklistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            addEditText()
        }
    }

    private fun addEditText(){
        val edittext = EditText(this)

        when {
            binding.checkbox.isChecked -> {
                edittext.inputType = InputType.TYPE_CLASS_NUMBER
                edittext.hint = "Numeric Input"
                binding.mainView.removeView(edittext)
                binding.mainView.addView(edittext,binding.mainView.childCount  - 1)
            }
            binding.checkbox.isChecked.not() -> {
                edittext.inputType = InputType.TYPE_CLASS_TEXT
                edittext.hint = "Text Input"
            }
        }
        binding.mainView.removeView(edittext)
        binding.mainView.addView(edittext,binding.mainView.childCount  - 1)
    }

}
