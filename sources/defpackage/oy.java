package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: oy reason: default package */
public final class oy {
    Context a;
    final String b;
    int c;
    final ox d;
    final b e;
    ov f;
    final Executor g;
    final ou h = new a() {
        public final void a(final String[] strArr) {
            oy.this.g.execute(new Runnable() {
                public final void run() {
                    ox oxVar = oy.this.d;
                    String[] strArr = strArr;
                    synchronized (oxVar.f) {
                        Iterator it = oxVar.f.iterator();
                        while (it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            if (!((b) entry.getKey()).a()) {
                                c cVar = (c) entry.getValue();
                                Set set = 0;
                                if (cVar.b.length == 1) {
                                    int length = strArr.length;
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            break;
                                        } else if (strArr[i].equalsIgnoreCase(cVar.b[0])) {
                                            set = cVar.d;
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    dq dqVar = new dq();
                                    for (String str : strArr) {
                                        String[] strArr2 = cVar.b;
                                        int length2 = strArr2.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length2) {
                                                break;
                                            }
                                            String str2 = strArr2[i2];
                                            if (str2.equalsIgnoreCase(str)) {
                                                dqVar.add(str2);
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                    if (dqVar.size() > 0) {
                                        set = dqVar;
                                    }
                                }
                                if (set != 0) {
                                    cVar.c.a(set);
                                }
                            }
                        }
                    }
                }
            });
        }
    };
    final AtomicBoolean i = new AtomicBoolean(false);
    final ServiceConnection j = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            oy.this.f = a.a(iBinder);
            oy.this.g.execute(oy.this.k);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            oy.this.g.execute(oy.this.l);
            oy oyVar = oy.this;
            oyVar.f = null;
            oyVar.a = null;
        }
    };
    final Runnable k = new Runnable() {
        public final void run() {
            try {
                ov ovVar = oy.this.f;
                if (ovVar != null) {
                    oy.this.c = ovVar.a(oy.this.h, oy.this.b);
                    oy.this.d.a(oy.this.e);
                }
            } catch (RemoteException unused) {
            }
        }
    };
    final Runnable l = new Runnable() {
        public final void run() {
            oy.this.d.b(oy.this.e);
        }
    };
    private final Runnable m = new Runnable() {
        public final void run() {
            oy.this.d.b(oy.this.e);
            try {
                ov ovVar = oy.this.f;
                if (ovVar != null) {
                    ovVar.a(oy.this.h, oy.this.c);
                }
            } catch (RemoteException unused) {
            }
            if (oy.this.a != null) {
                oy.this.a.unbindService(oy.this.j);
                oy.this.a = null;
            }
        }
    };

    public oy(Context context, String str, ox oxVar, Executor executor) {
        this.a = context.getApplicationContext();
        this.b = str;
        this.d = oxVar;
        this.g = executor;
        this.e = new b(oxVar.a) {
            /* access modifiers changed from: 0000 */
            public final boolean a() {
                return true;
            }

            public final void a(Set<String> set) {
                if (!oy.this.i.get()) {
                    try {
                        oy.this.f.a(oy.this.c, (String[]) set.toArray(new String[0]));
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
        this.a.bindService(new Intent(this.a, MultiInstanceInvalidationService.class), this.j, 1);
    }
}
