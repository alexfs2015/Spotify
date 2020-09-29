package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: ude reason: default package */
public final class ude implements fqy {
    public final udf a;
    public final ues b = new ues(uer.a);
    public uds c;
    public final wgx d = new wgx() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fbp.a(!bitmap.isRecycled());
            boolean z = loadedFrom != LoadedFrom.MEMORY;
            uds a2 = ude.this.c;
            a2.c = a2.a.a(a2.c, new c(bitmap, z));
            a2.b.a(a2.c);
            fbp.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            uds a2 = ude.this.c;
            a2.c = a2.a.a(a2.c, new b());
            a2.b.a(a2.c);
        }

        public final void b(Drawable drawable) {
            uds a2 = ude.this.c;
            a2.c = a2.a.a(a2.c, new d());
            a2.b.a(a2.c);
        }
    };
    private final a e = new a() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom, nq nqVar) {
            int a2 = ueu.a(nqVar, -11316397);
            int i = 855638016;
            if (vgp.b(855638016, a2) <= vgp.b(872415231, a2)) {
                i = 872415231;
            }
            boolean z = loadedFrom != LoadedFrom.MEMORY;
            uds a3 = ude.this.c;
            a3.c = a3.a.a(a3.c, new f(bitmap, z, a2, i));
            a3.b.a(a3.c);
        }

        public final void a(Drawable drawable) {
            uds a2 = ude.this.c;
            a2.c = a2.a.a(a2.c, new g());
            a2.b.a(a2.c);
        }

        public final void b(Drawable drawable) {
            uds a2 = ude.this.c;
            a2.c = a2.a.a(a2.c, new e());
            a2.b.a(a2.c);
        }
    };

    private ude(udc udc, Context context, ViewGroup viewGroup) {
        this.b.a(this.e);
        this.a = new udg(udc, context, viewGroup);
        fqz.a(this);
    }

    public static ude a(udc udc, Context context, ViewGroup viewGroup) {
        return new ude(udc, context, viewGroup);
    }

    public final View getView() {
        return this.a.a();
    }
}
