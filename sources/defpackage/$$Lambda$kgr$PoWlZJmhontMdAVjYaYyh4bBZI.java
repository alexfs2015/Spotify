package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$kgr$PoWlZJmhontMdAVjYaY-yh4bBZI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kgr$PoWlZJmhontMdAVjYaYyh4bBZI implements SingleOnSubscribe {
    private final /* synthetic */ kgr f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$kgr$PoWlZJmhontMdAVjYaYyh4bBZI(kgr kgr, String str, String str2) {
        this.f$0 = kgr;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, singleEmitter);
    }
}
