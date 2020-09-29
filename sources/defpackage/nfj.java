package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: nfj reason: default package */
public final class nfj implements vua<View> {
    private final wlc<Context> a;

    private nfj(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static nfj a(wlc<Context> wlc) {
        return new nfj(wlc);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        View view = new View(context);
        view.setLayoutParams(new LayoutParams(-1, uts.b(240.0f, context.getResources())));
        return (View) vuf.a(view, "Cannot return null from a non-@Nullable @Provides method");
    }
}
