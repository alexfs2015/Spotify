package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger.SectionId;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger.UserIntent;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: qzx reason: default package */
public final class qzx implements jmf<MusicItem> {
    private final qsr a;
    private final MusicPagesLogger b;
    private final jmq c;
    private final jmg d;
    private final jne e;
    private final sih f;

    public final /* synthetic */ jms onCreateContextMenu(Object obj) {
        MusicItem musicItem = (MusicItem) obj;
        switch (musicItem.a()) {
            case PLAYLIST:
                return this.e.a(musicItem.j(), musicItem.h()).a(this.f).a(this.a.b()).b(true).a();
            case ARTIST:
            case ARTIST_TWO_LINES:
                return this.c.a(musicItem.j(), musicItem.h()).a(this.f).a(false).c(true).d(true).b(false).a();
            case ALBUM:
                return this.d.a(musicItem.j(), musicItem.h()).a(this.f).a(true).b(true).c(this.a.b()).a();
            case TRACK:
                this.b.b(musicItem.j(), musicItem.n());
                return this.c.a(musicItem.j(), musicItem.h(), musicItem.w().j()).a(this.f).a(true).b(true).c(true).d(false).g(false).h(false).i(false).j(!musicItem.w().a()).a();
            case TRACK_SHUFFLE_ONLY:
                if (musicItem.w().g()) {
                    this.b.a(musicItem.j(), SectionId.LIST_OF_RECOMMENDED_ITEMS, musicItem.n(), InteractionType.HIT, UserIntent.OPEN_CONTEXT_MENU);
                } else {
                    this.b.b(musicItem.j(), musicItem.n());
                }
                return this.c.a(musicItem.j(), musicItem.h(), musicItem.w().j()).a(this.f).a(true).b(true).c(true).d(false).g(false).h(true).i(true).j(!musicItem.w().a()).a();
            default:
                throw new IllegalArgumentException("Unsupported type");
        }
    }

    public qzx(qsr qsr, MusicPagesLogger musicPagesLogger, jmq jmq, jmg jmg, jne jne, sih sih) {
        this.a = qsr;
        this.b = musicPagesLogger;
        this.c = jmq;
        this.d = jmg;
        this.e = jne;
        this.f = sih;
    }
}
