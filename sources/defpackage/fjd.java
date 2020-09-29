package defpackage;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: fjd reason: default package */
public final class fjd implements fio {
    private final fiu a;

    /* renamed from: fjd$a */
    static final class a<E> extends fin<Collection<E>> {
        private final fin<E> a;
        private final fiy<? extends Collection<E>> b;

        public final /* synthetic */ void a(fjw fjw, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                fjw.e();
                return;
            }
            fjw.a();
            for (Object a2 : collection) {
                this.a.a(fjw, a2);
            }
            fjw.b();
        }

        public a(fid fid, Type type, fin<E> fin, fiy<? extends Collection<E>> fiy) {
            this.a = new fjo(fid, fin, type);
            this.b = fiy;
        }

        public final /* synthetic */ Object a(fjv fjv) {
            if (fjv.f() == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            Collection collection = (Collection) this.b.a();
            fjv.a();
            while (fjv.e()) {
                collection.add(this.a.a(fjv));
            }
            fjv.b();
            return collection;
        }
    }

    public fjd(fiu fiu) {
        this.a = fiu;
    }

    public final <T> fin<T> a(fid fid, fju<T> fju) {
        Type type = fju.b;
        Class<? super T> cls = fju.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a2 = C$Gson$Types.a(type, cls);
        return new a(fid, a2, fid.a(fju.a(a2)), this.a.a(fju));
    }
}
