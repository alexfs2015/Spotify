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

/* renamed from: rgs reason: default package */
public final class rgs {
    private static final ImmutableMap<MusicPageId, rgr> a;
    private final Context b;
    private final rfg c;
    private final ImmutableMap<MusicPageId, fbu<rgq>> d;

    static {
        a g = ImmutableMap.g();
        g.b(MusicPageId.PLAYLISTS, rgr.f().a(ImmutableList.a(LinkType.COLLECTION_ROOTLIST)).a(Optional.b(ViewUris.bc)).a((gkq) PageIdentifiers.YOURLIBRARY_PLAYLISTS).a(uqo.y).a());
        g.b(MusicPageId.ARTISTS, rgr.f().a(ImmutableList.a(LinkType.COLLECTION_ARTIST_OVERVIEW)).a(Optional.b(ViewUris.be)).a((gkq) PageIdentifiers.YOURLIBRARY_ARTISTS).a(uqo.w).a());
        g.b(MusicPageId.ALBUMS, rgr.f().a(ImmutableList.a(LinkType.COLLECTION_ALBUM_OVERVIEW)).a(Optional.b(ViewUris.bf)).a((gkq) PageIdentifiers.YOURLIBRARY_ALBUMS).a(uqo.u).a());
        g.b(MusicPageId.DOWNLOADS, rgr.f().a(ImmutableList.a(LinkType.COLLECTION_OFFLINE_LIBRARY)).a(Optional.b(ViewUris.bj)).a((gkq) PageIdentifiers.COLLECTION_OFFLINELIBRARY).a(uqo.x).a());
        g.b(MusicPageId.SONGS, rgr.f().a(ImmutableList.a(LinkType.COLLECTION_TRACKS)).a(Optional.b(ViewUris.bi)).a((gkq) PageIdentifiers.COLLECTION_SONGS).a(uqo.A).a());
        g.b(MusicPageId.FOLDER, rgr.f().a(ImmutableList.a(LinkType.COLLECTION_PLAYLIST_FOLDER)).b(Optional.b(ViewUris.aH)).a((gkq) PageIdentifiers.PLAYLIST_FOLDER).a(uqo.aA).a());
        a = g.b();
    }

    public rgs(Context context, rfg rfg) {
        this.b = context;
        this.c = rfg;
        a g = ImmutableMap.g();
        g.b(MusicPageId.PLAYLISTS, Suppliers.a((fbu<T>) new $$Lambda$rgs$F6AUt96prxHTdl6FTp4S5bd5wU<T>(this)));
        g.b(MusicPageId.ARTISTS, Suppliers.a((fbu<T>) new $$Lambda$rgs$ksuccSoP4ZlUvCMkJX1Uhj4qhW8<T>(this)));
        g.b(MusicPageId.ALBUMS, Suppliers.a((fbu<T>) new $$Lambda$rgs$qW1SIo3BQjhKirKztd4eCqSQU<T>(this)));
        g.b(MusicPageId.DOWNLOADS, Suppliers.a((fbu<T>) new $$Lambda$rgs$d9xrKLhe3GOl_9znKzSi55Ujoo<T>(this)));
        g.b(MusicPageId.SONGS, Suppliers.a((fbu<T>) new $$Lambda$rgs$lXFm9vZbufhskkJvsRWFNbdT8q0<T>(this)));
        g.b(MusicPageId.FOLDER, Suppliers.a((fbu<T>) new $$Lambda$rgs$rChLgg9c5q_XKYwgDb6ZSdGaUo<T>(this)));
        this.d = g.b();
    }

    public static ImmutableMap<MusicPageId, rgr> a() {
        return a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rgq b() {
        return rgq.u().a(MusicPageId.FOLDER).a(Optional.e()).a("").a(this.c.b()).a(vca.a(this.c.a())).a(rfg.c()).a(EmptyPageAction.CREATE_PLAYLIST).d(this.b.getString(R.string.your_library_music_pages_button_create_playlist)).c(this.b.getString(R.string.your_library_music_pages_create_playlist_prompt_description_title)).b((CharSequence) this.b.getString(R.string.your_library_music_pages_create_playlist_prompt_description_subtitle)).a(false).b(false).c(false).a();
    }

    public static rgr b(MusicPageId musicPageId) {
        return (rgr) fbp.a(a.get(musicPageId));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rgq c() {
        return rgq.u().a(MusicPageId.SONGS).a(Optional.b("spotify:collection:tracks")).a(this.b.getString(R.string.your_library_music_pages_liked_songs_title)).c(this.b.getString(R.string.your_library_music_pages_page_songs_empty_title)).a(((a) this.c.c.get()).b()).a(vca.a(((a) this.c.c.get()).a())).a(ImmutableMap.b("available_offline_only", Boolean.FALSE)).a(PageAction.SHUFFLE_PLAY).e(this.b.getString(R.string.header_shuffle_play)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rgq d() {
        return rgq.u().a(MusicPageId.DOWNLOADS).a(Optional.b("spotify:offline-library")).a(this.b.getString(R.string.your_library_music_pages_page_downloads_title)).c(this.b.getString(R.string.your_library_music_pages_page_downloads_empty_title)).a(((a) this.c.d.get()).b()).a(vca.a(((a) this.c.d.get()).a())).a(ImmutableMap.f()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rgq e() {
        return rgq.u().a(MusicPageId.ALBUMS).a(Optional.b("spotify:collection:albums")).a(this.b.getString(R.string.your_library_music_pages_page_albums_title)).c(this.b.getString(R.string.your_library_music_pages_page_albums_empty_title)).a(((a) this.c.b.get()).b()).a(vca.a(((a) this.c.b.get()).a())).a(ImmutableMap.b("available_offline_only", Boolean.FALSE)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rgq f() {
        return rgq.u().a(MusicPageId.ARTISTS).a(Optional.b("spotify:collection:artists")).a(this.b.getString(R.string.your_library_music_pages_page_artists_title)).c(this.b.getString(R.string.your_library_music_pages_page_artists_empty_title)).b((CharSequence) this.b.getString(R.string.your_library_music_pages_page_artists_empty_subtitle)).d(this.b.getString(R.string.your_library_music_pages_page_artists_empty_button)).a(EmptyPageAction.ADD_ARTISTS).a(((a) this.c.a.get()).b()).a(vca.a(((a) this.c.a.get()).a())).a(ImmutableMap.b("available_offline_only", Boolean.FALSE)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rgq g() {
        return rgq.u().a(MusicPageId.PLAYLISTS).a(Optional.b("spotify:playlists")).a(this.b.getString(R.string.your_library_music_pages_page_playlists_title)).a(EmptyPageAction.CREATE_PLAYLIST).d(this.b.getString(R.string.your_library_music_pages_button_create_playlist)).c(this.b.getString(R.string.your_library_music_pages_create_playlist_prompt_description_title)).b((CharSequence) this.b.getString(R.string.your_library_music_pages_create_playlist_prompt_description_subtitle)).a(this.c.b()).a(vca.a(this.c.a())).a(rfg.c()).a();
    }

    public final rgq a(MusicPageId musicPageId) {
        return (rgq) ((fbu) fbp.a(this.d.get(musicPageId))).get();
    }
}
