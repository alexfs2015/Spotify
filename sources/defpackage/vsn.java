package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: vsn reason: default package */
public final class vsn extends vsm {
    private final Context a;

    public vsn(Context context) {
        this.a = context;
    }

    public final boolean a(vsk vsk) {
        if (vsk.e != 0) {
            return true;
        }
        return "android.resource".equals(vsk.d.getScheme());
    }

    public final a a(vsk vsk, int i) {
        Resources a2 = vsv.a(this.a, vsk);
        int a3 = vsv.a(a2, vsk);
        Options c = c(vsk);
        if (a(c)) {
            BitmapFactory.decodeResource(a2, a3, c);
            a(vsk.h, vsk.i, c, vsk);
        }
        return new a(BitmapFactory.decodeResource(a2, a3, c), LoadedFrom.DISK);
    }
}
