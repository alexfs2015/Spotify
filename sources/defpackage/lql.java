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

/* renamed from: lql reason: default package */
public final class lql {
    private static final a c;
    private final gpx a;
    private final jwe<uzc> b;

    /* renamed from: lql$a */
    public static abstract class a {

        /* renamed from: lql$a$a reason: collision with other inner class name */
        public interface C0051a {
            C0051a a(String str);

            C0051a a(List<lqv> list);

            a a();

            C0051a b(String str);
        }

        public abstract String a();

        public abstract String b();

        public abstract List<lqv> c();
    }

    /* renamed from: lql$b */
    public static abstract class b {

        /* renamed from: lql$b$a */
        public interface a {
            a a(String str);

            a a(List<String> list);

            b a();
        }

        public abstract String a();

        public abstract List<String> b();
    }

    public lql(gpx gpx, jwe<uzc> jwe) {
        this.a = gpx;
        this.b = jwe;
    }

    public final wud<a> a(String str, Set<String> set) {
        jst a2 = jst.a(str);
        if (a2.b == LinkType.TRACK) {
            return wuh.a(vun.a((SingleSource<T>) a(this.a.c(str).f($$Lambda$lql$XEkVxP1bMUTJg2dtuKLYL3Miz10.INSTANCE), set)));
        }
        if (a2.b == LinkType.ALBUM) {
            return wuh.a(vun.a((SingleSource<T>) a(Single.b(str), set)));
        }
        StringBuilder sb = new StringBuilder("Unsupported uri ");
        sb.append(str);
        return wud.a((Throwable) new IllegalArgumentException(sb.toString()));
    }

    private Single<a> a(Single<String> single, Set<String> set) {
        return single.a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lql$2lrOjTS_Ii4x3M4AT3uTdY5BP4<Object,Object>(this, set)).h($$Lambda$lql$DCzVML0fH2jqLhwhZmIMtnV5A_o.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Set set, String str) {
        return this.a.a(str).f(new $$Lambda$lql$c4iOBklN09L0tJfY8LHk9nvRuZg(set)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lql$uGcCUWbRDJSHV2kKpGAPEb6Z7R0<Object,Object>(this, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ b a(Set set, Album album) {
        ArrayList a2 = Lists.a();
        for (Disc disc : album.f) {
            for (Track track : disc.d) {
                String h = jst.c(jrl.a(track.d.d())).h();
                if (!set.contains(h)) {
                    a2.add(h);
                }
            }
        }
        return new a().a(album.e).a((List<String>) a2).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, b bVar) {
        List b2 = bVar.b();
        if (b2.isEmpty()) {
            return Single.b(c);
        }
        return this.b.a(str, (String[]) b2.toArray(new String[0])).c((Function<? super T, ? extends R>) new $$Lambda$lql$Pobxtcz1p5Ipy_Vxci66Eu4FVY<Object,Object>(b2, str, bVar)).a(0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r2v0, types: [java.util.List, java.util.List<java.lang.String>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.lql.a a(java.util.List<java.lang.String> r2, java.lang.String r3, defpackage.lql.b r4, java.util.Map r5) {
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
            lqn$a r2 = new lqn$a
            r2.<init>()
            lql$a$a r2 = r2.a(r3)
            java.lang.String r3 = r4.a()
            lql$a$a r2 = r2.b(r3)
            java.util.List r3 = defpackage.lqv.a(r0)
            lql$a$a r2 = r2.a(r3)
            lql$a r2 = r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lql.a(java.util.List, java.lang.String, lql$b, java.util.Map):lql$a");
    }

    static {
        String str = "";
        c = new a().a(str).b(str).a(Collections.emptyList()).a();
    }
}
