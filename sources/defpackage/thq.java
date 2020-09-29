package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: thq reason: default package */
public final class thq {
    private final iga a;
    private Ad b;
    private final tbt c;
    private final thp d;

    public thq(tbt tbt, thp thp, iga iga) {
        this.c = tbt;
        this.d = thp;
        this.a = iga;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Ad ad) {
        this.b = ad;
    }

    public final void a() {
        this.d.a((a<T>) new $$Lambda$thq$haKrWAQQlUXnh8W8EvgbncFD38I<T>(this));
        this.c.a((a<T>) new $$Lambda$thq$K9laSo06MR9dFrFl_JqyEdHslg8<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        iga iga = this.a;
        String str = z ? "unobscured" : "obscured";
        Ad ad = this.b;
        iga.a(str, ad != null ? ad.id() : "");
    }
}
