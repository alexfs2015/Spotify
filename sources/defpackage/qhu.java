package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.google.common.base.Function;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: qhu reason: default package */
public final class qhu {
    public final fpt a;
    public final Deque<jja> b = new ArrayDeque();
    public final Context c;
    public Fragment d;
    public a e;
    private final kf f;
    private final int g;

    /* renamed from: qhu$a */
    public interface a {
        void b(Fragment fragment);
    }

    private static boolean a(int i, int i2) {
        return (i == -1 || i2 == -1) ? false : true;
    }

    public qhu(kf kfVar, int i, fpt fpt, Context context) {
        this.f = kfVar;
        this.g = i;
        this.a = fpt;
        this.c = context;
    }

    public final void a() {
        this.d = this.f.a(this.g);
    }

    public final void a(Bundle bundle) {
        bundle.putParcelableArray("entries", (Parcelable[]) fbx.a((Iterable<E>) this.b).a((Function<? super E, T>) $$Lambda$qhu$ptk48So_BFr4TpgH21tJ4bsGT3U.INSTANCE).a(Bundle.class));
    }

    /* access modifiers changed from: private */
    public static Bundle a(jja jja) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("fragment_snapshot", (Parcelable) jja.b().a);
        return bundle;
    }

    public void a(Fragment fragment, boolean z) {
        a(fragment, z, -1, -1);
    }

    private void a(Fragment fragment, boolean z, int i, int i2) {
        km a2 = this.f.a();
        if (a(-1, -1)) {
            a2.a(-1, -1);
        }
        defpackage.udt.a.a(fragment, rju.k);
        if (this.d == null) {
            a2.a(this.g, fragment);
        } else {
            if (z) {
                if (this.b.size() >= 30) {
                    this.b.removeLast();
                }
                this.b.push(jja.a(this.f, this.d));
            }
            qmt.a(a2, this.d, fragment);
            a2.b(this.g, fragment, null);
        }
        this.d = fragment;
        a2.b();
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(this.d);
        }
    }

    public final boolean b() {
        if (this.b.isEmpty()) {
            return false;
        }
        a(((jja) this.b.pop()).a(), false);
        return true;
    }
}
