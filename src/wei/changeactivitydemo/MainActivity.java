package wei.changeactivitydemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button secondbtn, thirdbtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findviews();
	}

	void findviews() {

		secondbtn = (Button) findViewById(R.id.button1);
		secondbtn.setOnClickListener(listener);

		thirdbtn = (Button) findViewById(R.id.button2);
		thirdbtn.setOnClickListener(listener);
		// secondbtn.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		//
		// Intent intent=new Intent();
		// intent.setClass(MainActivity.this,ThirdActivity.class);
		// startActivity(intent);
		// }
		// });
		//

	}

	OnClickListener listener = new OnClickListener() {
		Intent intent = new Intent();
		@Override
		public void onClick(View v) {
			switch (v.getId()) {

			case R.id.button1:
			
				intent.setClass(MainActivity.this, SecondActivity.class);
				startActivity(intent);
                break;
			case R.id.button2:
			
				intent.setClass(MainActivity.this,ThirdActivity.class );
				startActivity(intent);
                break;
				
				
			}

		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
