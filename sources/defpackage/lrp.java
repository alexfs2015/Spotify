package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: lrp reason: default package */
public final class lrp implements lrg {
    final Context a;
    final RecentlyPlayedTracksLoader b;
    private final lri<lrf> c;
    private final a<lrf> d = new a<lrf>() {
        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lrf) obj).c());
        }

        public final /* bridge */ /* synthetic */ Observable a(lqv lqv, Set set, Object obj) {
            return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$lrp$1$1JI5ABikayYMuRk42k6sagfAb7s<Object>((lrf) obj, lqv));
        }

        public final /* synthetic */ lqy a(Object obj, boolean z) {
            lrf lrf = (lrf) obj;
            final boolean b = lrf.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lrf.a());
            return new lqy() {
                public final String b() {
                    return "recently_played";
                }

                public final String c() {
                    return "recently_played";
                }

                public final String a() {
                    return lrp.this.a.getString(R.string.assisted_curation_card_title_recently_played);
                }

                public final List<lqv> d() {
                    return a2;
                }

                public final boolean e() {
                    return b;
                }
            };
        }

        public final Observable<Map<String, lrf>> a(Set<String> set, String str) {
            return vun.b(lrp.this.b.a(100)).c((Function<? super T, ? extends R>) new $$Lambda$lrp$1$WhxOS_s52TLUJ46igLjf27aRXSY<Object,Object>(set));
        }

        public final Observable<Map<String, lrf>> a(lqv lqv, Set<String> set) {
            return Observable.c();
        }
    };

    public final String a() {
        return "recently_played";
    }

    public final void a(byte[] bArr) {
    }

    public final byte[] b() {
        return new byte[0];
    }

    public lrp(Context context, RecentlyPlayedTracksLoader recentlyPlayedTracksLoader, lrj lrj) {
        this.a = context;
        this.b = recentlyPlayedTracksLoader;
        this.c = lrj.a(this.d);
    }

    public final wud<List<lqy>> a(Set<String> set, String str) {
        return vun.a((ObservableSource<T>) this.c.a(set, str), BackpressureStrategy.BUFFER);
    }

    public final void a(String str, lqv lqv, Set<String> set) {
        this.c.a(str, lqv, set);
    }

    public final void a(String str, Set<String> set) {
        this.c.a(str, set);
    }

    public final void a(Set<String> set) {
        this.c.a(set);
    }
}
