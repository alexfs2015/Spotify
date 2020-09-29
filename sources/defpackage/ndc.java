package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: ndc reason: default package */
public final class ndc {
    private final rpu a;
    private final gmm<HubsJsonViewModel> b;
    private final wzi<rog> c;
    private final boolean d;

    public ndc(rpu rpu, gmm<HubsJsonViewModel> gmm, wzi<rog> wzi, boolean z) {
        this.a = rpu;
        this.b = gmm;
        this.c = wzi;
        this.d = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Uri uri) {
        return this.b.resolve(RequestBuilder.get(uri.toString()).build());
    }

    public final xii<hcs> a(String str) {
        return this.d ? wit.a((xfk<T>) ((rog) this.c.get()).a()) : wit.a((xfk<T>) this.a.a(str)).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$ndc$sFbMNmTEsU3Suog2Tt9qhaFNBtE<Object,Object>(this)).a(hcs.class);
    }
}
