package defpackage;

import io.reactivex.Completable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: msa reason: default package */
public abstract class msa implements msd {

    /* renamed from: msa$a */
    public interface a {
        a a(String str);

        msa a();

        a b(String str);
    }

    public static a c() {
        return new a();
    }

    public final Completable a(vjj vjj) {
        return vjj.b(a(), Collections.singletonList(b()));
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public final mrz a(mrz mrz) {
        Integer num = (Integer) mrz.h().get(b());
        if (num == null) {
            return mrz;
        }
        ArrayList arrayList = new ArrayList(mrz.d());
        arrayList.remove(num.intValue());
        return mrz.g().a((List<vle>) arrayList).a();
    }

    public final void a(List<msd> list) {
        list.add(new mru(a(), b()));
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    public final boolean b(List<msd> list) {
        if (!list.isEmpty()) {
            msd msd = (msd) list.get(list.size() - 1);
            if ((msd instanceof msa) && ((msa) msd).b().equals(b())) {
                list.remove(msd);
                return true;
            }
        }
        return false;
    }
}
