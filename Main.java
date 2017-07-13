package com.formation.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;


public class Main extends Activity {
    /** Called when the activity is first created. */
    public static int integer = 0;
	LinearLayout layout;
    
    /*
    @Define: create the Text.
    @Parameters: text[string]
    @return: the element.
    */
	private TextView createTextView(String text_input){
		TextView view = new TextView(this);
        view.setId(integer);
		view.setText(text_input);
        integer +=1;
		return view;
	}
    
	/*
    @Define: create the input text
    @Parameters: text[string], Width[int]
    @return: the element.
     */
    private EditText createInputText (String text_input, Integer width) {
        EditText view = new EditText(this);
        view.setId(integer);
        view.setText(text_input);
        view.setWidth(width);
        integer +=1;
        return view;
    }

    /*
    @Define: create the Button.
    @Parameters: text[string]
    @return: the element.
    */
	private Button createButton (String text_input) {
		Button view = new Button(this);
        view.setId(integer);
		view.setText(text_input);
        integer +=1;
		return view;
	}

	
    /*
    @Define: create the elements.
    @Parameters: savedInstanceState[element]
    @Functionnality: .AddView
    .AddView: AddElement [createButton|createInputText|createTextView].
    @Other: Fix the [Background|Gravity|Padding|Orientation].
    @return: null [ just implement to the layout ].
    */

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        
        layout = new LinearLayout(this);
        layout.addView(createTextView("Hello"));
        layout.addView(createButton("bonjour"));
        layout.addView(createInputText(null, 100));
        
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.RIGHT);
        layout.setPadding(20, 20, 0, 0);

        layout.setBackgroundResource(R.drawable.back);

        //BitmapDrawable bmp = (BitmapDrawable)this.getResources().getDrawable(R.drawable.back);
        //layout.setBackgroundDrawable(bmp);

        setContentView(layout);
        
    }
}
