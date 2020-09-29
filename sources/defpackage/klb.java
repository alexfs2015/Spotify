package defpackage;

import com.spotify.mobius.ConnectionException;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.HashMap;
import java.util.Map;

/* renamed from: klb reason: default package */
public final class klb {

    /* renamed from: klb$a */
    public static class a<F, E> {
        C0046a<ObservableTransformer<? extends F, E>, Consumer<Throwable>> a;
        private final Map<Class<?>, ObservableTransformer<F, E>> b;

        /* renamed from: klb$a$a reason: collision with other inner class name */
        interface C0046a<T, R> extends Function<T, R> {
            R apply(T t);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        private a() {
            this.b = new HashMap();
            this.a = new C0046a<ObservableTransformer<? extends F, E>, Consumer<Throwable>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    return new Consumer<Throwable>((ObservableTransformer) obj) {
                        private /* synthetic */ ObservableTransformer a;

                        {
                            this.a = r1;
                        }

                        public final /* synthetic */ void accept(Object obj) {
                            RxJavaPlugins.b().accept(new ConnectionException(this.a.getClass().toString(), (Throwable) obj));
                        }
                    };
                }
            };
        }

        public final <G extends F> a<F, E> a(final Class<G> cls, final ObservableTransformer<G, E> observableTransformer) {
            kkr.a(cls);
            kkr.a(observableTransformer);
            for (Class cls2 : this.b.keySet()) {
                if (!cls2.isAssignableFrom(cls)) {
                    if (cls.isAssignableFrom(cls2)) {
                    }
                }
                StringBuilder sb = new StringBuilder("Effect classes may not be assignable to each other, collision found: ");
                sb.append(cls.getSimpleName());
                sb.append(" <-> ");
                sb.append(cls2.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.b.put(cls, new ObservableTransformer<F, E>() {
                public final /* synthetic */ ObservableSource apply(Observable observable) {
                    Class cls = cls;
                    ObjectHelper.a(cls, "clazz is null");
                    return observable.a(Functions.b(cls)).a(cls).a(observableTransformer).a((Consumer) a.this.a.apply(observableTransformer));
                }
            });
            return this;
        }

        public final <G extends F> a<F, E> a(Class<G> cls, Function<G, E> function) {
            kkr.a(cls);
            kkr.a(function);
            return a(cls, kle.a(function, (Scheduler) null));
        }

        public final <G extends F> a<F, E> a(Class<G> cls, Action action) {
            kkr.a(cls);
            kkr.a(action);
            return a(cls, kle.a(action, (Scheduler) null));
        }

        public final <G extends F> a<F, E> a(Class<G> cls, Action action, Scheduler scheduler) {
            kkr.a(cls);
            kkr.a(action);
            return a(cls, kle.a(action, scheduler));
        }

        public final <G extends F> a<F, E> a(Class<G> cls, Consumer<G> consumer) {
            kkr.a(cls);
            kkr.a(consumer);
            return a(cls, kle.a(consumer, (Scheduler) null));
        }

        public final <G extends F> a<F, E> a(Class<G> cls, Consumer<G> consumer, Scheduler scheduler) {
            kkr.a(cls);
            kkr.a(consumer);
            return a(cls, kle.a(consumer, scheduler));
        }

        public final ObservableTransformer<F, E> a() {
            return new kky(this.b.keySet(), this.b.values());
        }
    }

    public static <M, E, F> ObservableTransformer<E, M> a(c<M, E, F> cVar, M m) {
        return new klc(cVar, m);
    }

    public static <M, E, F> defpackage.kju.a<M, E, F> a(kjz<M, E, F> kjz, ObservableTransformer<F, E> observableTransformer) {
        return kjt.a(kjz, kkz.a(observableTransformer));
    }

    public static <F, E> a<F, E> a() {
        return new a<>(0);
    }
}
