package com.example.asus.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.widget.Button;
import com.joanzapata.pdfview.PDFView;



public class read extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        PDFView pdfView=findViewById(R.id.cc);
        pdfView.fromAsset("sheji.pdf")
                .enableSwipe(true) // allows to block changing pages using swipe

                .enableDoubletap(true)
                .defaultPage(0)
                // allows to draw something on the current page, usually visible in the middle of the screen
                // allows to draw something on all pages, separately for every page. Called only for visible pages


                // add dynamic spacing to fit each page on its own on the screen


                 // toggle night mode
                .load();
        Log.v("cc","kaishi");
        Button button;
        Button change;


    }
}
