package defpackage;

import android.content.res.Resources;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import java.util.List;

/* renamed from: qwr reason: default package */
public final class qwr {
    public final fbd<a> a = Suppliers.a((fbd<T>) new $$Lambda$qwr$F3SkyCzJ3PPfW39JYSwAZ6OWMBE<T>(this));
    public final fbd<a> b = Suppliers.a((fbd<T>) new $$Lambda$qwr$TcVBhaAEm2R145wsn8LqqeCuvbc<T>(this));
    public final fbd<a> c = Suppliers.a((fbd<T>) new $$Lambda$qwr$LNo96D7kLFVZpZAOW5aEJDGcD5A<T>(this));
    public final fbd<a> d = Suppliers.a((fbd<T>) $$Lambda$qwr$f7hI6bVALokdwvt3p48YHB_OTVc.INSTANCE);
    final qsr e;
    final Resources f;
    private final fbd<a> g = Suppliers.a((fbd<T>) new $$Lambda$qwr$UDxuFs2p1RF3EcEyQ3pGxY3DLJY<T>(this));

    /* renamed from: qwr$a */
    public interface a {
        SortOption a();

        rbq b();
    }

    public qwr(qsr qsr, Resources resources) {
        this.e = qsr;
        this.f = resources;
    }

    public final SortOption a() {
        return ((a) this.g.get()).a();
    }

    public final rbq b() {
        return ((a) this.g.get()).b();
    }

