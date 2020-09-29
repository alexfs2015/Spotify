package defpackage;

import com.google.common.base.Optional;

/* renamed from: gio reason: default package */
public final class gio {
    public Optional<String> a = Optional.e();

    public final boolean a(wmd wmd) {
        if (!wmd.a.c()) {
            return false;
        }
        String str = wmd.a.b;
        if ("spclient.wg.spotify.com".equals(str) || "exp.wg.spotify.com".equals(str) || "wgint.spotify.net".equals(str)) {
            return true;
        }
        if (!this.a.b() || !((String) this.a.a("")).equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }
}
