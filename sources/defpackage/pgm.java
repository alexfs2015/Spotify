package defpackage;

import com.spotify.music.features.podcast.entity.topic.CETopicsRolloutHelper;

/* renamed from: pgm reason: default package */
public final class pgm implements wig<CETopicsRolloutHelper> {
    private final wzi<gfk<fli>> a;

    private pgm(wzi<gfk<fli>> wzi) {
        this.a = wzi;
    }

    public static pgm a(wzi<gfk<fli>> wzi) {
        return new pgm(wzi);
    }

    public final /* synthetic */ Object get() {
        return new CETopicsRolloutHelper((gfk) this.a.get());
    }
}
