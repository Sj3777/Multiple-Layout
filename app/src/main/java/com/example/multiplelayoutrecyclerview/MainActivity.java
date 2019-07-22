package com.example.multiplelayoutrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EditText message;
    ImageView sendMessage;

    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message=findViewById(R.id.message);
        sendMessage=findViewById(R.id.send_message);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        recyclerView=findViewById(R.id.recyclerview);

        Model[] models=new Model[]
                {

                        new Model("Hello",2,R.drawable.create2),
                        new Model("Hello friend ",1,R.drawable.create),
                        new Model("Hello",2,R.drawable.create2),
                        new Model("Hello idiot",1,R.drawable.create),
                        new Model("Hello frnds",2,R.drawable.create2),
                        new Model("Hello boys",1,R.drawable.create),
                        new Model("Hello boys",2,R.drawable.create),
                        new Model("Hello boys",2,R.drawable.create),
                        new Model(" boys",2,R.drawable.create2),
                        new Model("Hello boys",2,R.drawable.create),
                        new Model(" boys",1,R.drawable.create2),
                        new Model("Hello boys",1,R.drawable.create),
                        new Model(" boys",1,R.drawable.create),




                };

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter=new MyAdapter(getApplicationContext(),models);
        recyclerView.setAdapter(adapter);


        mRef=FirebaseDatabase.getInstance().getReference("Chats");



        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg=message.getText().toString();

            }
        });
    }


}
