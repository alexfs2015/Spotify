package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: tsp reason: default package */
public final class tsp {
    final tso a;
    a b;
    b c;
    private final vsr d = new vsr() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fay.a(!bitmap.isRecycled());
            tsp tsp = tsp.this;
            b bVar = new b(tsp.a, tsp.this.b, bitmap, loadedFrom, 0);
            tsp.c = bVar;
            fay.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            tsp.this.b.b(drawable);
        }

        public final void b(Drawable drawable) {
            if (tsp.this.c != null) {
                tsp.this.c.a = true;
                tsp.this.c = null;
            }
            tsp.this.b.a(drawable);
        }
    };

    /* renamed from: tsp$a */
    public interface a {
        void a(Bitmap bitmap, LoadedFrom loadedFrom, nl nlVar);

        void a(Drawable drawable);

        void b(Drawable drawable);
    }

    /* renamed from: tsp$b */
    static class b implements c {
        boolean a;
        private final a b;
        private final Bitmap c;
        private final LoadedFrom d;

        /* synthetic */ b(tso tso, a aVar, Bitmap bitmap, LoadedFrom loadedFrom, byte b2) {
            this(tso, aVar, bitmap, loadedFrom);
        }

        private b(tso tso, a aVar, Bitmap bitmap, LoadedFrom loadedFrom) {
            this.b = aVar;
            this.c = bitmap;
            this.d = loadedFrom;
            tso.generate(bitmap, this);
        }

        public final void a(nl nlVar) {
            if (!this.a) {
                this.b.a(this.c, this.d, nlVar);
            }
        }
    }

    public tsp(tso tso) {
        this.a = tso;
    }

    public final void a(a aVar) {
        this.b = (a) fay.a(aVar);
    }

    public final vsr a() {
        fay.b(this.b != null, "Did you forget to set a listener?");
        return this.d;
    }
}
