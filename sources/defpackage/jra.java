package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: jra reason: default package */
public class jra extends ssu implements a {
    public jvj a;

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Uri uri) {
        d(uri.toString());
    }

    public static jra c() {
        return new jra();
    }

    public final void B() {
        super.B();
        jvj jvj = this.a;
        if (jvj != null) {
            jvj.a();
            this.a = null;
        }
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final boolean a(Uri uri) {
        if (!jva.h(uri.toString())) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(uri);
        a(intent);
        return true;
    }

    public final void ah() {
        kf p = p();
        a a2 = hld.a(p.getIntent().getData());
        Uri uri = a2.b;
        if (!jsa.a(uri)) {
            StringBuilder sb = new StringBuilder("Initial uri is not deemed secure, aborting. ");
            sb.append(uri);
            Assertion.b(sb.toString());
            p.finish();
        } else if (a2.a) {
            this.a.a(uri.toString(), this);
        } else {
            d(uri.toString());
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public void onWebTokenUriReady(Uri uri) {
        jvj jvj = this.a;
        if (jvj != null) {
            jvj.a();
            this.a = null;
        }
        if (uri == null) {
            Logger.c("Not ready to load web, web token null", new Object[0]);
            return;
        }
        if (p() != null) {
            p().runOnUiThread(new $$Lambda$jra$brasbHUpI_8OMlOTbmrBqc_7Xc(this, uri));
        }
    }
}
