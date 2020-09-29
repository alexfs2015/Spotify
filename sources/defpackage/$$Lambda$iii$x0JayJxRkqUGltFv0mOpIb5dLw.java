package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import io.reactivex.SingleEmitter;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$iii$x0JayJxRkqUGltFv0mOpIb5dL-w reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$x0JayJxRkqUGltFv0mOpIb5dLw implements Consumer {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ SingleEmitter f$2;
    private final /* synthetic */ PlayOptions f$3;

    public /* synthetic */ $$Lambda$iii$x0JayJxRkqUGltFv0mOpIb5dLw(iii iii, String str, SingleEmitter singleEmitter, PlayOptions playOptions) {
        this.f$0 = iii;
        this.f$1 = str;
        this.f$2 = singleEmitter;
        this.f$3 = playOptions;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, (fpt) obj);
    }
}
