package ro.sapi.activitylifecyclemonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
        private static final String TAG = "statusz";

        @Override
        protected void onStart() {
            super.onStart();
            Log.d(TAG, "onCreate: MainActivity:  onStart()");
        }

        /** Called when the activity has become visible. */
        @Override
        protected void onResume() {
            super.onResume();
            Log.d(TAG, "onCreate: MainActivity:  onResume()");
        }

        /** Called when another activity is taking focus. */
        @Override
        protected void onPause() {
            super.onPause();
            Log.d(TAG, "onCreate: MainActivity:  onPause()");
        }

        /** Called when the activity is no longer visible. */
        @Override
        protected void onStop() {
            super.onStop();
            Log.d(TAG, "onCreate: MainActivity:  onStop()");
        }

        /** Called just before the activity is destroyed. */
        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d(TAG, "onCreate: MainActivity:  onDestroy()");

    }
}