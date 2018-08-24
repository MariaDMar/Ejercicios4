package com.example.estudiante.ejercicios4;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// MARIA DEL MAR MARTINEZ, SEBASTIAN GARCIA

    private EditText edtUserFormName;
    private EditText edtPassword;
    private Button btn_main_to_form;
    private TextView tv_main_status;
    private Button btnUserFormFinish;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent solicitud = getIntent();
        btn_main_to_form = findViewById(R.id.btn_main_to_form);
        edtUserFormName = findViewById(R.id.edt_userform_name);
        edtPassword = findViewById(R.id.edt_userform_email);

        btn_main_to_form = findViewById(R.id.btn_user_form_finish);
        Log.e("Prueba", ""+btn_main_to_form);

        btn_main_to_form.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent respuesta = new Intent(getApplicationContext(), UserFormActivity.class);
                tv_main_status = findViewById(R.id.tv_main_status);
                btn_main_to_form = findViewById(R.id.btn_main_to_form);

                String name = edtUserFormName.getText().toString();
                String password = edtPassword.getText().toString();
            startActivityForResult(respuesta, Constansts.REQ_NEW_USER);
                //arregle ifnal

             /*   btn_main_to_form.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent respuesta = new Intent(getApplicationContext(),
                                UserFormActivity.class);
                    }
                });*/

            }
        });

       /* protected void onActivityResult(int requestCode, int resultCore, Intent data){
            super.onActivityResult(requestCode,resultCode,data); //*/

    }




}