package defpackage;

import android.app.Activity;

/* renamed from: mjb reason: default package */
public final class mjb implements wig<mja> {
    private final wzi<Activity> a;

    private mjb(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static mjb a(wzi<Activity> wzi) {
        return new mjb(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mja((Activity) this.a.get());
    }
}
