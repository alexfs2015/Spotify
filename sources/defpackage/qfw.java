package defpackage;

import android.app.Activity;

/* renamed from: qfw reason: default package */
public final class qfw implements wig<qkk> {
    private final wzi<Activity> a;
    private final wzi<Boolean> b;

    private qfw(wzi<Activity> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qfw a(wzi<Activity> wzi, wzi<Boolean> wzi2) {
        return new qfw(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (qkk) wil.a(((Boolean) this.b.get()).booleanValue() ? new qkl((Activity) this.a.get()) : new qkm(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
