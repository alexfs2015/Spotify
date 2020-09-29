package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: cu reason: default package */
public final class cu extends Resources {
    private static boolean a;
    private final WeakReference<Context> b;

    public cu(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.b = new WeakReference<>(context);
    }

    public static boolean a() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final Drawable a(int i) {
        return super.getDrawable(i);
    }

    public final Drawable getDrawable(int i) {
        Context context = (Context) this.b.get();
        return context != null ? cg.a().a(context, this, i) : super.getDrawable(i);
    }
}
