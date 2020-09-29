package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.Random;

/* renamed from: hix reason: default package */
public final class hix implements wig<hiw> {
    private final wzi<Context> a;
    private final wzi<NotificationManager> b;
    private final wzi<Random> c;

    private hix(wzi<Context> wzi, wzi<NotificationManager> wzi2, wzi<Random> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hix a(wzi<Context> wzi, wzi<NotificationManager> wzi2, wzi<Random> wzi3) {
        return new hix(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hiw((Context) this.a.get(), (NotificationManager) this.b.get(), (Random) this.c.get());
    }
}
