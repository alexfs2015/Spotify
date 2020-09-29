package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.google.common.base.Function;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: qqi reason: default package */
public final class qqi {
    public final fqn a;
    public final Deque<jlm> b = new ArrayDeque();
    public final Context c;
    public Fragment d;
    public a e;
    private final kk f;
    private final int g;

    /* renamed from: qqi$a */
    public interface a {
        void b(Fragment fragment);
    }

    public qqi(kk kkVar, int i, fqn fqn, Context context) {
        this.f = kkVar;
        this.g = i;
        this.a = fqn;
        this.c = context;
    }

    /* access modifiers changed from: private */
    public static Bundle a(jlm jlm) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("fragment_snapshot", (Parcelable) jlm.b().a);
        return bundle;
    }

    private void a(Fragment fragment, boolean z, int i, int i2) {
        kr a2 = this.f.a();
        if (a(-1, -1)) {
            a2.a(-1, -1);
        }
        defpackage.uqo.a.a(fragment, rta.k);
        if (this.d == null) {
            a2.a(this.g, fragment);
        } else {
            if (z) {
                if (this.b.size() >= 30) {
                    this.b.removeLast();
                }
                this.b.push(jlm.a(this.f, this.d));
            }
            qvb.a(a2, this.d, fragment);
            a2.b(this.g, fragment, null);
        }
        this.d = fragment;
        a2.b();
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(this.d);
        }
    }

    private static boolean a(int i, int i2) {
        return (i == -1 || i2 == -1) ? false : true;
    }

    public final void a() {
        this.d = this.f.a(this.g);
    }

    public final void a(Bundle bundle) {
        bundle.putParcelableArray("entries", (Parcelable[]) fcp.a((Iterable<E>) this.b).a((Function<? super E, T>) $$Lambda$qqi$0iAOKcA4KivvKDdnTKnc97NQvgw.INSTANCE).a(Bundle.class));
    }

    public void a(Fragment fragment, boolean z) {
        a(fragment, z, -1, -1);
    }

    public final boolean b() {
        if (this.b.isEmpty()) {
            return false;
        }
        a(((jlm) this.b.pop()).a(), false);
        return true;
    }
}
