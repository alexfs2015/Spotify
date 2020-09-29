package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: bwo reason: default package */
public final class bwo extends Fragment implements btm {
    private static WeakHashMap<Activity, WeakReference<bwo>> a = new WeakHashMap<>();
    private Map<String, LifecycleCallback> b = new dp();
    /* access modifiers changed from: private */
    public int c = 0;
    /* access modifiers changed from: private */
    public Bundle d;

    public static bwo a(Activity activity) {
        String str = "LifecycleFragmentImpl";
        WeakReference weakReference = (WeakReference) a.get(activity);
        if (weakReference != null) {
            bwo bwo = (bwo) weakReference.get();
            if (bwo != null) {
                return bwo;
            }
        }
        try {
            bwo bwo2 = (bwo) activity.getFragmentManager().findFragmentByTag(str);
            if (bwo2 == null || bwo2.isRemoving()) {
                bwo2 = new bwo();
                activity.getFragmentManager().beginTransaction().add(bwo2, str).commitAllowingStateLoss();
            }
            a.put(activity, new WeakReference(bwo2));
            return bwo2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    public final Activity D_() {
        return getActivity();
    }

    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.b.get(str));
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, lifecycleCallback);
            if (this.c > 0) {
                new ejq(Looper.getMainLooper()).post(new bwp(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.b.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a2 : this.b.values()) {
            a2.a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = 1;
        this.d = bundle;
        for (Entry entry : this.b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c = 5;
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onResume() {
        super.onResume();
        this.c = 3;
        for (LifecycleCallback c2 : this.b.values()) {
            c2.c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.c = 2;
        for (LifecycleCallback b2 : this.b.values()) {
            b2.b();
        }
    }

    public final void onStop() {
        super.onStop();
        this.c = 4;
        for (LifecycleCallback d2 : this.b.values()) {
            d2.d();
        }
    }
}
