package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: vbg reason: default package */
public abstract class vbg {
    public static final vbg a = new a().a((vbh) new c()).b(true).a(true).c(false).a();

    /* renamed from: vbg$a */
    public interface a {
        a a(vbh vbh);

        a a(boolean z);

        vbg a();

        a b(boolean z);

        a c(boolean z);
    }

    public abstract vbh a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract a e();

    public final vbg a(vbh vbh) {
        return e().a(vbh).a();
    }

    public final vbg a(boolean z) {
        return e().a(z).a();
    }

    public final Set<vbt> f() {
        HashSet hashSet = new HashSet(0);
        fdh R_ = ((b) a()).a.R_();
        while (R_.hasNext()) {
            vbq vbq = (vbq) R_.next();
            if (vbq instanceof vbt) {
                vbt vbt = (vbt) vbq;
                if (vbt.d()) {
                    hashSet.add(vbt);
                }
            }
        }
        return hashSet;
    }
}
