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

/* renamed from: lvq reason: default package */
public final class lvq implements lvf {
    final Context a;
    final RecsLoader b;
    final luk c;
    final lul d;
    final lvh<lvx> e;
    private final a<lvx> f = new a<lvx>() {
        /* access modifiers changed from: private */
        public static /* synthetic */ Map a(luu luu, List list, a aVar, a aVar2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(lvq.a(aVar2.a()), new lvx(aVar2.a(), aVar2.b(), aVar2.c()));
            linkedHashMap.put(lvq.a(aVar.a()), new lvx(aVar.a(), aVar.b(), aVar.c()));
            linkedHashMap.put(lvq.a(luu.a()), new lvx(luu.a(), luu.b(), list));
            return linkedHashMap;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ lvx a(lvx lvx, luu luu, List list) {
            return (lvx) lvx.a(luu, list);
        }

        public final /* synthetic */ Observable a(Object obj) {
            return Observable.b(((lvx) obj).c());
        }

        public final Observable<Map<String, lvx>> a(Set<String> set, String str) {
            return Observable.c();
        }

        public final Observable<Map<String, lvx>> a(luu luu, Set<String> set) {
            String a2 = luu.a();
            return Observable.a((ObservableSource<? extends T1>) wit.b(lvq.this.b.a(a2, set, Collections.emptyList(), 50)), (ObservableSource<? extends T2>) wit.b(lvq.this.c.a(a2, set)), (ObservableSource<? extends T3>) wit.b(lvq.this.d.a(a2, set)), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$lvq$1$MFhCOa1w3RbN0efsXWkQVpK6LWQ<Object,Object,Object,Object>(luu));
        }

        public final /* synthetic */ Observable a(luu luu, Set set, Object obj) {
            lvx lvx = (lvx) obj;
            int i = AnonymousClass2.a[jva.a(lvx.c).b.ordinal()];
            return (i == 1 || i == 2) ? Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$lvq$1$GPYWgGMnw9kaPhg8lIbTkxEuF1o<Object>(lvx, luu)) : wit.b(lvq.this.b.a(luu.a(), set, lvx.a, 3)).c((Function<? super T, ? extends R>) new $$Lambda$lvq$1$rg5z17M0PNzzD4cBvJLzzrqIDoQ<Object,Object>(lvx, luu));
        }

        public final /* synthetic */ lux a(Object obj, boolean z) {
            lvx lvx = (lvx) obj;
            final String str = lvx.c;
            final String str2 = lvx.d;
            final boolean b = lvx.b();
            final ImmutableList a2 = ImmutableList.a((Collection<? extends E>) lvx.a());
            AnonymousClass1 r0 = new lux() {
                public final String a() {
                    int i = AnonymousClass2.a[jva.a(str).b.ordinal()];
                    if (i == 1 || i == 2) {
                        return lvq.this.a.getString(R.string.assisted_curation_card_title_similar_to_artist_or_album, new Object[]{str2});
                    } else if (i != 3) {
                        return str2;
                    } else {
                        return lvq.this.a.getString(R.string.assisted_curation_card_title_similar_to, new Object[]{str2});
                    }
                }

                public final String b() {
                    return lvq.a(str);
                }

                public final String c() {
                    return "similar_to";
                }

                public final List<luu> d() {
                    return a2;
                }

                public final boolean e() {
                    return b;
                }
            };
            return r0;
        }
    };

    /* renamed from: lvq$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lvq.AnonymousClass2.<clinit>():void");
        }
    }

    public lvq(Context context, RecsLoader recsLoader, lvi lvi, luk luk, lul lul) {
        this.a = context;
        this.b = recsLoader;
        this.e = lvi.a(this.f);
        this.c = luk;
        this.d = lul;
    }

    static /* synthetic */ String a(String str) {
        StringBuilder sb = new StringBuilder("similar_to/");
        sb.append(str);
        return sb.toString();
    }

    public final String a() {
        return "similar_to";
    }

    public final xii<List<lux>> a(Set<String> set, String str) {
        return wit.a((ObservableSource<T>) this.e.a(set, str), BackpressureStrategy.BUFFER);
    }

    public final void a(String str, Set<String> set) {
        this.e.a(str, set);
    }

    public final void a(String str, luu luu, Set<String> set) {
        this.e.a(str, luu, set);
    }

    public final void a(Set<String> set) {
        this.e.a(set);
    }

    public final void a(byte[] bArr) {
        this.e.a(bArr);
    }

    public final byte[] b() {
        return this.e.a();
    }
}
