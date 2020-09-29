package defpackage;

import com.spotify.common.uri.SpotifyUri;
import com.spotify.metadata.proto.Metadata.Track;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$hbc$4S4IhSXMqrkmJOvkdhKB9KFGloY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hbc$4S4IhSXMqrkmJOvkdhKB9KFGloY implements Function {
    public static final /* synthetic */ $$Lambda$hbc$4S4IhSXMqrkmJOvkdhKB9KFGloY INSTANCE = new $$Lambda$hbc$4S4IhSXMqrkmJOvkdhKB9KFGloY();

    private /* synthetic */ $$Lambda$hbc$4S4IhSXMqrkmJOvkdhKB9KFGloY() {
    }

    public final Object apply(Object obj) {
        return SpotifyUri.a(gce.a(((Track) obj).d.d())).toString();
    }
}
