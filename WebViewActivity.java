package sub2.acad.gez;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

public class WebViewActivity extends Activity {
ImageView imageview;
    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = (WebView) findViewById(R.id.webView1);
        
     imageview= (ImageView)findViewById(R.id.imageView1);
                          
WebSettings webSettings=webView.getSettings();        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.geziracollegesudan.com/sub.php");

   
   
   
    }

}
