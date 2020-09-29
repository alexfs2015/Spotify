package defpackage;

import io.reactivex.Single;
import io.reactivex.subjects.AsyncSubject;
import java.util.List;
import java.util.Map;

/* renamed from: gkg reason: default package */
public final class gkg implements gkl {
    private final AsyncSubject<List<gkq>> a = AsyncSubject.a();

    public /* synthetic */ Single<List<gkq>> b() {
        return CC.$default$b(this);
    }

    public /* synthetic */ Single<Map<String, gkq>> c() {
        return CC.$default$c(this);
    }

    public final void a(List<gkq> list) {
        AsyncSubject<List<gkq>> asyncSubject = this.a;
        if (!(asyncSubject.b.get() == AsyncSubject.a && asyncSubject.c == null)) {
            this.a.onNext(list);
            this.a.onComplete();
        }
    }

    public final Single<List<gkq>> a() {
        return this.a.h();
    }
}
