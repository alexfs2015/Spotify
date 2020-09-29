package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import io.reactivex.SingleEmitter;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ikv$MEdWS1F9IEqJhS0bHI1TL7j4WEw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$MEdWS1F9IEqJhS0bHI1TL7j4WEw implements Consumer {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ SingleEmitter f$2;
    private final /* synthetic */ PlayOptions f$3;

    public /* synthetic */ $$Lambda$ikv$MEdWS1F9IEqJhS0bHI1TL7j4WEw(ikv ikv, String str, SingleEmitter singleEmitter, PlayOptions playOptions) {
        this.f$0 = ikv;
        this.f$1 = str;
        this.f$2 = singleEmitter;
        this.f$3 = playOptions;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, (fqn) obj);
    }
}
