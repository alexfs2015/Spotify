package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackPosition;
import io.reactivex.Observable;

/* renamed from: -$$Lambda$ikp$YMlDFGVCAuP3IRGoZetn-O-SMyI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikp$YMlDFGVCAuP3IRGoZetnOSMyI implements b {
    public static final /* synthetic */ $$Lambda$ikp$YMlDFGVCAuP3IRGoZetnOSMyI INSTANCE = new $$Lambda$ikp$YMlDFGVCAuP3IRGoZetnOSMyI();

    private /* synthetic */ $$Lambda$ikp$YMlDFGVCAuP3IRGoZetnOSMyI() {
    }

    public final Observable serve(ikn ikn, JacksonModel jacksonModel) {
        return ikn.d.a((PlaybackPosition) jacksonModel);
    }
}
