package com.hllbr.javafragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);Bu alan bana bir adet Görünüm döndürüyor.Ben bana bir görünüm Döndürmesini istiyorum fakat mervcut görünümü değil benim istediğim hazırladğımı görünümü göstermesini istiyorum yapı üzerinde oynamalar yapacağım bu sebeple

        //Bir Görünüm Döndürmek için inflater kullanıyoruz

        //return inflater.inflate(R.layout.fragment_first,container,false);//Bu yapımızın bir alternatifi bulunuyor illa bu şekilde ypacağız diye bir sınırlamamız yok

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_first,container,false);
        //Ben burada fragment_first içindeki textView'a erişmek isteyebilirim.Fakat bu tanımlamayı Activity içerisinde yaptığım findById şeklinde yapamam.

        TextView textView = viewGroup.findViewById(R.id.textView);

        textView.setText("1st Fragment Example for HLLBR");
        return viewGroup;

    }
}
    /*
    Manuel Fragment oluşturmak için basic class oluşturup extends(import) edeceğin yapı ise fragmentter.

    Resource kısmında ise 2 adet dosya oluşturuyorum ve oluşturduğum fragmentlerı classlarımla bağlıyorum ardından

    Bu classları ise Main class ile bağlamam gerekiyor.

    Fragmnet ile çalışırken onCreateView oluşturmak zorundayım....

    Basic Activity için onCreate nasıl şartsa bu yapı içinde bahsedilen class şarttır.

    Bu yapıalrı nasıl kullanacağımız Android içerisinde bulunan Dökümanda yazıyor birebir aynı işlemleri takip ederek gerçekleştirebiliriz.Fakat ben Kendim bu işlemleri gerçekleştiriyorum

    Menuleri veya Layoutları Şişirmek için kullandığımızx inflater yapısı bu yapımız içinde geçerlidir.

     */