package defpackage;

import io.reactivex.Flowable;
import java.util.List;

/* renamed from: rze reason: default package */
public interface rze<T> {

    /* renamed from: rze$a */
    public interface a {
        void onHistoryChanged();
    }

    List<T> a();

    void a(T t);

    void a(List<T> list);

    void b();

    void b(T t);

    Flowable<List<T>> c();
}
