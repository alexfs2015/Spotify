package defpackage;

import com.google.common.base.Optional;

/* renamed from: uue reason: default package */
public final class uue {
    public static Optional<uua> a(hcj hcj) {
        String string = hcj.string("onDemandPlaylistUri");
        return fbo.a(string) ? Optional.e() : Optional.b(new uua(string, hcj.string("onDemandTrackUri")));
    }
}
