package defpackage;

import com.google.common.base.Optional;

/* renamed from: uiq reason: default package */
public final class uiq {
    public static Optional<uim> a(gzq gzq) {
        String string = gzq.string("onDemandPlaylistUri");
        if (fax.a(string)) {
            return Optional.e();
        }
        return Optional.b(new uim(string, gzq.string("onDemandTrackUri")));
    }
}
