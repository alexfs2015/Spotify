package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.Observable;

/* renamed from: ilc reason: default package */
public interface ilc<TArg extends JacksonModel, TResult extends JacksonModel> {
    Observable<TResult> a(ikn ikn, TArg targ);

    Class<TArg> a();

    String b();

    int c();
}
