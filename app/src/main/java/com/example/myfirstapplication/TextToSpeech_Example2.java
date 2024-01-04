package com.example.myfirstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TextToSpeech_Example2 extends AppCompatActivity implements View.OnClickListener, TextToSpeech.OnInitListener, AdapterView.OnItemSelectedListener {

   EditText edtpitch,edttext;
   Spinner spinnspeed;
   Button btnspeak;
   String speed="";
   TextToSpeech tts;
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.texttospeech_example2);

        tts = new TextToSpeech(this,this);

        edtpitch = (EditText) findViewById(R.id.editText_pitch);
        edttext = (EditText) findViewById(R.id.editText_Text);

        spinnspeed = (Spinner) findViewById(R.id.spinner_speed);

        loadspinnerspeed();

        btnspeak = (Button) findViewById(R.id.button_speak);

        btnspeak.setOnClickListener(this);
        spinnspeed.setOnItemSelectedListener(this);

    }

    private void loadspinnerspeed() {
        List labels = new ArrayList();
        labels.add("Very Slow");
        labels.add("Slow");
        labels.add("Very Fast");
        labels.add("Fast");
        labels.add("Very Fast");

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,labels);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnspeed.setAdapter(aa);
    }

    @Override
    public void onClick(View view) {
        if(view == btnspeak)
        {
                setSpeed();
                speakout();

        }
    }

    private void speakout() {
        String text = edttext.getText().toString().trim();
        tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

    }

    private void setSpeed() {
        if(speed.equals("Very Slow"))
        {
            tts.setSpeechRate(0.1f);
        }else if(speed.equals("Slow"))
        {
            tts.setSpeechRate(0.5f);
        }else if(speed.equals("Normal"))
        {
            tts.setSpeechRate(1.0f);
        }else if(speed.equals("Fast"))
        {
            tts.setSpeechRate(1.5f);
        }else if(speed.equals("Very Fast"))
        {
            tts.setSpeechRate(2.0f);
        }else
        {
            tts.setSpeechRate(1.0f);
        }
        float pitch = Float.parseFloat(edtpitch.getText().toString().trim());
        tts.setPitch(pitch);
    }

    @Override
    public void onInit(int i) {
        if(i==TextToSpeech.SUCCESS)
        {
            int result = tts.setLanguage(Locale.US);
            if(result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED)
            {
                Toast.makeText(getApplicationContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
            }else {
                speakout();

            }
        }else{
            Toast.makeText(getApplicationContext(), "Initialization Failed", Toast.LENGTH_SHORT).show();
        }
    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        speed = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(getApplicationContext(), "Speed ="+speed, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    protected void onDestroy() {
        if(tts!=null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
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
