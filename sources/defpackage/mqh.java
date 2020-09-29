package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: mqh reason: default package */
public interface mqh {

    /* renamed from: mqh$a */
    public interface a {

        /* renamed from: mqh$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static Observable<mqa> a(mpt mpt, mqm mqm, Scheduler scheduler) {
                return mpt.a.a(mqm.a()).c((Function<? super T, ? extends R>) $$Lambda$mqh$a$bF8qUvEYzltNWq2gE7V9OnKJgJ0.INSTANCE).a(scheduler);
            }

            public static /* synthetic */ mqa a(defpackage.mqm.a aVar) {
                return ((mqa) aVar.a).d().a(aVar.b > 0).a();
            }
        }
    }
}
