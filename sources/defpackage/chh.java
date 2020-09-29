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

@cfp
/* renamed from: chh reason: default package */
public final class chh extends cmg {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private static final Object b = new Object();
    private static boolean c = false;
    /* access modifiers changed from: private */
    public static eay d = null;
    private static HttpClient e = null;
    /* access modifiers changed from: private */
    public static bfz f = null;
    private static bhc<Object> g = null;
    /* access modifiers changed from: private */
    public final cfr h;
    private final cgm i;
    private final Object k = new Object();
    private final Context l;
    /* access modifiers changed from: private */
    public ebl m;
    private doc n;

    public chh(Context context, cgm cgm, cfr cfr, doc doc) {
        super(0);
        this.h = cfr;
        this.l = context;
        this.i = cgm;
        this.n = doc;
        synchronized (b) {
            if (!c) {
                f = new bfz();
                e = new HttpClient(context.getApplicationContext(), cgm.j);
                g = new chp();
                eay eay = new eay(this.l.getApplicationContext(), this.i.j, (String) dqe.f().a(dtg.a), new cho(), new chn());
                d = eay;
                c = true;
            }
        }
    }

    private final cgp a(cgl cgl) {
        bkc.e();
        String a2 = cmu.a();
        JSONObject a3 = a(cgl, a2);
        if (a3 == null) {
            return new cgp(0);
        }
        long b2 = bkc.l().b();
        bfz bfz = f;
        cqt cqt = new cqt();
        bfz.a.put(a2, cqt);
        cpc.a.post(new chj(this, a3, a2));
        try {
            JSONObject jSONObject = (JSONObject) cqt.get(a - (bkc.l().b() - b2), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new cgp(-1);
            }
            cgp a4 = chz.a(this.l, cgl, jSONObject.toString());
            if (a4.d != -3 && TextUtils.isEmpty(a4.b)) {
                a4 = new cgp(3);
            }
            return a4;
        } catch (InterruptedException | CancellationException unused) {
            return new cgp(-1);
        } catch (TimeoutException unused2) {
            return new cgp(2);
        } catch (ExecutionException unused3) {
            return new cgp(0);
        }
    }

    private final JSONObject a(cgl cgl, String str) {
        cii cii;
        Info info;
        Bundle bundle = cgl.c.c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            cii = (cii) bkc.p().a(this.l).get();
        } catch (Exception unused) {
            cpn.a(5);
            cii = null;
        }
        Context context = this.l;
        chs chs = new chs();
        chs.j = cgl;
        chs.k = cii;
        JSONObject a2 = chz.a(context, chs);
        if (a2 == null) {
            return null;
        }
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(this.l);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException unused2) {
            cpn.a(5);
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
            return bkc.e().a((Map<String, ?>) hashMap);
        } catch (JSONException unused3) {
            return null;
        }
    }

    protected static void a(eam eam) {
        eam.a("/loadAd", f);
        eam.a("/fetchHttpRequest", e);
        eam.a("/invalidRequest", g);
    }

    protected static void b(eam eam) {
        eam.b("/loadAd", f);
        eam.b("/fetchHttpRequest", e);
        eam.b("/invalidRequest", g);
    }

    public final void a() {
        cpn.a(3);
        String i2 = bkc.B().i(this.l);
        cgl cgl = new cgl(this.i, -1, bkc.B().g(this.l), bkc.B().h(this.l), i2);
        bkc.B().e(this.l, i2);
        cgp a2 = a(cgl);
        cgl cgl2 = cgl;
        clr clr = new clr(cgl2, a2, a2.d, bkc.l().b(), a2.m, this.n);
        cpc.a.post(new chi(this, clr));
    }

    public final void s_() {
        synchronized (this.k) {
            cpc.a.post(new chm(this));
        }
    }
}
