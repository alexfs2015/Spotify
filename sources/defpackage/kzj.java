package defpackage;

import android.view.LayoutInflater;
import android.view.Window;

/* renamed from: kzj reason: default package */
public final class kzj implements vua<LayoutInflater> {
    private final wlc<Window> a;

    private kzj(wlc<Window> wlc) {
        this.a = wlc;
    }

    public static kzj a(wlc<Window> wlc) {
        return new kzj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (LayoutInflater) vuf.a(((Window) this.a.get()).getLayoutInflater(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
