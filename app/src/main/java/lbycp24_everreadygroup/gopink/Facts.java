package lbycp24_everreadygroup.gopink;


import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Facts extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facts);

        TextView textview= (TextView) findViewById(R.id.textView);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }

    
}


