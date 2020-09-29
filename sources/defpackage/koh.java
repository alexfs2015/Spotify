package defpackage;

import com.spotify.mobius.rx2.UnknownEffectException;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: koh reason: default package */
final class koh<F, E> implements ObservableTransformer<F, E> {
    private final kog<F, E> a;

    koh(Set<Class<?>> set, Collection<ObservableTransformer<F, E>> collection) {
        final HashSet hashSet = new HashSet(set);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(collection));
        AnonymousClass1 r3 = new ObservableTransformer<F, E>() {
            public final /* synthetic */ ObservableSource apply(Observable observable) {
                return observable.a((Predicate<? super T>) new Predicate<F>() {
                    public final boolean test(F f) {
                        for (Class isAssignableFrom : hashSet) {
                            if (isAssignableFrom.isAssignableFrom(f.getClass())) {
                                return false;
                            }
                        }
                        return true;
                    }
                }).c((Function<? super T, ? extends R>) new Function<F, E>() {
                    public final E apply(F f) {
                        throw new UnknownEffectException(f);
                    }
                });
            }
        };
        ArrayList arrayList = new ArrayList(unmodifiableList);
        arrayList.add(r3);
        this.a = new kog<>(arrayList);
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return observable.a((ObservableTransformer<? super T, ? extends R>) this.a);
    }
}
