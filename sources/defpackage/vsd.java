package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: vsd reason: default package */
public final class vsd {
    private final vso a;
    private final Context b;

    public vsd(vso vso, Context context) {
        this.a = (vso) fay.a(vso);
        this.b = (Context) fay.a(context.getApplicationContext());
    }

    public final vsl a(Uri uri) {
        if (uri != null) {
            a("uri_started", uri.toString());
        }
        return a(this.a.a(uri), uri);
    }

    private vsl a(vsl vsl, Uri uri) {
        return new vsc(this.a.a, new $$Lambda$vsd$2OdiO_d85RNO_RvARIA_0gDsJT0(this), vsl, uri);
    }

    /* access modifiers changed from: private */
    public Void a(String str, String str2) {
        Intent intent = new Intent("image-load-event");
        intent.putExtra("event", str);
        intent.putExtra("uri", str2);
        mc.a(this.b).a(intent);
        return null;
    }
}
