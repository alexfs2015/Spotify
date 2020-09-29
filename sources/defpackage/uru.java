package defpackage;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: uru reason: default package */
public class uru<T> {
    private final Set<a<T>> a = new LinkedHashSet();

    /* renamed from: uru$a */
    public interface a<T> {
        void onChanged(T t);
    }

    public final void a(a<T> aVar) {
        this.a.add(aVar);
    }

    public final Observable<T> a() {
        PublishSubject a2 = PublishSubject.a();
        a2.getClass();
        a((a<T>) new $$Lambda$LBcdeeT9HS3vjt9bZwOSW6ybAUI<T>(a2));
        return a2;
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        for (a onChanged : this.a) {
            onChanged.onChanged(t);
        }
    }
}
