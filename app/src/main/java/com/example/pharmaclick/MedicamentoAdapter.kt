package com.example.pharmaclick

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import android.view.View
import com.squareup.picasso.Picasso



class MedicamentoAdapter(private val medicamentos: List<Medicamento>) :
    RecyclerView.Adapter<MedicamentoAdapter.MedicamentoViewHolder>() {

    class MedicamentoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombre: TextView = itemView.findViewById(R.id.textViewNombreMedicamento)
        val precio: TextView = itemView.findViewById(R.id.textViewPrecioMedicamento)
        val imagen: ImageView = itemView.findViewById(R.id.imageViewMedicamento)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicamentoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_medicamento, parent, false)
        return MedicamentoViewHolder(view)
    }

    override fun onBindViewHolder(holder: MedicamentoViewHolder, position: Int) {
        val medicamento = medicamentos[position]
        holder.nombre.text = medicamento.nombre
        holder.precio.text = "$${medicamento.precio}"
        Picasso.get().load(medicamento.imagen).into(holder.imagen)
    }

    override fun getItemCount(): Int = medicamentos.size
}

