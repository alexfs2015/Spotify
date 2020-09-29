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

@cfp
/* renamed from: bjw reason: default package */
public final class bjw extends dqv {
    /* access modifiers changed from: private */
    public final cpp a;
    private final dpt b;
    /* access modifiers changed from: private */
    public final Future<dio> c = cms.a((Callable<T>) new bjz<T>(this));
    /* access modifiers changed from: private */
    public final Context d;
    private final bkb e;
    /* access modifiers changed from: private */
    public WebView f = new WebView(this.d);
    /* access modifiers changed from: private */
    public dqj g;
    /* access modifiers changed from: private */
    public dio h;
    private AsyncTask<Void, Void, String> i;

    public bjw(Context context, dpt dpt, String str, cpp cpp) {
        this.d = context;
        this.a = cpp;
        this.b = dpt;
        this.e = new bkb(str);
        a(0);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.setWebViewClient(new bjx(this));
        this.f.setOnTouchListener(new bjy(this));
    }

    static /* synthetic */ void b(bjw bjw, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        bjw.d.startActivity(intent);
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
            cpn.a(5);
        }
        return parse.toString();
    }

    public final String D() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final drd E() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final dqj F() {
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

    public final void a(cdg cdg) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(cdm cdm, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(cjn cjn) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dpt dpt) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void a(dqg dqg) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dqj dqj) {
        this.g = dqj;
    }

    public final void a(dqz dqz) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(drd drd) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(drj drj) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(drw drw) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dsp dsp) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dty dty) {
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
            dqe.a();
            return cpc.a(this.d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void b(boolean z) {
    }

    public final boolean b(dpp dpp) {
        bxo.a(this.f, (Object) "This Search Ad has already been torn down");
        bkb bkb = this.e;
        cpp cpp = this.a;
        bkb.c = dpp.j.a;
        Bundle bundle = dpp.m != null ? dpp.m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) dqe.f().a(dtg.cw);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    bkb.d = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    bkb.b.put(str2.substring(4), bundle.getString(str2));
                }
            }
            bkb.b.put("SDKVersion", cpp.a);
        }
        this.i = new bka(this, 0).execute(new Void[0]);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final String c() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) dqe.f().a(dtg.cv));
        builder.appendQueryParameter("query", this.e.c);
        builder.appendQueryParameter("pubId", this.e.a);
        Map<String, String> map = this.e.b;
        for (String str : map.keySet()) {
            builder.appendQueryParameter(str, (String) map.get(str));
        }
        Uri build = builder.build();
        dio dio = this.h;
        if (dio != null) {
            try {
                build = dio.a(build, this.d, null, false, null, null);
            } catch (zzcj unused) {
                cpn.a(5);
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

    public final void c(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: 0000 */
    public final String d() {
        String str = this.e.d;
        if (TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) dqe.f().a(dtg.cv);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("https://");
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public final void j() {
        bxo.b("destroy must be called on the main UI thread.");
        this.i.cancel(true);
        this.c.cancel(true);
        this.f.destroy();
        this.f = null;
    }

    public final cbi k() {
        bxo.b("getAdFrame must be called on the main UI thread.");
        return cbj.a(this.f);
    }

    public final dpt l() {
        return this.b;
    }

    public final boolean m() {
        return false;
    }

    public final void n() {
        throw new IllegalStateException("Unused method");
    }

    public final void o() {
        bxo.b("pause must be called on the main UI thread.");
    }

    public final void p() {
        bxo.b("resume must be called on the main UI thread.");
    }

    public final Bundle q() {
        throw new IllegalStateException("Unused method");
    }

    public final void r() {
    }

    public final boolean s() {
        return false;
    }

    public final drq t() {
        return null;
    }
}
