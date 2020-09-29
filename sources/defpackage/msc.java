package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Completable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: msc reason: default package */
public abstract class msc implements msd {

    /* renamed from: msc$a */
    public interface a {
        a a(String str);

        msc a();

        a b(String str);

        a c(String str);
    }

    public static a d() {
        return new a();
    }

    public final Completable a(vjj vjj) {
        String c = c();
        return !fbo.a(c) ? vjj.a(a(), Collections.singletonList(b()), Optional.b(c)) : vjj.b(a(), Collections.singletonList(b()), Optional.e());
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public final mrz a(mrz mrz) {
        Integer num = (Integer) mrz.h().get(b());
        if (num == null) {
            return mrz;
        }
        Integer num2 = !fbo.a(c()) ? (Integer) mrz.h().get(c()) : null;
        ArrayList arrayList = new ArrayList(mrz.d());
        vle vle = (vle) arrayList.remove(num.intValue());
        if (num2 == null) {
            arrayList.add(vle);
        } else if (num.intValue() < num2.intValue()) {
            arrayList.add(num2.intValue() - 1, vle);
        } else {
            arrayList.add(num2.intValue(), vle);
        }
        return mrz.g().a((List<vle>) arrayList).a();
    }

    public final boolean a(List<msd> list) {
        mrw mrw = new mrw(a(), b(), c());
        if (!list.isEmpty()) {
            msd msd = (msd) list.get(list.size() - 1);
            if (!(msd instanceof msc) || !((msc) msd).b().equals(b())) {
                list.add(mrw);
                return false;
            }
            list.remove(msd);
            list.add(mrw);
            return true;
        }
        list.add(mrw);
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public abstract String c();
}
