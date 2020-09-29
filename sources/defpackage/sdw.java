package defpackage;

import android.app.Application;

/* renamed from: sdw reason: default package */
public final class sdw implements wig<sdv> {
    private final wzi<Application> a;

    private sdw(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static sdw a(wzi<Application> wzi) {
        return new sdw(wzi);
    }

    public final /* synthetic */ Object get() {
        return new sdv((Application) this.a.get());
    }
}
