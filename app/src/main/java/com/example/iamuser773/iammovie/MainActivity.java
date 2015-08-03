package com.example.iamuser773.iammovie;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView movie1 = (ImageView) findViewById(R.id.movie_1);
        ImageView movie2 = (ImageView) findViewById(R.id.movie_2);
        ImageView movie3 = (ImageView) findViewById(R.id.movie_3);

        movie1.setOnClickListener(this);
        movie2.setOnClickListener(this);
        movie3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.movie_1) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setDataAndType(Uri.parse("https://r2---sn-uvu-c33r.googlevideo.com/videoplayback?source=youtube&ipbits=0&key=yt5&ip=125.27.185.136&expire=1438617310&mime=video%2Fx-flv&upn=YFW0udaxZqA&id=o-ACWcqwXuvlbGxl91xwOZ17AbkScEyuZsS0Goh6pYNv2E&fexp=9408710%2C9415365%2C9415485%2C9416126&sparams=dur%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpl%2Crequiressl%2Csource%2Cupn%2Cexpire&dur=162.873&mn=sn-uvu-c33r&mm=31&initcwndbps=978750&sver=3&requiressl=yes&lmt=1414765829069783&signature=82F1126FD8791E23F64E972E8095806062A6CE38.A52FA2870EEBE44D5F49B0FBEAF2ECD808FE3D08&ms=au&mt=1438595573&pl=22&mv=m&itag=5")
                    , "video/*");
            startActivity(i);

        } else if (v.getId() == R.id.movie_2) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setDataAndType(Uri.parse("https://r3---sn-uvu-c33d.googlevideo.com/videoplayback?mv=m&initcwndbps=940000&source=youtube&sparams=dur%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpl%2Crequiressl%2Csource%2Cupn%2Cexpire&ms=au&sver=3&pl=22&id=o-AMpMMatPvdGhcy_HGRROCXIj6d7clzmgp87ShBMxgeZd&mime=video%2Fx-flv&lmt=1436642251659917&mn=sn-uvu-c33d&ip=125.27.185.136&key=yt5&mt=1438596859&mm=31&ipbits=0&fexp=9408710%2C9415365%2C9415485%2C9416126&dur=212.663&expire=1438618557&requiressl=yes&upn=SBBDWYEUIbU&signature=40EA1ABB66AE01AFD15AAFC415907BD0625E10AD.9266CFFCF1DC3FEC9E490E3BD32A8BB4A052C729&itag=5")
                    , "video/*");
            startActivity(i);

        }else if (v.getId() == R.id.movie_3) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setDataAndType(Uri.parse("https://r8---sn-uvu-c33r.googlevideo.com/videoplayback?itag=5&requiressl=yes&sver=3&fexp=9408710%2C9415365%2C9415485%2C9416126&expire=1438618684&sparams=dur%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpcm2cms%2Cpl%2Crequiressl%2Csource%2Cupn%2Cexpire&mime=video%2Fx-flv&key=yt5&dur=157.832&lmt=1429535592095866&ms=au&mt=1438596975&mv=m&source=youtube&signature=92AAB7F5998FD418C2AF0E9CC35329B96939D5CA.62A901211101C71B22C81363F00E0A748513AB39&initcwndbps=927500&id=o-ANHi6ykFkBJ8CtGjTQTJqOAc8euvHSB2xlgRLfFWpzZw&mm=31&mn=sn-uvu-c33r&pcm2cms=yes&upn=bPINn45c55s&ipbits=0&ip=125.27.185.136&pl=22")
                    , "video/*");
            startActivity(i);

        }
    }
}
