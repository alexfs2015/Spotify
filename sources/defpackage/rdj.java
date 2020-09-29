package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.datasource.SortOrder;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;
import java.util.regex.Pattern;

/* renamed from: rdj reason: default package */
public final class rdj {
    public final rdo a;
    public final rgf b;
    private final rbg c;
    private final wzi<rds> d;
    private final wzi<rhw> e;
    private final rhi f;
    private final rcu g;
    private final wzi<rcp> h;
    private final wzi<rcr> i;
    private final wzi<rdf> j;
    private final jrn k;
    private final Context l;
    private final rcj m;

    public rdj(Context context, rbg rbg, rdo rdo, wzi<rds> wzi, wzi<rhw> wzi2, rhi rhi, rcu rcu, wzi<rcp> wzi3, wzi<rcr> wzi4, wzi<rdf> wzi5, rgf rgf, jrn jrn, rcj rcj) {
        this.l = context;
        this.c = rbg;
        this.a = rdo;
        this.d = wzi;
        this.e = wzi2;
        this.f = rhi;
        this.g = rcu;
        this.h = wzi3;
        this.i = wzi4;
        this.j = wzi5;
        this.b = rgf;
        this.k = jrn;
        this.m = rcj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ MusicItem a(SongsMetadataFromTracks songsMetadataFromTracks) {
        rgf rgf = this.b;
        int length = songsMetadataFromTracks.length();
        boolean isLoading = songsMetadataFromTracks.isLoading();
        vli offlineState = songsMetadataFromTracks.offlineState();
        fqn d2 = this.k.d();
        boolean z = true;
        boolean z2 = length == 0;
        Type type = z2 ? Type.FAVORITE_SONGS_EMPTY : Type.FAVORITE_SONGS;
        String str = isLoading ? "" : z2 ? rgf.a.getString(R.string.your_library_music_pages_row_favorite_songs_empty_subtitle) : rgf.a.getResources().getQuantityString(R.plurals.your_library_music_pages_row_favorite_songs_subtitle, length, new Object[]{Integer.valueOf(length)});
        a a2 = MusicItem.z().a(rgf.c.a((CharSequence) type.toString()).c()).a(type);
        if (!jus.c(d2) && !z2) {
            z = false;
        }
        return a2.a(Boolean.valueOf(z)).d("spotify:internal:collection:tracks").a(rgf.a.getString(R.string.your_library_music_pages_liked_songs_title)).b(str).a(offlineState).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$yC4ZsWmIBm33woh6kCNMrEWuzfc.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$rdj$5fG2Bap0c9FprQEpdTrqVtz3iXA.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$klOrmY0TOg627pT9e3MATNFj8.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) new $$Lambda$rdj$Dot8pO_pKiSGOpXryjI7uMYRgI<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(ImmutableMap immutableMap) {
        return (String) immutableMap.getOrDefault("collapse_recommended_albums_section", Boolean.FALSE.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rdc a(Boolean bool) {
        return rdd.b(ImmutableList.a(this.b.a("recommended-albums", this.l.getString(R.string.your_library_music_pages_row_section_header_recommended_albums_title), this.l.getString(R.string.your_library_music_pages_row_section_header_recommended_albums_subtitle), false, bool.booleanValue(), "collapse_recommended_albums_section")));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(rdb rdb, MusicItem musicItem) {
        String b2 = rdb.c().b();
        if (b2.isEmpty() || Pattern.compile(Pattern.quote(b2), 66).matcher(musicItem.h()).find()) {
            return !((Boolean) fbm.a(rdb.c().d().get("available_offline_only"), Boolean.FALSE)).booleanValue() || !(((vli) jvi.a(musicItem.p(), new f())) instanceof f);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ MusicItem b(SongsMetadataFromTracks songsMetadataFromTracks) {
        rgf rgf = this.b;
        return MusicItem.z().a(rgf.c.a((CharSequence) Type.DOWNLOAD_TOGGLE.toString()).c()).a(Type.DOWNLOAD_TOGGLE).a(songsMetadataFromTracks.offlineState()).c("spotify:internal:collection:tracks").a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$yC4ZsWmIBm33woh6kCNMrEWuzfc.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$rdj$c6si1YOMGBhm99bGmhD3A94zq0.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$klOrmY0TOg627pT9e3MATNFj8.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) new $$Lambda$rdj$gc5y9r8NypiJ_mcxnTe6gpmh00<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(ImmutableMap immutableMap) {
        return (String) immutableMap.getOrDefault("collapse_recommended_artists_section", Boolean.FALSE.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rdc b(Boolean bool) {
        return rdd.b(ImmutableList.a(this.b.a("recommended-artists", this.l.getString(R.string.your_library_music_pages_row_section_header_recommended_artists_title), this.l.getString(R.string.your_library_music_pages_row_section_header_recommended_artists_subtitle), false, bool.booleanValue(), "collapse_recommended_artists_section")));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(rdb rdb) {
        return !Boolean.parseBoolean((String) rdb.d().getOrDefault("collapse_recommended_artists_section", Boolean.FALSE.toString()));
    }

    public final rda a() {
        rhw rhw = (rhw) this.e.get();
        Observable a2 = this.m.a();
        rgf rgf = this.b;
        rda a3 = rde.a(rde.a(rhw.b(), (rda) new rda(rde.a(rhw.a().c((Function<? super T, ? extends R>) new $$Lambda$rdj$si7l9l471_9N9or43snKjLbePss<Object,Object>(this))), $$Lambda$rdj$tUiCrqtm9XJo9DkhnbuyjED7y10.INSTANCE) {
            private final PublishSubject<rdc> a = PublishSubject.a();
            private /* synthetic */ rda b;
            private /* synthetic */ b c;

            {
                this.b = r1;
                this.c = r2;
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ rdc a(b bVar, rdc rdc) {
                rdb m = rdc.m();
                com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                int k = rdc.k();
                for (int i = 0; i < k; i++) {
                    MusicItem a2 = rdc.a(i);
                    if (bVar.apply(m, a2)) {
                        g.c(a2);
                    }
                }
                return rdd.a(g.a(), m);
            }

            public final Observable<Boolean> a() {
                return this.a.e(rdc.h).c((Function<? super T, ? extends R>) $$Lambda$rde$5$JMqJyHtJ17lLq47k96toupp5YBM.INSTANCE);
            }

            public final Observable<rdc> a(Observable<rdb> observable) {
                Observable c2 = this.b.a(observable).c((Function<? super T, ? extends R>) new $$Lambda$rde$5$OWb7f7yv4A_4MgE774_TZ6Gc<Object,Object>(this.c));
                PublishSubject<rdc> publishSubject = this.a;
                publishSubject.getClass();
                return c2.b((Consumer<? super T>) new $$Lambda$aRm7UzXWS9e0sn472n_IAE1wqE<Object>(publishSubject));
            }

            public final Observable<rdc> b() {
                return this.a.e(rdc.h);
            }
        }), this.a.a(null), rde.c(rde.a(a2, rde.a(MusicItem.z().a(rgf.c.a((CharSequence) Type.BANNED_TRACKS.toString()).c()).a(Type.BANNED_TRACKS).a(rgf.a.getString(R.string.your_library_music_pages_row_banned_tracks_title)).b(rgf.a.getString(R.string.your_library_music_pages_row_banned_tracks_subtitle)).a()))));
        return rde.a(rde.a((rda) this.j.get(), rde.a(a3.a(), rde.c(rde.a(this.b.a((String) null)))), a3));
    }

    public final rda b() {
        ImmutableList.a g2 = ImmutableList.g();
        g2.b((E[]) new rda[]{(rda) this.j.get(), (rcr) this.i.get()});
        if (jus.b(this.c.a.d())) {
            rda rda = (rda) this.h.get();
            g2.c(rde.d(rde.a(rde.a(rda.a(), rde.a(rde.a((ObservableTransformer<rdb, rdc>) new $$Lambda$rdj$Hn2HlVJbMJu_0yGiIDtYG0P7pkQ<rdb,rdc>(this)), rda)))));
        }
        return rde.a(rde.a(g2.a()));
    }

    public final rda c() {
        boolean d2 = this.c.d();
        rct a2 = this.g.a(a.a);
        Observable b2 = this.m.b();
        Observable a3 = Observable.a((ObservableSource<? extends T1>) a2.a(), (ObservableSource<? extends T2>) b2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$rdj$9rRTFRyrpn_YF85ySVz_mCqkjI.INSTANCE);
        ImmutableList.a g2 = ImmutableList.g();
        g2.c(a2);
        rgf rgf = this.b;
        MusicItem[] musicItemArr = {MusicItem.z().a(rgf.c.a((CharSequence) Type.ADD_ARTISTS_BUTTON.toString()).c()).a(Type.ADD_ARTISTS_BUTTON).a(rgf.a.getString(R.string.your_library_music_pages_button_add_artists)).a()};
        rgf rgf2 = this.b;
        g2.b((E[]) new rda[]{rde.a(a3, rde.b(rde.a(musicItemArr))), rde.a(b2, rde.b(rde.a(MusicItem.z().a(rgf2.c.a((CharSequence) Type.BANNED_ARTISTS.toString()).c()).a(Type.BANNED_ARTISTS).a(rgf2.a.getString(R.string.your_library_music_pages_row_banned_artists_title)).b(rgf2.a.getString(R.string.your_library_music_pages_row_banned_artists_subtitle)).a())))});
        if (d2) {
            rct a4 = this.g.a(a.a.e().a(false).b(true).c(true).a(Optional.b(SortOrder.RECENTLY_PLAYED)).a());
            g2.c(rde.a(rde.a(a4.a(), rde.a(rde.a((ObservableTransformer<rdb, rdc>) new $$Lambda$rdj$YdNhb19HDmILtEAlrMmkEX32_hw<rdb,rdc>(this)), rde.a((rda) a4, (a) $$Lambda$rdj$8fk2aMvMNcFh0sVguA4fu4Tiv9k.INSTANCE)))));
        }
        return rde.a(rde.a(g2.a()));
    }

    public final rda d() {
        rdn a2 = this.a.a(null);
        rcr rcr = (rcr) this.i.get();
        a2.a = true;
        rcr.a = true;
        return rde.a(rde.a(a2, rcr));
    }

    public final rda e() {
        rds rds = (rds) this.d.get();
        rgf rgf = this.b;
        rda a2 = rde.a(rds, rde.a(rde.a(MusicItem.z().a(rgf.c.a((CharSequence) Type.FILTER_INFO.toString()).c()).a(Type.FILTER_INFO).a(rgf.a.getString(R.string.your_library_music_pages_row_filter_info_title)).b(rgf.a.getString(R.string.your_library_music_pages_row_filter_info_clear_filter_button_label)).a()), (a) $$Lambda$rdj$8vxy5x1DeaVWgiVz0Dxo3w7a3g.INSTANCE));
        if (jus.c(this.k.d())) {
            rda[] rdaArr = new rda[2];
            rdaArr[0] = rde.b(rde.a(a2.a(), this.c.b() ? rde.a(((rhw) this.e.get()).a().c((Function<? super T, ? extends R>) new $$Lambda$rdj$rEVVz4_U_d3isgiMF1Vu56GLcA<Object,Object>(this))) : new rda() {
                public final Observable<Boolean> a() {
                    return Observable.b(Boolean.FALSE);
                }

                public final Observable<rdc> a(Observable<rdb> observable) {
                    return Observable.b(rdc.h);
                }

                public final Observable<rdc> b() {
                    return Observable.b(rdc.h);
                }
            }));
            rdaArr[1] = a2;
            return rde.a(rde.a(rdaArr));
        }
        rhi rhi = this.f;
        rhh rhh = new rhh((rda) rhi.a(rds, 1), (String) rhi.a("spotify:internal:collection:tracks", 2), 15, (rhr) rhi.a(rhi.a.get(), 4), (CollectionStateProvider) rhi.a(rhi.b.get(), 5), (sso) rhi.a(rhi.c.get(), 6), (rgf) rhi.a(rhi.d.get(), 7), (lbi) rhi.a(rhi.e.get(), 8));
        Observable a3 = a2.a();
        Observable a4 = rhh.a();
        rgf rgf2 = this.b;
        String string = this.l.getString(R.string.your_library_music_pages_row_section_header_songs_recs_title);
        String string2 = this.l.getString(R.string.your_library_music_pages_row_section_header_songs_recs_info_button_text);
        String string3 = this.l.getString(R.string.your_library_music_pages_info_dialog_songs_extra_songs_title);
        String string4 = this.l.getString(R.string.your_library_music_pages_info_dialog_songs_extra_songs_text);
        String string5 = this.l.getString(R.string.your_library_music_pages_info_dialog_songs_extra_songs_dismiss);
        a z = MusicItem.z();
        fej fej = rgf2.c;
        StringBuilder sb = new StringBuilder();
        sb.append(Type.SECTION_HEADER_WITH_BUTTON);
        sb.append("recs-section-header");
        return rde.a(rde.a(a2, rde.a(a3, rde.b(rde.a(a4, rde.a(rde.a(z.a(fej.a((CharSequence) sb.toString()).c()).a(Type.SECTION_HEADER_WITH_BUTTON).a(string).a((b) e.h().a(string2).b(string3).c(string4).d(string5).a()).a()), rhh))))));
    }
}
