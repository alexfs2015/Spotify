package defpackage;

import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;

/* renamed from: -$$Lambda$jyhbtmQSyScYHdhmRCdqvDOkkAU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jyhbtmQSyScYHdhmRCdqvDOkkAU implements xis {
    private final /* synthetic */ JsonCallbackReceiver f$0;

    public /* synthetic */ $$Lambda$jyhbtmQSyScYHdhmRCdqvDOkkAU(JsonCallbackReceiver jsonCallbackReceiver) {
        this.f$0 = jsonCallbackReceiver;
    }

    public final void call(Object obj) {
        this.f$0.sendOnError((Throwable) obj);
    }
}
