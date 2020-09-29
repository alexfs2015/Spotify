package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;

/* renamed from: ddf reason: default package */
final class ddf {
    private final Object a;
    private final int b;

    ddf(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ddf)) {
            return false;
        }
        ddf ddf = (ddf) obj;
        return this.a == ddf.a && this.b == ddf.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * AudioDriver.SPOTIFY_MAX_VOLUME) + this.b;
    }
}
