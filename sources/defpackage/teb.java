package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Map;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: teb reason: default package */
public final class teb {
    final tch a;
    final Resources b;
    private final boolean c;
    private final tdx d;
    private final uxc e;
    private final a f;
    private final rwz g;
    private final boolean h;

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(String str, Throwable th) {
        return str;
    }

    public teb(tch tch, Resources resources, boolean z, tdx tdx, uxc uxc, HeaderPolicy headerPolicy, rxa rxa, boolean z2) {
        this.a = tch;
        this.b = resources;
        this.c = z;
        this.d = tdx;
        this.e = uxc;
        this.g = rxa.a();
        this.h = z2;
        this.f = a.t().i(uyd.a(0, 0)).a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(headerPolicy).a(ListPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).d(ImmutableMap.f()).a()).a()).a())).a();
    }

    public final wud<tee> a(String str) {
        String str2;
        String str3;
        if (!this.h) {
            return ScalarSynchronousObservable.d(new a().a("").a(PivotSubtitleIcon.NONE).a(false).a());
        }
        LinkType linkType = jst.a(str).b;
        if (jsu.a(jst.a(str))) {
            if (AnonymousClass1.a[linkType.ordinal()] != 1) {
                str3 = this.b.getString(R.string.radio_title);
            } else {
                str3 = this.b.getString(R.string.driving_made_for_you);
            }
            return a(str, str3);
        } else if (linkType == LinkType.PLAYLIST_V2 || linkType == LinkType.PROFILE_PLAYLIST) {
            return vun.a((ObservableSource<T>) this.e.b(str, this.f), BackpressureStrategy.BUFFER).f($$Lambda$YNlRwsyDG7EICkxbEzrXyzGhv8.INSTANCE).f(new $$Lambda$teb$xpTJgepRynWgGa1SyPGIuCjQq0(this, str));
        } else {
            if (!jsu.a(linkType)) {
                switch (linkType) {
                    case ALBUM:
                        str2 = this.b.getString(R.string.album_title_default);
                        break;
                    case ARTIST:
                        str2 = this.b.getString(R.string.artist_default_title);
                        break;
                    case SEARCH_QUERY:
                    case TRACK:
                        str2 = this.b.getString(R.string.driving_track_subtitle);
                        break;
                    case SHOW_SHOW:
                    case SHOW_EPISODE:
                        str2 = this.b.getString(R.string.driving_podcast_subtitle);
                        break;
                    default:
                        str2 = this.b.getString(R.string.driving_fallback_suggested_music);
                        break;
                }
            } else {
                str2 = this.b.getString(R.string.collection_title_your_library);
            }
            return a(str, str2);
        }
    }

    private PivotSubtitleIcon a(String str, uyz uyz) {
        if (a(uyz)) {
            return PivotSubtitleIcon.DOWNLOADED;
        }
        if (b(str, uyz)) {
            return PivotSubtitleIcon.SHUFFLE;
        }
        return PivotSubtitleIcon.NONE;
    }

    private boolean a(uyz uyz) {
        if (this.c && uyz != null && (uyz.s() instanceof a)) {
            return true;
        }
        return false;
    }

    private boolean b(String str, uyz uyz) {
        return str != null && !c(str, uyz) && !this.c;
    }

    private boolean c(String str, uyz uyz) {
        return this.d.a(uyz, str);
    }

    public final wud<String> b(String str) {
        return wuh.a(this.g.a(null, str).c(new $$Lambda$teb$1d3qBaJKrpigK5D1fAbz4A1mG0(str))).a((wun<? super Throwable>) $$Lambda$teb$bEginH8KqdAFbCh0gsytDkb50E.INSTANCE).h(new $$Lambda$teb$AfccYvp80_2myo6kCStyQJd94mg(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(String str, Map map) {
        uys uys = (uys) map.get(str);
        return (uys == null || uys.t() == null) ? str : uys.t().getUri();
    }

    public static boolean c(String str) {
        return jst.a(str).b == LinkType.COLLECTION_PODCASTS_EPISODES || jst.a(str).b == LinkType.COLLECTION_PODCASTS_DOWNLOADS;
    }

    private wud<tee> a(String str, String str2) {
        return ScalarSynchronousObservable.d(new a().a(str2).a(a(str, (uyz) null)).a(c(str, null)).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tee d(String str, uyz uyz) {
        a aVar = new a();
        StringBuilder sb = new StringBuilder(50);
        uzd w = uyz.w();
        uzd d2 = uyz.d();
        if (w != null && !TextUtils.isEmpty(w.b())) {
            sb.append(this.b.getString(R.string.driving_made_for_you));
        } else if (d2 != null && !TextUtils.isEmpty(d2.c())) {
            sb.append(this.b.getString(R.string.driving_playlist_owner_subtitle, new Object[]{d2.c()}));
        }
        return aVar.a(sb.toString()).a(a(str, uyz)).a(c(str, uyz)).a();
    }
}
