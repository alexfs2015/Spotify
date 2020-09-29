package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$igt$ptCj0eN4LJTKW1R08YBqQt3doa0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$igt$ptCj0eN4LJTKW1R08YBqQt3doa0 implements Predicate {
    public static final /* synthetic */ $$Lambda$igt$ptCj0eN4LJTKW1R08YBqQt3doa0 INSTANCE = new $$Lambda$igt$ptCj0eN4LJTKW1R08YBqQt3doa0();

    private /* synthetic */ $$Lambda$igt$ptCj0eN4LJTKW1R08YBqQt3doa0() {
    }

    public final boolean test(Object obj) {
        return Boolean.parseBoolean((String) ((Ad) obj).metadata().get("fireImpressionOnStart"));
    }
}
