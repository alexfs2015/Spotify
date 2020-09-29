package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.HttpException;

/* renamed from: wrx reason: default package */
final class wrx extends defpackage.wrv.a {
    static final defpackage.wrv.a a = new wrx();

    /* renamed from: wrx$a */
    static final class a<R> implements wrv<R, CompletableFuture<R>> {
        private final Type a;

        a(Type type) {
            this.a = type;
        }

        public final Type a() {
            return this.a;
        }

        public final /* synthetic */ Object a(final wru wru) {
            final AnonymousClass1 r0 = new CompletableFuture<R>() {
                public final boolean cancel(boolean z) {
                    if (z) {
                        wru.b();
                    }
                    return super.cancel(z);
                }
            };
            wru.a(new wrw<R>() {
                public final void a(wsj<R> wsj) {
                    if (wsj.a()) {
                        r0.complete(wsj.b());
                    } else {
                        r0.completeExceptionally(new HttpException(wsj));
                    }
                }

                public final void a(wru<R> wru, Throwable th) {
                    r0.completeExceptionally(th);
                }
            });
            return r0;
        }
    }

    /* renamed from: wrx$b */
    static final class b<R> implements wrv<R, CompletableFuture<wsj<R>>> {
        private final Type a;

        b(Type type) {
            this.a = type;
        }

        public final Type a() {
            return this.a;
        }

        public final /* synthetic */ Object a(final wru wru) {
            final AnonymousClass1 r0 = new CompletableFuture<wsj<R>>() {
                public final boolean cancel(boolean z) {
                    if (z) {
                        wru.b();
                    }
                    return super.cancel(z);
                }
            };
            wru.a(new wrw<R>() {
                public final void a(wsj<R> wsj) {
                    r0.complete(wsj);
                }

                public final void a(wru<R> wru, Throwable th) {
                    r0.completeExceptionally(th);
                }
            });
            return r0;
        }
    }

    wrx() {
    }

    public final wrv<?, ?> a(Type type) {
        if (wsm.a(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2 = wsm.a(0, (ParameterizedType) type);
            if (wsm.a(a2) != wsj.class) {
                return new a(a2);
            }
            if (a2 instanceof ParameterizedType) {
                return new b(wsm.a(0, (ParameterizedType) a2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
