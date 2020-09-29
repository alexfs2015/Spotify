package defpackage;

/* renamed from: aiz reason: default package */
final class aiz {
    final vxh a;
    private final aia b;

    public aiz(vxh vxh, aia aia) {
        this.a = vxh;
        this.b = aia;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        String str = "preferences_migration_complete";
        String str2 = "always_send_reports_opt_in";
        if (!this.a.a().contains(str)) {
            vxi vxi = new vxi(this.b);
            if (!this.a.a().contains(str2) && vxi.a().contains(str2)) {
                boolean z = vxi.a().getBoolean(str2, false);
                vxh vxh = this.a;
                vxh.a(vxh.b().putBoolean(str2, z));
            }
            vxh vxh2 = this.a;
            vxh2.a(vxh2.b().putBoolean(str, true));
        }
        return this.a.a().getBoolean(str2, false);
    }
}
