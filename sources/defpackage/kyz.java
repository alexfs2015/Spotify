package defpackage;

import java.util.concurrent.Callable;

/* renamed from: kyz reason: default package */
public interface kyz {

    /* renamed from: kyz$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Boolean a(kyk kyk, fqn fqn) {
            return Boolean.valueOf(kyk.d(fqn) && !kyk.b(fqn));
        }

        public static Callable<Boolean> a(fqn fqn, kyk kyk) {
            return new $$Lambda$kyz$61clGCKv_082itswOHkFCWOKlow(kyk, fqn);
        }
    }
}
