package defpackage;

import android.content.res.Resources;

/* renamed from: tcf reason: default package */
public final class tcf {
    public final String a;
    private final String b;
    private final tck c;
    private final tck d;

    public tcf(tck tck, tck tck2, String str, String str2) {
        this.c = tck;
        this.d = tck2;
        this.b = str;
        this.a = str2;
    }

    public final String a(Resources resources) {
        return this.c.a(resources);
    }

    public final String b(Resources resources) {
        return this.d.a(resources);
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }
}
