package defpackage;

import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;

/* renamed from: -$$Lambda$kgr$aJH42DauUn7QOUor-vrQ61acp-I reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kgr$aJH42DauUn7QOUorvrQ61acpI implements CompletableOnSubscribe {
    private final /* synthetic */ kgr f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$kgr$aJH42DauUn7QOUorvrQ61acpI(kgr kgr, String str, String str2) {
        this.f$0 = kgr;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final void subscribe(CompletableEmitter completableEmitter) {
        this.f$0.a(this.f$1, this.f$2, completableEmitter);
    }
}
