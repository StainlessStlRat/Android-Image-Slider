package com.smarteist.autoimageslider.IndicatorView.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;

import androidx.annotation.NonNull;

import com.smarteist.autoimageslider.IndicatorView.draw.data.Indicator;

public interface ShapeDrawer {

    void draw(int coordinateX,
              int coordinateY,
              float radius,
              @NonNull Canvas canvas,
              @NonNull Paint paint);
}
