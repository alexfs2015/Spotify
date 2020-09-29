package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;

/* renamed from: -$$Lambda$7Twshdp5iwAqzIfBhtYvEek8ya4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$7Twshdp5iwAqzIfBhtYvEek8ya4 implements xis {
    private final /* synthetic */ JsonCallbackReceiver f$0;

    public /* synthetic */ $$Lambda$7Twshdp5iwAqzIfBhtYvEek8ya4(JsonCallbackReceiver jsonCallbackReceiver) {
        this.f$0 = jsonCallbackReceiver;
    }

    public final void call(Object obj) {
        this.f$0.sendOnResolved((Response) obj);
    }
}
