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

/* renamed from: qup reason: default package */
public final class qup {

    /* renamed from: qup$a */
    public interface a {
        boolean apply(qum qum);
    }

    /* renamed from: qup$b */
    public interface b {
        boolean apply(qum qum, MusicItem musicItem);
    }

    public static qul a(final qul qul, final a aVar) {
        return new qul() {
            private final PublishSubject<qun> a = PublishSubject.a();

            public final Observable<Boolean> a() {
                return this.a.e(qun.h).c((Function<? super T, ? extends R>) $$Lambda$qup$4$rHkq24vKXBRP_uReSKJK4rzK0k.INSTANCE);
            }

            public final Observable<qun> b() {
                return this.a.e(qun.h);
            }

            public final Observable<qun> a(Observable<qum> observable) {
                a aVar = aVar;
                aVar.getClass();
                Observable h = observable.c((Function<? super T, ? extends R>) new $$Lambda$t4mUkLQFrQnrlPdRtW_SXzvR70g<Object,Object>(aVar)).a(Functions.a()).h(new $$Lambda$qup$4$qdxVg1jZnK8bsKzpUmdYJeVlNM(qul, observable));
                PublishSubject<qun> publishSubject = this.a;
                publishSubject.getClass();
                return h.b((Consumer<? super T>) new $$Lambda$oejf_8XUIWcygvqgFi5acWh8Y4s<Object>(publishSubject));
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource a(qul qul, Observable observable, Boolean bool) {
                if (bool.booleanValue()) {
                    return qul.a(observable);
                }
                return Observable.b(qun.h);
            }
        };
    }

    public static qul a(qul... qulArr) {
        return a(ImmutableList.a((E[]) qulArr));
    }

    public static qul a(final ImmutableList<qul> immutableList) {
        ArrayList arrayList = new ArrayList(immutableList.size());
        fdh R_ = immutableList.R_();
        while (R_.hasNext()) {
            arrayList.add(((qul) R_.next()).a());
        }
        final Observable a2 = Observable.a((Iterable<? extends ObservableSource<? extends T>>) arrayList, (Function<? super Object[], ? extends R>) $$Lambda$qup$aZbO8dnQV3fIQ9ZA8oGXg9g_4E.INSTANCE).a(1).a();
        ArrayList arrayList2 = new ArrayList(immutableList.size());
        fdh R_2 = immutableList.R_();
        while (R_2.hasNext()) {
            arrayList2.add(((qul) R_2.next()).b());
        }
        final Observable a3 = Observable.a((Iterable<? extends ObservableSource<? extends T>>) arrayList2, (Function<? super Object[], ? extends R>) $$Lambda$qup$3fF3DlpEHx1NfuQJLZk7q31yXQ.INSTANCE).a(1).a();
        return new qul() {
            public final Observable<Boolean> a() {
                return a2;
            }

            public final Observable<qun> b() {
                return a3;
            }

            public final Observable<qun> a(Observable<qum> observable) {
                Observable<qum> observable2;
                ArrayList arrayList = new ArrayList(immutableList.size());
                fdh R_ = immutableList.R_();
                qul qul = null;
                Observable<qum> observable3 = observable;
                while (R_.hasNext()) {
                    qul qul2 = (qul) R_.next();
                    if (qul == null) {
                        observable2 = observable.a(1).a();
                    } else {
                        observable2 = Observable.a((ObservableSource<? extends T1>) observable3, (ObservableSource<? extends T2>) qul.b().c((Function<? super T, ? extends R>) $$Lambda$r1bfbv7SuCpO9sQw3GTj5cjqkpM.INSTANCE).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$qup$6$WhASdQyxTzpdp_UyIYtwUSWv1Nc.INSTANCE).a(1).a();
                    }
                    observable3 = observable2;
                    arrayList.add(qul2.a(observable3));
                    qul = qul2;
                }
                return Observable.a((Iterable<? extends ObservableSource<? extends T>>) arrayList, (Function<? super Object[], ? extends R>) $$Lambda$qup$6$2GfiM5RQphmFwK8vnuAU0U8Taoc.INSTANCE);
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ qun a(Object[] objArr) {
                com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    g.c(objArr[i]);
                }
                return quo.a(g.a());
            }
        };
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

    /* access modifiers changed from: private */
    public static /* synthetic */ qun a(Object[] objArr) {
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            g.c(objArr[i]);
        }
        return quo.a(g.a());
    }

    public static qul a(MusicItem... musicItemArr) {
        final ImmutableList a2 = ImmutableList.a((E[]) musicItemArr);
        final qun b2 = quo.b(a2);
        return new qul() {
            public final Observable<Boolean> a() {
                return Observable.b(Boolean.valueOf(!a2.isEmpty()));
            }

            public final Observable<qun> b() {
                return Observable.b(b2);
            }

            public final Observable<qun> a(Observable<qum> observable) {
                return observable.a((BiPredicate<? super T, ? super T>) $$Lambda$qup$7$VbOx0wSlnCjtPHUfqK2N3bovwXw.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$qup$7$Wdbm5mXMIOwyYaTOU3wNNlprL9Y<Object,Object>(b2));
            }
        };
    }

    public static qul a(Observable<MusicItem> observable) {
        Observable a2 = observable.c((Function<? super T, ? extends R>) $$Lambda$qAFmNuqsVCGX83VoNWFdKbGgyc.INSTANCE).a(1).a();
        final Observable a3 = a2.c((Function<? super T, ? extends R>) $$Lambda$qup$6PrVwKKS4H4oYtZOJZvu1oJfg.INSTANCE).a(1).a();
        final Observable a4 = a2.c((Function<? super T, ? extends R>) $$Lambda$XKBhzsVWSRSdSXWwRJMlFOGANZo.INSTANCE).a(1).a();
        return new qul() {
            public final Observable<Boolean> a() {
                return a3;
            }

            public final Observable<qun> b() {
                return a4;
            }

            public final Observable<qun> a(Observable<qum> observable) {
                return Observable.a((ObservableSource<? extends T1>) a4, (ObservableSource<? extends T2>) observable.a((BiPredicate<? super T, ? super T>) $$Lambda$qup$8$q3dkRHdomPtzMnA6Ml5h8CB1T4.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$qup$8$Nkn84Db3P8NIqeD_DAoBlhATVO8.INSTANCE);
            }
        };
    }

    public static qul a(final qul qul) {
        return new qul() {
            public final Observable<Boolean> a() {
                return qul.a().e(Boolean.FALSE).a(Functions.a());
            }

            public final Observable<qun> b() {
                return qul.b().e(qun.i);
            }

            public final Observable<qun> a(Observable<qum> observable) {
                return qul.a(observable).e(qun.i);
            }
        };
    }

    public static qul a(final ObservableTransformer<qum, qun> observableTransformer) {
        return new qul() {
            private final PublishSubject<qun> a = PublishSubject.a();

            public final Observable<Boolean> a() {
                return this.a.e(qun.h).c((Function<? super T, ? extends R>) $$Lambda$qup$10$0SyE_A9e8JFR8B27XnI0ur6jBWE.INSTANCE);
            }

            public final Observable<qun> b() {
                return this.a.e(qun.h);
            }

            public final Observable<qun> a(Observable<qum> observable) {
                Observable a2 = observable.a(observableTransformer).a(Functions.a());
                PublishSubject<qun> publishSubject = this.a;
                publishSubject.getClass();
                return a2.b((Consumer<? super T>) new $$Lambda$oejf_8XUIWcygvqgFi5acWh8Y4s<Object>(publishSubject));
            }
        };
    }

    public static qul b(qul qul) {
        return a(qul, (Predicate<qum>) $$Lambda$qup$6S6iCRVWezUKaMN2eHEUlHWdNQ.INSTANCE);
    }

    public static qul c(qul qul) {
        return a(qul, (Predicate<qum>) $$Lambda$qup$08HD5exWNi1mjJjEkd4CBxinLO0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(qum qum) {
        return a(qum) || b(qum);
    }

    public static qul d(qul qul) {
        return a(qul, (Predicate<qum>) $$Lambda$qup$H4t_ivzZNfG9BS3XdIeZbOnnYc.INSTANCE);
    }

    private static qul a(final qul qul, final Predicate<qum> predicate) {
        final BehaviorSubject a2 = BehaviorSubject.a();
        return new qul() {
            public final Observable<Boolean> a() {
                return a2.c((Function<? super T, ? extends R>) $$Lambda$qup$2$6mMVF_fxjOZZUx6NYtMdOGJ_RY.INSTANCE).a(Schedulers.c());
            }

            public final Observable<qun> b() {
                return a2.a(Schedulers.c());
            }

            public final Observable<qun> a(Observable<qum> observable) {
                Predicate predicate = predicate;
                predicate.getClass();
                Observable h = observable.c((Function<? super T, ? extends R>) new $$Lambda$DLaIXId7uXSJX4CV4ZviEedazo<Object,Object>(predicate)).a(Functions.a()).h(new $$Lambda$qup$2$isK5v1fBuS8avpdS2P079RJvOr4(qul, observable));
                BehaviorSubject behaviorSubject = a2;
                behaviorSubject.getClass();
                return h.b((Consumer<? super T>) new $$Lambda$iBlraNS07O0t6dvCiDvXFSqAkk<Object>(behaviorSubject));
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource a(qul qul, Observable observable, Boolean bool) {
                if (bool.booleanValue()) {
                    return Observable.b(qun.h);
                }
                return qul.a(observable);
            }
        };
    }

    /* access modifiers changed from: private */
    public static boolean a(qum qum) {
        return qum.c().a();
    }

    /* access modifiers changed from: private */
    public static boolean b(qum qum) {
        return qum.c().d().containsValue(Boolean.TRUE);
    }

    public static qul a(Observable<Boolean> observable, final qul qul) {
        final Observable a2 = observable.a(Functions.a()).a(1).a();
        return new qul() {
            public final Observable<Boolean> a() {
                return a2.h(new $$Lambda$qup$1$py1sJMEK6dhTxOEugQDIL9uNFHQ(qul)).e(Boolean.FALSE);
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource b(qul qul, Boolean bool) {
                if (bool.booleanValue()) {
                    return qul.a();
                }
                return Observable.b(Boolean.FALSE);
            }

            public final Observable<qun> b() {
                return a2.h(new $$Lambda$qup$1$BdNzeJKFyMOTc5UyW2mqR9X6lI(qul)).e(qun.i);
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource a(qul qul, Boolean bool) {
                if (bool.booleanValue()) {
                    return qul.b();
                }
                return Observable.b(qun.h);
            }

            public final Observable<qun> a(Observable<qum> observable) {
                return a2.h(new $$Lambda$qup$1$LaoTgwdEiD4ZrpPTdUHaKiLa_M(qul, observable));
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ ObservableSource a(qul qul, Observable observable, Boolean bool) {
                if (bool.booleanValue()) {
                    return qul.a(observable);
                }
                return Observable.b(qun.h);
            }
        };
    }
}
