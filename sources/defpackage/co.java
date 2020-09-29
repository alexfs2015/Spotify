package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: co reason: default package */
final class co extends ch {
    private final WeakReference<Context> a;

    public co(Context context, Resources resources) {
        super(resources);
        this.a = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.a.get();
        if (!(drawable == null || context == null)) {
            cg.a().a(context, i, drawable);
        }
        return drawable;
    }
}
