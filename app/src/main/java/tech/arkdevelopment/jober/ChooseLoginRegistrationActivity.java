package tech.arkdevelopment.jober;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * A login screen that offers login via email/password.
 */
public class ChooseLoginRegistrationActivity extends AppCompatActivity {

    private Button vLogin, vRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login_registration);

        vLogin = findViewById(R.id.sign_in_button);
        vRegister = findViewById(R.id.register_button);

        vLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseLoginRegistrationActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        vRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseLoginRegistrationActivity.this, RegistrationActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

