package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.features.assistedcuration.loader.GenresLoader;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: lrw reason: default package */
public final class lrw implements lrg {
    final Context a;
    final GenresLoader b;
    private final lri<lrm> c;
    private final a<lrm> d = new a<lrm>() {
        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lrm) obj).c());
        }

        public final /* bridge */ /* synthetic */ Observable a(lqv lqv, Set set, Object obj) {
            return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$lrw$1$UthBWVR6NVaq598GZgyOTRb0Tgk<Object>((lrm) obj, lqv));
        }

        public final /* synthetic */ lqy a(Object obj, boolean z) {
            lrm lrm = (lrm) obj;
            final lqs lqs = lrm.c;
            final boolean b = lrm.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lrm.a());
            return new lqy() {
                public final String c() {
                    return "top_genres";
                }

                public final String a() {
                    String b2 = jsd.b(lqs.a(), Locale.getDefault());
                    return lrw.this.a.getString(R.string.assisted_curation_card_title_genre, new Object[]{b2});
                }

                public final String b() {
                    return lrw.a(lqs);
                }

                public final List<lqv> d() {
                    return a2;
                }

                public final boolean e() {
                    return b;
                }
            };
        }

        public final Observable<Map<String, lrm>> a(Set<String> set, String str) {
            return vun.b(lrw.this.b.a(2, 100, str)).c((Function<? super T, ? extends R>) new $$Lambda$lrw$1$I6v_V6lZBsarS5XS9GvistfHZ8<Object,Object>(set));
        }

        public final Observable<Map<String, lrm>> a(lqv lqv, Set<String> set) {
            return Observable.c();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<lqs>, for r5v0, types: [java.util.List, java.util.List<lqs>] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ java.util.Map a(java.util.Set r4, java.util.List<defpackage.lqs> r5) {
            /*
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0009:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x0030
                java.lang.Object r1 = r5.next()
                lqs r1 = (defpackage.lqs) r1
                java.util.List r2 = r1.b()
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x0009
                java.lang.String r2 = defpackage.lrw.a(r1)
                lrm r3 = new lrm
                r3.<init>(r1)
                lrh r1 = r3.a(r4)
                r0.put(r2, r1)
                goto L_0x0009
            L_0x0030:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lrw.AnonymousClass1.a(java.util.Set, java.util.List):java.util.Map");
        }
    };

    public final String a() {
        return "top_genres";
    }

    public lrw(Context context, GenresLoader genresLoader, lrj lrj) {
        this.a = context;
        this.b = genresLoader;
        this.c = lrj.a(this.d);
    }

    public final wud<List<lqy>> a(Set<String> set, String str) {
        return vun.a((ObservableSource<T>) this.c.a(set, str), BackpressureStrategy.BUFFER);
    }

    public final void a(String str, lqv lqv, Set<String> set) {
        this.c.a(str, lqv, set);
    }

    public final void a(Set<String> set) {
        this.c.a(set);
    }

    public final void a(String str, Set<String> set) {
        this.c.a(str, set);
    }

    public final byte[] b() {
        return this.c.a();
    }

    public final void a(byte[] bArr) {
        this.c.a(bArr);
    }

    static /* synthetic */ String a(lqs lqs) {
        StringBuilder sb = new StringBuilder("top_genres/");
        sb.append(lqs.a());
        return sb.toString();
    }
}
