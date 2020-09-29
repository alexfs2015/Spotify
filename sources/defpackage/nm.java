package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: nm reason: default package */
final class nm {
    final Context a;
    final Handler b;
    boolean c;
    final BroadcastReceiver d = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            nm.this.a();
        }
    };
    final Runnable e = new Runnable() {
        public final void run() {
            nm.this.a();
        }
    };
    private final a f;
    private final PackageManager g;
    private final ArrayList<nl> h = new ArrayList<>();

    /* renamed from: nm$a */
    public interface a {
        void a(ne neVar);

        void b(ne neVar);
    }

    public nm(Context context, a aVar) {
        this.a = context;
        this.f = aVar;
        this.b = new Handler();
        this.g = context.getPackageManager();
    }

    private int a(String str, String str2) {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            nl nlVar = (nl) this.h.get(i);
            if (nlVar.j.getPackageName().equals(str) && nlVar.j.getClassName().equals(str2)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        int i;
        if (this.c) {
            int i2 = 0;
            for (ResolveInfo resolveInfo : this.g.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0)) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    int a2 = a(serviceInfo.packageName, serviceInfo.name);
                    if (a2 < 0) {
                        nl nlVar = new nl(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        nlVar.a();
                        i = i2 + 1;
                        this.h.add(i2, nlVar);
                        this.f.a(nlVar);
                    } else if (a2 >= i2) {
                        nl nlVar2 = (nl) this.h.get(a2);
                        nlVar2.a();
                        if (nlVar2.n == null && nlVar2.c()) {
                            nlVar2.e();
                            nlVar2.d();
                        }
                        i = i2 + 1;
                        Collections.swap(this.h, a2, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.h.size()) {
                for (int size = this.h.size() - 1; size >= i2; size--) {
                    nl nlVar3 = (nl) this.h.get(size);
                    this.f.b(nlVar3);
                    this.h.remove(nlVar3);
                    if (nlVar3.m) {
                        if (nl.i) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(nlVar3);
                            sb.append(": Stopping");
                        }
                        nlVar3.m = false;
                        nlVar3.b();
                    }
                }
            }
        }
    }
}
