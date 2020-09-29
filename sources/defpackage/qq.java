package defpackage;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: qq reason: default package */
public final class qq {
    public static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, null, path) : PropertyValuesHolder.ofFloat(new qp(property, path), new float[]{0.0f, 1.0f});
    }
}
