package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: mlo reason: default package */
public interface mlo {

    /* renamed from: mlo$a */
    public interface a {

        /* renamed from: mlo$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static Observable<mlh> a(mla mla, mlt mlt, Scheduler scheduler) {
                return mla.a.a(mlt.a()).c((Function<? super T, ? extends R>) $$Lambda$mlo$a$GaaMlSkXLS_lvfVlnzmVa21BNo.INSTANCE).a(scheduler);
            }

            public static /* synthetic */ mlh a(defpackage.mlt.a aVar) {
                return ((mlh) aVar.a).d().a(aVar.b > 0).a();
            }
        }
    }
}
