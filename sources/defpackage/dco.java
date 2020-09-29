package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;

/* renamed from: dco reason: default package */
final class dco {
    private final Object a;
    private final int b;

    dco(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dco)) {
            return false;
        }
        dco dco = (dco) obj;
        return this.a == dco.a && this.b == dco.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * AudioDriver.SPOTIFY_MAX_VOLUME) + this.b;
    }
}
