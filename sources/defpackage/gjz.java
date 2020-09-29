package defpackage;

import com.google.common.base.Optional;

/* renamed from: gjz reason: default package */
public final class gjz {
    public Optional<String> a = Optional.e();

    public final boolean a(xaj xaj) {
        if (!xaj.a.c()) {
            return false;
        }
        String str = xaj.a.b;
        if ("spclient.wg.spotify.com".equals(str) || "exp.wg.spotify.com".equals(str) || "wgint.spotify.net".equals(str)) {
            return true;
        }
        return this.a.b() && ((String) this.a.a("")).equalsIgnoreCase(str);
    }
}
