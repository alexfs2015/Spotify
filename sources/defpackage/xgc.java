package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.HttpException;

/* renamed from: xgc reason: default package */
final class xgc extends defpackage.xga.a {
    static final defpackage.xga.a a = new xgc();

    /* renamed from: xgc$a */
    static final class a<R> implements xga<R, CompletableFuture<R>> {
        private final Type a;

        a(Type type) {
            this.a = type;
        }

        public final /* synthetic */ Object a(final xfz xfz) {
            final AnonymousClass1 r0 = new CompletableFuture<R>() {
                public final boolean cancel(boolean z) {
                    if (z) {
                        xfz.b();
                    }
                    return super.cancel(z);
                }
            };
            xfz.a(new xgb<R>() {
                public final void a(xfz<R> xfz, Throwable th) {
                    r0.completeExceptionally(th);
                }

                public final void a(xgo<R> xgo) {
                    if (xgo.a()) {
                        r0.complete(xgo.b());
                    } else {
                        r0.completeExceptionally(new HttpException(xgo));
                    }
                }
            });
            return r0;
        }

        public final Type a() {
            return this.a;
        }
    }

    /* renamed from: xgc$b */
    static final class b<R> implements xga<R, CompletableFuture<xgo<R>>> {
        private final Type a;

        b(Type type) {
            this.a = type;
        }

        public final /* synthetic */ Object a(final xfz xfz) {
            final AnonymousClass1 r0 = new CompletableFuture<xgo<R>>() {
                public final boolean cancel(boolean z) {
                    if (z) {
                        xfz.b();
                    }
                    return super.cancel(z);
                }
            };
            xfz.a(new xgb<R>() {
                public final void a(xfz<R> xfz, Throwable th) {
                    r0.completeExceptionally(th);
                }

                public final void a(xgo<R> xgo) {
                    r0.complete(xgo);
                }
            });
            return r0;
        }

        public final Type a() {
            return this.a;
        }
    }

    xgc() {
    }

    public final xga<?, ?> a(Type type) {
        if (xgr.a(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2 = xgr.a(0, (ParameterizedType) type);
            if (xgr.a(a2) != xgo.class) {
                return new a(a2);
            }
            if (a2 instanceof ParameterizedType) {
                return new b(xgr.a(0, (ParameterizedType) a2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
