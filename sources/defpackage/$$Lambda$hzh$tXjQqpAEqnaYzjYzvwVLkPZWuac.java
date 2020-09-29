package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$hzh$tXjQqpAEqnaYzjYzvwVLkPZWuac reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hzh$tXjQqpAEqnaYzjYzvwVLkPZWuac implements Action {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$hzh$tXjQqpAEqnaYzjYzvwVLkPZWuac(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final void run() {
        Logger.b("Ad Event Reported Successfully: %s, %s", this.f$0, this.f$1);
    }
}
