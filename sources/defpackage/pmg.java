package defpackage;

import com.spotify.music.features.preloadnotification.conditions.PreloadedPartner;

/* renamed from: pmg reason: default package */
final class pmg implements plz {
    private final vos a;

    public pmg(vos vos) {
        this.a = vos;
    }

    public final boolean a() {
        return this.a.d() && PreloadedPartner.a(this.a.b());
    }
}
