package defpackage;

import android.app.Application;
import android.os.Handler;

/* renamed from: sfx reason: default package */
public final class sfx implements wig<sgb> {
    private final wzi<gnd> a;
    private final wzi<gnk> b;
    private final wzi<Handler> c;
    private final wzi<Application> d;

    private sfx(wzi<gnd> wzi, wzi<gnk> wzi2, wzi<Handler> wzi3, wzi<Application> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static sfx a(wzi<gnd> wzi, wzi<gnk> wzi2, wzi<Handler> wzi3, wzi<Application> wzi4) {
        return new sfx(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (sgb) wil.a(new sgb((gnd) this.a.get(), (gnk) this.b.get(), (Handler) this.c.get(), ((Application) this.d.get()).getApplicationContext()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
