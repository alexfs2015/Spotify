package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$tmf$gu3vax2sxmBVBSNzF_LIdAYlfyM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tmf$gu3vax2sxmBVBSNzF_LIdAYlfyM implements Function {
    public static final /* synthetic */ $$Lambda$tmf$gu3vax2sxmBVBSNzF_LIdAYlfyM INSTANCE = new $$Lambda$tmf$gu3vax2sxmBVBSNzF_LIdAYlfyM();

    private /* synthetic */ $$Lambda$tmf$gu3vax2sxmBVBSNzF_LIdAYlfyM() {
    }

    public final Object apply(Object obj) {
        return ((PlayerTrack) fbp.a(((PlayerState) obj).track())).uri();
    }
}
