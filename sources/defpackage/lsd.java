package defpackage;

import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;

/* renamed from: lsd reason: default package */
public final class lsd implements vua<AssistedCurationSearchLogger> {
    private final wlc<jjf> a;

    private lsd(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static lsd a(wlc<jjf> wlc) {
        return new lsd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new AssistedCurationSearchLogger((jjf) this.a.get());
    }
}
