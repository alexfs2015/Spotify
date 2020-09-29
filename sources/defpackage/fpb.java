package defpackage;

import android.app.Activity;

/* renamed from: fpb reason: default package */
public final class fpb implements vua<foz> {
    private final wlc<Activity> a;
    private final wlc<fpe> b;
    private final wlc<fpa> c;

    public static foz a(Activity activity, fpe fpe, fpa fpa) {
        return new foz(activity, fpe, fpa);
    }

    public final /* synthetic */ Object get() {
        return new foz((Activity) this.a.get(), (fpe) this.b.get(), (fpa) this.c.get());
    }
}
