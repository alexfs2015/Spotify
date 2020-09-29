package defpackage;

import io.reactivex.Completable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mnh reason: default package */
public abstract class mnh implements mnk {

    /* renamed from: mnh$a */
    public interface a {
        a a(String str);

        mnh a();

        a b(String str);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract String b();

    public final void a(List<mnk> list) {
        list.add(new mnb(a(), b()));
    }

    public final boolean b(List<mnk> list) {
        if (!list.isEmpty()) {
            mnk mnk = (mnk) list.get(list.size() - 1);
            if ((mnk instanceof mnh) && ((mnh) mnk).b().equals(b())) {
                list.remove(mnk);
                return true;
            }
        }
        return false;
    }

    public final mng a(mng mng) {
        Integer num = (Integer) mng.h().get(b());
        if (num == null) {
            return mng;
        }
        ArrayList arrayList = new ArrayList(mng.d());
        arrayList.remove(num.intValue());
        return mng.g().a((List<uzb>) arrayList).a();
    }

    public final Completable a(uxh uxh) {
        return uxh.b(a(), Collections.singletonList(b()));
    }

    public static a c() {
        return new a();
    }
}
