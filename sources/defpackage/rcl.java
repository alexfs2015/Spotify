package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader;

/* renamed from: rcl reason: default package */
public final class rcl implements wig<BansLoader> {
    private final wzi<gmn> a;

    private rcl(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static rcl a(wzi<gmn> wzi) {
        return new rcl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new BansLoader((gmn) this.a.get());
    }
}
