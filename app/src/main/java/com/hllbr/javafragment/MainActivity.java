package com.hllbr.javafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bu alanda Fragmentların bağlanması işlemini gerçekleştirmek için FragmentManager adlı bir Yönetici sınıftan yararlanacağım.


    }
    public void goToFirst(View view){
        FirstFragment firstFragment = new FirstFragment();//oluşturduğum class tan bir adet obje meydana getirdim .Bu obje ile bazı işlemler gerçekleştirmem gerekiyor
        FragmentManager fragmentManager = getSupportFragmentManager();//Yönetici sınmıfından yardım(Destek) getirme çağrım

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();//Bu şekilde destek üzerinden işlemlere başlayacağımı istemcime bildirmiş oldum

        //fragmentTransaction.add(R.id.frame_layout,firstFragment);//Bu yapı bana 2 adet soru soruyor hangi fragment eklenecek,Hangi layout kullanılacak
       fragmentTransaction.replace(R.id.frame_layout,firstFragment);
       fragmentTransaction.commit();

    }
    public void goToSecond(View view){
        SecondFragment secondFragment = new SecondFragment();
        //fragmentTransaction.add(R.id.frame_layout,secondFragment).commit();
        FragmentManager fragmentManager = getSupportFragmentManager();//Yönetici sınmıfından yardım(Destek) getirme çağrım

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();//Bu şekilde destek üzerinden işlemlere başlayacağımı istemcime bildirmiş oldum

        fragmentTransaction.replace(R.id.frame_layout,secondFragment).commit();
        //add komutu kullanırsam bir öncekinin üzerine ekler ama eğer replace kullanırsam o zaman üzerine ekelemez üzerine yazar.



    }
}