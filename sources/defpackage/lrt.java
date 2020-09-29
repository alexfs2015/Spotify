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

/* renamed from: lrt reason: default package */
public final class lrt implements lrg {
    final Context a;
    final RecsLoader b;
    private final lri<lrf> c;
    private final a<lrf> d = new a<lrf>() {
        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lrf) obj).c());
        }

        public final /* synthetic */ Observable a(lqv lqv, Set set, Object obj) {
            lrf lrf = (lrf) obj;
            return vun.b(lrt.this.b.a(lqv.a(), set, lrf.a, 3)).c((Function<? super T, ? extends R>) new $$Lambda$lrt$1$SygonSdVSRFGuPueda7Kdq_XARo<Object,Object>(lrf, lqv));
        }

        public final /* synthetic */ lqy a(Object obj, final boolean z) {
            lrf lrf = (lrf) obj;
            final boolean b = lrf.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lrf.a());
            return new lqy() {
                public final String b() {
                    return "suggested_songs";
                }

                public final String c() {
                    return "suggested_songs";
                }

                public final String a() {
                    return lrt.this.a.getString(R.string.assisted_curation_card_title_suggested_songs);
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
            return vun.b(lrt.this.b.a(set, str, set, 100)).f((ObservableSource<? extends T>) Observable.b(Lists.a())).c((Function<? super T, ? extends R>) new $$Lambda$lrt$1$j1l4hx98j2yLC6vI5HdyHsxDWRM<Object,Object>(set));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ lrf a(lrf lrf, lqv lqv, List list) {
            return (lrf) lrf.a(lqv, list);
        }

        public final Observable<Map<String, lrf>> a(lqv lqv, Set<String> set) {
            return Observable.c();
        }
    };

    public final String a() {
        return "suggested_songs";
    }

    public lrt(Context context, RecsLoader recsLoader, lrj lrj) {
        this.a = context;
        this.b = recsLoader;
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

    public final byte[] b() {
        return this.c.a();
    }

    public final void a(byte[] bArr) {
        this.c.a(bArr);
    }
}
