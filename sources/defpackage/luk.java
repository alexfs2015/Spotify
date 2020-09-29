package defpackage;

import com.google.common.collect.Lists;
import com.spotify.metadata.proto.Metadata.Album;
import com.spotify.metadata.proto.Metadata.Disc;
import com.spotify.metadata.proto.Metadata.Track;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: luk reason: default package */
public final class luk {
    private static final a c;
    private final grw a;
    private final jym<vlf> b;

    /* renamed from: luk$a */
    public static abstract class a {

        /* renamed from: luk$a$a reason: collision with other inner class name */
        public interface C0052a {
            C0052a a(String str);

            C0052a a(List<luu> list);

            a a();

            C0052a b(String str);
        }

        public abstract String a();

        public abstract String b();

        public abstract List<luu> c();
    }

    /* renamed from: luk$b */
    public static abstract class b {

        /* renamed from: luk$b$a */
        public interface a {
            a a(String str);

            a a(List<String> list);

            b a();
        }

        public abstract String a();

        public abstract List<String> b();
    }

    static {
        String str = "";
        c = new a().a(str).b(str).a(Collections.emptyList()).a();
    }

    public luk(grw grw, jym<vlf> jym) {
        this.a = grw;
        this.b = jym;
    }

    private Single<a> a(Single<String> single, Set<String> set) {
        return single.a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$luk$XMh4hECkKepHFjnwkwJHvU0_4<Object,Object>(this, set)).h($$Lambda$luk$oC0mZm9NOumTsKAnrfnTf3sb5uk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, b bVar) {
        List b2 = bVar.b();
        return b2.isEmpty() ? Single.b(c) : this.b.a(str, (String[]) b2.toArray(new String[0])).c((Function<? super T, ? extends R>) new $$Lambda$luk$44CNGlhF0gGeF7vrxJt8A7XgZw<Object,Object>(b2, str, bVar)).a(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Set set, String str) {
        return this.a.a(str).f(new $$Lambda$luk$dE3os8hN2NtqL7YvumBkDVdy_A(set)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$luk$3jZSySo33DXjCY24FqCFO0S_EE<Object,Object>(this, str));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r2v0, types: [java.util.List, java.util.List<java.lang.String>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.luk.a a(java.util.List<java.lang.String> r2, java.lang.String r3, defpackage.luk.b r4, java.util.Map r5) {
        /*
            java.util.ArrayList r0 = com.google.common.collect.Lists.a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0008:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001c
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.get(r1)
            r0.add(r1)
            goto L_0x0008
        L_0x001c:
            lum$a r2 = new lum$a
            r2.<init>()
            luk$a$a r2 = r2.a(r3)
            java.lang.String r3 = r4.a()
            luk$a$a r2 = r2.b(r3)
            java.util.List r3 = defpackage.luu.a(r0)
            luk$a$a r2 = r2.a(r3)
            luk$a r2 = r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luk.a(java.util.List, java.lang.String, luk$b, java.util.Map):luk$a");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ b a(Set set, Album album) {
        ArrayList a2 = Lists.a();
        for (Disc disc : album.f) {
            for (Track track : disc.d) {
                String h = jva.c(jtv.a(track.d.d())).h();
                if (!set.contains(h)) {
                    a2.add(h);
                }
            }
        }
        return new a().a(album.e).a((List<String>) a2).a();
    }

    public final xii<a> a(String str, Set<String> set) {
        jva a2 = jva.a(str);
        if (a2.b == LinkType.TRACK) {
            return xim.a(wit.a((SingleSource<T>) a(this.a.c(str).f($$Lambda$luk$x5uicINbeZ1jpcrohUC2sR9Ul4U.INSTANCE), set)));
        }
        if (a2.b == LinkType.ALBUM) {
            return xim.a(wit.a((SingleSource<T>) a(Single.b(str), set)));
        }
        StringBuilder sb = new StringBuilder("Unsupported uri ");
        sb.append(str);
        return xii.a((Throwable) new IllegalArgumentException(sb.toString()));
    }
}
