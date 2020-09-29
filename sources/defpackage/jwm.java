package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.SortOption;
import defpackage.vlb;
import io.reactivex.Observable;

@Deprecated
/* renamed from: jwm reason: default package */
public interface jwm<S, T extends vlb<S>, Payload extends JacksonModel> {
    Observable<T> a();

    Observable<T> a(Payload payload);

    jwm<S, T, Payload> a(Integer num, Integer num2);

    jwm<S, T, Payload> a(boolean z, boolean z2, boolean z3);

    void a(SortOption sortOption);

    void a(jwn<T> jwn);

    Observable<T> b();

    void d();
}
