package com.ucccwr.pdfdownload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnDownload;
    String URL = "https://cag.gov.in/uploads/download_audit_report/2017/Abbreviation_of_Report_No.14_of_2017_-_Compliance_audit_Union_Government_(Railways).pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDownload = (Button) findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new DownloadTask(MainActivity.this, URL);
            }
        });
    }
}
