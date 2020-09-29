package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: lxv reason: default package */
public final class lxv implements wgx {
    final Picasso a;
    final xok b = new xok();
    boolean c;
    private final a d;
    private final hhc e;

    /* renamed from: lxv$a */
    public interface a {
        void a(byte[] bArr);
    }

    public lxv(a aVar, Picasso picasso, hhc hhc) {
        this.d = aVar;
        this.a = picasso;
        this.e = hhc;
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fbp.a(!bitmap.isRecycled());
        if (!this.c) {
            xok xok = this.b;
            xii a2 = ScalarSynchronousObservable.d(bitmap).b(wit.a(this.e.b())).e((xiy<? super T, ? extends R>) new $$Lambda$lxv$pRAX5TY2MYPdBLN78kNmsWAXwlI<Object,Object>(bitmap)).a(wit.a(this.e.c()));
            a aVar = this.d;
            aVar.getClass();
            xok.a(a2.a((xis<? super T>) new $$Lambda$utyY9PYPErx4fErEogmH9NcKgWE<Object>(aVar), (xis<Throwable>) $$Lambda$lxv$JqgRp6Mzlk3I0jxvhe1w5TAKQsg.INSTANCE));
        }
        fbp.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        Logger.b("Failed to load image", new Object[0]);
    }

    public final void b(Drawable drawable) {
    }
}
