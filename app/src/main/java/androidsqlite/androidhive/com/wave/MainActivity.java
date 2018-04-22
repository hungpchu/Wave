package androidsqlite.androidhive.com.wave;

import java.io.File;
import  java.io.IOException;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mediaPlayer = new MediaPlayer();


       // String filePath = "sdcard/a.mp3";

       // mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

      //  File file = new File(filePath);

      //  Uri myUri = Uri.parse(filePath);
        //Uri myUri = Uri.fromFile(file);
        //Uri myUri = Uri.parse("file:///Music/awhole.mp3"); // initialize Uri here


//              mediaPlayer = new MediaPlayer();
//        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);


        Button play = (Button) findViewById(R.id.Play);
        Button stop = (Button) findViewById(R.id.Stop);


//        try {
//            mediaPlayer.setDataSource(getApplicationContext(), myUri);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try {
//            mediaPlayer.prepare();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mediaPlayer) {
//                mediaPlayer.start();
//            }
//        });

       // mediaPlayer.prepareAsync();


       play.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               mediaPlayer = new MediaPlayer();


               String filePath = "storage/a.mp3";
               //String filePath = Environment.getExternalStorageState().getPath()"/a.mp3";

               mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
               File file = new File(filePath);
               Uri myUri = Uri.fromFile(file);
               //Uri myUri = Uri.parse(filePath);

               try {
                   Toast.makeText(getApplicationContext(),"Playback start 0",Toast.LENGTH_LONG).show();
                   mediaPlayer.setDataSource(getApplicationContext(), myUri);
                   mediaPlayer.prepare();
                   mediaPlayer.start();
                   Toast.makeText(getApplicationContext(),"Playback start",Toast.LENGTH_LONG).show();
                   //Log.d("AAA", "BBB");

               }catch (IOException e){
                   e.printStackTrace();
               }






           }
       });

//        stop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mediaPlayer.stop();
//            }
//        });




    }
}
