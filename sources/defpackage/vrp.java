package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: vrp reason: default package */
public abstract class vrp<T> {
    public final Picasso a;
    public final vsk b;
    final WeakReference<T> c;
    final boolean d;
    public final int e;
    final int f;
    final int g;
    final Drawable h;
    public final String i;
    public final Object j;
    public boolean k;
    public boolean l;

    /* renamed from: vrp$a */
    public static class a<M> extends WeakReference<M> {
        public final vrp a;

        public a(vrp vrp, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.a = vrp;
        }
    }

    public abstract void a();

    public abstract void a(Bitmap bitmap, LoadedFrom loadedFrom);

    vrp(Picasso picasso, T t, vsk vsk, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        WeakReference<T> weakReference;
        this.a = picasso;
        this.b = vsk;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new a<>(this, t, picasso.i);
        }
        this.c = weakReference;
        this.e = i2;
        this.f = i3;
        this.d = z;
        this.g = i4;
        this.h = drawable;
        this.i = str;
        if (obj == 0) {
            obj = this;
        }
        this.j = obj;
    }

    public void b() {
        this.l = true;
    }

    public T c() {
        WeakReference<T> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
