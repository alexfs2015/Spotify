package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: joo reason: default package */
public class joo extends sin implements a {
    public jtd a;

    public static joo c() {
        return new joo();
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public final void ah() {
        ka p = p();
        a a2 = hij.a(p.getIntent().getData());
        Uri uri = a2.b;
        if (!jpo.a(uri)) {
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

    public final void B() {
        super.B();
        jtd jtd = this.a;
        if (jtd != null) {
            jtd.a();
            this.a = null;
        }
    }

    public void onWebTokenUriReady(Uri uri) {
        jtd jtd = this.a;
        if (jtd != null) {
            jtd.a();
            this.a = null;
        }
        if (uri == null) {
            Logger.c("Not ready to load web, web token null", new Object[0]);
            return;
        }
        if (p() != null) {
            p().runOnUiThread(new $$Lambda$joo$JF2a7IOp3G2yXKk1xOjwHK1grks(this, uri));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Uri uri) {
        d(uri.toString());
    }

    public final boolean a(Uri uri) {
        if (!jst.h(uri.toString())) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(uri);
        a(intent);
        return true;
    }
}
