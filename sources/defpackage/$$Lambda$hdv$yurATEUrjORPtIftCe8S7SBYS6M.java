package defpackage;

import com.spotify.common.uri.SpotifyUri;
import com.spotify.metadata.proto.Metadata.Track;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$hdv$yurATEUrjORPtIftCe8S7SBYS6M reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hdv$yurATEUrjORPtIftCe8S7SBYS6M implements Function {
    public static final /* synthetic */ $$Lambda$hdv$yurATEUrjORPtIftCe8S7SBYS6M INSTANCE = new $$Lambda$hdv$yurATEUrjORPtIftCe8S7SBYS6M();

    private /* synthetic */ $$Lambda$hdv$yurATEUrjORPtIftCe8S7SBYS6M() {
    }

    public final Object apply(Object obj) {
        return SpotifyUri.a(gdp.a(((Track) obj).d.d())).toString();
    }
}
