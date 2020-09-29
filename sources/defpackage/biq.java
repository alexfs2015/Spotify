package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: biq reason: default package */
final /* synthetic */ class biq implements Runnable {
    private final bin a;
    private final Runnable b;

    biq(bin bin, Runnable runnable) {
        this.a = bin;
        this.b = runnable;
    }

    public final void run() {
        bin bin = this.a;
        Runnable runnable = this.b;
        Context context = bin.a;
        bwx.b("Adapters must be initialized on the main thread.");
        Map<String, ebz> map = bjl.i().g().j().b;
        if (map != null && !map.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                    cow.a(5);
                    return;
                }
            }
            cii cii = cii.j;
            if (cii != null) {
                Collection<ebz> values = map.values();
                HashMap hashMap = new HashMap();
                car a2 = cas.a(context);
                for (ebz ebz : values) {
                    for (eby eby : ebz.a) {
                        String str = eby.k;
                        for (String str2 : eby.c) {
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
                        cjs a3 = cii.l.a(str3);
                        if (a3 != null) {
                            ecs ecs = a3.a;
                            if (!ecs.g()) {
                                if (ecs.m()) {
                                    ecs.a(a2, (cjt) a3.b, (List) entry.getValue());
                                    String str4 = "Initialized rewarded video mediation adapter ";
                                    String valueOf = String.valueOf(str3);
                                    if (valueOf.length() != 0) {
                                        str4.concat(valueOf);
                                    } else {
                                        new String(str4);
                                    }
                                    cow.a(3);
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        sb.toString();
                        cow.a(5);
                    }
                }
            }
        }
    }
}
