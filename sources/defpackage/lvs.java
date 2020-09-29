package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import com.spotify.music.features.assistedcuration.loader.RecsLoader;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: lvs reason: default package */
public final class lvs implements lvf {
    final Context a;
    final RecsLoader b;
    private final lvh<lve> c;
    private final a<lve> d = new a<lve>() {
        /* access modifiers changed from: private */
        public static /* synthetic */ lve a(lve lve, luu luu, List list) {
            return (lve) lve.a(luu, list);
        }

        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lve) obj).c());
        }

        public final Observable<Map<String, lve>> a(Set<String> set, String str) {
            return wit.b(lvs.this.b.a(set, str, set, 100)).f((ObservableSource<? extends T>) Observable.b(Lists.a())).c((Function<? super T, ? extends R>) new $$Lambda$lvs$1$gjuKq0E1XOQRqXQTHGnCzE5cRAY<Object,Object>(set));
        }

        public final Observable<Map<String, lve>> a(luu luu, Set<String> set) {
            return Observable.c();
        }

        public final /* synthetic */ Observable a(luu luu, Set set, Object obj) {
            lve lve = (lve) obj;
            return wit.b(lvs.this.b.a(luu.a(), set, lve.a, 3)).c((Function<? super T, ? extends R>) new $$Lambda$lvs$1$P8nDxhUXn3KRS0Hw210ZVCKb0Lw<Object,Object>(lve, luu));
        }

        public final /* synthetic */ lux a(Object obj, final boolean z) {
            lve lve = (lve) obj;
            final boolean b = lve.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lve.a());
            return new lux() {
                public final String a() {
                    return lvs.this.a.getString(R.string.assisted_curation_card_title_suggested_songs);
                }

                public final String b() {
                    return "suggested_songs";
                }

                public final String c() {
                    return "suggested_songs";
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

    public lvs(Context context, RecsLoader recsLoader, lvi lvi) {
        this.a = context;
        this.b = recsLoader;
        this.c = lvi.a(this.d);
    }

    public final String a() {
        return "suggested_songs";
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
        this.c.a(bArr);
    }

    public final byte[] b() {
        return this.c.a();
    }
}
