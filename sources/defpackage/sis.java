package defpackage;

import io.reactivex.Flowable;
import java.util.List;

/* renamed from: sis reason: default package */
public interface sis<T> {

    /* renamed from: sis$a */
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
