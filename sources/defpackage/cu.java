package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: cu reason: default package */
public final class cu extends Resources {
    private static boolean a = false;
    private final WeakReference<Context> b;

    public static boolean a() {
        return false;
    }

    public cu(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.b = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) {
        Context context = (Context) this.b.get();
        if (context != null) {
            return cg.a().a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* access modifiers changed from: 0000 */
    public final Drawable a(int i) {
        return super.getDrawable(i);
    }
}
