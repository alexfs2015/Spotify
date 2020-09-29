package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: dd reason: default package */
public class dd {
    private final d a;
    private final ComponentName b;

    dd(d dVar, ComponentName componentName) {
        this.a = dVar;
        this.b = componentName;
    }

    public static boolean a(Context context, String str, df dfVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dfVar, 33);
    }

    public final boolean a(long j) {
        try {
            return this.a.a(0);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final dg a(final dc dcVar) {
        AnonymousClass1 r0 = new a() {
            private Handler b = new Handler(Looper.getMainLooper());

            public final void a(final int i, final Bundle bundle) {
                if (dcVar != null) {
                    this.b.post(new Runnable() {
                        public final void run() {
                            dcVar.a(i, bundle);
                        }
                    });
                }
            }

            public final void a(final String str, final Bundle bundle) {
                if (dcVar != null) {
                    this.b.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }

            public final void a(final Bundle bundle) {
                if (dcVar != null) {
                    this.b.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }

            public final void b(final String str, final Bundle bundle) {
                if (dcVar != null) {
                    this.b.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }

            public final void a(int i, Uri uri, boolean z, Bundle bundle) {
                if (dcVar != null) {
                    Handler handler = this.b;
                    final int i2 = i;
                    final Uri uri2 = uri;
                    final boolean z2 = z;
                    final Bundle bundle2 = bundle;
                    AnonymousClass5 r1 = new Runnable() {
                        public final void run() {
                        }
                    };
                    handler.post(r1);
                }
            }
        };
        dg dgVar = null;
        try {
            if (!this.a.a((c) r0)) {
                return null;
            }
            dgVar = new dg(this.a, r0, this.b);
            return dgVar;
        } catch (RemoteException unused) {
        }
    }
}
