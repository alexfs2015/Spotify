package defpackage;

import android.content.res.Resources;

/* renamed from: tmq reason: default package */
public final class tmq implements tmr {
    private final int a;
    private final Object[] b;

    public tmq(int i, Object... objArr) {
        this.a = i;
        this.b = objArr;
    }

    public final String a(Resources resources) {
        return resources.getString(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tmq) && this.a == ((tmq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
