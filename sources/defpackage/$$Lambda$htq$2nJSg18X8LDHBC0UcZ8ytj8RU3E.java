package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$htq$2nJSg18X8LDHBC0UcZ8ytj8RU3E reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$htq$2nJSg18X8LDHBC0UcZ8ytj8RU3E implements SingleOnSubscribe {
    private final /* synthetic */ htq f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;
    private final /* synthetic */ htw f$3;

    public /* synthetic */ $$Lambda$htq$2nJSg18X8LDHBC0UcZ8ytj8RU3E(htq htq, String str, String str2, htw htw) {
        this.f$0 = htq;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = htw;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, singleEmitter);
    }
}
