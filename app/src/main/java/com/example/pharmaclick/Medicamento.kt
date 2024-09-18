package com.example.pharmaclick

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

data class Medicamento(
    val nombre: String = "",
    val precio: Double = 0.0,
    val imagen: String = ""
)
