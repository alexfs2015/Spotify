package defpackage;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: vcz reason: default package */
public class vcz<T> {
    private final Set<a<T>> a = new LinkedHashSet();

    /* renamed from: vcz$a */
    public interface a<T> {
        void onChanged(T t);
    }

    public final Observable<T> a() {
        PublishSubject a2 = PublishSubject.a();
        a2.getClass();
        a((a<T>) new $$Lambda$ew1Hsze41jsmUkHJw8ItQax_v_s<T>(a2));
        return a2;
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        for (a onChanged : this.a) {
            onChanged.onChanged(t);
        }
    }

    public final void a(a<T> aVar) {
        this.a.add(aVar);
    }
}
