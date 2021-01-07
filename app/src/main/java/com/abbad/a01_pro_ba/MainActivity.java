package com.abbad.a01_pro_ba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        
        forSecondCangess();
=======

        workNotHard();
    }

    private void workNotHard() {
        // новый пробный кусок кода. Смысла не имеет.
        Float a;
        Integer b;
        Float ansver;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробь ");
        a = sc.nextFloat();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите целое ");
        b = sc1.nextInt();
        ansver = a + b ;

        System.out.println("ответ на ваш вопрос, о сумме двух значений: " + ansver);

>>>>>>> New_First_Work
    }

    private void forSecondCangess() {
    }
    // Пробные действия с визуальной оболочкой.



    
}