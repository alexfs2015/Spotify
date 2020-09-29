package defpackage;

import com.spotify.base.java.logging.Logger;
import rx.internal.operators.EmptyObservableHolder;

/* renamed from: jwc reason: default package */
public final class jwc<T> implements c<T, T> {
    private final wud<Boolean> a;

    /* renamed from: jwc$a */
    static class a<T> implements wut<Boolean, wud<T>> {
        private final wud<T> a;

        public final /* synthetic */ Object call(Object obj) {
            Boolean bool = (Boolean) obj;
            Logger.b("Applying Flag. Value is:%s", bool);
            return bool.booleanValue() ? this.a : EmptyObservableHolder.a();
        }

        a(wud<T> wud) {
            this.a = wud;
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        return this.a.i(new a((wud) obj));
    }

    public jwc(wud<Boolean> wud) {
        this.a = wud;
    }
}
