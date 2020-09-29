package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: btd reason: default package */
final class btd implements a {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ btc b;

    btd(btc btc, BasePendingResult basePendingResult) {
        this.b = btc;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
