package defpackage;

import java.util.Map;

/* renamed from: chl reason: default package */
final class chl implements bgl<Object> {
    private final /* synthetic */ chj a;

    chl(chj chj) {
        this.a = chj;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.b) {
            if (!this.a.e.isDone()) {
                chp chp = new chp(-2, map);
                if (this.a.c.equals(chp.f)) {
                    String str = chp.h;
                    if (str == null) {
                        cow.a(5);
                        return;
                    }
                    if (str.contains("%40mediation_adapters%40")) {
                        String replaceAll = str.replaceAll("%40mediation_adapters%40", clo.a(this.a.a, (String) map.get("check_adapters"), this.a.d));
                        chp.h = replaceAll;
                        String str2 = "Ad request URL modified to ";
                        String valueOf = String.valueOf(replaceAll);
                        if (valueOf.length() != 0) {
                            str2.concat(valueOf);
                        } else {
                            new String(str2);
                        }
                        clu.a();
                    }
                    this.a.e.b(chp);
                }
            }
        }
    }
}
