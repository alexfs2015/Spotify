package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.spotify.android.glue.gradients.GlueGradients;
import com.spotify.android.glue.gradients.GlueGradients.Style;

/* renamed from: fwf reason: default package */
public final class fwf {
    public static fwg a(Context context, Style style) {
        return a((Drawable) GlueGradients.a(context, style, false), (Drawable) new fwe(context));
    }

    public static fwg a(Context context, int i) {
        return a((Drawable) new ColorDrawable(i), (Drawable) new fwe(context));
    }

    public static fwg a(Drawable drawable, Drawable drawable2) {
        return new fwg(new Drawable[]{drawable, drawable2});
    }
}
