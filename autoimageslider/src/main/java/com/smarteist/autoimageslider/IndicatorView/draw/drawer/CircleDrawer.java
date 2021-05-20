package com.smarteist.autoimageslider.IndicatorView.draw.drawer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import androidx.annotation.NonNull;

import com.smarteist.autoimageslider.IndicatorView.draw.drawer.type.ShapeDrawer;

public class CircleDrawer implements ShapeDrawer {
    @Override
    public void draw(int coordinateX,
                     int coordinateY,
                     float radius,
                     @NonNull Canvas canvas,
                     @NonNull Paint paint) {
        canvas.drawCircle(coordinateX, coordinateY, radius, paint);
    }
}
