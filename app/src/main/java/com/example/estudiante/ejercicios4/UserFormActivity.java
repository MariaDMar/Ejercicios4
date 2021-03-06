package com.example.estudiante.ejercicios4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserFormActivity extends AppCompatActivity {

    private EditText edtUserFormName;
    private EditText edtPassword;
    private EditText edtUserFormUserName;

    private Button btnUserFormFinish;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);

        //Intent solicitud = getIntent();
        edtUserFormName = findViewById(R.id.edt_userform_name);


        btnUserFormFinish = findViewById(R.id.btn_user_form_finish);

        btnUserFormFinish.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent respuesta = new Intent();

                String name = edtUserFormName.getText().toString();
                String email = edtPassword.getText().toString();
                String username= edtUserFormUserName.getText().toString();

                respuesta.putExtra("name", name);
                respuesta.putExtra("password", email);
                respuesta.putExtra("username", username);


                setResult(Constansts.RESP_NEW_USER, respuesta);
                finish();
                //arregle ifnal
            }
        });
    }
}
