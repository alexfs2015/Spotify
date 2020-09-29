package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.Random;

/* renamed from: hgb reason: default package */
public final class hgb implements vua<hga> {
    private final wlc<Context> a;
    private final wlc<NotificationManager> b;
    private final wlc<Random> c;

    private hgb(wlc<Context> wlc, wlc<NotificationManager> wlc2, wlc<Random> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hgb a(wlc<Context> wlc, wlc<NotificationManager> wlc2, wlc<Random> wlc3) {
        return new hgb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hga((Context) this.a.get(), (NotificationManager) this.b.get(), (Random) this.c.get());
    }
}
