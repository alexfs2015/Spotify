package defpackage;

import com.spotify.base.java.logging.Logger;
import rx.internal.operators.EmptyObservableHolder;

/* renamed from: jyk reason: default package */
public final class jyk<T> implements c<T, T> {
    private final xii<Boolean> a;

    /* renamed from: jyk$a */
    static class a<T> implements xiy<Boolean, xii<T>> {
        private final xii<T> a;

        a(xii<T> xii) {
            this.a = xii;
        }

        public final /* synthetic */ Object call(Object obj) {
            Boolean bool = (Boolean) obj;
            Logger.b("Applying Flag. Value is:%s", bool);
            return bool.booleanValue() ? this.a : EmptyObservableHolder.a();
        }
    }

    public jyk(xii<Boolean> xii) {
        this.a = xii;
    }

    public final /* synthetic */ Object call(Object obj) {
        return this.a.h(new a((xii) obj));
    }
}
