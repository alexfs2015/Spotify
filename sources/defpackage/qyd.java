package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.pages.EmptyPageAction;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qyd reason: default package */
public final class qyd {
    private static final ImmutableMap<MusicPageId, qyc> a;
    private final Context b;
    private final qwr c;
    private final ImmutableMap<MusicPageId, fbd<qyb>> d;

    public qyd(Context context, qwr qwr) {
        this.b = context;
        this.c = qwr;
        a g = ImmutableMap.g();
        g.b(MusicPageId.PLAYLISTS, Suppliers.a((fbd<T>) new $$Lambda$qyd$N1qFuDp1Lyuco7EExp1Jewgjj8<T>(this)));
        g.b(MusicPageId.ARTISTS, Suppliers.a((fbd<T>) new $$Lambda$qyd$3hh1kxx6mdP6R9EGgDydFXeUF0g<T>(this)));
        g.b(MusicPageId.ALBUMS, Suppliers.a((fbd<T>) new $$Lambda$qyd$VW2sH6D0TxxC6u_BQnNwDfkkfD4<T>(this)));
        g.b(MusicPageId.DOWNLOADS, Suppliers.a((fbd<T>) new $$Lambda$qyd$J40OhGifHLy7F3tFeVHiOWBYFU<T>(this)));
        g.b(MusicPageId.SONGS, Suppliers.a((fbd<T>) new $$Lambda$qyd$geGLQvwMIZGaPlSYSxB7iLAqoU<T>(this)));
        g.b(MusicPageId.FOLDER, Suppliers.a((fbd<T>) new $$Lambda$qyd$t495bnoYhwTGvVJek2r97tTZDhw<T>(this)));
        this.d = g.b();
    }

    public static ImmutableMap<MusicPageId, qyc> a() {
        return a;
    }

    public final qyb a(MusicPageId musicPageId) {
        return (qyb) ((fbd) fay.a(this.d.get(musicPageId))).get();
    }

    public static qyc b(MusicPageId musicPageId) {
        return (qyc) fay.a(a.get(musicPageId));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qyb g() {
        return qyb.u().a(MusicPageId.PLAYLISTS).a(Optional.b("spotify:playlists")).a(this.b.getString(R.string.your_library_music_pages_page_playlists_title)).a(EmptyPageAction.CREATE_PLAYLIST).d(this.b.getString(R.string.your_library_music_pages_button_create_playlist)).c(this.b.getString(R.string.your_library_music_pages_create_playlist_prompt_description_title)).b((CharSequence) this.b.getString(R.string.your_library_music_pages_create_playlist_prompt_description_subtitle)).a(this.c.b()).a(uqv.a(this.c.a())).a(qwr.c()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qyb f() {
        return qyb.u().a(MusicPageId.ARTISTS).a(Optional.b("spotify:collection:artists")).a(this.b.getString(R.string.your_library_music_pages_page_artists_title)).c(this.b.getString(R.string.your_library_music_pages_page_artists_empty_title)).b((CharSequence) this.b.getString(R.string.your_library_music_pages_page_artists_empty_subtitle)).d(this.b.getString(R.string.your_library_music_pages_page_artists_empty_button)).a(EmptyPageAction.ADD_ARTISTS).a(((a) this.c.a.get()).b()).a(uqv.a(((a) this.c.a.get()).a())).a(ImmutableMap.b("available_offline_only", Boolean.FALSE)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qyb e() {
        return qyb.u().a(MusicPageId.ALBUMS).a(Optional.b("spotify:collection:albums")).a(this.b.getString(R.string.your_library_music_pages_page_albums_title)).c(this.b.getString(R.string.your_library_music_pages_page_albums_empty_title)).a(((a) this.c.b.get()).b()).a(uqv.a(((a) this.c.b.get()).a())).a(ImmutableMap.b("available_offline_only", Boolean.FALSE)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qyb d() {
        return qyb.u().a(MusicPageId.DOWNLOADS).a(Optional.b("spotify:offline-library")).a(this.b.getString(R.string.your_library_music_pages_page_downloads_title)).c(this.b.getString(R.string.your_library_music_pages_page_downloads_empty_title)).a(((a) this.c.d.get()).b()).a(uqv.a(((a) this.c.d.get()).a())).a(ImmutableMap.f()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qyb c() {
        return qyb.u().a(MusicPageId.SONGS).a(Optional.b("spotify:collection:tracks")).a(this.b.getString(R.string.your_library_music_pages_liked_songs_title)).c(this.b.getString(R.string.your_library_music_pages_page_songs_empty_title)).a(((a) this.c.c.get()).b()).a(uqv.a(((a) this.c.c.get()).a())).a(ImmutableMap.b("available_offline_only", Boolean.FALSE)).a(PageAction.SHUFFLE_PLAY).e(this.b.getString(R.string.header_shuffle_play)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qyb b() {
        return qyb.u().a(MusicPageId.FOLDER).a(Optional.e()).a("").a(this.c.b()).a(uqv.a(this.c.a())).a(qwr.c()).a(EmptyPageAction.CREATE_PLAYLIST).d(this.b.getString(R.string.your_library_music_pages_button_create_playlist)).c(this.b.getString(R.string.your_library_music_pages_create_playlist_prompt_description_title)).b((CharSequence) this.b.getString(R.string.your_library_music_pages_create_playlist_prompt_description_subtitle)).a(false).b(false).c(false).a();
    }

    static {
        a g = ImmutableMap.g();
        g.b(MusicPageId.PLAYLISTS, qyc.f().a(ImmutableList.a(LinkType.COLLECTION_ROOTLIST)).a(Optional.b(ViewUris.bd)).a((gjf) PageIdentifiers.YOURLIBRARY_PLAYLISTS).a(udt.y).a());
        g.b(MusicPageId.ARTISTS, qyc.f().a(ImmutableList.a(LinkType.COLLECTION_ARTIST_OVERVIEW)).a(Optional.b(ViewUris.bf)).a((gjf) PageIdentifiers.YOURLIBRARY_ARTISTS).a(udt.w).a());
        g.b(MusicPageId.ALBUMS, qyc.f().a(ImmutableList.a(LinkType.COLLECTION_ALBUM_OVERVIEW)).a(Optional.b(ViewUris.bg)).a((gjf) PageIdentifiers.YOURLIBRARY_ALBUMS).a(udt.u).a());
        g.b(MusicPageId.DOWNLOADS, qyc.f().a(ImmutableList.a(LinkType.COLLECTION_OFFLINE_LIBRARY)).a(Optional.b(ViewUris.bk)).a((gjf) PageIdentifiers.COLLECTION_OFFLINELIBRARY).a(udt.x).a());
        g.b(MusicPageId.SONGS, qyc.f().a(ImmutableList.a(LinkType.COLLECTION_TRACKS)).a(Optional.b(ViewUris.bj)).a((gjf) PageIdentifiers.COLLECTION_SONGS).a(udt.A).a());
        g.b(MusicPageId.FOLDER, qyc.f().a(ImmutableList.a(LinkType.COLLECTION_PLAYLIST_FOLDER)).b(Optional.b(ViewUris.aI)).a((gjf) PageIdentifiers.PLAYLIST_FOLDER).a(udt.aA).a());
        a = g.b();
    }
}
