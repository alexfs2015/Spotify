package defpackage;

import android.content.res.Resources;

/* renamed from: tms reason: default package */
public final class tms implements tmr {
    private final int a;

    public tms(int i) {
        this.a = i;
    }

    public final String a(Resources resources) {
        int i = this.a;
        return i == 0 ? "" : resources.getString(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tms) && this.a == ((tms) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
