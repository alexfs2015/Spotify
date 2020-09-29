package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.HashBiMap;
import com.google.common.hash.Hashing;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ugr reason: default package */
public final class ugr implements ugq {
    private final fej a = Hashing.b();
    private final HashBiMap<Integer, String> b = HashBiMap.a();
    private final Map<Integer, ugp> c = new HashMap();
    private final LayoutInflater d;

    public ugr(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    private int a(String str) {
        return this.a.a().a(str, fbi.c).a().b();
    }

    public final int a(ugt ugt) {
        String canonicalName = ugt.getClass().getCanonicalName();
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
            ugp ugp = (ugp) this.c.get(Integer.valueOf(i));
            if (ugp != null) {
                return ugp.a(this.d, viewGroup);
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

    public final void a(Class<? extends ugt> cls, ugp ugp) {
        String canonicalName = cls.getCanonicalName();
        int a2 = a(canonicalName);
        if (!this.b.containsKey(Integer.valueOf(a2))) {
            this.b.put(Integer.valueOf(a2), canonicalName);
            this.c.put(Integer.valueOf(a2), ugp);
        }
    }

    public final void a(ugt ugt, u uVar) {
        ugp ugp = (ugp) this.c.get(Integer.valueOf(a(ugt)));
        if (ugp != null) {
            ugp.a(ugt);
            return;
        }
        StringBuilder sb = new StringBuilder("No AdapterDelegate added for ViewType ");
        sb.append(uVar.t);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(ugt ugt, u uVar, int i) {
        ugp ugp = (ugp) this.c.get(Integer.valueOf(a(ugt)));
        if (ugp != null) {
            ugp.a(ugt, uVar);
            return;
        }
        StringBuilder sb = new StringBuilder("No AdapterDelegate added for ViewType ");
        sb.append(uVar.t);
        throw new IllegalStateException(sb.toString());
    }
}
