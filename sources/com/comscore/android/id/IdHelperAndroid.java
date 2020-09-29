package com.comscore.android.id;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.provider.Settings.Secure;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

public class IdHelperAndroid {
    public static final String[] INVALID_ID_VALUES = {"0123456789ABCDEF", "0123456789abcdef", "9774d56d682e549c", "9774D56D682E549C", "unknown", "UNKNOWN", "android_id", "ANDROID_ID"};
    public static final String NO_ID_AVAILABLE = "none";
    private static final String a = "com.google.android.gms";
    private static final String b = "com.google.android.gms.ads.identifier.service.START";
    private static boolean c;
    private static boolean d;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static final boolean h = false;

    static final class a implements ServiceConnection {
        boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private a() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        /* access modifiers changed from: 0000 */
        public final IBinder a() {
            if (!this.a) {
                this.a = true;
                return (IBinder) this.b.take();
            }
            throw new IllegalStateException();
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

    static final class b implements IInterface {
        private IBinder a;

        b(IBinder iBinder) {
            this.a = iBinder;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                obtain.writeInt(z ? 1 : 0);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final IBinder asBinder() {
            return this.a;
        }

        public final String getId() {
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
    }

    private static DeviceId a() {
        DeviceId deviceId = new DeviceId("random", UUID.randomUUID().toString(), 7, 2, 0);
        return deviceId;
    }

    private static Boolean a(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        } else if (!z && g) {
            return Boolean.FALSE;
        } else {
            try {
                boolean z2 = Secure.getInt(context.getContentResolver(), "limit_ad_tracking") == 0;
                if (!z && !z2) {
                    g = true;
                }
                return Boolean.valueOf(z2);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static String a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = new a();
            Intent intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, aVar, 1)) {
                try {
                    return new b(aVar.a()).getId();
                } catch (Exception unused) {
                } finally {
                    context.unbindService(aVar);
                }
            }
            return "";
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    private static boolean b(Context context) {
        if (c) {
            return d;
        }
        try {
            context.getPackageManager().getInstallerPackageName(context.getPackageName());
            String str = "com.android.vending";
            if ("com.android.vending".equals(str) || "com.google.play".equals(str)) {
                c = true;
                d = true;
                return true;
            }
        } catch (Exception unused) {
        }
        c = true;
        d = false;
        return false;
    }

    private static boolean c(Context context) {
        if (e) {
            return f;
        }
        try {
            context.getPackageManager().getInstallerPackageName(context.getPackageName());
            boolean equals = "com.amazon.venezia".equals("com.android.vending");
            e = true;
            if (equals) {
                f = true;
                return true;
            }
            f = false;
            return false;
        } catch (Exception unused) {
            e = true;
            f = false;
            return false;
        }
    }

    public static boolean checkAndroidId(String str) {
        for (String equals : INVALID_ID_VALUES) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAndroidSerial(String str) {
        if (str == null) {
            return false;
        }
        for (String equals : INVALID_ID_VALUES) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return str.length() > 3 && !str.substring(0, 3).equals("***") && !str.substring(0, 3).equals("000");
    }

    private static boolean d(Context context) {
        return Build.MODEL.matches("AFTN") || context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    private static String e(Context context) {
        try {
            return Secure.getString(context.getContentResolver(), "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAmazonAdvertisingId(Context context, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Boolean a2 = a(context, z);
            if (a2 == null) {
                return null;
            }
            return a2.booleanValue() ? e(context) : NO_ID_AVAILABLE;
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public static DeviceId getAndroidId(Context context) {
        if (VERSION.SDK_INT >= 3) {
            try {
                String str = (String) Secure.class.getMethod("getString", new Class[]{ContentResolver.class, String.class}).invoke(null, new Object[]{context.getContentResolver(), "android_id"});
                if (str != null && str.length() > 0) {
                    DeviceId deviceId = new DeviceId("AndroidId", str, 7, 2, 2);
                    return deviceId;
                }
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return null;
    }

    public static DeviceId getAndroidSerial() {
        if (VERSION.SDK_INT < 9) {
            return null;
        }
        DeviceId deviceId = new DeviceId("AndroidSerial", a.a(), 3, 1, 1);
        return deviceId;
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context) {
        return getCrossPublisherDeviceId(context, false);
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context, boolean z) {
        boolean z2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (d(context)) {
                String amazonAdvertisingId = getAmazonAdvertisingId(context, z);
                if (amazonAdvertisingId != null) {
                    return new CrossPublisherId(amazonAdvertisingId, 1);
                }
                z2 = c(context);
            } else {
                DeviceId googlePlayAdvertisingDeviceId = getGooglePlayAdvertisingDeviceId(context, z);
                if (googlePlayAdvertisingDeviceId != null) {
                    return new CrossPublisherId(googlePlayAdvertisingDeviceId.getId(), 1);
                }
                z2 = b(context);
            }
            if (!z2) {
                DeviceId androidSerial = getAndroidSerial();
                if (androidSerial != null && checkAndroidSerial(androidSerial.getId())) {
                    return new CrossPublisherId(androidSerial.getId(), 2);
                }
                DeviceId androidId = getAndroidId(context);
                if (androidId != null && checkAndroidId(androidId.getId())) {
                    return new CrossPublisherId(androidId.getId(), 3);
                }
            }
            return new CrossPublisherId(null, 0);
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public static DeviceId getDeviceId(Context context) {
        DeviceId androidSerial = getAndroidSerial();
        if (androidSerial != null && checkAndroidSerial(androidSerial.getId())) {
            return androidSerial;
        }
        DeviceId androidId = getAndroidId(context);
        return (androidId == null || !checkAndroidId(androidId.getId())) ? a() : androidId;
    }

    public static DeviceId getGooglePlayAdvertisingDeviceId(Context context) {
        return getGooglePlayAdvertisingDeviceId(context, false);
    }

    public static DeviceId getGooglePlayAdvertisingDeviceId(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        } else if (!isGooglePlayServicesAvailable(context)) {
            return null;
        } else {
            DeviceId deviceId = new DeviceId("googleplayapp", isAdvertisingIdEnabled(context, z) ? a(context) : NO_ID_AVAILABLE, 0, 0, -1);
            return deviceId;
        }
    }

    public static boolean isAdvertisingIdEnabled(Context context) {
        return isAdvertisingIdEnabled(context, false);
    }

    public static boolean isAdvertisingIdEnabled(Context context, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            boolean z2 = false;
            if (!z && g) {
                return false;
            }
            a aVar = new a();
            Intent intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, aVar, 1)) {
                try {
                    z2 = !new b(aVar.a()).a(true);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    context.unbindService(aVar);
                    throw th;
                }
                context.unbindService(aVar);
            }
            if (!z && !z2) {
                g = true;
            }
            return z2;
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public static boolean isGooglePlayServicesAvailable(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        } else if (VERSION.SDK_INT <= 8) {
            return false;
        } else {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                a aVar = new a();
                Intent intent = new Intent(b);
                intent.setPackage(a);
                if (!context.bindService(intent, aVar, 1)) {
                    return false;
                }
                context.unbindService(aVar);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static String md5(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length << 1);
            for (byte b2 : digest) {
                byte b3 = b2 & 255;
                if (b3 < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(b3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Huh, MD5 should be supported?", e2);
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e3);
        }
    }
}
