package defpackage;

import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;

/* renamed from: -$$Lambda$ilb$vjtL-WLlivaz5_JSi5aAHKbbwBA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ilb$vjtLWLlivaz5_JSi5aAHKbbwBA implements CompletableOnSubscribe {
    private final /* synthetic */ ilb f$0;
    private final /* synthetic */ kxn f$1;

    public /* synthetic */ $$Lambda$ilb$vjtLWLlivaz5_JSi5aAHKbbwBA(ilb ilb, kxn kxn) {
        this.f$0 = ilb;
        this.f$1 = kxn;
    }

    public final void subscribe(CompletableEmitter completableEmitter) {
        this.f$0.a(this.f$1, completableEmitter);
    }
}
