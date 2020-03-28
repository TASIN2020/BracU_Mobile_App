package com.example.bracumobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   //for "BracU"_button

   public void Bracu (View view){

        openUrl ("http://www.bracu.ac.bd");
   }
   public void openUrl (String url){

       Uri uri = Uri.parse(url);
       Intent launchWeb = new Intent (Intent.ACTION_VIEW,uri);
       startActivity(launchWeb);

   }

   //for "About" button

    public void About (View view){

        openUrl1 ("http://www.bracu.ac.bd/about");
    }
    public void openUrl1 (String url){

        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);

    }


    //for "Academics" Button

    public void Academics (View view){

        openUrl2 ("http://www.bracu.ac.bd/academics");
    }
    public void openUrl2 (String url){

        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);

    }

    //for "USIS" Button

    public void Usis (View view){

        openUrl3 ("http://usis.bracu.ac.bd/academia/");
    }
    public void openUrl3 (String url){

        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);

    }


    //for "Admission" Button

    public void Admission (View view){

        openUrl4 ("http://www.bracu.ac.bd/admissions");
    }
    public void openUrl4 (String url){

        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);

    }

    //for "News and Notice" Button

    public void News (View view){

        openUrl5 ("https://www.bracu.ac.bd/news-events/news-archive");
    }
    public void openUrl5 (String url){

        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);

    }

}
