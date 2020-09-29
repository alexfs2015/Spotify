package defpackage;

import com.google.common.collect.Lists;
import com.spotify.metadata.proto.Metadata.Artist;
import com.spotify.metadata.proto.Metadata.TopTracks;
import com.spotify.metadata.proto.Metadata.Track;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: lul reason: default package */
public final class lul {
    private static final a c;
    private final grw a;
    private final jym<vlf> b;

    /* renamed from: lul$a */
    public static abstract class a {

        /* renamed from: lul$a$a reason: collision with other inner class name */
        public interface C0053a {
            C0053a a(String str);

            C0053a a(List<luu> list);

            a a();

            C0053a b(String str);
        }

        public abstract String a();

        public abstract String b();

        public abstract List<luu> c();
    }

    /* renamed from: lul$b */
    public static abstract class b {

        /* renamed from: lul$b$a */
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

    public lul(grw grw, jym<vlf> jym) {
        this.a = grw;
        this.b = jym;
    }

    private Single<a> a(Single<String> single, Set<String> set) {
        return single.a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lul$gISLttew0MCNceFRa0SBq0rTiA<Object,Object>(this, set)).h($$Lambda$lul$JoROkkLiBHAkbQ4Pzc25gkqzdRY.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, b bVar) {
        List b2 = bVar.b();
        return b2.isEmpty() ? Single.b(c) : this.b.a(str, (String[]) b2.toArray(new String[0])).c((Function<? super T, ? extends R>) new $$Lambda$lul$M9NqiQuANNkrE0Kzh8q4slxdwjU<Object,Object>(b2, str, bVar)).a(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Set set, String str) {
        return this.a.b(str).f(new $$Lambda$lul$ppeyfE0kLsTxeyjbLC_StxTkIo(set)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$lul$2Bi0VM9zoLzllUpVZrfRVQc9cP4<Object,Object>(this, str));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r2v0, types: [java.util.List, java.util.List<java.lang.String>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.lul.a a(java.util.List<java.lang.String> r2, java.lang.String r3, defpackage.lul.b r4, java.util.Map r5) {
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
            luo$a r2 = new luo$a
            r2.<init>()
            lul$a$a r2 = r2.a(r3)
            java.lang.String r3 = r4.a()
            lul$a$a r2 = r2.b(r3)
            java.util.List r3 = defpackage.luu.a(r0)
            lul$a$a r2 = r2.a(r3)
            lul$a r2 = r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lul.a(java.util.List, java.lang.String, lul$b, java.util.Map):lul$a");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ b a(Set set, Artist artist) {
        ArrayList a2 = Lists.a();
        for (TopTracks topTracks : artist.f) {
            for (Track track : topTracks.d) {
                String h = jva.c(jtv.a(track.d.d())).h();
                if (!set.contains(h)) {
                    a2.add(h);
                }
            }
        }
        return new a().a(artist.e).a((List<String>) a2).a();
    }

    public final xii<a> a(String str, Set<String> set) {
        jva a2 = jva.a(str);
        if (a2.b == LinkType.TRACK) {
            return xim.a(wit.a((SingleSource<T>) a(this.a.c(str).f($$Lambda$lul$3z7F9ohCG1NymwGL2uhnDE8MlE8.INSTANCE), set)));
        }
        if (a2.b == LinkType.ARTIST) {
            return xim.a(wit.a((SingleSource<T>) a(Single.b(str), set)));
        }
        StringBuilder sb = new StringBuilder("Unsupported uri ");
        sb.append(str);
        return xii.a((Throwable) new IllegalArgumentException(sb.toString()));
    }
}
