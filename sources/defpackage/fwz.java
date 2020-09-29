package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.spotify.android.glue.gradients.GlueGradients;
import com.spotify.android.glue.gradients.GlueGradients.Style;

/* renamed from: fwz reason: default package */
public final class fwz {
    public static fxa a(Context context, int i) {
        return a((Drawable) new ColorDrawable(i), (Drawable) new fwy(context));
    }

    public static fxa a(Context context, Style style) {
        return a((Drawable) GlueGradients.a(context, style, false), (Drawable) new fwy(context));
    }

    public static fxa a(Drawable drawable, Drawable drawable2) {
        return new fxa(new Drawable[]{drawable, drawable2});
    }
}
