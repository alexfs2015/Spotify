package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.service.SpotifyService;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

/* renamed from: gst reason: default package */
public interface gst {

    /* renamed from: gst$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<ConnectManager> a(Activity activity, vvb vvb, Scheduler scheduler) {
            return vvb.a(new Intent(activity, SpotifyService.class), activity.getLocalClassName()).b(scheduler).a((ObservableTransformer<? super T, ? extends R>) new hkl<Object,Object>($$Lambda$rf1st2CA5eLzP83QY26FdiY5jvg.INSTANCE));
        }
    }
}
