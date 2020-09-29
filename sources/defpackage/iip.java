package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.Observable;

/* renamed from: iip reason: default package */
public interface iip<TArg extends JacksonModel, TResult extends JacksonModel> {
    Observable<TResult> a(iia iia, TArg targ);

    Class<TArg> a();

    String b();

    int c();
}
