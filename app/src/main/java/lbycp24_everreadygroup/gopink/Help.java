package lbycp24_everreadygroup.gopink;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


public class Help extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        TextView textview3= (TextView) findViewById(R.id.textView3);
        textview3.setMovementMethod(new ScrollingMovementMethod());
    }
}
