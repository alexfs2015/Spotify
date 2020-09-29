package defpackage;

import java.util.Map;

/* renamed from: cic reason: default package */
final class cic implements bhc<Object> {
    private final /* synthetic */ cia a;

    cic(cia cia) {
        this.a = cia;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.b) {
            if (!this.a.e.isDone()) {
                cig cig = new cig(-2, map);
                if (this.a.c.equals(cig.f)) {
                    String str = cig.h;
                    if (str == null) {
                        cpn.a(5);
                        return;
                    }
                    if (str.contains("%40mediation_adapters%40")) {
                        String replaceAll = str.replaceAll("%40mediation_adapters%40", cmf.a(this.a.a, (String) map.get("check_adapters"), this.a.d));
                        cig.h = replaceAll;
                        String str2 = "Ad request URL modified to ";
                        String valueOf = String.valueOf(replaceAll);
                        if (valueOf.length() != 0) {
                            str2.concat(valueOf);
                        } else {
                            new String(str2);
                        }
                        cml.a();
                    }
                    this.a.e.b(cig);
                }
            }
        }
    }
}
