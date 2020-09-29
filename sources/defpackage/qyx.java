package defpackage;

import android.app.Application;

/* renamed from: qyx reason: default package */
public final class qyx implements wig<qyw> {
    private final wzi<Application> a;

    private qyx(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static qyx a(wzi<Application> wzi) {
        return new qyx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qyw((Application) this.a.get());
    }
}
