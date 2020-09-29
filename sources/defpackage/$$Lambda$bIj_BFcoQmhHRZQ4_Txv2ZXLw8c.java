package defpackage;

import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: -$$Lambda$bIj_BFcoQmhHRZQ4_Txv2ZXLw8c reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$bIj_BFcoQmhHRZQ4_Txv2ZXLw8c implements Function {
    private final /* synthetic */ Map f$0;

    public /* synthetic */ $$Lambda$bIj_BFcoQmhHRZQ4_Txv2ZXLw8c(Map map) {
        this.f$0 = map;
    }

    public final Object apply(Object obj) {
        return (NowPlayingWidget) this.f$0.get((Type) obj);
    }
}
