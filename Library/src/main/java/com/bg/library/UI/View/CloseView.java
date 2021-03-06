package com.bg.library.UI.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.bg.library.UI.Drawable.CloseDrawable;


/**
 * Created by BinGe on 2017/10/24.
 * XX按钮
 */
public class CloseView extends View {

    private CloseDrawable mDrawable;

    public CloseView(Context context) {
        this(context, null);
    }

    public CloseView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mDrawable = new CloseDrawable(getContext());
        Drawable background = getBackground();
        if (background != null && background instanceof ColorDrawable) {
            ColorDrawable cd = (ColorDrawable) background;
            int color = cd.getColor();
            mDrawable.setColor(color);
        }
        setBackground(mDrawable);
    }

    @Override
    public void setBackgroundColor(@ColorInt int color) {
//        super.setBackgroundColor(color);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
