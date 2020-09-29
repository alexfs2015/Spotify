package defpackage;

import com.google.common.base.Optional;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;

/* renamed from: pze reason: default package */
public final class pze {
    public static ObservableTransformer<pza, pzb> a(pyt pyt, pzo pzo) {
        return kok.a().a(a.class, (ObservableTransformer<G, E>) new $$Lambda$pze$iMoG9bwUqLWKIMt2SUMSYNDoGpQ<G,E>(pyt)).a(b.class, (Consumer<G>) new $$Lambda$pze$4n1d0Rh1vdeVBoh4aI7rWnrG4<G>(pzo)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pzb a(a aVar, Optional optional) {
        if (optional.b()) {
            return new f((qag) fbp.a(((ho) optional.c()).a), (pxx) fbp.a(((ho) optional.c()).b));
        }
        return pzb.a(String.format("No message found with creative id %s.", new Object[]{aVar.c}));
    }
}
