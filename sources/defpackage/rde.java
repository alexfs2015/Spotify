package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;

/* renamed from: rde reason: default package */
public final class rde {

    /* renamed from: rde$a */
    public interface a {
        boolean apply(rdb rdb);
    }

    /* renamed from: rde$b */
    public interface b {
        boolean apply(rdb rdb, MusicItem musicItem);
    }

    public static rda a(final ImmutableList<rda> immutableList) {
        ArrayList arrayList = new ArrayList(immutableList.size());
        fdz R_ = immutableList.R_();
        while (R_.hasNext()) {
            arrayList.add(((rda) R_.next()).a());
        }
        final Observable a2 = Observable.a((Iterable<? extends ObservableSource<? extends T>>) arrayList, (Function<? super Object[], ? extends R>) $$Lambda$rde$tlmrlnoPN3Tt4YtifqqYZWI31w.INSTANCE).a(1).a();
        ArrayList arrayList2 = new ArrayList(immutableList.size());
        fdz R_2 = immutableList.R_();
        while (R_2.hasNext()) {
            arrayList2.add(((rda) R_2.next()).b());
        }
        final Observable a3 = Observable.a((Iterable<? extends ObservableSource<? extends T>>) arrayList2, (Function<? super Object[], ? extends R>) $$Lambda$rde$BgNA3G8Hw41j0I3KKnkYkP1DXt0.INSTANCE).a(1).a();
        return new rda() {
            /* access modifiers changed from: private */
            public static /* synthetic */ rdc a(Object[] objArr) {
                com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    g.c(objArr[i]);
                }
                return rdd.a(g.a());
            }

            public final Observable<Boolean> a() {
                return a2;
            }

            public final Observable<rdc> a(Observable<rdb> observable) {
                ArrayList arrayList = new ArrayList(immutableList.size());
                fdz R_ = immutableList.R_();
                rda rda = null;
                Observable<rdb> observable2 = observable;
                while (R_.hasNext()) {
                    rda rda2 = (rda) R_.next();
                    observable2 = rda == null ? observable.a(1).a() : Observable.a((ObservableSource<? extends T1>) observable2, (ObservableSource<? extends T2>) rda.b().c((Function<? super T, ? extends R>) $$Lambda$BMiNOJXPctCxuj52nmfjQpkGCcc.INSTANCE).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$rde$6$nMJ3aFxhb5XTioQFBz8CjBgTc.INSTANCE).a(1).a();
                    arrayList.add(rda2.a(observable2));
                    rda = rda2;
                }
                return Observable.a((Iterable<? extends ObservableSource<? extends T>>) arrayList, (Function<? super Object[], ? extends R>) $$Lambda$rde$6$uksxv9iuipJzn4nCh9Z4fs6ui8w.INSTANCE);
            }

            public final Observable<rdc> b() {
                return a3;
            }
        };
    }

    public static rda a(Observable<MusicItem> observable) {
        Observable a2 = observable.c((Function<? super T, ? extends R>) $$Lambda$qAFmNuqsVCGX83VoNWFdKbGgyc.INSTANCE).a(1).a();
        final Observable a3 = a2.c((Function<? super T, ? extends R>) $$Lambda$rde$uI89SmW_9wsOEK_R3BBl0FYFDtg.INSTANCE).a(1).a();
        final Observable a4 = a2.c((Function<? super T, ? extends R>) $$Lambda$izXbHfLZJZGW4IMh98cyWkI5sQ.INSTANCE).a(1).a();
        return new rda() {
            public final Observable<Boolean> a() {
                return a3;
            }

            public final Observable<rdc> a(Observable<rdb> observable) {
                return Observable.a((ObservableSource<? extends T1>) a4, (ObservableSource<? extends T2>) observable.a((BiPredicate<? super T, ? super T>) $$Lambda$rde$8$UY63xXWDKPV3yqYz4xEcIMegfLQ.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$rde$8$6_1mC000kSwBmvi5owffOP8sl9I.INSTANCE);
            }

            public final Observable<rdc> b() {
                return a4;
            }
        };
    }

    public static rda a(Observable<Boolean> observable, final rda rda) {
        final Observable a2 = observable.a(Functions.a()).a(1).a();
        return new rda() {
            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource a(rda rda, Observable observable, Boolean bool) {
                return bool.booleanValue() ? rda.a(observable) : Observable.b(rdc.h);
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource a(rda rda, Boolean bool) {
                return bool.booleanValue() ? rda.b() : Observable.b(rdc.h);
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource b(rda rda, Boolean bool) {
                return bool.booleanValue() ? rda.a() : Observable.b(Boolean.FALSE);
            }

            public final Observable<Boolean> a() {
                return a2.h(new $$Lambda$rde$1$FRcUio6UJXw4g1MEGEeGBqqq3S0(rda)).e(Boolean.FALSE);
            }

            public final Observable<rdc> a(Observable<rdb> observable) {
                return a2.h(new $$Lambda$rde$1$lCsZ4SFxFtKM0yGfp8UUGsZxA(rda, observable));
            }

            public final Observable<rdc> b() {
                return a2.h(new $$Lambda$rde$1$1gpnd_itbmIRY7oxzBAKLRfRRiE(rda)).e(rdc.i);
            }
        };
    }

    public static rda a(final ObservableTransformer<rdb, rdc> observableTransformer) {
        return new rda() {
            private final PublishSubject<rdc> a = PublishSubject.a();

            public final Observable<Boolean> a() {
                return this.a.e(rdc.h).c((Function<? super T, ? extends R>) $$Lambda$rde$10$MlGtW_MhVjqyZ0KAtXV9FOC32f8.INSTANCE);
            }

            public final Observable<rdc> a(Observable<rdb> observable) {
                Observable a2 = observable.a(observableTransformer).a(Functions.a());
                PublishSubject<rdc> publishSubject = this.a;
                publishSubject.getClass();
                return a2.b((Consumer<? super T>) new $$Lambda$aRm7UzXWS9e0sn472n_IAE1wqE<Object>(publishSubject));
            }

            public final Observable<rdc> b() {
                return this.a.e(rdc.h);
            }
        };
    }

    public static rda a(final rda rda) {
        return new rda() {
            public final Observable<Boolean> a() {
                return rda.a().e(Boolean.FALSE).a(Functions.a());
            }

            public final Observable<rdc> a(Observable<rdb> observable) {
                return rda.a(observable).e(rdc.i);
            }

            public final Observable<rdc> b() {
                return rda.b().e(rdc.i);
            }
        };
    }

    private static rda a(final rda rda, final Predicate<rdb> predicate) {
        final BehaviorSubject a2 = BehaviorSubject.a();
        return new rda() {
            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource a(rda rda, Observable observable, Boolean bool) {
                return bool.booleanValue() ? Observable.b(rdc.h) : rda.a(observable);
            }

            public final Observable<Boolean> a() {
                return a2.c((Function<? super T, ? extends R>) $$Lambda$rde$2$mzRRrnlDHc76YYjetRIFCLnMz8.INSTANCE).a(Schedulers.c());
            }

            public final Observable<rdc> a(Observable<rdb> observable) {
                Predicate predicate = predicate;
                predicate.getClass();
                Observable h = observable.c((Function<? super T, ? extends R>) new $$Lambda$TIyibCTuQoPElYCiPAUvSlyoOs8<Object,Object>(predicate)).a(Functions.a()).h(new $$Lambda$rde$2$9lnqhPou5DilaHptYt3xbLgH2s(rda, observable));
                BehaviorSubject behaviorSubject = a2;
                behaviorSubject.getClass();
                return h.b((Consumer<? super T>) new $$Lambda$nLJsih1HAzoaXsxSIRArfpzhYlM<Object>(behaviorSubject));
            }

            public final Observable<rdc> b() {
                return a2.a(Schedulers.c());
            }
        };
    }

    public static rda a(final rda rda, final a aVar) {
        return new rda() {
            private final PublishSubject<rdc> a = PublishSubject.a();

            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource a(rda rda, Observable observable, Boolean bool) {
                return bool.booleanValue() ? rda.a(observable) : Observable.b(rdc.h);
            }

            public final Observable<Boolean> a() {
                return this.a.e(rdc.h).c((Function<? super T, ? extends R>) $$Lambda$rde$4$0xiJthHl6WQhFvV0JHJ5UoF5Pw.INSTANCE);
            }

            public final Observable<rdc> a(Observable<rdb> observable) {
                a aVar = aVar;
                aVar.getClass();
                Observable h = observable.c((Function<? super T, ? extends R>) new $$Lambda$FTn8ZIeGfz_OyBMVfIiPKEcV9xM<Object,Object>(aVar)).a(Functions.a()).h(new $$Lambda$rde$4$nCKX25VjVe2Sw1PLhrgyiaFZWqM(rda, observable));
                PublishSubject<rdc> publishSubject = this.a;
                publishSubject.getClass();
                return h.b((Consumer<? super T>) new $$Lambda$aRm7UzXWS9e0sn472n_IAE1wqE<Object>(publishSubject));
            }

            public final Observable<rdc> b() {
                return this.a.e(rdc.h);
            }
        };
    }

    public static rda a(MusicItem... musicItemArr) {
        final ImmutableList a2 = ImmutableList.a((E[]) musicItemArr);
        final rdc b2 = rdd.b(a2);
        return new rda() {
            public final Observable<Boolean> a() {
                return Observable.b(Boolean.valueOf(!a2.isEmpty()));
            }

            public final Observable<rdc> a(Observable<rdb> observable) {
                return observable.a((BiPredicate<? super T, ? super T>) $$Lambda$rde$7$1GAp5PdAzYJWgiKBjKkWta1czY.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$rde$7$NIpZk8o4Iqo__hKdQnvRMpWuGZo<Object,Object>(b2));
            }

            public final Observable<rdc> b() {
                return Observable.b(b2);
            }
        };
    }

    public static rda a(rda... rdaArr) {
        return a(ImmutableList.a((E[]) rdaArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rdc a(Object[] objArr) {
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            g.c(objArr[i]);
        }
        return rdd.a(g.a());
    }

    /* access modifiers changed from: private */
    public static boolean a(rdb rdb) {
        return rdb.c().a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Object[] objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i].booleanValue()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static rda b(rda rda) {
        return a(rda, (Predicate<rdb>) $$Lambda$rde$1jYXVAWe1XgPj3hz0XxhxLsgKNQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static boolean b(rdb rdb) {
        return rdb.c().d().containsValue(Boolean.TRUE);
    }

    public static rda c(rda rda) {
        return a(rda, (Predicate<rdb>) $$Lambda$rde$hArVBQLUBeMDeQ6mDLNhfv8i0vc.INSTANCE);
    }

    public static rda d(rda rda) {
        return a(rda, (Predicate<rdb>) $$Lambda$rde$YCCkqg8T43Ga4izP_usbdDQLKuo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(rdb rdb) {
        return a(rdb) || b(rdb);
    }
}
