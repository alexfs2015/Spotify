package defpackage;

import io.reactivex.Single;
import io.reactivex.subjects.AsyncSubject;
import java.util.List;
import java.util.Map;

/* renamed from: gls reason: default package */
public final class gls implements glx {
    private final AsyncSubject<List<gmc>> a = AsyncSubject.a();

    public final Single<List<gmc>> a() {
        return this.a.h();
    }

    public final void a(List<gmc> list) {
        AsyncSubject<List<gmc>> asyncSubject = this.a;
        if (!(asyncSubject.b.get() == AsyncSubject.a && asyncSubject.c == null)) {
            this.a.onNext(list);
            this.a.onComplete();
        }
    }

    public /* synthetic */ Single<List<gmc>> b() {
        return CC.$default$b(this);
    }

    public /* synthetic */ Single<Map<String, gmc>> c() {
        return CC.$default$c(this);
    }
}
