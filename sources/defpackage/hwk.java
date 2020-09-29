package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* renamed from: hwk reason: default package */
public final class hwk implements wig<hwj> {
    private final wzi<Context> a;
    private final wzi<NotificationManager> b;

    private hwk(wzi<Context> wzi, wzi<NotificationManager> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hwk a(wzi<Context> wzi, wzi<NotificationManager> wzi2) {
        return new hwk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hwj((Context) this.a.get(), (NotificationManager) this.b.get());
    }
}
