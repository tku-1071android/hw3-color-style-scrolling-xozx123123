package EX03_09.java;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class EX03_09_1 extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* apply mylayout.xml Layout */
        setContentView(R.layout.mylayout);
        /* use findViewById() to get Button, then add onClickListener */
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                /* new an intent with class to be active */
                Intent intent= new Intent();
                intent.setClass(EX03_09_1.this,MainActivity.class);
          /* 调用一个新的Activity */
                startActivity(intent);
                /* 关闭原本的Activity */
                EX03_09_1.this.finish();
            }   /* end of onClick()  */
        } /* end of Button.OnClickListener() */);
    }
}