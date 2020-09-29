package defpackage;

import com.google.common.collect.Lists;
import io.reactivex.Completable;
import java.util.Iterator;
import java.util.List;

/* renamed from: msb reason: default package */
public abstract class msb implements msd {

    /* renamed from: msb$a */
    public interface a {
        a a(String str);

        msb a();

        a b(String str);
    }

    public static a c() {
        return new a();
    }

    public final Completable a(vjj vjj) {
        return vjj.b(a(), b());
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public final mrz a(mrz mrz) {
        return mrz.g().b(b()).a();
    }

    public final void a(List<msd> list) {
        mrv mrv = new mrv(a(), b());
        Iterator it = Lists.a((Iterable<? extends E>) list).iterator();
        while (it.hasNext()) {
            msd msd = (msd) it.next();
            if (msd instanceof msb) {
                list.remove(msd);
            }
        }
        if (!fbo.a(b())) {
            list.add(mrv);
        }
    }

    /* access modifiers changed from: protected */
    public abstract String b();
}
