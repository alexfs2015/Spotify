package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: rgt reason: default package */
public final class rgt {
    private final hec a;
    private final String b;
    private final Context c;
    private final kvb d;
    private final snx e;

    public rgt(hec hec, String str, Context context, kvb kvb, snx snx) {
        this.a = hec;
        this.b = str;
        this.c = context;
        this.d = kvb;
        this.e = snx;
    }

    public final Flowable<Uri> a(Uri uri) {
        fay.a(uri);
        return this.a.a().c((Function<? super T, ? extends R>) new $$Lambda$rgt$ndb7RHFOyk9jK8i9jZQEfnFsP8<Object,Object>(this, uri));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Uri a(Uri uri, fpt fpt) {
        String str = "video";
        String str2 = "checkDeviceCapability";
        String str3 = "locale";
        Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("application", "nft").appendQueryParameter("platform", "android").appendQueryParameter("podcast", String.valueOf(iqh.b(fpt))).appendQueryParameter(str, String.valueOf(iqh.c(fpt))).appendQueryParameter(str2, String.valueOf(jsl.c(fpt))).appendQueryParameter(str3, this.b);
        String str4 = "true";
        if (this.d.b(fpt)) {
            appendQueryParameter.appendQueryParameter("under-cap", str4);
        } else {
            snx snx = this.e;
            if (snx.a(fpt)) {
                appendQueryParameter.appendQueryParameter("on-demand-trial", str4);
            }
        }
        if (jtc.c(this.c)) {
            appendQueryParameter.appendQueryParameter("signal", "device_type:tablet");
        }
        return appendQueryParameter.build();
    }
}
