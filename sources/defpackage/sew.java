package defpackage;

import com.spotify.music.libs.search.rx.requests.SearchRequestFactory;

/* renamed from: sew reason: default package */
public final class sew implements vua<sev> {
    private final wlc<SearchRequestFactory> a;

    private sew(wlc<SearchRequestFactory> wlc) {
        this.a = wlc;
    }

    public static sew a(wlc<SearchRequestFactory> wlc) {
        return new sew(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sev((SearchRequestFactory) this.a.get());
    }
}
