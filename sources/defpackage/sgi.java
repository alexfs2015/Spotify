package defpackage;

import com.spotify.music.libs.search.rx.requests.SearchRequestFactory;
import com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType;

/* renamed from: sgi reason: default package */
public final class sgi implements vua<SearchRequestFactory> {
    private final wlc<SearchRequestType> a;
    private final wlc<sbb> b;

    private sgi(wlc<SearchRequestType> wlc, wlc<sbb> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sgi a(wlc<SearchRequestType> wlc, wlc<sbb> wlc2) {
        return new sgi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new SearchRequestFactory((SearchRequestType) this.a.get(), (sbb) this.b.get());
    }
}
