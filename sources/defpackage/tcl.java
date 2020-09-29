package defpackage;

import android.content.res.Resources;

/* renamed from: tcl reason: default package */
public final class tcl implements tck {
    private final int a;

    public tcl(int i) {
        this.a = i;
    }

    public final String a(Resources resources) {
        int i = this.a;
        if (i == 0) {
            return "";
        }
        return resources.getString(i);
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tcl) && this.a == ((tcl) obj).a) {
            return true;
        }
        return false;
    }
}
