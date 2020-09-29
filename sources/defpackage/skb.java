package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: skb reason: default package */
public final class skb {
    private final sjv a;

    public skb(sjv sjv) {
        this.a = sjv;
    }

    public final boolean a(String str) {
        return this.a.c() && (ViewUris.aK.b(str) || ViewUris.u.b(str) || ViewUris.aJ.b(str) || ViewUris.aB.b(str));
    }
}
