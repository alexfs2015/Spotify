package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: vvk reason: default package */
public final class vvk {
    private final Context a;
    private final vxh b;

    public vvk(Context context) {
        this.a = context.getApplicationContext();
        this.b = new vxi(context, "TwitterAdvertisingInfoPreferences");
    }

    /* access modifiers changed from: 0000 */
    public void a(vvj vvj) {
        String str = "limit_ad_tracking_enabled";
        String str2 = "advertising_id";
        if (b(vvj)) {
            vxh vxh = this.b;
            vxh.a(vxh.b().putString(str2, vvj.a).putBoolean(str, vvj.b));
            return;
        }
        vxh vxh2 = this.b;
        vxh2.a(vxh2.b().remove(str2).remove(str));
    }

    private vvn c() {
        return new vvl(this.a);
    }

    private vvn d() {
        return new vvm(this.a);
    }

    private static boolean b(vvj vvj) {
        return vvj != null && !TextUtils.isEmpty(vvj.a);
    }

    /* access modifiers changed from: 0000 */
    public vvj b() {
        vvj a2 = c().a();
        String str = "Fabric";
        if (!b(a2)) {
            a2 = d().a();
            if (!b(a2)) {
                vuu.a().a(str, "AdvertisingInfo not present");
            } else {
                vuu.a().a(str, "Using AdvertisingInfo from Service Provider");
            }
        } else {
            vuu.a().a(str, "Using AdvertisingInfo from Reflection Provider");
        }
        return a2;
    }

    public final vvj a() {
        final vvj vvj = new vvj(this.b.a().getString("advertising_id", ""), this.b.a().getBoolean("limit_ad_tracking_enabled", false));
        if (b(vvj)) {
            vuu.a().a("Fabric", "Using AdvertisingInfo from Preference Store");
            new Thread(new vvp() {
                public final void a() {
                    vvj b2 = vvk.this.b();
                    if (!vvj.equals(b2)) {
                        vuu.a().a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                        vvk.this.a(b2);
                    }
                }
            }).start();
            return vvj;
        }
        vvj b2 = b();
        a(b2);
        return b2;
    }
}
