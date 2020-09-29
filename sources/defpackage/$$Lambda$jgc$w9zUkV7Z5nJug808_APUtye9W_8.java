package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$jgc$w9zUkV7Z5nJug808_APUtye9W_8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jgc$w9zUkV7Z5nJug808_APUtye9W_8 implements Function {
    public static final /* synthetic */ $$Lambda$jgc$w9zUkV7Z5nJug808_APUtye9W_8 INSTANCE = new $$Lambda$jgc$w9zUkV7Z5nJug808_APUtye9W_8();

    private /* synthetic */ $$Lambda$jgc$w9zUkV7Z5nJug808_APUtye9W_8() {
    }

    public final Object apply(Object obj) {
        return ((PlayerTrack) fay.a(((PlayerState) obj).track())).uri();
    }
}
