package defpackage;

import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: wvx reason: default package */
public final class wvx<T, U> implements b<T, T>, wuu<U, U, Boolean> {
    final wut<? super T, ? extends U> a;
    final wuu<? super U, ? super U, Boolean> b = this;

    /* renamed from: wvx$a */
    static final class a {
        static final wvx<?, ?> a = new wvx<>(Identity.INSTANCE);
    }

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        return new wuj<T>(wuj) {
            private U a;
            private boolean b;

            public final void onNext(T t) {
                try {
                    U call = wvx.this.a.call(t);
                    U u = this.a;
                    this.a = call;
                    if (this.b) {
                        try {
                            if (!((Boolean) wvx.this.b.call(u, call)).booleanValue()) {
                                wuj.onNext(t);
                            } else {
                                request(1);
                            }
                        } catch (Throwable th) {
                            wul.a(th, wuj, call);
                        }
                    } else {
                        this.b = true;
                        wuj.onNext(t);
                    }
                } catch (Throwable th2) {
                    wul.a(th2, wuj, t);
                }
            }

            public final void onError(Throwable th) {
                wuj.onError(th);
            }

            public final void onCompleted() {
                wuj.onCompleted();
            }
        };
    }

    public static <T> wvx<T, T> a() {
        return a.a;
    }

    public wvx(wut<? super T, ? extends U> wut) {
        this.a = wut;
    }

    public final /* synthetic */ Object call(Object obj, Object obj2) {
        return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
    }
}
