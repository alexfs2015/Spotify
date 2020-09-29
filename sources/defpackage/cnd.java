package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: cnd reason: default package */
public final class cnd {
    String a;
    private final Object b = new Object();
    private String c;
    private String d;
    private boolean e;

    public cnd() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = false;
        this.a = str;
    }

    private final String a(Context context) {
        String str;
        synchronized (this.b) {
            if (TextUtils.isEmpty(this.c)) {
                bjl.e();
                this.c = cmd.c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.c)) {
                    bjl.e();
                    this.c = cmd.a();
                    bjl.e();
                    cmd.b(context, "debug_signals_id.txt", this.c);
                }
            }
            str = this.c;
        }
        return str;
    }

    private final Uri b(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private static String d(Context context, String str, String str2) {
        String str3;
        Throwable e2;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", bjl.e().b(context, str2));
        cpr a2 = new cnl(context).a(str, (Map<String, String>) hashMap);
        try {
            return (String) a2.get((long) ((Integer) dpn.f().a(dsp.cU)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e3) {
            e2 = e3;
            str5 = "Timeout while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                clu.a(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            clu.a(str3, e2);
            a2.cancel(true);
            return null;
        } catch (InterruptedException e4) {
            e2 = e4;
            str5 = "Interrupted while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                clu.a(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            clu.a(str3, e2);
            a2.cancel(true);
            return null;
        } catch (Exception e5) {
            String str6 = "Error retriving a response from: ";
            String valueOf = String.valueOf(str);
            clu.a(valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6), e5);
            return null;
        }
    }

    public final String a() {
        String str;
        synchronized (this.b) {
            str = this.d;
        }
        return str;
    }

    public final void a(Context context, String str, String str2, String str3) {
        Builder buildUpon = b(context, (String) dpn.f().a(dsp.cT), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        bjl.e();
        cmd.a(context, str, buildUpon.build().toString());
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.e;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public final void c(Context context, String str, String str2) {
        bjl.e();
        cmd.a(context, b(context, (String) dpn.f().a(dsp.cQ), str, str2));
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Context context, String str, String str2) {
        String d2 = d(context, b(context, (String) dpn.f().a(dsp.cR), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            cow.a(3);
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d2.trim());
            String optString = jSONObject.optString("gct");
            this.a = jSONObject.optString("status");
            synchronized (this.b) {
                this.d = optString;
            }
            return true;
        } catch (JSONException unused) {
            cow.a(5);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(Context context, String str, String str2) {
        String d2 = d(context, b(context, (String) dpn.f().a(dsp.cS), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            cow.a(3);
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d2.trim()).optString("debug_mode"));
            synchronized (this.b) {
                this.e = equals;
            }
            return equals;
        } catch (JSONException unused) {
            cow.a(5);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            cow.a(4);
        } else {
            cmd.a.post(new cne(context, str, z, z2));
        }
    }
}
