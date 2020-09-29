package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;

/* renamed from: -$$Lambda$iPgCfqEATWeTQBMrIam_PVWt1XY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iPgCfqEATWeTQBMrIam_PVWt1XY implements wun {
    private final /* synthetic */ JsonCallbackReceiver f$0;

    public /* synthetic */ $$Lambda$iPgCfqEATWeTQBMrIam_PVWt1XY(JsonCallbackReceiver jsonCallbackReceiver) {
        this.f$0 = jsonCallbackReceiver;
    }

    public final void call(Object obj) {
        this.f$0.sendOnResolved((Response) obj);
    }
}
