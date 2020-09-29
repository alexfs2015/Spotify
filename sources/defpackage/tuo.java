package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.HashBiMap;
import com.google.common.hash.Hashing;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tuo reason: default package */
public final class tuo implements tun {
    private final fdr a = Hashing.b();
    private final HashBiMap<Integer, String> b = HashBiMap.a();
    private final Map<Integer, tum> c = new HashMap();
    private final LayoutInflater d;

    public tuo(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    public final void a(Class<? extends tuq> cls, tum tum) {
        String canonicalName = cls.getCanonicalName();
        int a2 = a(canonicalName);
        if (!this.b.containsKey(Integer.valueOf(a2))) {
            this.b.put(Integer.valueOf(a2), canonicalName);
            this.c.put(Integer.valueOf(a2), tum);
        }
    }

    public final int a(tuq tuq) {
        String canonicalName = tuq.getClass().getCanonicalName();
        if (this.b.containsValue(canonicalName)) {
            return ((Integer) this.b.inverse().get(canonicalName)).intValue();
        }
        StringBuilder sb = new StringBuilder("No AdapterDelegate added that can handle type: ");
        sb.append(canonicalName);
        sb.append(" Did you register the segment in any adapter delegate?");
        throw new IllegalArgumentException(sb.toString());
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            tum tum = (tum) this.c.get(Integer.valueOf(i));
            if (tum != null) {
                return tum.a(this.d, viewGroup);
            }
            StringBuilder sb = new StringBuilder("No AdapterDelegate added for ViewType ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("ViewType ");
        sb2.append(i);
        sb2.append(" is registered but delegate was null. Did you actually create it?");
        throw new IllegalStateException(sb2.toString());
    }

    public final void a(tuq tuq, u uVar, int i) {
        tum tum = (tum) this.c.get(Integer.valueOf(a(tuq)));
        if (tum != null) {
            tum.a(tuq, uVar);
            return;
        }
        StringBuilder sb = new StringBuilder("No AdapterDelegate added for ViewType ");
        sb.append(uVar.t);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(tuq tuq, u uVar) {
        tum tum = (tum) this.c.get(Integer.valueOf(a(tuq)));
        if (tum != null) {
            tum.a(tuq);
            return;
        }
        StringBuilder sb = new StringBuilder("No AdapterDelegate added for ViewType ");
        sb.append(uVar.t);
        throw new IllegalStateException(sb.toString());
    }

    private int a(String str) {
        return this.a.a().a(str, far.c).a().b();
    }
}
