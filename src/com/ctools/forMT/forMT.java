package com.ctools.forMT;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forMT extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button bn_Start = (Button)findViewById(R.id.start);
        bn_Start.setOnClickListener(new startListener());
    }

    public class startListener implements View.OnClickListener{
        public void onClick(View v){
            try{
                Runtime run = Runtime.getRuntime();
                run.exec("monkey -s 500 -v-v-v --throttle 500 --ignore-crashes --ignore-timeouts 72000");

//                if(Build.VERSION.SDK_INT<17){
//                    run.exec("monkey -s 500 -v-v-v --throttle 500 --ignore-crashes --ignore-timeouts 72000");
//                }else{
//                    run.exec("monkey -s 500 -v-v-v --throttle 500 --ignore-crashes --ignore-timeouts 72000");
//                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }


}
