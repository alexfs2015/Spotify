package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.UriWithOptionExtras;
import io.reactivex.Observable;

/* renamed from: -$$Lambda$iic$YtuWxVFG4jFaSQlPZK5ZWpVtC5E reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iic$YtuWxVFG4jFaSQlPZK5ZWpVtC5E implements b {
    public static final /* synthetic */ $$Lambda$iic$YtuWxVFG4jFaSQlPZK5ZWpVtC5E INSTANCE = new $$Lambda$iic$YtuWxVFG4jFaSQlPZK5ZWpVtC5E();

    private /* synthetic */ $$Lambda$iic$YtuWxVFG4jFaSQlPZK5ZWpVtC5E() {
    }

    public final Observable serve(iia iia, JacksonModel jacksonModel) {
        return iia.d.a(((UriWithOptionExtras) jacksonModel).uri, ((UriWithOptionExtras) jacksonModel).options);
    }
}
