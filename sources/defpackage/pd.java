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

/* renamed from: pd reason: default package */
public final class pd {
    Context a;
    final String b;
    int c;
    final pc d;
    final b e;
    pa f;
    final Executor g;
    final oz h = new a() {
        public final void a(final String[] strArr) {
            pd.this.g.execute(new Runnable() {
                public final void run() {
                    pc pcVar = pd.this.d;
                    String[] strArr = strArr;
                    synchronized (pcVar.f) {
                        Iterator it = pcVar.f.iterator();
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
            pd.this.f = a.a(iBinder);
            pd.this.g.execute(pd.this.k);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            pd.this.g.execute(pd.this.l);
            pd pdVar = pd.this;
            pdVar.f = null;
            pdVar.a = null;
        }
    };
    final Runnable k = new Runnable() {
        public final void run() {
            try {
                pa paVar = pd.this.f;
                if (paVar != null) {
                    pd.this.c = paVar.a(pd.this.h, pd.this.b);
                    pd.this.d.a(pd.this.e);
                }
            } catch (RemoteException unused) {
            }
        }
    };
    final Runnable l = new Runnable() {
        public final void run() {
            pd.this.d.b(pd.this.e);
        }
    };
    private final Runnable m = new Runnable() {
        public final void run() {
            pd.this.d.b(pd.this.e);
            try {
                pa paVar = pd.this.f;
                if (paVar != null) {
                    paVar.a(pd.this.h, pd.this.c);
                }
            } catch (RemoteException unused) {
            }
            if (pd.this.a != null) {
                pd.this.a.unbindService(pd.this.j);
                pd.this.a = null;
            }
        }
    };

    public pd(Context context, String str, pc pcVar, Executor executor) {
        this.a = context.getApplicationContext();
        this.b = str;
        this.d = pcVar;
        this.g = executor;
        this.e = new b(pcVar.a) {
            public final void a(Set<String> set) {
                if (!pd.this.i.get()) {
                    try {
                        pd.this.f.a(pd.this.c, (String[]) set.toArray(new String[0]));
                    } catch (RemoteException unused) {
                    }
                }
            }

            /* access modifiers changed from: 0000 */
            public final boolean a() {
                return true;
            }
        };
        this.a.bindService(new Intent(this.a, MultiInstanceInvalidationService.class), this.j, 1);
    }
}
