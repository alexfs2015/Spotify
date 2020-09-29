package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: eyy reason: default package */
public final class eyy extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new eyy();
    private final WeakHashMap<Drawable, Integer> b = new WeakHashMap<>();

    private eyy() {
        super(Integer.class, "drawableAlphaCompat");
    }

    public final /* synthetic */ Object get(Object obj) {
        Drawable drawable = (Drawable) obj;
        return VERSION.SDK_INT >= 19 ? Integer.valueOf(drawable.getAlpha()) : this.b.containsKey(drawable) ? (Integer) this.b.get(drawable) : Integer.valueOf(255);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        Integer num = (Integer) obj2;
        if (VERSION.SDK_INT < 19) {
            this.b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
