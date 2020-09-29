package defpackage;

import com.google.common.collect.Lists;
import io.reactivex.Completable;
import java.util.Iterator;
import java.util.List;

/* renamed from: mni reason: default package */
public abstract class mni implements mnk {

    /* renamed from: mni$a */
    public interface a {
        a a(String str);

        mni a();

        a b(String str);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract String b();

    public final void a(List<mnk> list) {
        mnc mnc = new mnc(a(), b());
        Iterator it = Lists.a((Iterable<? extends E>) list).iterator();
        while (it.hasNext()) {
            mnk mnk = (mnk) it.next();
            if (mnk instanceof mni) {
                list.remove(mnk);
            }
        }
        if (!fax.a(b())) {
            list.add(mnc);
        }
    }

    public final mng a(mng mng) {
        return mng.g().b(b()).a();
    }

    public final Completable a(uxh uxh) {
        return uxh.b(a(), b());
    }

    public static a c() {
        return new a();
    }
}
