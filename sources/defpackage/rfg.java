package defpackage;

import android.content.res.Resources;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import java.util.List;

/* renamed from: rfg reason: default package */
public final class rfg {
    public final fbu<a> a = Suppliers.a((fbu<T>) new $$Lambda$rfg$rpbOmUP6wWQwGt6aU9iXNCvxaCI<T>(this));
    public final fbu<a> b = Suppliers.a((fbu<T>) new $$Lambda$rfg$2YdXbYI9DsNZv339dy3f8UUZPLw<T>(this));
    public final fbu<a> c = Suppliers.a((fbu<T>) new $$Lambda$rfg$ZIZUacofJKG4OmTlh5WuGS4LTg<T>(this));
    public final fbu<a> d = Suppliers.a((fbu<T>) $$Lambda$rfg$f68sMeK3Hcvj2BSEdoBgnuZPNoY.INSTANCE);
    final rbg e;
    final Resources f;
    private final fbu<a> g = Suppliers.a((fbu<T>) new $$Lambda$rfg$460DuJCwiHP9mt7fUTEdFpyhg10<T>(this));

    /* renamed from: rfg$a */
    public interface a {
        SortOption a();

        rkm b();
    }

    public rfg(rbg rbg, Resources resources) {
        this.e = rbg;
        this.f = resources;
    }

