package com.abbad.a01_pro_ba;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
    // Клас  Adapter*а для RecyclerView. Экран показа всех контактов.
    // Но показ только для полей Имя, Фамилия, Мобильный = firstName, family, mobileNumber.
    // Если надо - возможно добавление поля показа для домашнего номера - код есть, поля на активити нет.
public class AdapterForPers extends RecyclerView.Adapter<AdapterForPers.VwHolder> {

    private final List<Persona> personaList;

    public AdapterForPers(List<Persona> personaList) {
        this.personaList = personaList; 
    }

    @NonNull
    @Override
    public VwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View personalDate = LayoutInflater.from(parent.getContext()).inflate(R.layout.prosmotr_personcontact, parent, false);
        VwHolder vwHolder = new VwHolder(personalDate);
        return vwHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VwHolder holder, int position) {
        holder.firstName.setText(personaList.get(position).getFirstName());
        holder.family.setText(personaList.get(position).getFamily());
        holder.mobileNumber.setText(personaList.get(position).getMobileNumber());
    }

    @Override
    public int getItemCount() {
        return personaList.size();
    }

    public class VwHolder extends RecyclerView.ViewHolder {

        private  TextView firstName;
        private  TextView family;
        private  TextView mobileNumber;
        private  TextView homeNumber;

        public VwHolder(@NonNull View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.firstName_scroll);
            family = itemView.findViewById(R.id.family_scroll);
            mobileNumber = itemView.findViewById(R.id.mobileNumber_scroll);

        }
    }
}
