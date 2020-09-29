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

/* renamed from: lvv reason: default package */
public final class lvv implements lvf {
    final Context a;
    final GenresLoader b;
    private final lvh<lvl> c;
    private final a<lvl> d = new a<lvl>() {
        /* access modifiers changed from: private */
        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<lur>, for r5v0, types: [java.util.List, java.util.List<lur>] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ java.util.Map a(java.util.Set r4, java.util.List<defpackage.lur> r5) {
            /*
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0009:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x0030
                java.lang.Object r1 = r5.next()
                lur r1 = (defpackage.lur) r1
                java.util.List r2 = r1.b()
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x0009
                java.lang.String r2 = defpackage.lvv.a(r1)
                lvl r3 = new lvl
                r3.<init>(r1)
                lvg r1 = r3.a(r4)
                r0.put(r2, r1)
                goto L_0x0009
            L_0x0030:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lvv.AnonymousClass1.a(java.util.Set, java.util.List):java.util.Map");
        }

        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lvl) obj).c());
        }

        public final Observable<Map<String, lvl>> a(Set<String> set, String str) {
            return wit.b(lvv.this.b.a(2, 100, str)).c((Function<? super T, ? extends R>) new $$Lambda$lvv$1$C0r0AN_g2vaJuVB3vI314I_54WE<Object,Object>(set));
        }

        public final Observable<Map<String, lvl>> a(luu luu, Set<String> set) {
            return Observable.c();
        }

        public final /* bridge */ /* synthetic */ Observable a(luu luu, Set set, Object obj) {
            return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$lvv$1$J5dk_2oDPcnxEkTonbaq0MCMf78<Object>((lvl) obj, luu));
        }

        public final /* synthetic */ lux a(Object obj, boolean z) {
            lvl lvl = (lvl) obj;
            final lur lur = lvl.c;
            final boolean b = lvl.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lvl.a());
            return new lux() {
                public final String a() {
                    String b2 = jun.b(lur.a(), Locale.getDefault());
                    return lvv.this.a.getString(R.string.assisted_curation_card_title_genre, new Object[]{b2});
                }

                public final String b() {
                    return lvv.a(lur);
                }

                public final String c() {
                    return "top_genres";
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

    public lvv(Context context, GenresLoader genresLoader, lvi lvi) {
        this.a = context;
        this.b = genresLoader;
        this.c = lvi.a(this.d);
    }

    static /* synthetic */ String a(lur lur) {
        StringBuilder sb = new StringBuilder("top_genres/");
        sb.append(lur.a());
        return sb.toString();
    }

    public final String a() {
        return "top_genres";
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
