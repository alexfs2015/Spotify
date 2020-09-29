package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: jga reason: default package */
public final class jga extends jht implements jfy {
    String a;
    String b;

    public jga(String str) {
        super(str);
    }

    public final void a(String str, String str2) {
        Logger.b("Ad Playing State enabled", new Object[0]);
        this.a = str;
        this.b = str2;
        ag_();
    }

    public final void b(String str, String str2) {
        Logger.b("Ad Playing State Ad Changed", new Object[0]);
        this.a = str;
        this.b = str2;
        for (jhy jhy : this.d) {
            if (jhy instanceof jgb) {
                ((jgb) jhy).a(str, str2);
            }
        }
    }

    public final void a() {
        Logger.b("Ad Playing State Disabled", new Object[0]);
        ah_();
    }
}
