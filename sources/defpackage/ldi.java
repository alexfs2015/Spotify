package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: ldi reason: default package */
public final class ldi implements wig<mh> {
    private final wzi<Application> a;

    private ldi(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static ldi a(wzi<Application> wzi) {
        return new ldi(wzi);
    }

    public final /* synthetic */ Object get() {
        return (mh) wil.a(mh.a((Context) (Application) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
