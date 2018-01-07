package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {


            CardView cardView = (CardView) mainGrid.getChildAt(i);

            final int finalI = i;

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                   final WebView webView;

                   /* webView = (WebView) findViewById(R.id.webviewPDFarea);
                    webView.getSettings().setJavaScriptEnabled(true);

                    Log.i("info:", Integer.toString(finalI,10));

                    //if(finalI == 0)
                    //{*/

                       Intent intent = new Intent(MainActivity.this,ActivityOne.class);
                        intent.putExtra("info",Integer.toString(finalI,10));
                        startActivity(intent);
                    //}

                  //  webView.loadUrl("https://drive.google.com/open?id=0Bz9C0ysJZ7PnaWJQLTduVWIyYnM");
                    // webView.loadUrl("https://www.google.com");

                     /*if(Integer.toString(finalI).equals("1")) {
                         webView = (WebView) findViewById(R.id.webviewPDFarea);
                         webView.getSettings().setJavaScriptEnabled(true);

                         webView.loadUrl("https://drive.google.com/open?id=0Bz9C0ysJZ7PnaWJQLTduVWIyYnM");
                        // webView.loadUrl("https://www.google.com");
                    }
                    else if(finalI == 2) {
                         webView = (WebView) findViewById(R.id.webviewPDFarea);
                         webView.getSettings().setJavaScriptEnabled(true);

                         webView.loadUrl("https://www.google.co.in/search?q=gogle&ie=utf-8&oe=utf-8&client=firefox-b-ab&gfe_rd=cr&dcr=0&ei=eaJQWu2DEonm8wfb24SwAw");
                        // webView.loadUrl("https://www.google.com");
                    }
                    */



                }
            });
        }
    }
}
