package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: rpv reason: default package */
public final class rpv {
    private final hgy a;
    private final String b;
    private final Context c;
    private final kyk d;
    private final sye e;

    public rpv(hgy hgy, String str, Context context, kyk kyk, sye sye) {
        this.a = hgy;
        this.b = str;
        this.c = context;
        this.d = kyk;
        this.e = sye;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Uri a(Uri uri, fqn fqn) {
        String str = "video";
        String str2 = "checkDeviceCapability";
        String str3 = "locale";
        Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("application", "nft").appendQueryParameter("platform", "android").appendQueryParameter("podcast", String.valueOf(isu.b(fqn))).appendQueryParameter(str, String.valueOf(isu.c(fqn))).appendQueryParameter(str2, String.valueOf(jus.c(fqn))).appendQueryParameter(str3, this.b);
        String str4 = "true";
        if (this.d.b(fqn)) {
            appendQueryParameter.appendQueryParameter("under-cap", str4);
        } else {
            sye sye = this.e;
            if (sye.a(fqn)) {
                appendQueryParameter.appendQueryParameter("on-demand-trial", str4);
            }
        }
        if (jvi.c(this.c)) {
            appendQueryParameter.appendQueryParameter("signal", "device_type:tablet");
        }
        return appendQueryParameter.build();
    }

    public final Flowable<Uri> a(Uri uri) {
        fbp.a(uri);
        return this.a.a().c((Function<? super T, ? extends R>) new $$Lambda$rpv$I2CFYjZM_qO_gmcInr9HPcvdaIQ<Object,Object>(this, uri));
    }
}
