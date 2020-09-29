package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bjh reason: default package */
final /* synthetic */ class bjh implements Runnable {
    private final bje a;
    private final Runnable b;

    bjh(bje bje, Runnable runnable) {
        this.a = bje;
        this.b = runnable;
    }

    public final void run() {
        bje bje = this.a;
        Runnable runnable = this.b;
        Context context = bje.a;
        bxo.b("Adapters must be initialized on the main thread.");
        Map<String, ecq> map = bkc.i().g().j().b;
        if (map != null && !map.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                    cpn.a(5);
                    return;
                }
            }
            ciz ciz = ciz.j;
            if (ciz != null) {
                Collection<ecq> values = map.values();
                HashMap hashMap = new HashMap();
                cbi a2 = cbj.a(context);
                for (ecq ecq : values) {
                    for (ecp ecp : ecq.a) {
                        String str = ecp.k;
                        for (String str2 : ecp.c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                for (Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        ckj a3 = ciz.l.a(str3);
                        if (a3 != null) {
                            edj edj = a3.a;
                            if (!edj.g()) {
                                if (edj.m()) {
                                    edj.a(a2, (ckk) a3.b, (List) entry.getValue());
                                    String str4 = "Initialized rewarded video mediation adapter ";
                                    String valueOf = String.valueOf(str3);
                                    if (valueOf.length() != 0) {
                                        str4.concat(valueOf);
                                    } else {
                                        new String(str4);
                                    }
                                    cpn.a(3);
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        sb.toString();
                        cpn.a(5);
                    }
                }
            }
        }
    }
}
