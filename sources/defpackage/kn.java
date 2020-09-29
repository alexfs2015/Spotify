package defpackage;

import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: kn reason: default package */
public class kn extends ly {
    private static final b f = new b() {
        public final <T extends ly> T a(Class<T> cls) {
            return new kn(true);
        }
    };
    final HashSet<Fragment> a = new HashSet<>();
    final HashMap<String, kn> b = new HashMap<>();
    public final HashMap<String, mb> c = new HashMap<>();
    final boolean d;
    boolean e = false;
    private boolean g = false;

    kn(boolean z) {
        this.d = z;
    }

    static kn a(mb mbVar) {
        return (kn) new lz(mbVar, f).a(kn.class);
    }

    public final void a() {
        boolean z = kl.c;
        this.e = true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Fragment fragment) {
        return this.a.add(fragment);
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(Fragment fragment) {
        if (this.a.contains(fragment) && this.d) {
            return this.e;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void c(Fragment fragment) {
        boolean z = kl.c;
        kn knVar = (kn) this.b.get(fragment.h);
        if (knVar != null) {
            knVar.a();
            this.b.remove(fragment.h);
        }
        mb mbVar = (mb) this.c.get(fragment.h);
        if (mbVar != null) {
            mbVar.a();
            this.c.remove(fragment.h);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kn knVar = (kn) obj;
            return this.a.equals(knVar.a) && this.b.equals(knVar.b) && this.c.equals(knVar.c);
        }
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.a.iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
