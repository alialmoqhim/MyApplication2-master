package com.example.ibrahimalhassan.myapplication;



        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.TextureView;
        import android.view.View;
        import android.widget.Button;

public class affairs extends AppCompatActivity {
    Button btn;
    TextureView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affairs);

        btn=(Button) findViewById(R.id.calendar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(affairs.this,calendar.class);
                startActivity(i);
            }
        });



    }
}
