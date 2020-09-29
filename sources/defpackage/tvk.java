package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tvk reason: default package */
public final class tvk implements wig<Flowable<PlayerState>> {
    private final wzi<viy> a;

    private tvk(wzi<viy> wzi) {
        this.a = wzi;
    }

    public static tvk a(wzi<viy> wzi) {
        return new tvk(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((viy) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
