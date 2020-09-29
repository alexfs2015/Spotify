package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger.SectionId;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger.UserIntent;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: rit reason: default package */
public final class rit implements jor<MusicItem> {
    private final rbg a;
    private final MusicPagesLogger b;
    private final jpc c;
    private final jos d;
    private final jpq e;
    private final sso f;

    public rit(rbg rbg, MusicPagesLogger musicPagesLogger, jpc jpc, jos jos, jpq jpq, sso sso) {
        this.a = rbg;
        this.b = musicPagesLogger;
        this.c = jpc;
        this.d = jos;
        this.e = jpq;
        this.f = sso;
    }

    public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
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
}
