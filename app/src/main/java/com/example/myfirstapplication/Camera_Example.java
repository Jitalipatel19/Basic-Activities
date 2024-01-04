package com.example.myfirstapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Camera_Example extends AppCompatActivity implements View.OnClickListener {
   Button btntake;
   ImageView i2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera_example);

        btntake = (Button) findViewById(R.id.button_take);
        i2 = (ImageView) findViewById(R.id.imageView2);

        btntake.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btntake){
            Intent i =  new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i,1250);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1250){
            try {
                Bitmap bmp = (Bitmap) data.getExtras().get("data");
                i2.setImageBitmap(bmp);

            }catch (NullPointerException ex){
                Toast.makeText(getApplicationContext(), "Please Take a photo", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
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
