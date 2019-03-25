package com.example.liushi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/*Time:2000/12/07
 *Author:yinqiuping
 *Description:
 */public class LiuShiLayout extends ViewGroup {

    public LiuShiLayout(Context context) {
        super(context);
    }

    public LiuShiLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LiuShiLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        测量子宽高
        measureChildren(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int width = getWidth();//获取宽
        int row = 0;//定义常量行数
        int diswith = 18;//定义间距

        for (int i = 0; i < getChildCount(); i++) {
//            获取紫的坐标
            View view = getChildAt(i);
//            测量宽高
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (diswith + measuredWidth > width) {
                row++;
                diswith = 18;
            }
            view.layout(diswith, row * measuredHeight, diswith + measuredWidth, measuredHeight * (row + 1));

            diswith += measuredWidth;
        }
    }
}
