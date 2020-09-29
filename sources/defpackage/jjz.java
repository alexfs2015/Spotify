package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: jjz reason: default package */
public final class jjz {
    rzt a;
    final iiw b;
    xip c;
    private final xii<String> d;

    public jjz(xii<String> xii, rzt rzt, iiw iiw) {
        this.d = xii;
        this.a = rzt;
        this.b = iiw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        rzt rzt = this.a;
        a aVar = new a("bluetooth");
        aVar.b(rzt.d);
        aVar.c(str);
        aVar.e(rzt.g);
        aVar.d(rzt.f);
        aVar.a(rzt.c);
        this.a = aVar.a();
        try {
            this.b.a(this.a);
        } catch (JsonProcessingException e) {
            Assertion.a("Could not connect BT as external accessory", (Throwable) e);
        }
    }

    public final void a() {
        this.c = this.d.i($$Lambda$jjz$PZq_ij1k0stP8cWuBnzLMk6FxA.INSTANCE).a((xis<? super T>) new $$Lambda$jjz$2p08lN6sglTyKIJTtE8qtECUU0Q<Object>(this), (xis<Throwable>) $$Lambda$jjz$SD4ldg75pGUOxC6TmzhRABWOmjU.INSTANCE);
    }
}