    public static ImmutableMap<String, Boolean> c() {
        return ImmutableMap.b("available_offline_only", Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public a d() {
        return new a() {
            private final SortOption a = new jss(new SortOption(uya.e.a(), R.string.sort_order_recently_played, false)).a(new SortOption(uya.c.a())).a(new SortOption(uya.b.a())).a;
            private final SortOption b = new jss(new SortOption(uya.d.a(), R.string.your_library_sort_order_relevance, false)).a(new SortOption(uya.c.a())).a(new SortOption(uya.b.a())).a;

            public final SortOption a() {
                fpt b2 = qwr.this.e.a.b();
                if (b2 != null && ((String) b2.a(uqy.c)).equals("Enabled")) {
                    return this.b;
                }
                return this.a;
            }

            public final rbq b() {
                com.google.common.collect.ImmutableList.a b2 = ImmutableList.g().b((E[]) new SortOption[]{this.b, new SortOption(uya.a.a(), R.string.your_library_sort_order_custom_in_playlists, false), new jss(new SortOption(uya.c.a(), R.string.your_library_sort_order_name_alphabetically, false)).a(new SortOption(uya.b.a())).a, this.a, new jss(new SortOption(uya.b.a(), R.string.sort_order_recently_added, false)).a(new SortOption(uya.a.a())).a});
                com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                if (qwr.this.e.c()) {
                    g.c(b.h().a("available_offline_only").b(qwr.this.f.getString(R.string.your_library_music_pages_playlists_available_downloads_only_filter_inactive_title)).c(qwr.this.f.getString(R.string.your_library_music_pages_playlists_available_downloads_only_filter_active_title)).a(SpotifyIconV2.FILTER).b(SpotifyIconV2.FILTER).a(false).a());
                }
                return rbq.i().a(qwr.this.f.getString(R.string.your_library_music_pages_playlists_show_sort_options_title)).b(qwr.this.f.getString(R.string.your_library_music_pages_playlists_show_text_filter_title)).a((List<SortOption>) b2.a()).a(g.a()).c(qwr.this.f.getString(R.string.your_library_music_pages_find_in_playlists_hint)).a();
            }
        };
    }

    /* access modifiers changed from: private */
    public a e() {
        return new a() {
            private final SortOption a = new jss(new SortOption("name", R.string.your_library_sort_order_artist_name_alphabetically_in_artists, false)).a(new SortOption("addTime")).a;

            public final SortOption a() {
                return this.a;
            }

            public final rbq b() {
                ImmutableList a2 = ImmutableList.a(this.a, new SortOption("addTime", R.string.sort_order_recently_added, false));
                return rbq.i().a(qwr.this.f.getString(R.string.your_library_music_pages_artists_show_sort_options_title)).b(qwr.this.f.getString(R.string.your_library_music_pages_artists_show_text_filter_title)).a((List<SortOption>) a2).c(qwr.this.f.getString(R.string.your_library_music_pages_find_in_artists_hint)).a();
            }
        };
    }

    /* access modifiers changed from: private */
    public a f() {
        return new a() {
            private final SortOption a = new jss(new SortOption("artist.name", R.string.your_library_sort_order_artist_name_alphabetically, false)).a(new SortOption("name")).a(new SortOption("addTime")).a;

            public final SortOption a() {
                return this.a;
            }

            public final rbq b() {
                String str = "addTime";
                ImmutableList a2 = ImmutableList.a(new jss(new SortOption("name", R.string.your_library_sort_order_title_alphabetically, false)).a(new SortOption(str)).a, this.a, new SortOption(str, R.string.sort_order_recently_added, false));
                com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                if (qwr.this.e.c()) {
                    g.c(b.h().a("available_offline_only").b(qwr.this.f.getString(R.string.your_library_music_pages_albums_available_downloads_only_filter_inactive_title)).c(qwr.this.f.getString(R.string.your_library_music_pages_albums_available_downloads_only_filter_active_title)).a(SpotifyIconV2.FILTER).b(SpotifyIconV2.FILTER).a(false).a());
                }
                return rbq.i().a(qwr.this.f.getString(R.string.your_library_music_pages_albums_show_sort_options_title)).b(qwr.this.f.getString(R.string.your_library_music_pages_albums_show_text_filter_title)).a((List<SortOption>) a2).a(g.a()).c(qwr.this.f.getString(R.string.your_library_music_pages_find_in_albums_hint)).a();
            }
        };
    }

    /* access modifiers changed from: private */
    public a g() {
        return new a() {
            private final SortOption a = new jss(new SortOption("addTime", R.string.sort_order_recently_added, false)).a(new SortOption("album.name")).a(new SortOption("album.artist.name")).a(new SortOption("discNumber")).a(new SortOption("trackNumber")).a;

            public final SortOption a() {
                return this.a;
            }

            public final rbq b() {
                String str = "name";
                String str2 = "addTime";
                ImmutableList a2 = ImmutableList.a(new jss(new SortOption(str, R.string.your_library_sort_order_title_alphabetically, false)).a(new SortOption(str2)).a, new jss(new SortOption("artist.name", R.string.your_library_sort_order_artist_name_alphabetically, false)).a(new SortOption(str)).a(new SortOption(str2)).a, new jss(new SortOption("album.name", R.string.your_library_sort_order_album_name_alphabetically_in_liked_songs, false)).a(new SortOption("album.artist.name")).a(new SortOption("discNumber")).a(new SortOption("trackNumber")).a, this.a);
                com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                if (qwr.this.e.c()) {
                    g.c(b.h().a("available_offline_only").b(qwr.this.f.getString(R.string.your_library_music_pages_songs_available_downloads_only_filter_inactive_title)).c(qwr.this.f.getString(R.string.your_library_music_pages_songs_available_downloads_only_filter_active_title)).a(SpotifyIconV2.FILTER).b(SpotifyIconV2.FILTER).a(false).a());
                }
                return rbq.i().a(qwr.this.f.getString(R.string.your_library_music_pages_liked_songs_show_sort_options_title)).b(qwr.this.f.getString(R.string.your_library_music_pages_liked_songs_show_text_filter_title)).a((List<SortOption>) a2).a(g.a()).c(qwr.this.f.getString(R.string.your_library_music_pages_find_in_liked_songs_hint)).a();
            }
        };
    }

    /* access modifiers changed from: private */
    public static a h() {
        return new a() {
            private final SortOption a = new jss(new SortOption("name", R.string.your_library_sort_order_name_alphabetically, false)).a(new SortOption("addTime")).a;

            public final SortOption a() {
                return this.a;
            }

            public final rbq b() {
                return rbq.f;
            }
        };
    }
}
