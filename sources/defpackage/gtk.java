package defpackage;

import android.app.Application;
import android.content.Context;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Observable;

/* renamed from: gtk reason: default package */
public final class gtk implements wig<Observable<ConnectionType>> {
    private final wzi<Application> a;

    private gtk(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static gtk a(wzi<Application> wzi) {
        return new gtk(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(jvm.a(jvn.a((Context) (Application) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
