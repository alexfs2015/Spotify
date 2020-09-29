package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: trb reason: default package */
public final class trb implements fqe {
    public final trc a;
    public final tsp b = new tsp(tso.a);
    public trp c;
    public final vsr d = new vsr() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fay.a(!bitmap.isRecycled());
            boolean z = loadedFrom != LoadedFrom.MEMORY;
            trp a2 = trb.this.c;
            a2.c = a2.a.a(a2.c, new c(bitmap, z));
            a2.b.a(a2.c);
            fay.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            trp a2 = trb.this.c;
            a2.c = a2.a.a(a2.c, new b());
            a2.b.a(a2.c);
        }

        public final void b(Drawable drawable) {
            trp a2 = trb.this.c;
            a2.c = a2.a.a(a2.c, new d());
            a2.b.a(a2.c);
        }
    };
    private final a e = new a() {
        public final void b(Drawable drawable) {
            trp a2 = trb.this.c;
            a2.c = a2.a.a(a2.c, new e());
            a2.b.a(a2.c);
        }

        public final void a(Drawable drawable) {
            trp a2 = trb.this.c;
            a2.c = a2.a.a(a2.c, new g());
            a2.b.a(a2.c);
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom, nl nlVar) {
            int a2 = tsr.a(nlVar, -11316397);
            int i = 855638016;
            if (uuy.b(855638016, a2) <= uuy.b(872415231, a2)) {
                i = 872415231;
            }
            boolean z = loadedFrom != LoadedFrom.MEMORY;
            trp a3 = trb.this.c;
            a3.c = a3.a.a(a3.c, new f(bitmap, z, a2, i));
            a3.b.a(a3.c);
        }
    };

    public static trb a(tqz tqz, Context context, ViewGroup viewGroup) {
        return new trb(tqz, context, viewGroup);
    }

    private trb(tqz tqz, Context context, ViewGroup viewGroup) {
        this.b.a(this.e);
        this.a = new trd(tqz, context, viewGroup);
        fqf.a(this);
    }

    public final View getView() {
        return this.a.a();
    }
}
