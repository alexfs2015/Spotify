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

/* renamed from: nh reason: default package */
final class nh {
    final Context a;
    final Handler b;
    boolean c;
    final BroadcastReceiver d = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            nh.this.a();
        }
    };
    final Runnable e = new Runnable() {
        public final void run() {
            nh.this.a();
        }
    };
    private final a f;
    private final PackageManager g;
    private final ArrayList<ng> h = new ArrayList<>();

    /* renamed from: nh$a */
    public interface a {
        void a(mz mzVar);

        void b(mz mzVar);
    }

    public nh(Context context, a aVar) {
        this.a = context;
        this.f = aVar;
        this.b = new Handler();
        this.g = context.getPackageManager();
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
                        ng ngVar = new ng(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        ngVar.a();
                        i = i2 + 1;
                        this.h.add(i2, ngVar);
                        this.f.a(ngVar);
                    } else if (a2 >= i2) {
                        ng ngVar2 = (ng) this.h.get(a2);
                        ngVar2.a();
                        if (ngVar2.n == null && ngVar2.c()) {
                            ngVar2.e();
                            ngVar2.d();
                        }
                        i = i2 + 1;
                        Collections.swap(this.h, a2, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.h.size()) {
                for (int size = this.h.size() - 1; size >= i2; size--) {
                    ng ngVar3 = (ng) this.h.get(size);
                    this.f.b(ngVar3);
                    this.h.remove(ngVar3);
                    if (ngVar3.m) {
                        if (ng.i) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(ngVar3);
                            sb.append(": Stopping");
                        }
                        ngVar3.m = false;
                        ngVar3.b();
                    }
                }
            }
        }
    }

    private int a(String str, String str2) {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            ng ngVar = (ng) this.h.get(i);
            if (ngVar.j.getPackageName().equals(str) && ngVar.j.getClassName().equals(str2)) {
                return i;
            }
        }
        return -1;
    }
}
