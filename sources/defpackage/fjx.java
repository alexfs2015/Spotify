package defpackage;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: fjx reason: default package */
public final class fjx implements fji {
    private final fjo a;

    /* renamed from: fjx$a */
    static final class a<E> extends fjh<Collection<E>> {
        private final fjh<E> a;
        private final fjs<? extends Collection<E>> b;

        public a(fix fix, Type type, fjh<E> fjh, fjs<? extends Collection<E>> fjs) {
            this.a = new fki(fix, fjh, type);
            this.b = fjs;
        }

        public final /* synthetic */ Object a(fkp fkp) {
            if (fkp.f() == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            Collection collection = (Collection) this.b.a();
            fkp.a();
            while (fkp.e()) {
                collection.add(this.a.a(fkp));
            }
            fkp.b();
            return collection;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                fkq.e();
                return;
            }
            fkq.a();
            for (Object a2 : collection) {
                this.a.a(fkq, a2);
            }
            fkq.b();
        }
    }

    public fjx(fjo fjo) {
        this.a = fjo;
    }

    public final <T> fjh<T> a(fix fix, fko<T> fko) {
        Type type = fko.b;
        Class<? super T> cls = fko.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a2 = C$Gson$Types.a(type, cls);
        return new a(fix, a2, fix.a(fko.a(a2)), this.a.a(fko));
    }
}
