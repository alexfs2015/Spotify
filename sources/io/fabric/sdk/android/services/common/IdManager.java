package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public final class IdManager {
    private static final Pattern c = Pattern.compile("[^\\p{Alnum}]");
    private static final String d = Pattern.quote("/");
    public final boolean a;
    public final String b;
    private final ReentrantLock e = new ReentrantLock();
    private final vvx f;
    private final boolean g;
    private final Context h;
    private final String i;
    private final Collection<vuz> j;
    private vvk k;
    private vvj l;
    private boolean m;
    private vvw n;

    public enum DeviceIdentifierType {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int protobufIndex;

        private DeviceIdentifierType(int i) {
            this.protobufIndex = i;
        }
    }

    public IdManager(Context context, String str, String str2, Collection<vuz> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.h = context;
            this.b = str;
            this.i = str2;
            this.j = collection;
            this.f = new vvx();
            this.k = new vvk(context);
            this.n = new vvw();
            this.g = CommonUtils.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            String str3 = "Fabric";
            if (!this.g) {
                vvc a2 = vuu.a();
                StringBuilder sb = new StringBuilder("Device ID collection disabled for ");
                sb.append(context.getPackageName());
                a2.a(str3, sb.toString());
            }
            this.a = CommonUtils.a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.a) {
                vvc a3 = vuu.a();
                StringBuilder sb2 = new StringBuilder("User information collection disabled for ");
                sb2.append(context.getPackageName());
                a3.a(str3, sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    public final String a() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        SharedPreferences a2 = CommonUtils.a(this.h);
        b(a2);
        String string = a2.getString("crashlytics.installation.id", null);
        return string == null ? a(a2) : string;
    }

    public final String b() {
        return String.format(Locale.US, "%s/%s", new Object[]{a(Build.MANUFACTURER), a(Build.MODEL)});
    }

    public static String a(String str) {
        return str.replaceAll(d, "");
    }

    private String a(SharedPreferences sharedPreferences) {
        String str = "crashlytics.installation.id";
        this.e.lock();
        String str2 = null;
        try {
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                String uuid = UUID.randomUUID().toString();
                if (uuid != null) {
                    str2 = c.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
                }
                string = str2;
                sharedPreferences.edit().putString(str, string).commit();
            }
            return string;
        } finally {
            this.e.unlock();
        }
    }

    private void b(SharedPreferences sharedPreferences) {
        vvj f2 = f();
        if (f2 != null) {
            a(sharedPreferences, f2.a);
        }
    }

    private void a(SharedPreferences sharedPreferences, String str) {
        String str2 = "crashlytics.advertising.id";
        this.e.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString(str2, null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString(str2, str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString(str2, str).commit();
                }
            }
        } finally {
            this.e.unlock();
        }
    }

    public final Map<DeviceIdentifierType, String> c() {
        HashMap hashMap = new HashMap();
        for (vuz vuz : this.j) {
            if (vuz instanceof vvs) {
                for (Entry entry : ((vvs) vuz).d().entrySet()) {
                    a(hashMap, (DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final String d() {
        return this.f.a(this.h);
    }

    private static void a(Map<DeviceIdentifierType, String> map, DeviceIdentifierType deviceIdentifierType, String str) {
        if (str != null) {
            map.put(deviceIdentifierType, str);
        }
    }

    private synchronized vvj f() {
        if (!this.m) {
            this.l = this.k.a();
            this.m = true;
        }
        return this.l;
    }

    public final Boolean e() {
        if (!(this.g && !this.n.a(this.h))) {
            return null;
        }
        vvj f2 = f();
        if (f2 != null) {
            return Boolean.valueOf(f2.b);
        }
        return null;
    }
}
