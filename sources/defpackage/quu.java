package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.datasource.SortOrder;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadata;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;
import java.util.regex.Pattern;

/* renamed from: quu reason: default package */
public final class quu {
    public final quz a;
    public final qxq b;
    private final qsr c;
    private final wlc<qvd> d;
    private final wlc<qvf> e;
    private final qyt f;
    private final quf g;
    private final wlc<qua> h;
    private final wlc<quc> i;
    private final wlc<quq> j;
    private final jpb k;
    private final Context l;
    private final qtu m;

    public quu(Context context, qsr qsr, quz quz, wlc<qvd> wlc, wlc<qvf> wlc2, qyt qyt, quf quf, wlc<qua> wlc3, wlc<quc> wlc4, wlc<quq> wlc5, qxq qxq, jpb jpb, qtu qtu) {
        this.l = context;
        this.c = qsr;
        this.a = quz;
        this.d = wlc;
        this.e = wlc2;
        this.f = qyt;
        this.g = quf;
        this.h = wlc3;
        this.i = wlc4;
        this.j = wlc5;
        this.b = qxq;
        this.k = jpb;
        this.m = qtu;
    }

    public final qul a() {
        qul qul;
        qul[] qulArr = new qul[3];
        if (uqi.b(this.c.a.b())) {
            qul = new qul() {
                public final Observable<Boolean> a() {
                    return Observable.b(Boolean.FALSE);
                }

                public final Observable<qun> b() {
                    return Observable.b(qun.h);
                }

                public final Observable<qun> a(Observable<qum> observable) {
                    return Observable.b(qun.h);
                }
            };
        } else {
            qvf qvf = (qvf) this.e.get();
            qul = qup.a(qvf.b(), (qul) new qul(qup.a(qvf.a().c((Function<? super T, ? extends R>) new $$Lambda$quu$TykYMN1TzNvAypf4fOMdSIFmrQ<Object,Object>(this))), $$Lambda$quu$6XKKfWXqeO1rDMWdtH5VHTNel20.INSTANCE) {
                private final PublishSubject<qun> a = PublishSubject.a();
                private /* synthetic */ qul b;
                private /* synthetic */ b c;

                {
                    this.b = r1;
                    this.c = r2;
                }

                public final Observable<Boolean> a() {
                    return this.a.e(qun.h).c((Function<? super T, ? extends R>) $$Lambda$qup$5$RDoYjukAsIbTtnKe8tCHz6iFs5Y.INSTANCE);
                }

                public final Observable<qun> b() {
                    return this.a.e(qun.h);
                }

                public final Observable<qun> a(Observable<qum> observable) {
                    Observable c2 = this.b.a(observable).c((Function<? super T, ? extends R>) new $$Lambda$qup$5$Z5Cpa4hm3tKejpCBkrVIw4HXbKk<Object,Object>(this.c));
                    PublishSubject<qun> publishSubject = this.a;
                    publishSubject.getClass();
                    return c2.b((Consumer<? super T>) new $$Lambda$oejf_8XUIWcygvqgFi5acWh8Y4s<Object>(publishSubject));
                }

                /* access modifiers changed from: private */
                public static /* synthetic */ qun a(b bVar, qun qun) {
                    qum m = qun.m();
                    com.google.common.collect.ImmutableList.a g = ImmutableList.g();
                    int k = qun.k();
                    for (int i = 0; i < k; i++) {
                        MusicItem a2 = qun.a(i);
                        if (bVar.apply(m, a2)) {
                            g.c(a2);
                        }
                    }
                    return quo.a(g.a(), m);
                }
            });
        }
        qulArr[0] = qul;
        qulArr[1] = this.a.a(null);
        Observable a2 = this.m.a();
        qxq qxq = this.b;
        qulArr[2] = qup.c(qup.a(a2, qup.a(MusicItem.z().a(qxq.c.a((CharSequence) Type.BANNED_TRACKS.toString()).c()).a(Type.BANNED_TRACKS).a(qxq.a.getString(R.string.your_library_music_pages_row_banned_tracks_title)).b(qxq.a.getString(R.string.your_library_music_pages_row_banned_tracks_subtitle)).a())));
        qul a3 = qup.a(qulArr);
        return qup.a(qup.a((qul) this.j.get(), qup.a(a3.a(), qup.c(qup.a(this.b.a((String) null)))), a3));
    }

    public final qul b() {
        a g2 = ImmutableList.g();
        g2.b((E[]) new qul[]{(qul) this.j.get(), (quc) this.i.get()});
        if (jsl.b(this.c.a.b())) {
            qul qul = (qul) this.h.get();
            g2.c(qup.d(qup.a(qup.a(qul.a(), qup.a(qup.a((ObservableTransformer<qum, qun>) new $$Lambda$quu$dU7_w5gHTjAIdGLUUSDskQgJnE<qum,qun>(this)), qul)))));
        }
        return qup.a(qup.a(g2.a()));
    }

