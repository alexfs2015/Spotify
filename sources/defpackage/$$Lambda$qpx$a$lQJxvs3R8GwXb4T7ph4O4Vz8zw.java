package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Response;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$qpx$a$lQJxvs3R8GwXb4T7ph-4O4Vz8zw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qpx$a$lQJxvs3R8GwXb4T7ph4O4Vz8zw implements Action {
    private final /* synthetic */ Response f$0;

    public /* synthetic */ $$Lambda$qpx$a$lQJxvs3R8GwXb4T7ph4O4Vz8zw(Response response) {
        this.f$0 = response;
    }

    public final void run() {
        Logger.b("Successfully prepared the context %s", this.f$0.toString());
    }
}
