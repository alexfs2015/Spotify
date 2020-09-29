package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: jip reason: default package */
public final class jip extends jkj implements jin {
    String a;
    String b;

    public jip(String str) {
        super(str);
    }

    public final void a() {
        Logger.b("Ad Playing State Disabled", new Object[0]);
        ah_();
    }

    public final void a(String str, String str2) {
        Logger.b("Ad Playing State Disabled", new Object[0]);
        ah_();
    }

    public final void b(String str, String str2) {
        Logger.b("Ad Playing State Ad Changed", new Object[0]);
        this.a = str;
        this.b = str2;
        for (jko jko : this.d) {
            if (jko instanceof jiq) {
                ((jiq) jko).a(str, str2);
            }
        }
    }
}