    public final qul c() {
        boolean d2 = this.c.d();
        que a2 = this.g.a(a.a);
        Observable b2 = this.m.b();
        Observable a3 = Observable.a((ObservableSource<? extends T1>) a2.a(), (ObservableSource<? extends T2>) b2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$quu$vkPg77VkHtOoiTPMSqweNHF5C0M.INSTANCE);
        a g2 = ImmutableList.g();
        g2.c(a2);
        qxq qxq = this.b;
        MusicItem[] musicItemArr = {MusicItem.z().a(qxq.c.a((CharSequence) Type.ADD_ARTISTS_BUTTON.toString()).c()).a(Type.ADD_ARTISTS_BUTTON).a(qxq.a.getString(R.string.your_library_music_pages_button_add_artists)).a()};
        qxq qxq2 = this.b;
        g2.b((E[]) new qul[]{qup.a(a3, qup.b(qup.a(musicItemArr))), qup.a(b2, qup.b(qup.a(MusicItem.z().a(qxq2.c.a((CharSequence) Type.BANNED_ARTISTS.toString()).c()).a(Type.BANNED_ARTISTS).a(qxq2.a.getString(R.string.your_library_music_pages_row_banned_artists_title)).b(qxq2.a.getString(R.string.your_library_music_pages_row_banned_artists_subtitle)).a())))});
        if (d2) {
            que a4 = this.g.a(a.a.e().a(false).b(true).c(true).a(Optional.b(SortOrder.RECENTLY_PLAYED)).a());
            g2.c(qup.a(qup.a(a4.a(), qup.a(qup.a((ObservableTransformer<qum, qun>) new $$Lambda$quu$bpTtNsFtyoHBbPkYqWF9Zs3SwFc<qum,qun>(this)), qup.a((qul) a4, (a) $$Lambda$quu$bAWFnXChUdw8k5YXwU2n9leL2rk.INSTANCE)))));
        }
        return qup.a(qup.a(g2.a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(qum qum) {
        return !Boolean.parseBoolean((String) qum.d().getOrDefault("collapse_recommended_artists_section", Boolean.FALSE.toString()));
    }

    public final qul d() {
        quy a2 = this.a.a(null);
        quc quc = (quc) this.i.get();
        a2.a = true;
        quc.a = true;
        return qup.a(qup.a(a2, quc));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$043IgulM_T5OZdEOkBxCVXxHubQ.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$quu$qpZYzDyun5mKgaDu5XvVTiuORo4.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$klOrmY0TOg627pT9e3MATNFj8.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) new $$Lambda$quu$936o0dqRidRjjmeu3aLlfT77zDw<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(ImmutableMap immutableMap) {
        return (String) immutableMap.getOrDefault("collapse_recommended_artists_section", Boolean.FALSE.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qun b(Boolean bool) {
        return quo.b(ImmutableList.a(this.b.a("recommended-artists", this.l.getString(R.string.your_library_music_pages_row_section_header_recommended_artists_title), this.l.getString(R.string.your_library_music_pages_row_section_header_recommended_artists_subtitle), false, bool.booleanValue(), "collapse_recommended_artists_section")));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$043IgulM_T5OZdEOkBxCVXxHubQ.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$quu$41azbOjKDUVQ_SipbtBvYrlHgJ8.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$klOrmY0TOg627pT9e3MATNFj8.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) new $$Lambda$quu$AgLTMNJZdlz7bmz4D_kkzfU6bss<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(ImmutableMap immutableMap) {
        return (String) immutableMap.getOrDefault("collapse_recommended_albums_section", Boolean.FALSE.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qun a(Boolean bool) {
        return quo.b(ImmutableList.a(this.b.a("recommended-albums", this.l.getString(R.string.your_library_music_pages_row_section_header_recommended_albums_title), this.l.getString(R.string.your_library_music_pages_row_section_header_recommended_albums_subtitle), false, bool.booleanValue(), "collapse_recommended_albums_section")));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ MusicItem b(SongsMetadata songsMetadata) {
        qxq qxq = this.b;
        return MusicItem.z().a(qxq.c.a((CharSequence) Type.DOWNLOAD_TOGGLE.toString()).c()).a(Type.DOWNLOAD_TOGGLE).a(songsMetadata.offlineState()).c("spotify:internal:collection:tracks").a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ MusicItem a(SongsMetadata songsMetadata) {
        String str;
        qxq qxq = this.b;
        int length = songsMetadata.length();
        boolean isLoading = songsMetadata.isLoading();
        uzf offlineState = songsMetadata.offlineState();
        fpt b2 = this.k.b();
        boolean z = true;
        boolean z2 = length == 0;
        Type type = z2 ? Type.FAVORITE_SONGS_EMPTY : Type.FAVORITE_SONGS;
        if (isLoading) {
            str = "";
        } else if (z2) {
            str = qxq.a.getString(R.string.your_library_music_pages_row_favorite_songs_empty_subtitle);
        } else {
            str = qxq.a.getResources().getQuantityString(R.plurals.your_library_music_pages_row_favorite_songs_subtitle, length, new Object[]{Integer.valueOf(length)});
        }
        MusicItem.a a2 = MusicItem.z().a(qxq.c.a((CharSequence) type.toString()).c()).a(type);
        if (!jsl.c(b2) && !z2) {
            z = false;
        }
        return a2.a(Boolean.valueOf(z)).d("spotify:internal:collection:tracks").a(qxq.a.getString(R.string.your_library_music_pages_liked_songs_title)).b(str).a(offlineState).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(qum qum, MusicItem musicItem) {
        String b2 = qum.c().b();
        if (!b2.isEmpty() && !Pattern.compile(Pattern.quote(b2), 66).matcher(musicItem.h()).find()) {
            return false;
        }
        if (!((Boolean) fav.a(qum.c().d().get("available_offline_only"), Boolean.FALSE)).booleanValue() || !(((uzf) jtc.a(musicItem.p(), new f())) instanceof f)) {
            return true;
        }
        return false;
    }

    public final qul e() {
        qul qul;
        qvd qvd = (qvd) this.d.get();
        qxq qxq = this.b;
        qul a2 = qup.a(qvd, qup.a(qup.a(MusicItem.z().a(qxq.c.a((CharSequence) Type.FILTER_INFO.toString()).c()).a(Type.FILTER_INFO).a(qxq.a.getString(R.string.your_library_music_pages_row_filter_info_title)).b(qxq.a.getString(R.string.your_library_music_pages_row_filter_info_clear_filter_button_label)).a()), (a) $$Lambda$quu$UE6LQKF1eMZ4olIsmwXf98oOKXE.INSTANCE));
        if (jsl.c(this.k.b())) {
            qul[] qulArr = new qul[2];
            Observable a3 = a2.a();
            if (this.c.b()) {
                qul = qup.a(((qvf) this.e.get()).a().c((Function<? super T, ? extends R>) new $$Lambda$quu$KQW4uxNI7zdNH3GdzbOkNMpzF4g<Object,Object>(this)));
            } else {
                qul = new qul() {
                    public final Observable<Boolean> a() {
                        return Observable.b(Boolean.FALSE);
                    }

                    public final Observable<qun> b() {
                        return Observable.b(qun.h);
                    }

                    public final Observable<qun> a(Observable<qum> observable) {
                        return Observable.b(qun.h);
                    }
                };
            }
            qulArr[0] = qup.b(qup.a(a3, qul));
            qulArr[1] = a2;
            return qup.a(qup.a(qulArr));
        }
        qyt qyt = this.f;
        qys qys = new qys((qul) qyt.a(qvd, 1), (String) qyt.a("spotify:internal:collection:tracks", 2), 15, (qzc) qyt.a(qyt.a.get(), 4), (CollectionStateProvider) qyt.a(qyt.b.get(), 5), (sih) qyt.a(qyt.c.get(), 6), (qxq) qyt.a(qyt.d.get(), 7), (kxz) qyt.a(qyt.e.get(), 8));
        Observable a4 = a2.a();
        Observable a5 = qys.a();
        qxq qxq2 = this.b;
        String string = this.l.getString(R.string.your_library_music_pages_row_section_header_songs_recs_title);
        String string2 = this.l.getString(R.string.your_library_music_pages_row_section_header_songs_recs_info_button_text);
        String string3 = this.l.getString(R.string.your_library_music_pages_info_dialog_songs_extra_songs_title);
        String string4 = this.l.getString(R.string.your_library_music_pages_info_dialog_songs_extra_songs_text);
        String string5 = this.l.getString(R.string.your_library_music_pages_info_dialog_songs_extra_songs_dismiss);
        MusicItem.a z = MusicItem.z();
        fdr fdr = qxq2.c;
        StringBuilder sb = new StringBuilder();
        sb.append(Type.SECTION_HEADER_WITH_BUTTON);
        sb.append("recs-section-header");
        return qup.a(qup.a(a2, qup.a(a4, qup.b(qup.a(a5, qup.a(qup.a(z.a(fdr.a((CharSequence) sb.toString()).c()).a(Type.SECTION_HEADER_WITH_BUTTON).a(string).a((b) e.h().a(string2).b(string3).c(string4).d(string5).a()).a()), qys))))));
    }
}