    public static ImmutableMap<String, Boolean> c() {
        return ImmutableMap.b("available_offline_only", Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public a d() {
        return new a() {
            private final SortOption a = new juz(new SortOption(vkc.e.a(), R.string.sort_order_recently_played, false)).a(new SortOption(vkc.c.a())).a(new SortOption(vkc.b.a())).a;
            private final SortOption b = new juz(new SortOption(vkc.d.a(), R.string.your_library_sort_order_relevance, false)).a(new SortOption(vkc.c.a())).a(new SortOption(vkc.b.a())).a;

            public final SortOption a() {
                fqn d = rfg.this.e.a.d();
                return d != null && ((String) d.a(vcd.c)).equals("Enabled") ? this.b : this.a;
            }

            public final rkm b() {
                com.google.common.collect.ImmutableList.a b2 = ImmutableList.g().b((E[]) new SortOption[]{this.b, new SortOption(vkc.a.a(), R.string.your_library_sort_order_custom_in_playlists, false), new juz(new SortOption(vkc.c.a(), R.string.your_library_sort_order_name_alphabetically, false)).a(new SortOption(vkc.b.a())).a, this.a, new juz(new SortOption(vkc.b.a(), R.string.sort_order_recently_added, false)).a(new SortOption(vkc.a.a())).a});
                com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                if (rfg.this.e.c()) {
                    g.c(b.h().a("available_offline_only").b(rfg.this.f.getString(R.string.your_library_music_pages_playlists_available_downloads_only_filter_inactive_title)).c(rfg.this.f.getString(R.string.your_library_music_pages_playlists_available_downloads_only_filter_active_title)).a(SpotifyIconV2.FILTER).b(SpotifyIconV2.FILTER).a(false).a());
                }
                return rkm.i().a(rfg.this.f.getString(R.string.your_library_music_pages_playlists_show_sort_options_title)).b(rfg.this.f.getString(R.string.your_library_music_pages_playlists_show_text_filter_title)).a((List<SortOption>) b2.a()).a(g.a()).c(rfg.this.f.getString(R.string.your_library_music_pages_find_in_playlists_hint)).a();
            }
        };
    }

    /* access modifiers changed from: private */
    public a e() {
        return new a() {
            private final SortOption a = new juz(new SortOption("name", R.string.your_library_sort_order_artist_name_alphabetically_in_artists, false)).a(new SortOption("addTime")).a;

            public final SortOption a() {
                return this.a;
            }

            public final rkm b() {
                ImmutableList a2 = ImmutableList.a(this.a, new SortOption("addTime", R.string.sort_order_recently_added, false));
                return rkm.i().a(rfg.this.f.getString(R.string.your_library_music_pages_artists_show_sort_options_title)).b(rfg.this.f.getString(R.string.your_library_music_pages_artists_show_text_filter_title)).a((List<SortOption>) a2).c(rfg.this.f.getString(R.string.your_library_music_pages_find_in_artists_hint)).a();
            }
        };
    }

    /* access modifiers changed from: private */
    public a f() {
        return new a() {
            private final SortOption a = new juz(new SortOption("artist.name", R.string.your_library_sort_order_artist_name_alphabetically, false)).a(new SortOption("name")).a(new SortOption("addTime")).a;

            public final SortOption a() {
                return this.a;
            }

            public final rkm b() {
                String str = "addTime";
                ImmutableList a2 = ImmutableList.a(new juz(new SortOption("name", R.string.your_library_sort_order_title_alphabetically, false)).a(new SortOption(str)).a, this.a, new SortOption(str, R.string.sort_order_recently_added, false));
                com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                if (rfg.this.e.c()) {
                    g.c(b.h().a("available_offline_only").b(rfg.this.f.getString(R.string.your_library_music_pages_albums_available_downloads_only_filter_inactive_title)).c(rfg.this.f.getString(R.string.your_library_music_pages_albums_available_downloads_only_filter_active_title)).a(SpotifyIconV2.FILTER).b(SpotifyIconV2.FILTER).a(false).a());
                }
                return rkm.i().a(rfg.this.f.getString(R.string.your_library_music_pages_albums_show_sort_options_title)).b(rfg.this.f.getString(R.string.your_library_music_pages_albums_show_text_filter_title)).a((List<SortOption>) a2).a(g.a()).c(rfg.this.f.getString(R.string.your_library_music_pages_find_in_albums_hint)).a();
            }
        };
    }

    /* access modifiers changed from: private */
    public a g() {
        return new a() {
            private final SortOption a = new juz(new SortOption("addTime", R.string.sort_order_recently_added, false)).a(new SortOption("album.name")).a(new SortOption("album.artist.name")).a(new SortOption("discNumber")).a(new SortOption("trackNumber")).a;

            public final SortOption a() {
                return this.a;
            }

            public final rkm b() {
                String str = "name";
                String str2 = "addTime";
                ImmutableList a2 = ImmutableList.a(new juz(new SortOption(str, R.string.your_library_sort_order_title_alphabetically, false)).a(new SortOption(str2)).a, new juz(new SortOption("artist.name", R.string.your_library_sort_order_artist_name_alphabetically, false)).a(new SortOption(str)).a(new SortOption(str2)).a, new juz(new SortOption("album.name", R.string.your_library_sort_order_album_name_alphabetically_in_liked_songs, false)).a(new SortOption("album.artist.name")).a(new SortOption("discNumber")).a(new SortOption("trackNumber")).a, this.a);
                com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                if (rfg.this.e.c()) {
                    g.c(b.h().a("available_offline_only").b(rfg.this.f.getString(R.string.your_library_music_pages_songs_available_downloads_only_filter_inactive_title)).c(rfg.this.f.getString(R.string.your_library_music_pages_songs_available_downloads_only_filter_active_title)).a(SpotifyIconV2.FILTER).b(SpotifyIconV2.FILTER).a(false).a());
                }
                return rkm.i().a(rfg.this.f.getString(R.string.your_library_music_pages_liked_songs_show_sort_options_title)).b(rfg.this.f.getString(R.string.your_library_music_pages_liked_songs_show_text_filter_title)).a((List<SortOption>) a2).a(g.a()).c(rfg.this.f.getString(R.string.your_library_music_pages_find_in_liked_songs_hint)).a();
            }
        };
    }

    /* access modifiers changed from: private */
    public static a h() {
        return new a() {
            private final SortOption a = new juz(new SortOption("name", R.string.your_library_sort_order_name_alphabetically, false)).a(new SortOption("addTime")).a;

            public final SortOption a() {
                return this.a;
            }

            public final rkm b() {
                return rkm.f;
            }
        };
    }

    public final SortOption a() {
        return ((a) this.g.get()).a();
    }

    public final rkm b() {
        return ((a) this.g.get()).b();
    }
}
