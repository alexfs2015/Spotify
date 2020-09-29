package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: ltw reason: default package */
public final class ltw implements vsr {
    final Picasso a;
    final xag b = new xag();
    boolean c;
    private final a d;
    private final heg e;

    /* renamed from: ltw$a */
    public interface a {
        void a(byte[] bArr);
    }

    public final void b(Drawable drawable) {
    }

    public ltw(a aVar, Picasso picasso, heg heg) {
        this.d = aVar;
        this.a = picasso;
        this.e = heg;
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        fay.a(!bitmap.isRecycled());
        if (!this.c) {
            xag xag = this.b;
            wud a2 = ScalarSynchronousObservable.d(bitmap).b(vun.a(this.e.b())).f(new $$Lambda$ltw$shg95fMQWL0IeWacyZPVCHSovpA(bitmap)).a(vun.a(this.e.c()));
            a aVar = this.d;
            aVar.getClass();
            xag.a(a2.a((wun<? super T>) new $$Lambda$GIWoGXzfTxEXAa6XMn7tQY7ctA<Object>(aVar), (wun<Throwable>) $$Lambda$ltw$l0ZU0ZmP8SmJoroVNpLf2aWpac.INSTANCE));
        }
        fay.a(!bitmap.isRecycled());
    }

    public final void a(Drawable drawable) {
        Logger.b("Failed to load image", new Object[0]);
    }
}
