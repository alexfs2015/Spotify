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

/* renamed from: tol reason: default package */
public final class tol {
    final tmo a;
    final Resources b;
    private final boolean c;
    private final toh d;
    private final vje e;
    private final a f;
    private final sgj g;
    private final boolean h;

    public tol(tmo tmo, Resources resources, boolean z, toh toh, vje vje, HeaderPolicy headerPolicy, sgk sgk, boolean z2) {
        this.a = tmo;
        this.b = resources;
        this.c = z;
        this.d = toh;
        this.e = vje;
        this.g = sgk.a();
        this.h = z2;
        this.f = a.t().i(vkg.a(0, 0)).a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(headerPolicy).a(ListPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).d(ImmutableMap.f()).a()).a()).a())).a();
    }

    private PivotSubtitleIcon a(String str, vlc vlc) {
        return a(vlc) ? PivotSubtitleIcon.DOWNLOADED : b(str, vlc) ? PivotSubtitleIcon.SHUFFLE : PivotSubtitleIcon.NONE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(String str, Throwable th) {
        return str;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(String str, Map map) {
        vkv vkv = (vkv) map.get(str);
        return (vkv == null || vkv.t() == null) ? str : vkv.t().getUri();
    }

    private xii<too> a(String str, String str2) {
        return ScalarSynchronousObservable.d(new a().a(str2).a(a(str, (vlc) null)).a(c(str, null)).a());
    }

    private boolean a(vlc vlc) {
        return this.c && vlc != null && (vlc.s() instanceof a);
    }

    private boolean b(String str, vlc vlc) {
        return str != null && !c(str, vlc) && !this.c;
    }

    public static boolean c(String str) {
        return jva.a(str).b == LinkType.COLLECTION_PODCASTS_EPISODES || jva.a(str).b == LinkType.COLLECTION_PODCASTS_DOWNLOADS;
    }

    private boolean c(String str, vlc vlc) {
        return this.d.a(vlc, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ too d(String str, vlc vlc) {
        a aVar = new a();
        StringBuilder sb = new StringBuilder(50);
        vlg w = vlc.w();
        vlg d2 = vlc.d();
        if (w != null && !TextUtils.isEmpty(w.b())) {
            sb.append(this.b.getString(R.string.driving_made_for_you));
        } else if (d2 != null && !TextUtils.isEmpty(d2.c())) {
            sb.append(this.b.getString(R.string.driving_playlist_owner_subtitle, new Object[]{d2.c()}));
        }
        return aVar.a(sb.toString()).a(a(str, vlc)).a(c(str, vlc)).a();
    }

    public final xii<too> a(String str) {
        String str2;
        if (!this.h) {
            return ScalarSynchronousObservable.d(new a().a("").a(PivotSubtitleIcon.NONE).a(false).a());
        }
        LinkType linkType = jva.a(str).b;
        if (jvb.a(jva.a(str))) {
            return a(str, AnonymousClass1.a[linkType.ordinal()] != 1 ? this.b.getString(R.string.radio_title) : this.b.getString(R.string.driving_made_for_you));
        } else if (linkType == LinkType.PLAYLIST_V2 || linkType == LinkType.PROFILE_PLAYLIST) {
            return wit.a((ObservableSource<T>) this.e.b(str, this.f), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) $$Lambda$qg9LC7tjjGOhvxFio0b7PfD2bTM.INSTANCE).e((xiy<? super T, ? extends R>) new $$Lambda$tol$_m64Yqdz_wjopDCfIW8haxSXzCA<Object,Object>(this, str));
        } else {
            if (!jvb.a(linkType)) {
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

    public final xii<String> b(String str) {
        return xim.a(this.g.a(null, str).c(new $$Lambda$tol$1v94KX0aB2aSuhVpg8yhJQUf66E(str))).a((xis<? super Throwable>) $$Lambda$tol$7NYcICMVHCsWhLBW6mXHYXJbVc4.INSTANCE).g(new $$Lambda$tol$Kziavafg29PoVf80D9LWLSDC7Ao(str));
    }
}
