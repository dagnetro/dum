package ro.dagnet.dumbrava_delivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        WebView webb = (WebView)findViewById(R.id.web1);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("https://www.dumbrava-delivery.ro");

        webb.clearCache(true);
        webb.clearHistory();
        webb.getSettings().setJavaScriptEnabled(true);
        webb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);



    }
}
