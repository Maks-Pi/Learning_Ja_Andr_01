package com.abbad.a01_pro_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        class personality () {
            View textPhone;
            View name;
        }


        //инициализация кнопок/ интерфейса
        Button bSave = findViewById(R.id.button);
        Button bNew = findViewById(R.id.button2);
        Button bFind = findViewById(R.id.button3);
        View textPhone = findViewById(R.id.editTextPhone);
        View  name = findViewById(R.id.editTextTextPersonName);

        LinkedList <View> person = new LinkedList<>();
        person.add( name, textPhone );

//        bSave.setOnClickListener p

//         void newPerson() {
//            textPhone = null;
//            name = null;
//        bNew.setOnClickListener(v1 -> newPerson());
//        };name

        View.OnClickListener onClick0 = new View.OnClickListener() {
            @Override
            public void onClick(View v0) {
                () -> setname
                textPhone =  ;
                ((View) v0).set.
                //((Button) v0).setText("Новое поле для записи");
//            }
//        };
//
//        bNew.setOnClickListener(onClick0);


        public static void main (Object[] args){
            // Создание телефоннтой книги на основе мар, ключ = имя
            HashMap <Object, Object> phoneBook = new HashMap<>();
            phoneBook.put(name, textPhone);
            // HashMap put (String Name, String textPhone)
            bSave.setOnClickListener(v -> phoneBook());
        }

    }
    public static void main (String[] args){
        // Создание телефоннтой книги на основе мар, ключ = имя
        HashMap <String, String> phoneBook = new HashMap<>();



//            phoneBook.put(name, textPhone);
        // HashMap put (String Name, String textPhone)
        bSave.setOnClickListener(v0 -> phoneBook());
    }

//    public static void main (String[] args){
//        // Создание телефоннтой книги на основе мар, ключ = имя
//        HashMap <String, String> phoneBook = new HashMap<>();
//        phoneBook.put(nae, )
//        // HashMap put (String Name, String textPhone)
//    }

}