package defpackage;

import com.spotify.intentrouter.MatcherCollisionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: glh reason: default package */
public final class glh<T> {
    public final gle<T> a;
    public a<T> b;
    private final glf<T> c;

    /* renamed from: glh$a */
    public interface a<T> {
        void a(T t);

        void a(T t, glg<T> glg);

        void a(T t, List<glg<T>> list);
    }

    public glh(glf<T> glf, gle<T> gle) {
        this.c = glf;
        this.a = gle;
    }

    public final boolean a(T t) {
        glf<T> glf = this.c;
        ArrayList arrayList = new ArrayList();
        for (glg glg : glf.a) {
            if (glg.a().a(t)) {
                arrayList.add(glg);
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
            glg glg2 = (glg) unmodifiableList.get(0);
            a<T> aVar3 = this.b;
            if (aVar3 != null) {
                aVar3.a(t, glg2);
            }
            gld b2 = glg2.b();
            gle<T> gle = this.a;
            gle.a.onNext(b2.c(t));
            return true;
        }
    }
}
