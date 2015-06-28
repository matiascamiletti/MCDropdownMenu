package com.mobileia.mcdropdownmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MCDropdownMenu extends RelativeLayout {

    /**
     * Resource layout for main view.
     */
    private int mLayoutMainView = R.layout.main_view;

    private PopupWindow mPopupWindow = null;

    /**
     * Init
     */
    private void init() {
        initMainView();
        initOnClick();
        initPopupWindow();
    }

    private void initMainView() {
        // Clean views
        removeAllViews();
        // Create main view
        View mainView = LayoutInflater.from(getContext()).inflate(mLayoutMainView, null);
        // Add view
        addView(mainView);
    }

    private void initOnClick() {
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPopupWindow != null) {
                    mPopupWindow.showAsDropDown(MCDropdownMenu.this);
                }
            }
        });
    }

    private void initPopupWindow() {
        View popupView = LayoutInflater.from(getContext()).inflate(R.layout.popup_view, null);
        mPopupWindow = new PopupWindow(popupView, LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, true);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setBackgroundDrawable(new BitmapDrawable());
        /*mPopupWindow.setTouchInterceptor(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mPopupWindow.dismiss();
                return false;
            }
        });*/
    }

    // Override
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    // Setters
    public void setLayoutMainView(int resource) {
        mLayoutMainView = resource;
        // Generate main view
        initMainView();
    }


    // Constructs
    /**
     *
     * @param context
     */
    public MCDropdownMenu(Context context) {
        super(context);
        init();
    }

    public MCDropdownMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MCDropdownMenu(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

}
