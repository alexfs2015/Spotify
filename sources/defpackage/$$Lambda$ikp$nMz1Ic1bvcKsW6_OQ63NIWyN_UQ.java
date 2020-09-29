package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.UriWithOptionExtras;
import io.reactivex.Observable;

/* renamed from: -$$Lambda$ikp$nMz1Ic1bvcKsW6_OQ63NIWyN_UQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikp$nMz1Ic1bvcKsW6_OQ63NIWyN_UQ implements b {
    public static final /* synthetic */ $$Lambda$ikp$nMz1Ic1bvcKsW6_OQ63NIWyN_UQ INSTANCE = new $$Lambda$ikp$nMz1Ic1bvcKsW6_OQ63NIWyN_UQ();

    private /* synthetic */ $$Lambda$ikp$nMz1Ic1bvcKsW6_OQ63NIWyN_UQ() {
    }

    public final Observable serve(ikn ikn, JacksonModel jacksonModel) {
        return ikn.d.a(((UriWithOptionExtras) jacksonModel).uri, ((UriWithOptionExtras) jacksonModel).options);
    }
}
