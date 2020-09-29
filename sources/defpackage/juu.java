package defpackage;

import android.content.res.Resources;
import java.lang.ref.WeakReference;

/* renamed from: juu reason: default package */
public class juu {
    private final WeakReference<Resources> a;

    public juu(Resources resources) {
        this.a = new WeakReference<>(fbp.a(resources));
    }

    /* access modifiers changed from: protected */
    public final String a(int i, int i2, Object... objArr) {
        Resources resources = (Resources) this.a.get();
        return resources == null ? "" : resources.getQuantityString(i, i2, objArr);
    }

    /* access modifiers changed from: protected */
    public final String a(int i, Object... objArr) {
        Resources resources = (Resources) this.a.get();
        return resources == null ? "" : resources.getString(i, objArr);
    }
}
