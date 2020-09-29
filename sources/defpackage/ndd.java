package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: ndd reason: default package */
public final class ndd implements wig<ndc> {
    private final wzi<rpu> a;
    private final wzi<gmm<HubsJsonViewModel>> b;
    private final wzi<rog> c;
    private final wzi<Boolean> d;

    private ndd(wzi<rpu> wzi, wzi<gmm<HubsJsonViewModel>> wzi2, wzi<rog> wzi3, wzi<Boolean> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ndd a(wzi<rpu> wzi, wzi<gmm<HubsJsonViewModel>> wzi2, wzi<rog> wzi3, wzi<Boolean> wzi4) {
        return new ndd(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ndc((rpu) this.a.get(), (gmm) this.b.get(), this.c, ((Boolean) this.d.get()).booleanValue());
    }
}
