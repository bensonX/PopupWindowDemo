package com.example.popupwindowdemo;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

public class PopWindowUtil {
	private PopupWindow mMenuPopupWindow;
	public View initView(Context context,int layoutId){
		LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = layoutInflater.inflate(layoutId, null);
		return view;
	}
	
	public PopupWindow showMenuPopupWindow(View view,final PopupWindow myWindow,View parentView,int styleId,int yPos) {
		if (mMenuPopupWindow == null) {
			mMenuPopupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
		}
		// ʹ��ۼ�
		mMenuPopupWindow.setFocusable(false);
		// ����������������ʧ
		mMenuPopupWindow.setOutsideTouchable(false);

		// �����Ϊ�˵��������Back��Ҳ��ʹ����ʧ�����Ҳ�����Ӱ����ı���
//		mMenuPopupWindow.setBackgroundDrawable(new BitmapDrawable());

		// // ��ʾ��λ��Ϊ:��Ļ�Ŀ�ȵ�һ��-PopupWindow�ĸ߶ȵ�һ��
		// int xPos = Env.getScreenWidth() / 2 - mPopupWindow.getWidth() / 2 -
		// mPopupWindow.getWidth();

		mMenuPopupWindow.setAnimationStyle(styleId);

		int myYPos = yPos - mMenuPopupWindow.getHeight();
		mMenuPopupWindow.showAtLocation(parentView,Gravity.NO_GRAVITY , 0,  myYPos);

		mMenuPopupWindow.update();
		
		mMenuPopupWindow.setOnDismissListener(new OnDismissListener() {
			
			@Override
			public void onDismiss() {
				if(myWindow!=null)
					myWindow.dismiss();
			}
		});	
		
		return mMenuPopupWindow;
	}
}
