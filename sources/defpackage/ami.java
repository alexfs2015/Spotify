package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.FacebookException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ami reason: default package */
public class ami {
    private static final String d = ami.class.getCanonicalName();
    private static ami g;
    String a;
    String b;
    boolean c;
    private String e;
    private long f;

    /* renamed from: ami$a */
    static final class a implements IInterface {
        private IBinder a;

        a(IBinder iBinder) {
            this.a = iBinder;
        }

        public final String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final IBinder asBinder() {
            return this.a;
        }

        public final boolean b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: ami$b */
    static final class b implements ServiceConnection {
        AtomicBoolean a;
        final BlockingQueue<IBinder> b;

        private b() {
            this.a = new AtomicBoolean(false);
            this.b = new LinkedBlockingDeque();
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static ami a(ami ami) {
        ami.f = System.currentTimeMillis();
        g = ami;
        return ami;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[Catch:{ Exception -> 0x00ed, all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082 A[Catch:{ Exception -> 0x00ed, all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[Catch:{ Exception -> 0x00ed, all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089 A[Catch:{ Exception -> 0x00ed, all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e A[Catch:{ Exception -> 0x00ed, all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ami a(android.content.Context r13) {
        /*
            java.lang.String r0 = "limit_tracking"
            java.lang.String r1 = "androidid"
            java.lang.String r2 = "aid"
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r3 != r4) goto L_0x0017
            java.lang.String r3 = d
            java.lang.String r4 = "getAttributionIdentifiers should not be called from the main thread"
            android.util.Log.e(r3, r4)
        L_0x0017:
            ami r3 = g
            if (r3 == 0) goto L_0x002c
            long r3 = java.lang.System.currentTimeMillis()
            ami r5 = g
            long r6 = r5.f
            long r3 = r3 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x002c
            return r5
        L_0x002c:
            ami r3 = b(r13)
            if (r3 != 0) goto L_0x003d
            ami r3 = d(r13)
            if (r3 != 0) goto L_0x003d
            ami r3 = new ami
            r3.<init>()
        L_0x003d:
            r4 = 3
            r5 = 0
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            r4 = 0
            r8[r4] = r2     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            r6 = 1
            r8[r6] = r1     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            r6 = 2
            r8[r6] = r0     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            java.lang.String r7 = "com.facebook.katana.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r6 = r6.resolveContentProvider(r7, r4)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r6 == 0) goto L_0x005e
            java.lang.String r4 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
        L_0x005c:
            r7 = r4
            goto L_0x0072
        L_0x005e:
            android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            java.lang.String r7 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r4 = r6.resolveContentProvider(r7, r4)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r4 == 0) goto L_0x0071
            java.lang.String r4 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            goto L_0x005c
        L_0x0071:
            r7 = r5
        L_0x0072:
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r4 == 0) goto L_0x0082
            java.lang.String r6 = r13.getPackageName()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            r4.getInstallerPackageName(r6)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            java.lang.String r4 = "com.android.vending"
            goto L_0x0083
        L_0x0082:
            r4 = r5
        L_0x0083:
            if (r4 == 0) goto L_0x0087
            r3.b = r4     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
        L_0x0087:
            if (r7 != 0) goto L_0x008e
            ami r13 = a(r3)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            return r13
        L_0x008e:
            android.content.ContentResolver r6 = r13.getContentResolver()     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r13 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00ed, all -> 0x00eb }
            if (r13 == 0) goto L_0x00d8
            boolean r4 = r13.moveToFirst()     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            if (r4 != 0) goto L_0x00a2
            goto L_0x00d8
        L_0x00a2:
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            int r0 = r13.getColumnIndex(r0)     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            r3.a = r2     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            if (r1 <= 0) goto L_0x00ce
            if (r0 <= 0) goto L_0x00ce
            java.lang.String r2 = r3.a()     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            if (r2 != 0) goto L_0x00ce
            java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            r3.e = r1     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            java.lang.String r0 = r13.getString(r0)     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            r3.c = r0     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
        L_0x00ce:
            if (r13 == 0) goto L_0x00d3
            r13.close()
        L_0x00d3:
            ami r13 = a(r3)
            return r13
        L_0x00d8:
            ami r0 = a(r3)     // Catch:{ Exception -> 0x00e6, all -> 0x00e2 }
            if (r13 == 0) goto L_0x00e1
            r13.close()
        L_0x00e1:
            return r0
        L_0x00e2:
            r0 = move-exception
            r5 = r13
            r13 = r0
            goto L_0x010e
        L_0x00e6:
            r0 = move-exception
            r12 = r0
            r0 = r13
            r13 = r12
            goto L_0x00ef
        L_0x00eb:
            r13 = move-exception
            goto L_0x010e
        L_0x00ed:
            r13 = move-exception
            r0 = r5
        L_0x00ef:
            java.lang.String r1 = d     // Catch:{ all -> 0x010c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x010c }
            java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
            r2.<init>(r3)     // Catch:{ all -> 0x010c }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x010c }
            r2.append(r13)     // Catch:{ all -> 0x010c }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x010c }
            defpackage.ank.b(r1, r13)     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x010b
            r0.close()
        L_0x010b:
            return r5
        L_0x010c:
            r13 = move-exception
            r5 = r0
        L_0x010e:
            if (r5 == 0) goto L_0x0113
            r5.close()
        L_0x0113:
            goto L_0x0115
        L_0x0114:
            throw r13
        L_0x0115:
            goto L_0x0114
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ami.a(android.content.Context):ami");
    }

    private static ami b(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new FacebookException("getAndroidId cannot be called on the main thread.");
            } else if (!c(context)) {
                return null;
            } else {
                Method a2 = ank.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                if (a2 == null) {
                    return null;
                }
                Object a3 = ank.a((Object) null, a2, context);
                if (a3 == null) {
                    return null;
                }
                Method a4 = ank.a(a3.getClass(), "getId", (Class<?>[]) new Class[0]);
                Method a5 = ank.a(a3.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                if (a4 != null) {
                    if (a5 != null) {
                        ami ami = new ami();
                        ami.e = (String) ank.a(a3, a4, new Object[0]);
                        ami.c = ((Boolean) ank.a(a3, a5, new Object[0])).booleanValue();
                        return ami;
                    }
                }
                return null;
            }
        } catch (Exception e2) {
            ank.a("android_id", e2);
            return null;
        }
    }

    private static boolean c(Context context) {
        Method a2 = ank.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
        if (a2 == null) {
            return false;
        }
        Object a3 = ank.a((Object) null, a2, context);
        return (a3 instanceof Integer) && ((Integer) a3).intValue() == 0;
    }

    private static ami d(Context context) {
        if (!c(context)) {
            return null;
        }
        b bVar = new b(0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                if (!bVar.a.compareAndSet(true, true)) {
                    a aVar = new a((IBinder) bVar.b.take());
                    ami ami = new ami();
                    ami.e = aVar.a();
                    ami.c = aVar.b();
                    return ami;
                }
                throw new IllegalStateException("Binder already consumed");
            } catch (Exception e2) {
                ank.a("android_id", e2);
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    public final String a() {
        if (!akq.a() || !akq.p()) {
            return null;
        }
        return this.e;
    }
}
