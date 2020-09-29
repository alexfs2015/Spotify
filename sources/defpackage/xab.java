package defpackage;

import java.util.ArrayList;
import java.util.List;
import rx.internal.operators.NotificationLite;
import rx.internal.producers.SingleProducer;
import rx.subjects.SubjectSubscriptionManager;
import rx.subjects.SubjectSubscriptionManager.b;

/* renamed from: xab reason: default package */
public final class xab<T> extends xae<T, T> {
    private SubjectSubscriptionManager<T> a;
    private volatile Object b;

    public static <T> xab<T> e() {
        final SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.onTerminated = new wun<b<T>>() {
            public final /* synthetic */ void call(Object obj) {
                b bVar = (b) obj;
                Object obj2 = subjectSubscriptionManager.latest;
                if (obj2 == null || NotificationLite.b(obj2)) {
                    bVar.onCompleted();
                } else if (NotificationLite.c(obj2)) {
                    bVar.onError(NotificationLite.f(obj2));
                } else {
                    bVar.a.setProducer(new SingleProducer(bVar.a, NotificationLite.e(obj2)));
                }
            }
        };
        return new xab<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    private xab(a<T> aVar, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(aVar);
        this.a = subjectSubscriptionManager;
    }

    public final void onCompleted() {
        b[] a2;
        if (this.a.active) {
            Object obj = this.b;
            if (obj == null) {
                obj = NotificationLite.a();
            }
            for (b bVar : this.a.a(obj)) {
                if (obj == NotificationLite.a()) {
                    bVar.onCompleted();
                } else {
                    bVar.a.setProducer(new SingleProducer(bVar.a, NotificationLite.e(obj)));
                }
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.a.active) {
            ArrayList arrayList = null;
            for (b onError : this.a.a(NotificationLite.a(th))) {
                try {
                    onError.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            wul.a((List<? extends Throwable>) arrayList);
        }
    }

    public final void onNext(T t) {
        this.b = NotificationLite.a(t);
    }
}
