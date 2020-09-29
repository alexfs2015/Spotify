package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;

/* renamed from: lzl reason: default package */
final class lzl {
    private final a a;

    /* renamed from: lzl$a */
    public static class a {
    }

    public lzl(a aVar) {
        this.a = aVar;
    }

    private static int a(Context context) {
        return gb.b(context.getResources(), R.color.gray_30, null);
    }

    private Drawable a(Context context, String str) {
        int i;
        if (str != null) {
            try {
                i = Color.parseColor(str);
            } catch (IllegalArgumentException e) {
                int a2 = a(context);
                Logger.c(e, "Not supported color: %s", str);
                i = a2;
            }
        } else {
            i = a(context);
        }
        return fwz.a((Drawable) new GradientDrawable(Orientation.TL_BR, new int[]{i, 0}), (Drawable) new fwy(context));
    }

    public final void a(View view, String str) {
        ip.a(view, a(view.getContext(), str));
    }
}
