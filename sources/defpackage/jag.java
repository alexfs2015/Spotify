package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.base.Optional;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: jag reason: default package */
public final class jag {
    private final Scheduler a;
    private final jai b;
    private final jbo c;
    private final jbi d;
    private final jbm e;
    private final jal f;

    public jag(jai jai, jbm jbm, jbo jbo, jbi jbi, jal jal, Scheduler scheduler) {
        this.b = jai;
        this.e = jbm;
        this.c = jbo;
        this.d = jbi;
        this.f = jal;
        this.a = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, xgo xgo) {
        Optional optional;
        Optional b2 = this.f.a() ? this.c.b(xgo) : this.c.a(xgo);
        if (b2.b()) {
            optional = this.d.a((Bitmap) b2.c());
            ((Bitmap) b2.c()).recycle();
        } else {
            optional = Optional.e();
        }
        if (!optional.b()) {
            return Single.a(new Throwable());
        }
        Uri uri = (Uri) optional.c();
        Intent a2 = this.f.a() ? this.f.a(str, Optional.e(), uri) : this.f.a(str, uri, (String) fbp.a(xgo.a.f.a("X-Background-Top-Color")), (String) fbp.a(xgo.a.f.a("X-Background-Bottom-Color")));
        this.e.a(uri, a2, 1);
        return Single.b(a2);
    }

    public final Single<Intent> a(String str, String str2) {
        jai jai = this.b;
        return jai.a.a(jai.b, str).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$jag$LeWIFAC7pLyPelDfZcvdrN9Yj1Y<Object,Object>(this, str2)).b(this.a);
    }
}
