/*
 * James Keller
 * ITCS 4180 - 091
 * Date:  02/04/14
 * In-Class Assignment 1
 */

package edu.uncc.itcs4180;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	//Creation and/or initialization of global variables
	LinearLayout root;
	int count = 1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Button object creation passing color information to the inner
        //class
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new ButtonStore(Color.GRAY));
        
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new ButtonStore(Color.CYAN));
        
        b = (Button) findViewById(R.id.button3);
        b.setOnClickListener(new ButtonStore(Color.DKGRAY));
        
        b = (Button) findViewById(R.id.button4);
        b.setOnClickListener(new ButtonStore(Color.MAGENTA));
        
        b = (Button) findViewById(R.id.button5);
        b.setOnClickListener(new ButtonStore(Color.YELLOW));
        
        root = (LinearLayout) findViewById(R.id.LinearLayout1);   
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    //Inner class for keeping track of button clicks and changing
    //the background color
    public class ButtonStore implements View.OnClickListener {
    	int color;
    	
    	//Constructor
    	public ButtonStore(int color) {
    		this.color = color;
    	}
    	
    	//Changes the background color with each button click and increments the count
		@Override
		public void onClick(View arg0) {
			root.setBackgroundColor(this.color);
			final TextView tv1 = (TextView) findViewById(R.id.textView1);
			tv1.setText("# Clicks: " + count);
			count++;
		}
    }
    
}
