package defpackage;

import com.google.common.base.Optional;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;

/* renamed from: pqi reason: default package */
public final class pqi {
    public static ObservableTransformer<pqe, pqf> a(ppx ppx, pqs pqs) {
        return klb.a().a(a.class, (ObservableTransformer<G, E>) new $$Lambda$pqi$IwbuT_o9cxOtSW5qD04jDgQ0L6E<G,E>(ppx)).a(b.class, (Consumer<G>) new $$Lambda$pqi$pQANZoX50_OuPXzbBrXSkyFZdk0<G>(pqs)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pqf a(a aVar, Optional optional) {
        if (optional.b()) {
            return new f((prk) fay.a(((ho) optional.c()).a), (ppb) fay.a(((ho) optional.c()).b));
        }
        return pqf.a(String.format("No message found with creative id %s.", new Object[]{aVar.c}));
    }
}
