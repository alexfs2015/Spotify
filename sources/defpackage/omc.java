package defpackage;

import com.google.common.base.Optional;
import io.reactivex.subjects.PublishSubject;

/* renamed from: omc reason: default package */
public final class omc {
    public Optional<Integer> a = Optional.e();
    public final PublishSubject<Integer> b = PublishSubject.a();

    public final void a(int i) {
        this.b.onNext(Integer.valueOf(i));
    }

    public final void b(int i) {
        this.a = Optional.b(Integer.valueOf(i));
    }
}
