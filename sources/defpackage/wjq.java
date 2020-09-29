package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: wjq reason: default package */
public final class wjq {
    private final Context a;
    private final wln b;

    public wjq(Context context) {
        this.a = context.getApplicationContext();
        this.b = new wlo(context, "TwitterAdvertisingInfoPreferences");
    }

    private static boolean b(wjp wjp) {
        return wjp != null && !TextUtils.isEmpty(wjp.a);
    }

    private wjt c() {
        return new wjr(this.a);
    }

    private wjt d() {
        return new wjs(this.a);
    }

    public final wjp a() {
        final wjp wjp = new wjp(this.b.a().getString("advertising_id", ""), this.b.a().getBoolean("limit_ad_tracking_enabled", false));
        if (b(wjp)) {
            wja.a().a("Fabric", "Using AdvertisingInfo from Preference Store");
            new Thread(new wjv() {
                public final void a() {
                    wjp b2 = wjq.this.b();
                    if (!wjp.equals(b2)) {
                        wja.a().a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                        wjq.this.a(b2);
                    }
                }
            }).start();
            return wjp;
        }
        wjp b2 = b();
        a(b2);
        return b2;
    }

    /* access modifiers changed from: 0000 */
    public void a(wjp wjp) {
        String str = "limit_ad_tracking_enabled";
        String str2 = "advertising_id";
        if (b(wjp)) {
            wln wln = this.b;
            wln.a(wln.b().putString(str2, wjp.a).putBoolean(str, wjp.b));
            return;
        }
        wln wln2 = this.b;
        wln2.a(wln2.b().remove(str2).remove(str));
    }

    /* access modifiers changed from: 0000 */
    public wjp b() {
        wjp a2 = c().a();
        String str = "Fabric";
        if (!b(a2)) {
            a2 = d().a();
            if (!b(a2)) {
                wja.a().a(str, "AdvertisingInfo not present");
            } else {
                wja.a().a(str, "Using AdvertisingInfo from Service Provider");
            }
        } else {
            wja.a().a(str, "Using AdvertisingInfo from Reflection Provider");
        }
        return a2;
    }
}
