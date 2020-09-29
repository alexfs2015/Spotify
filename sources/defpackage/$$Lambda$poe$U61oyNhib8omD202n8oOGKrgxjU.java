package defpackage;

import io.reactivex.Completable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$poe$U61oyNhib8omD202n8oOGKrgxjU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$poe$U61oyNhib8omD202n8oOGKrgxjU implements Function {
    private final /* synthetic */ Consumer f$0;

    public /* synthetic */ $$Lambda$poe$U61oyNhib8omD202n8oOGKrgxjU(Consumer consumer) {
        this.f$0 = consumer;
    }

    public final Object apply(Object obj) {
        return Completable.a((Action) new $$Lambda$poe$Erh6y9r9cRkCw5LBGTeTXO3JlY(this.f$0, (ho) obj));
    }
}
