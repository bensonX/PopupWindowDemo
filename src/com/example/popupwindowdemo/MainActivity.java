package com.example.popupwindowdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView mMyTextView;
	private RelativeLayout mRelativeLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mRelativeLayout = (RelativeLayout) findViewById(R.id.layout_parent);
		mMyTextView = (TextView) findViewById(R.id.text);
		mMyTextView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showMenuPopupWindow();
			}
		});
	} 
	

	// œ‘ æ≤Àµ•dialog
	public void showMenuPopupWindow() {
		PopupWindow mBottomPopupWindow = null;
		PopupWindow mTopPopupWindow = null;
		PopWindowUtil mTopPopWindowUtil = new PopWindowUtil();
		View mView = mTopPopWindowUtil.initView(this, R.layout.playview_operator_view);
		int yPos = getWindow().getDecorView().getHeight();
		mBottomPopupWindow =  mTopPopWindowUtil.showMenuPopupWindow(mView, mTopPopupWindow, mRelativeLayout, R.style.PopupAnimationBottom, yPos);
		
		PopWindowUtil mBottomPopWindowUtil = new PopWindowUtil();
		View mTopView = mBottomPopWindowUtil.initView(this, R.layout.playview_operator_view);
		int yTosPos = getWindow().getDecorView().getHeight()-mRelativeLayout.getHeight();
		mTopPopupWindow = mBottomPopWindowUtil.showMenuPopupWindow(mTopView, mBottomPopupWindow, mRelativeLayout, R.style.PopupAnimationTop, yTosPos);
	}
	
	

}
