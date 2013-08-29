package wei.changeactivitydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends Activity {

	Button mainbtn,secondbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_activity);
		findviews();
	}

	
	void findviews(){
		
		
		mainbtn=(Button)findViewById(R.id.button1);
		mainbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(ThirdActivity.this,MainActivity.class);
				startActivity(intent);
				
				
			}
		});
		
		secondbtn=(Button)findViewById(R.id.button2);
		secondbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(ThirdActivity.this,SecondActivity.class);
				startActivity(intent);
			}
		});
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
