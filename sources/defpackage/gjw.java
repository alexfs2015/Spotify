package defpackage;

import com.spotify.intentrouter.MatcherCollisionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: gjw reason: default package */
public final class gjw<T> {
    public final gjt<T> a;
    public a<T> b;
    private final gju<T> c;

    /* renamed from: gjw$a */
    public interface a<T> {
        void a(T t);

        void a(T t, gjv<T> gjv);

        void a(T t, List<gjv<T>> list);
    }

    public gjw(gju<T> gju, gjt<T> gjt) {
        this.c = gju;
        this.a = gjt;
    }

    public final boolean a(T t) {
        gju<T> gju = this.c;
        ArrayList arrayList = new ArrayList();
        for (gjv gjv : gju.a) {
            if (gjv.a().a(t)) {
                arrayList.add(gjv);
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        if (unmodifiableList.size() == 0) {
            a<T> aVar = this.b;
            if (aVar != null) {
                aVar.a(t);
            }
            return false;
        } else if (unmodifiableList.size() > 1) {
            a<T> aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a(t, unmodifiableList);
            }
            throw MatcherCollisionException.a(unmodifiableList);
        } else {
            gjv gjv2 = (gjv) unmodifiableList.get(0);
            a<T> aVar3 = this.b;
            if (aVar3 != null) {
                aVar3.a(t, gjv2);
            }
            gjs b2 = gjv2.b();
            gjt<T> gjt = this.a;
            gjt.a.onNext(b2.c(t));
            return true;
        }
    }
}
