package com.smarteist.autoimageslider.IndicatorView.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.smarteist.autoimageslider.IndicatorView.animation.data.Value;
import com.smarteist.autoimageslider.IndicatorView.animation.data.type.DropAnimationValue;
import com.smarteist.autoimageslider.IndicatorView.draw.data.Indicator;
import com.smarteist.autoimageslider.IndicatorView.draw.data.Orientation;

public class DropDrawer extends BaseDrawer {

    public DropDrawer(@NonNull Paint paint,
                      @NonNull Indicator indicator,
                      @NonNull ShapeDrawer shapeDrawer) {
        super(paint, indicator, shapeDrawer);
    }

    public void draw(
            @NonNull Canvas canvas,
            @NonNull Value value,
            int coordinateX,
            int coordinateY) {

        if (!(value instanceof DropAnimationValue)) {
            return;
        }

        DropAnimationValue v = (DropAnimationValue) value;
        int unselectedColor = indicator.getUnselectedColor();
        int selectedColor = indicator.getSelectedColor();
        float radius = indicator.getRadius();

        paint.setColor(unselectedColor);
        canvas.drawCircle(coordinateX, coordinateY, radius, paint);

        paint.setColor(selectedColor);
        if (indicator.getOrientation() == Orientation.HORIZONTAL) {
            shapeDrawer.draw(v.getWidth(), v.getHeight(), v.getRadius(), canvas, paint);
        } else {
            shapeDrawer.draw(v.getHeight(), v.getWidth(), v.getRadius(), canvas, paint);
        }
    }
}
