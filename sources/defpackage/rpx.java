package defpackage;

import android.content.Context;

/* renamed from: rpx reason: default package */
public final class rpx implements vua<rpw> {
    private final wlc<Context> a;

    private rpx(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static rpx a(wlc<Context> wlc) {
        return new rpx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rpw((Context) this.a.get());
    }
}
