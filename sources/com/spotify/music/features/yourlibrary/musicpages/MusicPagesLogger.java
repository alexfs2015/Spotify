package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import io.reactivex.functions.Consumer;

public final class MusicPagesLogger implements rbr {
    private final InteractionLogger a;
    private final ImpressionLogger b;

    public enum SectionId {
        ADD_ARTISTS_BUTTON("add-artists-button"),
        ALBUMS_EMPTY_VIEW("albums-empty-view"),
        ARTISTS_EMPTY_VIEW("artists-empty-view"),
        CREATE_NEW_PLAYLIST_BUTTON("create-new-playlist-button"),
        CONTEXT_MENU("context-menu"),
        DOWNLOAD_TOGGLE("download-toggle"),
        ENTITY_SECTION_HEADER("entity-section-header"),
        FILTER_AND_SORT_VIEW("filter-and-sort-view"),
        FILTER_INDICATOR_VIEW("filter-indicator-view"),
        HIDDEN_ARTISTS_BUTTON(r10),
        HIDDEN_TRACKS_BUTTON(r10),
        LIKED_SONGS("liked-songs"),
        LIST_OF_ITEMS("list-of-items"),
        LIST_OF_RECOMMENDED_ITEMS("list-of-recommended-items"),
        PLAYLISTS_EMPTY_VIEW("playlists-empty-view"),
        RECS_INFO_DIALOG("recs-dialog"),
        RECS_SECTION_HEADER("recs-section-header"),
        SHUFFLE_PLAY_BUTTON("shuffle-play-button"),
        SORT_BOTTOM_SHEET("sort-bottom-sheet");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum UserIntent {
        ADD_ARTISTS("add-artists"),
        BACK_FROM_SORT_BOTTOM_SHEET("back-from-sort-bottom-sheet"),
        BAN("ban"),
        BROWSE("browse"),
        CANCEL_FILTER_BY_TEXT("filter-cancel"),
        CLEAR_ALL_FILTERS("clear-all-filters"),
        CLEAR_FILTER("clear-filter"),
        CLEAR_FILTER_BY_TEXT("clear-filter-by-text"),
        CREATE("create"),
        DISMISS_INFO_DIALOG("got-it"),
        DOWNLOAD("offline-enable"),
        FILTER_BY_TEXT("filter-by-text"),
        FOLLOW_ARTIST("follow-artist"),
        LIKE_ALBUM("like-album"),
        LIKE("like-enable"),
        ITEM("item"),
        OPEN("open"),
        OPEN_CONTEXT_MENU("track-context-menu-clicked"),
        OPEN_HIDDEN_ARTISTS("open-hidden-artists"),
        OPEN_HIDDEN_TRACKS("open-hidden-tracks"),
        OPEN_INFO_DIALOG(LogMessage.SEVERITY_INFO),
        OPEN_LIKED_SONGS("liked-songs"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        PLAY_TRACK_VIA_ROW("play-track-via-row"),
        REMOVE_DOWNLOADS("offline-disable"),
        SELECT_FILTER("filter-selected"),
        SELECT_SORT("sort-selected"),
        SHUFFLE_PLAY("shuffle-play"),
        SORT_BY_OPTION("sort-by-option"),
        UNLIKE("like-disable");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public MusicPagesLogger(InteractionLogger interactionLogger, ImpressionLogger impressionLogger) {
        this.a = interactionLogger;
        this.b = impressionLogger;
    }

    public final Consumer<s> g() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((s) obj);
            }
        };
    }

