package com.example.myfirstapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Popup_Menu_Example extends AppCompatActivity implements View.OnClickListener {
    Button btnview;
    ConstraintLayout clayout1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_menu_example);

        btnview=(Button) findViewById(R.id.button_view);
        clayout1=(ConstraintLayout) findViewById(R.id.clayout1);

        btnview.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==btnview)
        {
            PopupMenu pm = new PopupMenu(Popup_Menu_Example.this,btnview);
            pm.getMenuInflater().inflate(R.menu.popup_menu,pm.getMenu());

            pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    if(menuItem.getTitle().equals("RED"))
                    {
                        btnview.setBackgroundColor(Color.RED);
                        clayout1.setBackgroundColor(Color.WHITE);
                        return true;
                    }else if(menuItem.getTitle().equals("GREEN"))
                    {
                        btnview.setBackgroundColor(Color.MAGENTA);
                        clayout1.setBackgroundColor(Color.GREEN);
                        return true;
                    }else if(menuItem.getTitle().equals("BLUE"))
                    {
                        btnview.setBackgroundColor(Color.BLUE);
                        clayout1.setBackgroundColor(Color.BLUE);
                        return true;
                    }
                    return false;
                }
            });
            pm.show();
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