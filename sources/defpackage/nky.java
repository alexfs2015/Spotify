package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: nky reason: default package */
public final class nky implements wig<View> {
    private final wzi<Context> a;

    private nky(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static nky a(wzi<Context> wzi) {
        return new nky(wzi);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        View view = new View(context);
        view.setLayoutParams(new LayoutParams(-1, vfj.b(240.0f, context.getResources())));
        return (View) wil.a(view, "Cannot return null from a non-@Nullable @Provides method");
    }
}
