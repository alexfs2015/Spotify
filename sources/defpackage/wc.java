package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: wc reason: default package */
public final class wc {

    /* renamed from: wc$a */
    static final class a implements ServiceConnection {
        boolean a;
        final LinkedBlockingQueue<IBinder> b;

        private a() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: wc$b */
    public static final class b {
        final String a;
        final Boolean b;

        b(String str, Boolean bool) {
            this.a = str;
            this.b = bool;
        }
    }

    /* renamed from: wc$c */
    static final class c implements IInterface {
        private IBinder a;

        public c(IBinder iBinder) {
            this.a = iBinder;
        }

        public final Boolean a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                boolean z2 = false;
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z2 = true;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                if (valueOf != null) {
                    return Boolean.valueOf(!valueOf.booleanValue());
                }
                return null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
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
    }

    public static b a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                a aVar = new a(0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, aVar, 1)) {
                    try {
                        if (!aVar.a) {
                            aVar.a = true;
                            c cVar = new c((IBinder) aVar.b.take());
                            b bVar = new b(cVar.a(), cVar.a(true));
                            context.unbindService(aVar);
                            return bVar;
                        }
                        throw new IllegalStateException();
                    } catch (Exception e) {
                        throw e;
                    } catch (Throwable th) {
                        context.unbindService(aVar);
                        throw th;
                    }
                } else {
                    throw new IOException("Google Play connection failed");
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
    }
}
