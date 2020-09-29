package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: eyh reason: default package */
public final class eyh extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new eyh();
    private final WeakHashMap<Drawable, Integer> b = new WeakHashMap<>();

    public final /* synthetic */ Object get(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.b.containsKey(drawable)) {
            return (Integer) this.b.get(drawable);
        }
        return Integer.valueOf(255);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        Integer num = (Integer) obj2;
        if (VERSION.SDK_INT < 19) {
            this.b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }

    private eyh() {
        super(Integer.class, "drawableAlphaCompat");
    }
}
