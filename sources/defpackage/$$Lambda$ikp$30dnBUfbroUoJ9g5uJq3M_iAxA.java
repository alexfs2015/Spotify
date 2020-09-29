package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import io.reactivex.Observable;

/* renamed from: -$$Lambda$ikp$30dnBUf-broUoJ9g5uJq3M_iAxA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikp$30dnBUfbroUoJ9g5uJq3M_iAxA implements b {
    public static final /* synthetic */ $$Lambda$ikp$30dnBUfbroUoJ9g5uJq3M_iAxA INSTANCE = new $$Lambda$ikp$30dnBUfbroUoJ9g5uJq3M_iAxA();

    private /* synthetic */ $$Lambda$ikp$30dnBUfbroUoJ9g5uJq3M_iAxA() {
    }

    public final Observable serve(ikn ikn, JacksonModel jacksonModel) {
        return ikp.a(ikn, (LogMessage) jacksonModel);
    }
}
