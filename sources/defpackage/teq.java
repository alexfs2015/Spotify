package defpackage;

import android.app.Activity;
import android.view.Display;

/* renamed from: teq reason: default package */
public final class teq implements wig<Display> {
    private final wzi<Activity> a;

    private teq(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static teq a(wzi<Activity> wzi) {
        return new teq(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Display) wil.a(((Activity) this.a.get()).getWindowManager().getDefaultDisplay(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
