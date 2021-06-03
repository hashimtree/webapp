package sub2.acad.gez;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
ImageView imageView;
    private Button button,button2;
 WebView webView2;
    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button = (Button) findViewById(R.id.buttonUrl);
        
   webView2 = (WebView) findViewById(R.id.webView2);
   imageView= (ImageView)findViewById(R.id.imageView1);
                       
imageView.setImageResource(R.drawable.i);//set the source in java class
      

button2 = (Button) findViewById(R.id.buttonUrl2);

WebSettings webSettings=webView2.getSettings();        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.loadUrl("http://www.geziracollegesudan.com/card.php");

        button2.setOnClickListener(new OnClickListener() {

          @Override
          public void onClick(View arg0) {
  WebSettings webSettings=webView2.getSettings();        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.loadUrl("http://www.geziracollegesudan.com/login.php");          
         
         
          }

        });


button.setOnClickListener(new OnClickListener() {

          @Override
          public void onClick(View arg0) {
            Intent intent = new Intent(context, WebViewActivity.class);
            startActivity(intent);
          }

        });







    }

}