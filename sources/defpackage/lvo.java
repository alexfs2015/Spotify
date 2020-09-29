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

/* renamed from: lvo reason: default package */
public final class lvo implements lvf {
    final Context a;
    final RecentlyPlayedTracksLoader b;
    private final lvh<lve> c;
    private final a<lve> d = new a<lve>() {
        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lve) obj).c());
        }

        public final Observable<Map<String, lve>> a(Set<String> set, String str) {
            return wit.b(lvo.this.b.a(100)).c((Function<? super T, ? extends R>) new $$Lambda$lvo$1$scaXoXP_ATirbDdC2YsB4jWulBo<Object,Object>(set));
        }

        public final Observable<Map<String, lve>> a(luu luu, Set<String> set) {
            return Observable.c();
        }

        public final /* bridge */ /* synthetic */ Observable a(luu luu, Set set, Object obj) {
            return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$lvo$1$YFIrRuffYnEXOio13iNLcNTDmSg<Object>((lve) obj, luu));
        }

        public final /* synthetic */ lux a(Object obj, boolean z) {
            lve lve = (lve) obj;
            final boolean b = lve.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lve.a());
            return new lux() {
                public final String a() {
                    return lvo.this.a.getString(R.string.assisted_curation_card_title_recently_played);
                }

                public final String b() {
                    return "recently_played";
                }

                public final String c() {
                    return "recently_played";
                }

                public final List<luu> d() {
                    return a2;
                }

                public final boolean e() {
                    return b;
                }
            };
        }
    };

    public lvo(Context context, RecentlyPlayedTracksLoader recentlyPlayedTracksLoader, lvi lvi) {
        this.a = context;
        this.b = recentlyPlayedTracksLoader;
        this.c = lvi.a(this.d);
    }

    public final String a() {
        return "recently_played";
    }

    public final xii<List<lux>> a(Set<String> set, String str) {
        return wit.a((ObservableSource<T>) this.c.a(set, str), BackpressureStrategy.BUFFER);
    }

    public final void a(String str, Set<String> set) {
        this.c.a(str, set);
    }

    public final void a(String str, luu luu, Set<String> set) {
        this.c.a(str, luu, set);
    }

    public final void a(Set<String> set) {
        this.c.a(set);
    }

    public final void a(byte[] bArr) {
    }

    public final byte[] b() {
        return new byte[0];
    }
}
