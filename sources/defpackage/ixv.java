package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.base.Optional;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: ixv reason: default package */
public final class ixv {
    private final Scheduler a;
    private final ixx b;
    private final izd c;
    private final iyx d;
    private final izb e;
    private final iya f;

    public ixv(ixx ixx, izb izb, izd izd, iyx iyx, iya iya, Scheduler scheduler) {
        this.b = ixx;
        this.e = izb;
        this.c = izd;
        this.d = iyx;
        this.f = iya;
        this.a = scheduler;
    }

    public final Single<Intent> a(String str, String str2) {
        ixx ixx = this.b;
        return ixx.a.a(ixx.b, str).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$ixv$aLPxwBXhL5tM1Dy0OcoXNv7tokg<Object,Object>(this, str2)).b(this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, wsj wsj) {
        Optional optional;
        Optional optional2;
        Intent intent;
        if (this.f.a()) {
            optional = this.c.b(wsj);
        } else {
            optional = this.c.a(wsj);
        }
        if (optional.b()) {
            optional2 = this.d.a((Bitmap) optional.c());
            ((Bitmap) optional.c()).recycle();
        } else {
            optional2 = Optional.e();
        }
        if (!optional2.b()) {
            return Single.a(new Throwable());
        }
        Uri uri = (Uri) optional2.c();
        if (this.f.a()) {
            intent = this.f.a(str, Optional.e(), uri);
        } else {
            intent = this.f.a(str, uri, (String) fay.a(wsj.a.f.a("X-Background-Top-Color")), (String) fay.a(wsj.a.f.a("X-Background-Bottom-Color")));
        }
        this.e.a(uri, intent, 1);
        return Single.b(intent);
    }
}
