package com.example.myfirstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class If_Example extends AppCompatActivity implements View.OnClickListener {
    EditText edtno1,edtno2,edtno3;
    Button btnprintno,btnodev,btnmax2,btnmaxequal,btnpnz,btnmax3;
            ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.if_example);
        edtno1=(EditText) findViewById(R.id.edtno1);
        edtno2=(EditText) findViewById(R.id.edtno2);
        edtno3=(EditText) findViewById(R.id.edt_no3);
        btnprintno=(Button) findViewById(R.id.button_printno);
        btnodev=(Button)  findViewById(R.id.button_odev);
        btnmax2=(Button) findViewById(R.id.button_max2);
        btnmaxequal=(Button) findViewById(R.id.button_maxequal);
        btnpnz=(Button) findViewById(R.id.button_pnz);
        btnmax3=(Button) findViewById(R.id.button_max3);
        btnprintno.setOnClickListener(this);
        btnodev.setOnClickListener(this);
        btnmax2.setOnClickListener(this);
        btnmaxequal.setOnClickListener(this);
        btnpnz.setOnClickListener(this);
        btnmax3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==btnprintno){
            int n=Integer.parseInt(edtno1.getText().toString().trim());
            if(n>10)
            {
                Toast.makeText(this, "n="+n, Toast.LENGTH_SHORT).show();
            }

        }
        if(view==btnodev){
            int n=Integer.parseInt(edtno1.getText().toString().trim());
            if(n%2==0){
                Toast.makeText(this, "Even no", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Odd no", Toast.LENGTH_SHORT).show();
            }
        }
        if(view==btnmax2){
            int a,b;
             a=Integer.parseInt(edtno1.getText().toString().trim());
             b=Integer.parseInt(edtno2.getText().toString().trim());
             if(a>b){
                 Toast.makeText(this, "a is max", Toast.LENGTH_SHORT).show();
             }else
                 Toast.makeText(this, "b is max", Toast.LENGTH_SHORT).show();
        }

        if(view==btnmaxequal){
            int a,b;
            a=Integer.parseInt(edtno1.getText().toString().trim());
            b=Integer.parseInt(edtno2.getText().toString().trim());
            if(a>b){
                Toast.makeText(this, "A is max", Toast.LENGTH_SHORT).show();
            }else if(b>a){
                Toast.makeText(this, "B is max", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Equal", Toast.LENGTH_SHORT).show();
            }
        }

        if(view==btnpnz){
            int a=Integer.parseInt(edtno1.getText().toString().trim());
            if(a>0){
                Toast.makeText(this, "Positive", Toast.LENGTH_SHORT).show();
            }else if(a<0){
                Toast.makeText(this, "Negative", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Zero", Toast.LENGTH_SHORT).show();
            }
        }
        if(view==btnmax3){
            int a,b,c;
            a=Integer.parseInt(edtno1.getText().toString().trim());
            b=Integer.parseInt(edtno2.getText().toString().trim());
            c=Integer.parseInt(edtno3.getText().toString().trim());
            if(a>b && b>c){
                Toast.makeText(this, "A is max", Toast.LENGTH_SHORT).show();
            }else if(b>a && b>c){
                Toast.makeText(this, "B is max", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "C is max", Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent i;
        switch (item.getItemId()){
            case R.id.actv_example:
                i= new Intent(getApplicationContext(),Actv_Example.class);
                startActivity(i);
                return true;
            case R.id.sms_example:
                i= new Intent(getApplicationContext(), Sms_Example.class);
                startActivity(i);
                return true;

            case R.id.alert_example:
                i= new Intent(getApplicationContext(),Alert_Example.class);
                startActivity(i);
                return true;
            case R.id.internal_storage_example:_example:
            i= new Intent(getApplicationContext(), Internal_Storage_Example.class);
                startActivity(i);
                return true;

            case R.id.analog_digital_example:
                i= new Intent(getApplicationContext(),Analog_Digital_Example.class);
                startActivity(i);
                return true;

            case R.id.arithm_example:
                i= new Intent(getApplicationContext(),Arithm_Example.class);
                startActivity(i);
                return true;

            case R.id.checkbox_example:
                i= new Intent(getApplicationContext(), Checkbox_Example.class);
                startActivity(i);
                return true;

            case R.id.custom_toast_example:
                i= new Intent(getApplicationContext(), Custom_Toast_Example.class);
                startActivity(i);
                return true;

            case R.id.datepicker1:
                i= new Intent(getApplicationContext(), DatePicker_Example.class);
                startActivity(i);
                return true;
            case R.id.datepicker2:
                i= new Intent(getApplicationContext(), Datepicker_Example2.class);
                startActivity(i);
                return true;



            case R.id.email_example:
                i= new Intent(getApplicationContext(), Email_Example.class);
                startActivity(i);
                return true;
            case R.id.context_menu_example:
                i= new Intent(getApplicationContext(), Context_Menu_Example.class);
                startActivity(i);
                return true;

            case R.id.camera_example:
                i= new Intent(getApplicationContext(), Camera_Example.class);
                startActivity(i);
                return true;

            case R.id.texttospeech1:
                i= new Intent(getApplicationContext(), TextToSpeech_Example.class);
                startActivity(i);
                return true;
            case R.id.texttospeech2:
                i= new Intent(getApplicationContext(), TextToSpeech_Example2.class);
                startActivity(i);
                return true;


            case R.id.firstactivity_example:
                i= new Intent(getApplicationContext(),First_Activity.class);
                startActivity(i);
                return true;

            case R.id.for_example:
                i= new Intent(getApplicationContext(),For_Example.class);
                startActivity(i);
                return true;

            case R.id.if_example:
                i= new Intent(getApplicationContext(),If_Example.class);
                startActivity(i);
                return true;

            case R.id.implicit_intent_example:
                i= new Intent(getApplicationContext(),Implicit_Itent_Example.class);
                startActivity(i);
                return true;

            case R.id.oneactivity_example:
                i= new Intent(getApplicationContext(),One_Activity.class);
                startActivity(i);
                return true;

            case R.id.pbar_example:
                i= new Intent(getApplicationContext(),ProgressBar_Example.class);
                startActivity(i);
                return true;

            case R.id.ratingbar_example:
                i= new Intent(getApplicationContext(),Ratingbar_Example.class);
                startActivity(i);
                return true;

            case R.id.screen_orientation_example:
                i= new Intent(getApplicationContext(),Screen_Oreintation_Exaample.class);
                startActivity(i);
                return true;

            case R.id.seekbar_example:
                i= new Intent(getApplicationContext(),Seekbar_Example.class);
                startActivity(i);
                return true;
            case R.id.seekbar_discrete:
                i= new Intent(getApplicationContext(), Seekbar_Discrete_Example.class);
                startActivity(i);
                return true;

            case R.id.spinner_example:
                i= new Intent(getApplicationContext(),Spinner_Example.class);
                startActivity(i);
                return true;


            case R.id.switch_example:
                i= new Intent(getApplicationContext(), Switch_Example.class);
                startActivity(i);
                return true;

            case R.id.tpicker_example:
                i= new Intent(getApplicationContext(),TimePicker_Example.class);
                startActivity(i);
                return true;
            case R.id.bluetooth_example1:
                i= new Intent(getApplicationContext(), Bluetooth_Example1.class);
                startActivity(i);
                return true;
            case R.id.bluetooth_example2:
                i= new Intent(getApplicationContext(), Bluetooth_Example2.class);
                startActivity(i);
                return true;

            case R.id.toggle_button_example:
                i= new Intent(getApplicationContext(),Toggle_Button_Example.class);
                startActivity(i);
                return true;

            case R.id.while_example:
                i= new Intent(getApplicationContext(),Actv_Example.class);
                startActivity(i);
                return true;

            case R.id.mainactivtiy:
                i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                return true;
            case R.id.popup_example:
                i= new Intent(getApplicationContext(),Popup_Menu_Example.class);
                startActivity(i);
                return true;
            case R.id.phonecall_example:
                i= new Intent(getApplicationContext(),Phone_Call_Example.class);
                startActivity(i);
                return true;
            case R.id.wifi_example:
                i= new Intent(getApplicationContext(), Wifi_Example.class);
                startActivity(i);
                return true;



            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
