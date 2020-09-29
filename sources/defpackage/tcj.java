package defpackage;

import android.content.res.Resources;

/* renamed from: tcj reason: default package */
public final class tcj implements tck {
    private final int a;
    private final Object[] b;

    public tcj(int i, Object... objArr) {
        this.a = i;
        this.b = objArr;
    }

    public final String a(Resources resources) {
        return resources.getString(this.a, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tcj) && this.a == ((tcj) obj).a) {
            return true;
        }
        return false;
    }
}
