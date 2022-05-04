package sg.edu.np.mad.p05madweek2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fbutton = findViewById(R.id.button);
        User zhewei = new User("Zhe Wei", "Week 2 Practical", 1234, false);
        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (zhewei.followed==true){
                    fbutton.setText("Unfollow");
                    zhewei.followed = false;
                }
                else{
                    fbutton.setText("Follow");
                    zhewei.followed = true;
                }
            }
        });
    }
}