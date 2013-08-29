package wei.changeactivitydemo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity {

	Button mainbtn,thirdbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		findviews();
	}

	void findviews(){
		
		
		mainbtn=(Button)findViewById(R.id.button1);
		mainbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(SecondActivity.this,MainActivity.class);
				startActivity(intent);
				
				
			}
		});
		
		thirdbtn=(Button)findViewById(R.id.button2);
		thirdbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(SecondActivity.this,ThirdActivity.class);
				startActivity(intent);
			}
		});
		
	}
	
}
