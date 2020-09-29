package defpackage;

import com.spotify.music.internal.util.process.ProcessType;

/* renamed from: kmc reason: default package */
public final class kmc implements vua<kmb> {
    private final wlc<glm> a;
    private final wlc<rwp> b;
    private final wlc<ProcessType> c;

    private kmc(wlc<glm> wlc, wlc<rwp> wlc2, wlc<ProcessType> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kmc a(wlc<glm> wlc, wlc<rwp> wlc2, wlc<ProcessType> wlc3) {
        return new kmc(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new kmb((glm) this.a.get(), (rwp) this.b.get(), (ProcessType) this.c.get());
    }
}
