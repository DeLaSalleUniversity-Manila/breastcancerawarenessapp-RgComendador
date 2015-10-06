package lbycp24_everreadygroup.gopink;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Information extends Activity{
String[] main_menu = {
        "Facts",
        "Treatments"
};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, main_menu);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                switch (position){
                    case 0:
                        Intent goToFacts = new Intent(Information.this, Facts.class);
                        startActivity(goToFacts);
                        break;

                    case 1:
                        Intent goToTreatments = new Intent(Information.this, Treatments.class);
                        startActivity(goToTreatments);
                        break;

                    //case 2: TBA
                }
            }
        });
    }
}