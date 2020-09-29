package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: wgt reason: default package */
public final class wgt extends wgs {
    private final Context a;

    public wgt(Context context) {
        this.a = context;
    }

    public final a a(wgq wgq, int i) {
        Resources a2 = whb.a(this.a, wgq);
        int a3 = whb.a(a2, wgq);
        Options c = c(wgq);
        if (a(c)) {
            BitmapFactory.decodeResource(a2, a3, c);
            a(wgq.h, wgq.i, c, wgq);
        }
        return new a(BitmapFactory.decodeResource(a2, a3, c), LoadedFrom.DISK);
    }

    public final boolean a(wgq wgq) {
        if (wgq.e != 0) {
            return true;
        }
        return "android.resource".equals(wgq.d.getScheme());
    }
}
