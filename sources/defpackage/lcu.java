package defpackage;

import android.app.Activity;
import android.view.Window;

/* renamed from: lcu reason: default package */
public final class lcu implements wig<Window> {
    private final wzi<Activity> a;

    private lcu(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static lcu a(wzi<Activity> wzi) {
        return new lcu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Window) wil.a(((Activity) this.a.get()).getWindow(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
