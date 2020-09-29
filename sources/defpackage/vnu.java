package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: vnu reason: default package */
public abstract class vnu {
    public static final vnu a = new a().a((vnv) new c()).b(true).a(true).c(false).a();

    /* renamed from: vnu$a */
    public interface a {
        a a(vnv vnv);

        a a(boolean z);

        vnu a();

        a b(boolean z);

        a c(boolean z);
    }

    public final vnu a(vnv vnv) {
        return e().a(vnv).a();
    }

    public final vnu a(boolean z) {
        return e().a(z).a();
    }

    public abstract vnv a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract a e();

    public final Set<voh> f() {
        HashSet hashSet = new HashSet(0);
        fdz R_ = ((b) a()).a.R_();
        while (R_.hasNext()) {
            voe voe = (voe) R_.next();
            if (voe instanceof voh) {
                voh voh = (voh) voe;
                if (voh.d()) {
                    hashSet.add(voh);
                }
            }
        }
        return hashSet;
    }
}
