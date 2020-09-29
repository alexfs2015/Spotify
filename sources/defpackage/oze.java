package defpackage;

import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: oze reason: default package */
public final class oze implements tse {
    private final spi a;
    private final ozg b;

    public oze(spi spi, ozg ozg) {
        this.a = spi;
        this.b = ozg;
    }

    public final void a(String str) {
        this.b.a.a(str, null, -1, InteractionType.HIT, "open-topic-page");
        this.a.a(str);
    }
}
