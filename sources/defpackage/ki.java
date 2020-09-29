package defpackage;

import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ki reason: default package */
public class ki extends lt {
    private static final b f = new b() {
        public final <T extends lt> T a(Class<T> cls) {
            return new ki(true);
        }
    };
    final HashSet<Fragment> a = new HashSet<>();
    final HashMap<String, ki> b = new HashMap<>();
    public final HashMap<String, lw> c = new HashMap<>();
    final boolean d;
    boolean e = false;
    private boolean g = false;

    static ki a(lw lwVar) {
        return (ki) new lu(lwVar, f).a(ki.class);
    }

    ki(boolean z) {
        this.d = z;
    }

    public final void a() {
        boolean z = kg.c;
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
        boolean z = kg.c;
        ki kiVar = (ki) this.b.get(fragment.h);
        if (kiVar != null) {
            kiVar.a();
            this.b.remove(fragment.h);
        }
        lw lwVar = (lw) this.c.get(fragment.h);
        if (lwVar != null) {
            lwVar.a();
            this.c.remove(fragment.h);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ki kiVar = (ki) obj;
            return this.a.equals(kiVar.a) && this.b.equals(kiVar.b) && this.c.equals(kiVar.c);
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
