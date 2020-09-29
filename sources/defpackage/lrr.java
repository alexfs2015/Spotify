package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.features.assistedcuration.loader.RecsLoader;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: lrr reason: default package */
public final class lrr implements lrg {
    final Context a;
    final RecsLoader b;
    final lql c;
    final lqm d;
    final lri<lry> e;
    private final a<lry> f = new a<lry>() {
        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lry) obj).c());
        }

        public final /* synthetic */ Observable a(lqv lqv, Set set, Object obj) {
            lry lry = (lry) obj;
            int i = AnonymousClass2.a[jst.a(lry.c).b.ordinal()];
            if (i == 1 || i == 2) {
                return Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$lrr$1$n_869a15s4MgAbdyQFPMnPnUBUI<Object>(lry, lqv));
            }
            return vun.b(lrr.this.b.a(lqv.a(), set, lry.a, 3)).c((Function<? super T, ? extends R>) new $$Lambda$lrr$1$c7DPBatjTgEb9kYCDSpBxbMwS5M<Object,Object>(lry, lqv));
        }

        public final /* synthetic */ lqy a(Object obj, boolean z) {
            lry lry = (lry) obj;
            final String str = lry.c;
            final String str2 = lry.d;
            final boolean b = lry.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lry.a());
            AnonymousClass1 r0 = new lqy() {
                public final String c() {
                    return "similar_to";
                }

                public final String a() {
                    int i = AnonymousClass2.a[jst.a(str).b.ordinal()];
                    if (i == 1 || i == 2) {
                        return lrr.this.a.getString(R.string.assisted_curation_card_title_similar_to_artist_or_album, new Object[]{str2});
                    } else if (i != 3) {
                        return str2;
                    } else {
                        return lrr.this.a.getString(R.string.assisted_curation_card_title_similar_to, new Object[]{str2});
                    }
                }

                public final String b() {
                    return lrr.a(str);
                }

                public final List<lqv> d() {
                    return a2;
                }

                public final boolean e() {
                    return b;
                }
            };
            return r0;
        }

        public final Observable<Map<String, lry>> a(Set<String> set, String str) {
            return Observable.c();
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ lry a(lry lry, lqv lqv, List list) {
            return (lry) lry.a(lqv, list);
        }

        public final Observable<Map<String, lry>> a(lqv lqv, Set<String> set) {
            String a2 = lqv.a();
            return Observable.a((ObservableSource<? extends T1>) vun.b(lrr.this.b.a(a2, set, Collections.emptyList(), 50)), (ObservableSource<? extends T2>) vun.b(lrr.this.c.a(a2, set)), (ObservableSource<? extends T3>) vun.b(lrr.this.d.a(a2, set)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$lrr$1$mzwJFSAA_LP9jPhYEixRfNwEc60<Object,Object,Object,Object>(lqv));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ Map a(lqv lqv, List list, a aVar, a aVar2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(lrr.a(aVar2.a()), new lry(aVar2.a(), aVar2.b(), aVar2.c()));
            linkedHashMap.put(lrr.a(aVar.a()), new lry(aVar.a(), aVar.b(), aVar.c()));
            linkedHashMap.put(lrr.a(lqv.a()), new lry(lqv.a(), lqv.b(), list));
            return linkedHashMap;
        }
    };

    /* renamed from: lrr$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ALBUM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ARTIST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.TRACK     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lrr.AnonymousClass2.<clinit>():void");
        }
    }

    public final String a() {
        return "similar_to";
    }

    public lrr(Context context, RecsLoader recsLoader, lrj lrj, lql lql, lqm lqm) {
        this.a = context;
        this.b = recsLoader;
        this.e = lrj.a(this.f);
        this.c = lql;
        this.d = lqm;
    }

    public final wud<List<lqy>> a(Set<String> set, String str) {
        return vun.a((ObservableSource<T>) this.e.a(set, str), BackpressureStrategy.BUFFER);
    }

    public final void a(String str, lqv lqv, Set<String> set) {
        this.e.a(str, lqv, set);
    }

    public final void a(String str, Set<String> set) {
        this.e.a(str, set);
    }

    public final void a(Set<String> set) {
        this.e.a(set);
    }

    public final byte[] b() {
        return this.e.a();
    }

    public final void a(byte[] bArr) {
        this.e.a(bArr);
    }

    static /* synthetic */ String a(String str) {
        StringBuilder sb = new StringBuilder("similar_to/");
        sb.append(str);
        return sb.toString();
    }
}
