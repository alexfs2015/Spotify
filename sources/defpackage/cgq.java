package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: cgq reason: default package */
public final class cgq extends clp {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private static final Object b = new Object();
    private static boolean c = false;
    /* access modifiers changed from: private */
    public static eah d = null;
    private static HttpClient e = null;
    /* access modifiers changed from: private */
    public static bfi f = null;
    private static bgl<Object> g = null;
    /* access modifiers changed from: private */
    public final cfa h;
    private final cfv i;
    private final Object k = new Object();
    private final Context l;
    /* access modifiers changed from: private */
    public eau m;
    private dnl n;

    public cgq(Context context, cfv cfv, cfa cfa, dnl dnl) {
        super(0);
        this.h = cfa;
        this.l = context;
        this.i = cfv;
        this.n = dnl;
        synchronized (b) {
            if (!c) {
                f = new bfi();
                e = new HttpClient(context.getApplicationContext(), cfv.j);
                g = new cgy();
                eah eah = new eah(this.l.getApplicationContext(), this.i.j, (String) dpn.f().a(dsp.a), new cgx(), new cgw());
                d = eah;
                c = true;
            }
        }
    }

    protected static void a(dzv dzv) {
        dzv.a("/loadAd", f);
        dzv.a("/fetchHttpRequest", e);
        dzv.a("/invalidRequest", g);
    }

    protected static void b(dzv dzv) {
        dzv.b("/loadAd", f);
        dzv.b("/fetchHttpRequest", e);
        dzv.b("/invalidRequest", g);
    }

    public final void s_() {
        synchronized (this.k) {
            col.a.post(new cgv(this));
        }
    }

    public final void a() {
        cow.a(3);
        String i2 = bjl.B().i(this.l);
        cfu cfu = new cfu(this.i, -1, bjl.B().g(this.l), bjl.B().h(this.l), i2);
        bjl.B().e(this.l, i2);
        cfy a2 = a(cfu);
        cfu cfu2 = cfu;
        cla cla = new cla(cfu2, a2, a2.d, bjl.l().b(), a2.m, this.n);
        col.a.post(new cgr(this, cla));
    }

    private final cfy a(cfu cfu) {
        bjl.e();
        String a2 = cmd.a();
        JSONObject a3 = a(cfu, a2);
        if (a3 == null) {
            return new cfy(0);
        }
        long b2 = bjl.l().b();
        bfi bfi = f;
        cqc cqc = new cqc();
        bfi.a.put(a2, cqc);
        col.a.post(new cgs(this, a3, a2));
        try {
            JSONObject jSONObject = (JSONObject) cqc.get(a - (bjl.l().b() - b2), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new cfy(-1);
            }
            cfy a4 = chi.a(this.l, cfu, jSONObject.toString());
            if (a4.d != -3 && TextUtils.isEmpty(a4.b)) {
                a4 = new cfy(3);
            }
            return a4;
        } catch (InterruptedException | CancellationException unused) {
            return new cfy(-1);
        } catch (TimeoutException unused2) {
            return new cfy(2);
        } catch (ExecutionException unused3) {
            return new cfy(0);
        }
    }

    private final JSONObject a(cfu cfu, String str) {
        chr chr;
        Info info;
        Bundle bundle = cfu.c.c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            chr = (chr) bjl.p().a(this.l).get();
        } catch (Exception unused) {
            cow.a(5);
            chr = null;
        }
        Context context = this.l;
        chb chb = new chb();
        chb.j = cfu;
        chb.k = chr;
        JSONObject a2 = chi.a(context, chb);
        if (a2 == null) {
            return null;
        }
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(this.l);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException unused2) {
            cow.a(5);
            info = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", a2);
        hashMap.put("data", bundle);
        if (info != null) {
            hashMap.put("adid", info.getId());
            hashMap.put("lat", Integer.valueOf(info.isLimitAdTrackingEnabled() ? 1 : 0));
        }
        try {
            return bjl.e().a((Map<String, ?>) hashMap);
        } catch (JSONException unused3) {
            return null;
        }
    }
}
