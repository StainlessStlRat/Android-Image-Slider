package com.smarteist.autoimageslider.IndicatorView.draw.drawer.type;

import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.smarteist.autoimageslider.IndicatorView.draw.data.Indicator;

class BaseDrawer {

    protected Paint paint;
    protected Indicator indicator;
    protected ShapeDrawer shapeDrawer;

    BaseDrawer(@NonNull Paint paint,
               @NonNull Indicator indicator,
               @NonNull ShapeDrawer shapeDrawer) {
        this.paint = paint;
        this.indicator = indicator;
        this.shapeDrawer = shapeDrawer;
    }
}
