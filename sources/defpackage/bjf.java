package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzcj;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@cey
/* renamed from: bjf reason: default package */
public final class bjf extends dqe {
    /* access modifiers changed from: private */
    public final coy a;
    private final dpc b;
    /* access modifiers changed from: private */
    public final Future<dhx> c = cmb.a((Callable<T>) new bji<T>(this));
    /* access modifiers changed from: private */
    public final Context d;
    private final bjk e;
    /* access modifiers changed from: private */
    public WebView f = new WebView(this.d);
    /* access modifiers changed from: private */
    public dps g;
    /* access modifiers changed from: private */
    public dhx h;
    private AsyncTask<Void, Void, String> i;

    public bjf(Context context, dpc dpc, String str, coy coy) {
        this.d = context;
        this.a = coy;
        this.b = dpc;
        this.e = new bjk(str);
        a(0);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.setWebViewClient(new bjg(this));
        this.f.setOnTouchListener(new bjh(this));
    }

    public final String D() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final dqm E() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final dps F() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void I() {
        throw new IllegalStateException("Unused method");
    }

    public final String J_() {
        return null;
    }

    public final String a() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (this.f != null) {
            this.f.setLayoutParams(new LayoutParams(-1, i2));
        }
    }

    public final void a(ccp ccp) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(ccv ccv, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(ciw ciw) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dpc dpc) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void a(dpp dpp) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dps dps) {
        this.g = dps;
    }

    public final void a(dqi dqi) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dqm dqm) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dqs dqs) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(drf drf) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dry dry) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dth dth) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: 0000 */
    public final int b(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            dpn.a();
            return col.a(this.d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void b(boolean z) {
    }

    public final void c(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    public final void j() {
        bwx.b("destroy must be called on the main UI thread.");
        this.i.cancel(true);
        this.c.cancel(true);
        this.f.destroy();
        this.f = null;
    }

    public final car k() {
        bwx.b("getAdFrame must be called on the main UI thread.");
        return cas.a(this.f);
    }

    public final dpc l() {
        return this.b;
    }

    public final boolean m() {
        return false;
    }

    public final void n() {
        throw new IllegalStateException("Unused method");
    }

    public final void o() {
        bwx.b("pause must be called on the main UI thread.");
    }

    public final void p() {
        bwx.b("resume must be called on the main UI thread.");
    }

    public final Bundle q() {
        throw new IllegalStateException("Unused method");
    }

    public final void r() {
    }

    public final boolean s() {
        return false;
    }

    public final dqz t() {
        return null;
    }

    public final boolean b(doy doy) {
        bwx.a(this.f, (Object) "This Search Ad has already been torn down");
        bjk bjk = this.e;
        coy coy = this.a;
        bjk.c = doy.j.a;
        Bundle bundle = doy.m != null ? doy.m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) dpn.f().a(dsp.cw);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    bjk.d = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    bjk.b.put(str2.substring(4), bundle.getString(str2));
                }
            }
            bjk.b.put("SDKVersion", coy.a);
        }
        this.i = new bjj(this, 0).execute(new Void[0]);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final String c() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) dpn.f().a(dsp.cv));
        builder.appendQueryParameter("query", this.e.c);
        builder.appendQueryParameter("pubId", this.e.a);
        Map<String, String> map = this.e.b;
        for (String str : map.keySet()) {
            builder.appendQueryParameter(str, (String) map.get(str));
        }
        Uri build = builder.build();
        dhx dhx = this.h;
        if (dhx != null) {
            try {
                build = dhx.a(build, this.d, null, false, null, null);
            } catch (zzcj unused) {
                cow.a(5);
            }
        }
        String d2 = d();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(d2);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final String d() {
        String str = this.e.d;
        if (TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) dpn.f().a(dsp.cv);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("https://");
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public final String c(String str) {
        if (this.h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.h.a(parse, this.d, null, null);
        } catch (zzcj unused) {
            cow.a(5);
        }
        return parse.toString();
    }

    static /* synthetic */ void b(bjf bjf, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        bjf.d.startActivity(intent);
    }
}
