package com.smarteist.autoimageslider.IndicatorView.draw.drawer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import androidx.annotation.NonNull;

import com.smarteist.autoimageslider.IndicatorView.draw.data.Indicator;
import com.smarteist.autoimageslider.IndicatorView.draw.drawer.type.ShapeDrawer;

public class RectangleDrawer implements ShapeDrawer {

    private final Indicator indicator;

    public RectangleDrawer(Indicator indicator) {
        this.indicator = indicator;
    }

    @Override
    public void draw(int coordinateX,
                     int coordinateY,
                     float radius,
                     @NonNull Canvas canvas,
                     @NonNull Paint paint) {
        canvas.drawRect(getRect(coordinateX, coordinateY, this.indicator), paint);
    }

    private RectF getRect(int coordinateX,
                          int coordinateY,
                          Indicator indicator) {
        RectF rect = new RectF();
        rect.left = coordinateX - indicator.getRectW()/2.0f;
        rect.right = coordinateX + indicator.getRectW()/2.0f;
        rect.top = coordinateY + indicator.getRectH()/2.0f;
        rect.bottom = coordinateY - indicator.getRectH()/2.0f;
        return rect;
    }
}
