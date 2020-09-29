package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bve reason: default package */
final class bve implements bvf {
    private final /* synthetic */ bvd a;

    bve(bvd bvd) {
        this.a = bvd;
    }

    public final void a(BasePendingResult<?> basePendingResult) {
        this.a.c.remove(basePendingResult);
    }
}
