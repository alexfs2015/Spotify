package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.service.SpotifyService;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: gqu reason: default package */
public interface gqu {

    /* renamed from: gqu$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<ConnectManager> a(Activity activity, vhw vhw, Scheduler scheduler) {
            return vhw.a(new Intent(activity, SpotifyService.class), activity.getLocalClassName()).b(scheduler).a((ObservableTransformer<? super T, ? extends R>) new hhr<Object,Object>($$Lambda$veWN4OzRc4dmhaIB3TZne8JHq8.INSTANCE));
        }
    }
}
