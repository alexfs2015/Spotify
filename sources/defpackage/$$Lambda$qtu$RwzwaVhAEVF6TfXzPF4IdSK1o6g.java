package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader.BansResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qtu$RwzwaVhAEVF6TfXzPF4IdSK1o6g reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qtu$RwzwaVhAEVF6TfXzPF4IdSK1o6g implements Function {
    public static final /* synthetic */ $$Lambda$qtu$RwzwaVhAEVF6TfXzPF4IdSK1o6g INSTANCE = new $$Lambda$qtu$RwzwaVhAEVF6TfXzPF4IdSK1o6g();

    private /* synthetic */ $$Lambda$qtu$RwzwaVhAEVF6TfXzPF4IdSK1o6g() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((BansResponse) obj).getArtists().isEmpty());
    }
}
