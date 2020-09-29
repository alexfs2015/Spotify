package defpackage;

import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pze$mhUXywc6NxqlPClFr2Z8Bihz8bs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pze$mhUXywc6NxqlPClFr2Z8Bihz8bs implements Function {
    private final /* synthetic */ a f$0;

    public /* synthetic */ $$Lambda$pze$mhUXywc6NxqlPClFr2Z8Bihz8bs(a aVar) {
        this.f$0 = aVar;
    }

    public final Object apply(Object obj) {
        return pzb.a(String.format("Error fetching creative Id %s. %s", new Object[]{this.f$0.c, ((Throwable) obj).getMessage()}));
    }
}
