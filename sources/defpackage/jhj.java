package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: jhj reason: default package */
public final class jhj {
    rqi a;
    final igj b;
    wuk c;
    private final wud<String> d;

    public jhj(wud<String> wud, rqi rqi, igj igj) {
        this.d = wud;
        this.a = rqi;
        this.b = igj;
    }

    public final void a() {
        this.c = this.d.j($$Lambda$jhj$pYyoG2oVUaSuNk1nFtmbzk52xbM.INSTANCE).a((wun<? super T>) new $$Lambda$jhj$VGTFs9IRBn1AOajG6n20jkFaPo<Object>(this), (wun<Throwable>) $$Lambda$jhj$1_9RaUebLMV79pXBTNf4hxeAtg4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        rqi rqi = this.a;
        a aVar = new a("bluetooth");
        aVar.b(rqi.d);
        aVar.c(str);
        aVar.e(rqi.g);
        aVar.d(rqi.f);
        aVar.a(rqi.c);
        this.a = aVar.a();
        try {
            this.b.a(this.a);
        } catch (JsonProcessingException e) {
            Assertion.a("Could not connect BT as external accessory", (Throwable) e);
        }
    }
}