    public final Consumer<t> h() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((t) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(t tVar) {
        a((String) null, SectionId.LIKED_SONGS, 0, InteractionType.HIT, UserIntent.OPEN_LIKED_SONGS);
    }

    public final Consumer<e> i() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((e) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        StringBuilder sb = new StringBuilder("clear-filter/");
        sb.append(eVar.a);
        a((String) null, SectionId.FILTER_INDICATOR_VIEW, 0, InteractionType.HIT, sb.toString());
    }

    public final Consumer<d> j() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((d) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        a((String) null, SectionId.LIST_OF_ITEMS, 0, InteractionType.HIT, UserIntent.CLEAR_ALL_FILTERS);
    }

    public final Consumer<j> k() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((j) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(j jVar) {
        a((String) null, SectionId.CREATE_NEW_PLAYLIST_BUTTON, 0, InteractionType.HIT, UserIntent.CREATE);
    }

    public final Consumer<k> l() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((k) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(k kVar) {
        a((String) null, SectionId.PLAYLISTS_EMPTY_VIEW, 0, InteractionType.HIT, UserIntent.CREATE);
    }

    public final Consumer<q> m() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((q) obj);
            }
        };
    }

    public final Consumer<r> n() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((r) obj);
            }
        };
    }

    public final Consumer<ad> o() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((ad) obj);
            }
        };
    }

    public final Consumer<h> p() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((h) obj);
            }
        };
    }

    public final Consumer<p> q() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((p) obj);
            }
        };
    }

    public final Consumer<f> r() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((f) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        a((String) null, SectionId.ADD_ARTISTS_BUTTON, 0, InteractionType.HIT, UserIntent.ADD_ARTISTS);
    }

    public final Consumer<g> s() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((g) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        a((String) null, SectionId.ARTISTS_EMPTY_VIEW, 0, InteractionType.HIT, UserIntent.ADD_ARTISTS);
    }

    public final Consumer<u> t() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((u) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(u uVar) {
        a((String) null, SectionId.HIDDEN_ARTISTS_BUTTON, 0, InteractionType.HIT, UserIntent.OPEN_HIDDEN_ARTISTS);
    }

    public final Consumer<v> u() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((v) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(v vVar) {
        a((String) null, SectionId.HIDDEN_TRACKS_BUTTON, 0, InteractionType.HIT, UserIntent.OPEN_HIDDEN_TRACKS);
    }

    public final Consumer<x> v() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((x) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(x xVar) {
        a((String) null, SectionId.RECS_SECTION_HEADER, 0, InteractionType.HIT, UserIntent.OPEN_INFO_DIALOG);
    }

    public final Consumer<l> w() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((l) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(l lVar) {
        a((String) null, SectionId.RECS_INFO_DIALOG, 0, InteractionType.HIT, UserIntent.DISMISS_INFO_DIALOG);
    }

    public final Consumer<z> x() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((z) obj);
            }
        };
    }

    public final Consumer<y> y() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((y) obj);
            }
        };
    }

    public final Consumer<ac> z() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((ac) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ac acVar) {
        a((String) null, SectionId.SHUFFLE_PLAY_BUTTON, 0, InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
    }

    public final Consumer<ab> A() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((ab) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ab abVar) {
        a((String) null, SectionId.CONTEXT_MENU, 0, InteractionType.HIT, UserIntent.SELECT_SORT);
    }

    public final Consumer<aa> B() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((aa) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(aa aaVar) {
        a((String) null, SectionId.CONTEXT_MENU, 0, InteractionType.HIT, UserIntent.SELECT_FILTER);
    }

    public final Consumer<o> C() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((o) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(o oVar) {
        a((String) null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionType.HIT, UserIntent.SELECT_FILTER);
    }

    public final Consumer<w> D() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((w) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(i iVar) {
        f();
    }

    public final Consumer<i> E() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((i) obj);
            }
        };
    }

    public final Consumer<n> F() {
        return new Consumer() {
            public final void accept(Object obj) {
                MusicPagesLogger.this.a((n) obj);
            }
        };
    }

    public final void b(String str, int i) {
        a(str, SectionId.LIST_OF_ITEMS, i, InteractionType.HIT, UserIntent.OPEN_CONTEXT_MENU);
    }

    public final void a(String str, int i) {
        StringBuilder sb = new StringBuilder("sort-by-option/");
        sb.append(str);
        int i2 = i;
        a((String) null, SectionId.SORT_BOTTOM_SHEET, i2, InteractionType.HIT, sb.toString());
    }

    public final void a(String str, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "activate-filter/" : "deactivate-filter/");
        sb.append(str);
        a((String) null, SectionId.SORT_BOTTOM_SHEET, i, InteractionType.HIT, sb.toString());
    }

    public final void a() {
        a((String) null, SectionId.SORT_BOTTOM_SHEET, 0, InteractionType.HIT, UserIntent.BACK_FROM_SORT_BOTTOM_SHEET);
    }

    public final void b() {
        a((String) null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionType.HIT, UserIntent.SELECT_SORT);
    }

    public final void c() {
        a((String) null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionType.HIT, UserIntent.FILTER_BY_TEXT);
    }

    public final void d() {
        a((String) null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionType.HIT, UserIntent.SELECT_FILTER);
    }

    public final void e() {
        a((String) null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionType.HIT, UserIntent.CLEAR_FILTER_BY_TEXT);
    }

    public final void f() {
        a((String) null, SectionId.FILTER_AND_SORT_VIEW, 0, InteractionType.HIT, UserIntent.CANCEL_FILTER_BY_TEXT);
    }

    public void a(String str, SectionId sectionId, int i, InteractionType interactionType, UserIntent userIntent) {
        a(str, sectionId, i, interactionType, userIntent.toString());
    }

    private void a(String str, SectionId sectionId, int i, InteractionType interactionType, String str2) {
        this.a.a(str, sectionId != null ? sectionId.toString() : null, i, interactionType, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(n nVar) {
        String str = nVar.a;
        boolean z = nVar.b;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "activate-filter/" : "deactivate-filter/");
        sb.append(str);
        a((String) null, SectionId.CONTEXT_MENU, 0, InteractionType.HIT, sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(w wVar) {
        a(wVar.a, SectionId.ENTITY_SECTION_HEADER, wVar.b, InteractionType.HIT, UserIntent.OPEN);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(y yVar) {
        SectionId sectionId;
        UserIntent userIntent;
        if (yVar.c) {
            sectionId = SectionId.LIST_OF_RECOMMENDED_ITEMS;
        } else {
            sectionId = SectionId.LIST_OF_ITEMS;
        }
        SectionId sectionId2 = sectionId;
        if (yVar.d) {
            userIntent = UserIntent.PLAY_PREVIEW_VIA_IMAGE;
        } else {
            userIntent = UserIntent.PLAY_PREVIEW_VIA_ROW;
        }
        a(yVar.a, sectionId2, yVar.b, InteractionType.HIT, userIntent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(z zVar) {
        SectionId sectionId;
        if (zVar.c) {
            sectionId = SectionId.LIST_OF_RECOMMENDED_ITEMS;
        } else {
            sectionId = SectionId.LIST_OF_ITEMS;
        }
        a(zVar.a, sectionId, zVar.b, InteractionType.HIT, UserIntent.PLAY_TRACK_VIA_ROW);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(p pVar) {
        a(pVar.a, SectionId.LIST_OF_RECOMMENDED_ITEMS, 0, InteractionType.HIT, UserIntent.FOLLOW_ARTIST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(h hVar) {
        a(hVar.a, SectionId.LIST_OF_RECOMMENDED_ITEMS, hVar.b, InteractionType.HIT, UserIntent.BAN);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ad adVar) {
        a(adVar.a, SectionId.LIST_OF_ITEMS, adVar.b, InteractionType.HIT, UserIntent.UNLIKE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(r rVar) {
        a(rVar.a, SectionId.LIST_OF_RECOMMENDED_ITEMS, rVar.b, InteractionType.HIT, UserIntent.LIKE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(q qVar) {
        a(qVar.a, SectionId.LIST_OF_RECOMMENDED_ITEMS, qVar.b, InteractionType.HIT, UserIntent.LIKE_ALBUM);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(s sVar) {
        a(sVar.a, SectionId.LIST_OF_ITEMS, sVar.b, InteractionType.HIT, UserIntent.ITEM);
    }
}
