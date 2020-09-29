package defpackage;

import com.google.common.base.Optional;
import io.reactivex.subjects.PublishSubject;

/* renamed from: oew reason: default package */
public final class oew {
    public Optional<Integer> a = Optional.e();
    public final PublishSubject<Integer> b = PublishSubject.a();

    public final void a(int i) {
        this.a = Optional.b(Integer.valueOf(i));
    }
}
