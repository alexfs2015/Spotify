package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: bwq reason: default package */
public final class bwq extends Fragment implements btm {
    private static WeakHashMap<kf, WeakReference<bwq>> a = new WeakHashMap<>();
    /* access modifiers changed from: private */
    public int T = 0;
    /* access modifiers changed from: private */
    public Bundle U;
    private Map<String, LifecycleCallback> b = new dp();

    public static bwq a(kf kfVar) {
        String str = "SupportLifecycleFragmentImpl";
        WeakReference weakReference = (WeakReference) a.get(kfVar);
        if (weakReference != null) {
            bwq bwq = (bwq) weakReference.get();
            if (bwq != null) {
                return bwq;
            }
        }
        try {
            bwq bwq2 = (bwq) kfVar.i().a(str);
            if (bwq2 == null || bwq2.n) {
                bwq2 = new bwq();
                kfVar.i().a().a((Fragment) bwq2, str).c();
            }
            a.put(kfVar, new WeakReference(bwq2));
            return bwq2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    public final void B() {
        super.B();
        this.T = 5;
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final /* synthetic */ Activity D_() {
        return p();
    }

    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.b.get(str));
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        for (LifecycleCallback a2 : this.b.values()) {
            a2.a(i, i2, intent);
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, lifecycleCallback);
            if (this.T > 0) {
                new ejq(Looper.getMainLooper()).post(new bwr(this, lifecycleCallback, str));
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

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.b.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void aP_() {
        super.aP_();
        this.T = 2;
        for (LifecycleCallback b2 : this.b.values()) {
            b2.b();
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.T = 1;
        this.U = bundle;
        for (Entry entry : this.b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle != null) {
            for (Entry entry : this.b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void h() {
        super.h();
        this.T = 4;
        for (LifecycleCallback d : this.b.values()) {
            d.d();
        }
    }

    public final void z() {
        super.z();
        this.T = 3;
        for (LifecycleCallback c : this.b.values()) {
            c.c();
        }
    }
}
