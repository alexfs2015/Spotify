package defpackage;

import android.content.res.Resources;
import java.lang.ref.WeakReference;

/* renamed from: jsn reason: default package */
public class jsn {
    private final WeakReference<Resources> a;

    public jsn(Resources resources) {
        this.a = new WeakReference<>(fay.a(resources));
    }

    /* access modifiers changed from: protected */
    public final String a(int i, Object... objArr) {
        Resources resources = (Resources) this.a.get();
        if (resources == null) {
            return "";
        }
        return resources.getString(i, objArr);
    }

    /* access modifiers changed from: protected */
    public final String a(int i, int i2, Object... objArr) {
        Resources resources = (Resources) this.a.get();
        if (resources == null) {
            return "";
        }
        return resources.getQuantityString(i, i2, objArr);
    }
}
