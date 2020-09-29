package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.SortOption;
import defpackage.uyy;
import io.reactivex.Observable;

@Deprecated
/* renamed from: jue reason: default package */
public interface jue<S, T extends uyy<S>, Payload extends JacksonModel> {
    Observable<T> a();

    Observable<T> a(Payload payload);

    jue<S, T, Payload> a(Integer num, Integer num2);

    jue<S, T, Payload> a(boolean z, boolean z2, boolean z3);

    void a(SortOption sortOption);

    void a(juf<T> juf);

    Observable<T> b();

    void d();
}
