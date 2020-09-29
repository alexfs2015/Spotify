package defpackage;

/* renamed from: ajn reason: default package */
final class ajn {
    final wln a;
    private final aio b;

    public ajn(wln wln, aio aio) {
        this.a = wln;
        this.b = aio;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        String str = "preferences_migration_complete";
        String str2 = "always_send_reports_opt_in";
        if (!this.a.a().contains(str)) {
            wlo wlo = new wlo(this.b);
            if (!this.a.a().contains(str2) && wlo.a().contains(str2)) {
                boolean z = wlo.a().getBoolean(str2, false);
                wln wln = this.a;
                wln.a(wln.b().putBoolean(str2, z));
            }
            wln wln2 = this.a;
            wln2.a(wln2.b().putBoolean(str, true));
        }
        return this.a.a().getBoolean(str2, false);
    }
}
