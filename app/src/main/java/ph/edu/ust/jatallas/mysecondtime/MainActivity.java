package ph.edu.ust.jatallas.mysecondtime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView textViewResult = (TextView) findViewById(R.id.textViewResult);
                for (int i = 0; i<=19; i++){
                    if ((i % 2) == 0){
                        textViewResult.append(i + ", ");
                    }
                }
            }
        });

    }

}
