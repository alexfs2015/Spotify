package defpackage;

import io.reactivex.functions.Predicate;
import java.util.concurrent.Callable;

/* renamed from: fok reason: default package */
public final class fok {
    public static final Predicate<Object> a;
    private static final a b;

    /* renamed from: fok$a */
    static final class a implements Predicate<Object>, Callable<Boolean> {
        private final Boolean a;

        a(Boolean bool) {
            this.a = bool;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }

        public final boolean test(Object obj) {
            return this.a.booleanValue();
        }
    }

    static {
        a aVar = new a(Boolean.TRUE);
        b = aVar;
        a = aVar;
    }
}
