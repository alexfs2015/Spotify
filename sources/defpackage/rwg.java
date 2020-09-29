package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/* renamed from: rwg reason: default package */
public final class rwg implements ActivityLifecycleCallbacks {
    private static b<Object, Integer> a = b.a("debug_save_state_budget_bytes");
    private final Map<String, Integer> b = new HashMap(64);
    private final int c;
    private int d;

    private rwg(int i) {
        this.c = i;
    }

    private static int a(Bundle bundle, StringBuilder sb) {
        Parcel obtain = Parcel.obtain();
        int i = 0;
        for (String str : bundle.keySet()) {
            a(2, sb, str, " = ");
            Object obj = bundle.get(str);
            if (obj == null) {
                sb.append("0 bytes (null)");
            } else {
                obtain.setDataPosition(0);
                obtain.setDataSize(0);
                int i2 = -1;
                if (obj instanceof Parcelable) {
                    obtain.writeParcelable((Parcelable) obj, 0);
                    i2 = obtain.dataSize();
                } else if (obj instanceof SparseIntArray) {
                    juo.a(obtain, (SparseIntArray) obj);
                    i2 = obtain.dataSize();
                } else {
                    try {
                        obtain.writeValue(obj);
                        i2 = obtain.dataSize();
                    } catch (RuntimeException unused) {
                    }
                }
                String simpleName = obj.getClass().getSimpleName();
                if (i2 < 0) {
                    a(0, sb, simpleName, " not supported, ??? bytes");
                } else {
                    a(0, sb, Integer.valueOf(i2), " bytes (", simpleName, Character.valueOf(')'));
                    i += i2;
                }
            }
        }
        obtain.recycle();
        return i;
    }

    private int a(StringBuilder sb, String str, Bundle bundle, Bundle bundle2) {
        a(0, sb, "Save state for: ", str);
        int a2 = bundle == null ? 0 : a(bundle, sb);
        int a3 = bundle2 == null ? 0 : a(bundle2, sb);
        int i = a2 + a3;
        a(2, sb, "Total bytes: ", Integer.valueOf(i), " ( args: ", Integer.valueOf(a3), ", state: ", Integer.valueOf(a2), ") bytes");
        return i;
    }

    private static String a(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getName());
        sb.append('@');
        sb.append(System.identityHashCode(obj));
        return sb.toString();
    }

    private static void a(int i, StringBuilder sb, Object... objArr) {
        if (i != 0) {
            sb.append(10);
        }
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        for (Object append : objArr) {
            sb.append(append);
        }
    }

    public static void a(Application application, Random random, SpSharedPreferences<Object> spSharedPreferences) {
        if (random.nextFloat() < 0.1f) {
            application.registerActivityLifecycleCallbacks(new rwg(spSharedPreferences.a(a, 370000)));
        }
    }

    private void a(String str) {
        if (str != null) {
            Integer num = (Integer) this.b.remove(str);
            if (num != null) {
                this.d -= num.intValue();
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (bundle != null) {
            a(bundle.getString("__dm"));
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        a(a((Object) activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        String a2 = a((Object) activity);
        Bundle extras = activity.getIntent() != null ? activity.getIntent().getExtras() : null;
        bundle.putString("__dm", a2);
        DebugFlag debugFlag = DebugFlag.ENABLE_PRINTING_STATE_DIAGNOSTICS;
        Parcel obtain = Parcel.obtain();
        if (bundle != null) {
            bundle.writeToParcel(obtain, 0);
        }
        if (extras != null) {
            extras.writeToParcel(obtain, 0);
        }
        int dataSize = obtain.dataSize();
        obtain.recycle();
        this.b.put(a2, Integer.valueOf(dataSize));
        this.d += dataSize;
        if (this.d > this.c) {
            StringBuilder sb = new StringBuilder(400);
            a(sb, a2, bundle, extras);
            StringBuilder sb2 = new StringBuilder(this.b.size() * 50);
            for (Entry entry : this.b.entrySet()) {
                sb2.append(10);
                sb2.append((String) entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
            }
            Assertion.b(String.format(Locale.US, "Application state exceeded state budget, %d > %d\n%s%s", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), sb, sb2}));
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
