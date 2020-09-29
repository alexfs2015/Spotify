package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: wjs reason: default package */
final class wjs implements wjt {
    private final Context a;

    /* renamed from: wjs$a */
    static final class a implements ServiceConnection {
        private boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private a() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final IBinder a() {
            if (this.a) {
                wja.a().e("Fabric", "getBinder already called");
            }
            this.a = true;
            try {
                return (IBinder) this.b.poll(200, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.b.clear();
        }
    }

    /* renamed from: wjs$b */
    static final class b implements IInterface {
        private final IBinder a;

        public b(IBinder iBinder) {
            this.a = iBinder;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
            defpackage.wja.a().a("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0024 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a() {
            /*
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r2)     // Catch:{ Exception -> 0x0024 }
                android.os.IBinder r2 = r5.a     // Catch:{ Exception -> 0x0024 }
                r3 = 1
                r4 = 0
                r2.transact(r3, r0, r1, r4)     // Catch:{ Exception -> 0x0024 }
                r1.readException()     // Catch:{ Exception -> 0x0024 }
                java.lang.String r2 = r1.readString()     // Catch:{ Exception -> 0x0024 }
                r1.recycle()
                r0.recycle()
                goto L_0x0036
            L_0x0022:
                r2 = move-exception
                goto L_0x0037
            L_0x0024:
                wji r2 = defpackage.wja.a()     // Catch:{ all -> 0x0022 }
                java.lang.String r3 = "Fabric"
                java.lang.String r4 = "Could not get parcel from Google Play Service to capture AdvertisingId"
                r2.a(r3, r4)     // Catch:{ all -> 0x0022 }
                r1.recycle()
                r0.recycle()
                r2 = 0
            L_0x0036:
                return r2
            L_0x0037:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wjs.b.a():java.lang.String");
        }

        public final IBinder asBinder() {
            return this.a;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            defpackage.wja.a().a("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b() {
            /*
                r6 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                r2 = 0
                java.lang.String r3 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r3)     // Catch:{ Exception -> 0x0025 }
                r3 = 1
                r0.writeInt(r3)     // Catch:{ Exception -> 0x0025 }
                android.os.IBinder r4 = r6.a     // Catch:{ Exception -> 0x0025 }
                r5 = 2
                r4.transact(r5, r0, r1, r2)     // Catch:{ Exception -> 0x0025 }
                r1.readException()     // Catch:{ Exception -> 0x0025 }
                int r4 = r1.readInt()     // Catch:{ Exception -> 0x0025 }
                if (r4 == 0) goto L_0x0030
                r2 = 1
                goto L_0x0030
            L_0x0023:
                r2 = move-exception
                goto L_0x0037
            L_0x0025:
                wji r3 = defpackage.wja.a()     // Catch:{ all -> 0x0023 }
                java.lang.String r4 = "Fabric"
                java.lang.String r5 = "Could not get parcel from Google Play Service to capture Advertising limitAdTracking"
                r3.a(r4, r5)     // Catch:{ all -> 0x0023 }
            L_0x0030:
                r1.recycle()
                r0.recycle()
                return r2
            L_0x0037:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wjs.b.b():boolean");
        }
    }

    public wjs(Context context) {
        this.a = context.getApplicationContext();
    }

    public final wjp a() {
        String str = "Could not bind to Google Play Service to capture AdvertisingId";
        String str2 = "Fabric";
        if (Looper.myLooper() == Looper.getMainLooper()) {
            wja.a().a(str2, "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        try {
            this.a.getPackageManager().getPackageInfo("com.android.vending", 0);
            a aVar = new a(0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (this.a.bindService(intent, aVar, 1)) {
                    try {
                        b bVar = new b(aVar.a());
                        wjp wjp = new wjp(bVar.a(), bVar.b());
                        this.a.unbindService(aVar);
                        return wjp;
                    } catch (Exception e) {
                        wja.a().b(str2, "Exception in binding to Google Play Service to capture AdvertisingId", e);
                        this.a.unbindService(aVar);
                    }
                } else {
                    wja.a().a(str2, str);
                    return null;
                }
            } catch (Throwable th) {
                wja.a().a(str2, str, th);
            }
        } catch (NameNotFoundException unused) {
            wja.a().a(str2, "Unable to find Google Play Services package name");
            return null;
        } catch (Exception e2) {
            wja.a().a(str2, "Unable to determine if Google Play Services is available", (Throwable) e2);
            return null;
        }
    }
}
