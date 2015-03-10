package asia.takezoo.googlemap;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        LatLng  kyoto= new LatLng(34.985442,135.758466);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(kyoto, 13));

        map.addMarker(new MarkerOptions()
                .title("Kyoto Station")
                .snippet("Hello Kyoto")
                .position(kyoto));
    }
}
/*



public class MainActivity extends ActionBarActivity {

    // GoogleMapオブジェクトの宣言
    private GoogleMap googleMap;

    @SuppressLint("NewApi")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // MapFragmentオブジェクトを取得
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);


        try {
            // GoogleMapオブジェクトの取得
            googleMap = mapFragment.getMap();

            // Activityが初回で生成されたとき
            if (savedInstanceState == null) {

                // MapFragmentのオブジェクトをセット
                mapFragment.setRetainInstance(true);

                // 地図の初期設定を行うメソッドの呼び出し
                mapInit();
            }
        }
        // GoogleMapが使用不可のとき
        catch (Exception e) {


        }
        //mapFragment.getMapAsync((com.google.android.gms.maps.OnMapReadyCallback) this);


        //https://developers.google.com/maps/documentation/android/map#add_a_map_to_an_android_app
    }


    // 地図の初期設定メソッド
    private void mapInit() {

        // 地図タイプ設定
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        // 現在位置ボタンの表示を行なう
        googleMap.setMyLocationEnabled(true);

        // 京都駅の位置、ズーム設定
        CameraPosition camerapos = new CameraPosition.Builder()
                .target(new LatLng(34.985442,135.758466)).zoom(15.5f).build();

        // 地図の中心の変更する
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(camerapos));


        // Fragmentの取得
        FragmentManager manager = getSupportFragmentManager();
        SupportMapFragment frag = (SupportMapFragment) manager.findFragmentById(R.id.map);
        // GoogleMapの取得
        GoogleMap map = frag.getMap();


        // ピンを立てる
        /*LatLng position = new LatLng(0, 0);
        MarkerOptions options = new MarkerOptions();
        options.position(position);
        options.title("タイトル");
        map.addMarker(options);*/

        /*map.addMarker(new MarkerOptions()
                .position(new LatLng(10, 10))
                .title("Hello world"));*/


 /*       // マーカーを貼る緯度・経度
        LatLng location = new LatLng(34.985442,135.758466);

        // マーカーの設定
        MarkerOptions options = new MarkerOptions();
        options.position(location);
        options.title("京都駅");
        options.snippet(location.toString());

        // マップにマーカーを追加
         map.addMarker(options);

    }*/

   /* @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(10, 10))
                .title("Hello world"));
    }*/

/*
public class MainActivity extends FragmentActivity
        implements OnMapReadyCallback {

    // GoogleMapオブジェクトの宣言
    private GoogleMap googleMap;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }*/
/*
// Fragmentの取得
        FragmentManager manager = getSupportFragmentManager();
        SupportMapFragment frag = (SupportMapFragment) manager.findFragmentById(R.id.map);
        // GoogleMapの取得
        GoogleMap map = frag.getMap();


   MapFragment mapFragment = (MapFragment) getFragmentManager()
            .findFragmentById(R.id.map);
    mapFragment.getMapAsync(this);

    @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(0, 0))
                .title("Marker"));
    }

*/


/*

//http://seesaawiki.jp/w/moonlight_aska/d/%A5%DE%A1%BC%A5%AB%A1%BC%A4%F2%C9%BD%BC%A8%A4%B9%A4%EB

public class MainActivity extends FragmentActivity {
    // 六甲山：北緯34度46分41秒, 東経135度15分49秒}
    //private double mLatitude = 34.0d + 46.0d/60 + 41.0d/(60*60);
    //private double mLongitude = 135.0d + 15.0d/60 + 49.0d/(60*60);
    private GoogleMap mMap = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       mMap = ( (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map) ).getMap();
        if (mMap != null) {
            LatLng location = new LatLng(34.985442,135.758466);
            CameraPosition cameraPos = new CameraPosition.Builder()
           .target(location).zoom(10.0f)
            .bearing(0).build();
          mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPos));
            // マーカー設定
            MarkerOptions options = new MarkerOptions();
            options.position(location);
            mMap.addMarker(options);
            }

        }

*/

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}*/
