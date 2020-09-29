package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: ues reason: default package */
public final class ues {
    final uer a;
    a b;
    b c;
    private final wgx d = new wgx() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fbp.a(!bitmap.isRecycled());
            ues ues = ues.this;
            b bVar = new b(ues.a, ues.this.b, bitmap, loadedFrom, 0);
            ues.c = bVar;
            fbp.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            ues.this.b.b(drawable);
        }

        public final void b(Drawable drawable) {
            if (ues.this.c != null) {
                ues.this.c.a = true;
                ues.this.c = null;
            }
            ues.this.b.a(drawable);
        }
    };

    /* renamed from: ues$a */
    public interface a {
        void a(Bitmap bitmap, LoadedFrom loadedFrom, nq nqVar);

        void a(Drawable drawable);

        void b(Drawable drawable);
    }

    /* renamed from: ues$b */
    static class b implements c {
        boolean a;
        private final a b;
        private final Bitmap c;
        private final LoadedFrom d;

        private b(uer uer, a aVar, Bitmap bitmap, LoadedFrom loadedFrom) {
            this.b = aVar;
            this.c = bitmap;
            this.d = loadedFrom;
            uer.generate(bitmap, this);
        }

        /* synthetic */ b(uer uer, a aVar, Bitmap bitmap, LoadedFrom loadedFrom, byte b2) {
            this(uer, aVar, bitmap, loadedFrom);
        }

        public final void a(nq nqVar) {
            if (!this.a) {
                this.b.a(this.c, this.d, nqVar);
            }
        }
    }

    public ues(uer uer) {
        this.a = uer;
    }

    public final wgx a() {
        fbp.b(this.b != null, "Did you forget to set a listener?");
        return this.d;
    }

    public final void a(a aVar) {
        this.b = (a) fbp.a(aVar);
    }
}
