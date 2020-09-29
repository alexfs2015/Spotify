package defpackage;

import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest.Response;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vlz$G8R_Uj-3t1DNxqHCMnlbF_7d8Yg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vlz$G8R_Uj3t1DNxqHCMnlbF_7d8Yg implements Function {
    public static final /* synthetic */ $$Lambda$vlz$G8R_Uj3t1DNxqHCMnlbF_7d8Yg INSTANCE = new $$Lambda$vlz$G8R_Uj3t1DNxqHCMnlbF_7d8Yg();

    private /* synthetic */ $$Lambda$vlz$G8R_Uj3t1DNxqHCMnlbF_7d8Yg() {
    }

    public final Object apply(Object obj) {
        return Single.b(Response.a(((com.spotify.cosmos.router.Response) obj).getBody()));
    }
}
