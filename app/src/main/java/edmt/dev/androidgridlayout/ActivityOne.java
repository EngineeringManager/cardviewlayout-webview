package edmt.dev.androidgridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

       // TextView txtInfo = (TextView)findViewById(R.id.txtInfo);
        if(getIntent() != null)
       {
            String info = getIntent().getStringExtra("info");
          //  txtInfo.setText(info);
           Log.i("iiin",info.toString());

           Toast.makeText(this, info.toString(), Toast.LENGTH_SHORT).show();
           if(info.equals("0"))
           {
               final WebView webView;

               webView = (WebView) findViewById(R.id.webviewPDFarea);
               webView.getSettings().setJavaScriptEnabled(true);
               webView.loadUrl("https://drive.google.com/open?id=1c4sos05bVerPHSDbaIrZhWsoBomGE_tH");

           }
           else if(info.equals("2"))
           {
               final WebView webView;

               webView = (WebView) findViewById(R.id.webviewPDFarea);
               webView.getSettings().setJavaScriptEnabled(true);
               webView.loadUrl("https://drive.google.com/open?id=1uNQxEV8tdfPLYdt0vR6xTNnCjADD70wj");

           }
           else
           {
               final WebView webView;

               webView = (WebView) findViewById(R.id.webviewPDFarea);
               webView.getSettings().setJavaScriptEnabled(true);
               webView.loadUrl("https://www.google.co.in/search?q=gogle&ie=utf-8&oe=utf-8&client=firefox-b-ab&gfe_rd=cr&dcr=0&ei=eaJQWu2DEonm8wfb24SwAw");


           }
          /* final WebView webView;

            webView = (WebView) findViewById(R.id.webviewPDFarea);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("www.google.com");*/


        }
    }
}
