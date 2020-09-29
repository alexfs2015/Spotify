package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: wfv reason: default package */
public abstract class wfv<T> {
    public final Picasso a;
    public final wgq b;
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

    /* renamed from: wfv$a */
    public static class a<M> extends WeakReference<M> {
        public final wfv a;

        public a(wfv wfv, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.a = wfv;
        }
    }

    wfv(Picasso picasso, T t, wgq wgq, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        this.a = picasso;
        this.b = wgq;
        this.c = t == null ? null : new a<>(this, t, picasso.i);
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

    public abstract void a();

    public abstract void a(Bitmap bitmap, LoadedFrom loadedFrom);

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
