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

/* renamed from: bvx reason: default package */
public final class bvx extends Fragment implements bsv {
    private static WeakHashMap<Activity, WeakReference<bvx>> a = new WeakHashMap<>();
    private Map<String, LifecycleCallback> b = new dp();
    /* access modifiers changed from: private */
    public int c = 0;
    /* access modifiers changed from: private */
    public Bundle d;

    public static bvx a(Activity activity) {
        String str = "LifecycleFragmentImpl";
        WeakReference weakReference = (WeakReference) a.get(activity);
        if (weakReference != null) {
            bvx bvx = (bvx) weakReference.get();
            if (bvx != null) {
                return bvx;
            }
        }
        try {
            bvx bvx2 = (bvx) activity.getFragmentManager().findFragmentByTag(str);
            if (bvx2 == null || bvx2.isRemoving()) {
                bvx2 = new bvx();
                activity.getFragmentManager().beginTransaction().add(bvx2, str).commitAllowingStateLoss();
            }
            a.put(activity, new WeakReference(bvx2));
            return bvx2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.b.get(str));
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, lifecycleCallback);
            if (this.c > 0) {
                new eiz(Looper.getMainLooper()).post(new bvy(this, lifecycleCallback, str));
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

    public final Activity D_() {
        return getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = 1;
        this.d = bundle;
        for (Entry entry : this.b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.c = 2;
        for (LifecycleCallback b2 : this.b.values()) {
            b2.b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.c = 3;
        for (LifecycleCallback c2 : this.b.values()) {
            c2.c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a2 : this.b.values()) {
            a2.a(i, i2, intent);
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

    public final void onStop() {
        super.onStop();
        this.c = 4;
        for (LifecycleCallback d2 : this.b.values()) {
            d2.d();
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

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.b.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
