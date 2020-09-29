package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: thk reason: default package */
public interface thk {

    /* renamed from: thk$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<Boolean> a(int i, Flowable<Boolean> flowable, Scheduler scheduler) {
            return flowable.c((Function<? super T, ? extends R>) new $$Lambda$thk$Hbx4j2DOXqSsWava8f_AE07hDc<Object,Object>(i)).a(scheduler);
        }

        public static /* synthetic */ Boolean a(int i, Boolean bool) {
            return Boolean.valueOf(bool.booleanValue() || i == 2);
        }
    }
}
