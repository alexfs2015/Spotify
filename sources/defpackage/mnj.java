package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Completable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mnj reason: default package */
public abstract class mnj implements mnk {

    /* renamed from: mnj$a */
    public interface a {
        a a(String str);

        mnj a();

        a b(String str);

        a c(String str);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public abstract String c();

    public final boolean a(List<mnk> list) {
        mnd mnd = new mnd(a(), b(), c());
        if (!list.isEmpty()) {
            mnk mnk = (mnk) list.get(list.size() - 1);
            if (!(mnk instanceof mnj) || !((mnj) mnk).b().equals(b())) {
                list.add(mnd);
                return false;
            }
            list.remove(mnk);
            list.add(mnd);
            return true;
        }
        list.add(mnd);
        return false;
    }

    public final mng a(mng mng) {
        Integer num = (Integer) mng.h().get(b());
        if (num == null) {
            return mng;
        }
        Integer num2 = !fax.a(c()) ? (Integer) mng.h().get(c()) : null;
        ArrayList arrayList = new ArrayList(mng.d());
        uzb uzb = (uzb) arrayList.remove(num.intValue());
        if (num2 == null) {
            arrayList.add(uzb);
        } else if (num.intValue() < num2.intValue()) {
            arrayList.add(num2.intValue() - 1, uzb);
        } else {
            arrayList.add(num2.intValue(), uzb);
        }
        return mng.g().a((List<uzb>) arrayList).a();
    }

    public final Completable a(uxh uxh) {
        String c = c();
        if (!fax.a(c)) {
            return uxh.a(a(), Collections.singletonList(b()), Optional.b(c));
        }
        return uxh.b(a(), Collections.singletonList(b()), Optional.e());
    }

    public static a d() {
        return new a();
    }
}
