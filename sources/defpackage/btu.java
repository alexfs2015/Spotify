package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: btu reason: default package */
final class btu implements a {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ btt b;

    btu(btt btt, BasePendingResult basePendingResult) {
        this.b = btt;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
