package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: oec reason: default package */
public final class oec {
    private static final Policy a;
    private static final ListPolicy b;
    private static final Policy c;
    private final oeg d;
    private final jug e;
    private final hec f;
    private final uxc g;
    private final odh h;
    private final hbg i;
    private final odw j;
    private final oee k;
    private Observable<ody> l;

    static {
        String str = "name";
        String str2 = "covers";
        ImmutableMap b2 = ImmutableMap.g().b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b();
        ImmutableMap b3 = ImmutableMap.g().b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b();
        String str3 = "link";
        String str4 = "previewId";
        String str5 = "inCollection";
        String str6 = "isBanned";
        String str7 = "isExplicit";
        String str8 = "playable";
        String str9 = "available";
        String str10 = "isPremiumOnly";
        String str11 = "freezeFrames";
        String str12 = "mediaTypeEnum";
        String str13 = "formatListAttributes";
        String str14 = "description";
        String str15 = "publishDate";
        String str16 = "offline";
        String str17 = "length";
        ImmutableMap b4 = ImmutableMap.g().b(str3, Boolean.TRUE).b(str, Boolean.TRUE).b("rowId", Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b(str9, Boolean.TRUE).b(str10, Boolean.TRUE).b(str2, Boolean.TRUE).b(str11, Boolean.TRUE).b(str12, Boolean.TRUE).b(str13, Boolean.TRUE).b(str14, Boolean.TRUE).b(str15, Boolean.TRUE).b(str16, Boolean.TRUE).b(str17, Boolean.TRUE).b();
        b = ListPolicy.builder().a(b4).b(b2).c(ImmutableMap.b(str, Boolean.TRUE)).e(ImmutableMap.g().b(str, Boolean.TRUE).b("username", Boolean.TRUE).b()).d(b3).a();
        a = Policy.builder().a(DecorationPolicy.builder().a(HeaderPolicy.builder().a(ImmutableMap.b(str3, Boolean.TRUE)).a()).a(b).a()).a();
        String str18 = "collaborative";
        String str19 = "ownedBySelf";
        String str20 = "picture";
        c = Policy.builder().a(DecorationPolicy.builder().a(HeaderPolicy.builder().a(ImmutableMap.g().b(str, Boolean.TRUE).b("isWritable", Boolean.TRUE).b(str18, Boolean.TRUE).b(str19, Boolean.TRUE).b(str20, Boolean.TRUE).b()).b(ImmutableMap.f()).c(ImmutableMap.f()).a()).a(b).a()).a();
    }

    public oec(oeg oeg, jug jug, hec hec, uxc uxc, odh odh, hbg hbg, odw odw, oee oee) {
        this.d = oeg;
        this.e = jug;
        this.f = hec;
        this.g = uxc;
        this.h = odh;
        this.i = hbg;
        this.j = odw;
        this.k = oee;
    }

    public final Observable<ody> a() {
        if (this.l == null) {
            Observable a2 = this.e.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a());
            String m = this.d.m();
            this.l = Observable.a((ObservableSource<? extends T1>) this.g.b(m, a.t().i(uyd.a(0, 0)).b(true).a(Optional.b(c)).a()), (ObservableSource<? extends T2>) this.f.a().j().h(new $$Lambda$oec$kVwst9YYilbM337y4Y3uj2EiYJw(this, a2, m)), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$oec$psQh09X4gHVlJivkOeP7ixXPSEA<Object,Object,Object>(this)).a(1).a();
        }
        return this.l;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable, String str, fpt fpt) {
        return observable.h(new $$Lambda$oec$1s3FD9YO_H5hdzpMqBGaBKXFkUs(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Boolean bool) {
        Optional optional;
        Optional optional2;
        AllSongsConfiguration n = this.d.n();
        Optional e2 = n.e();
        C0081a h2 = a.t().f(Optional.b(Boolean.FALSE)).a(n.a()).h(Optional.b(Boolean.valueOf(this.j.a.a.a())));
        if (n.c().b()) {
            optional = Optional.b(Boolean.valueOf(!((Boolean) n.c().c()).booleanValue()));
        } else {
            optional = Optional.b(bool);
        }
        C0081a g2 = h2.g(optional);
        if (e2.b()) {
            optional2 = uyd.a(0, ((Integer) e2.c()).intValue());
        } else {
            optional2 = Optional.e();
        }
        return this.i.a(str).a(g2.i(optional2).a(Optional.b(a)).a(), this.h.a.a(Functions.a()));
    }

    public final Observable<Boolean> b() {
        return a().c((Function<? super T, ? extends R>) $$Lambda$oec$zFLubysy9RTHeE0KyLhVzQypO48.INSTANCE).a(Functions.a()).b(1).c((Function<? super T, ? extends R>) $$Lambda$oec$dncQCM626wulSNEJ2tejcdHaR8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long a(ody ody) {
        ArrayList arrayList = new ArrayList(ody.b());
        arrayList.addAll(ody.c());
        return Long.valueOf(a((List<uzb>) arrayList));
    }

    private static long a(List<uzb> list) {
        long j2 = 17;
        for (uzb uzb : list) {
            j2 ^= (long) uzb.getUri().hashCode();
            uzc b2 = uzb.b();
            if (b2 != null) {
                j2 ^= (long) Arrays.hashCode(new Object[]{Boolean.valueOf(b2.inCollection()), Boolean.valueOf(b2.isBanned())});
            }
        }
        return j2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ody a(uza uza, List list) {
        a a2 = new a().a(uza.a());
        oee oee = this.k;
        List<uzc> k2 = uza.k();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(k2.size());
        for (uzc uzc : k2) {
            String uri = uzc.getUri();
            if (!hashSet.contains(uri)) {
                hashSet.add(uri);
                arrayList.add(new uzb(uzc) {
                    private /* synthetic */ uzc a;

                    public final uys a() {
                        return null;
                    }

                    public final String d() {
                        return null;
                    }

                    public final String getHeader() {
                        return null;
                    }

                    public final boolean isHeader() {
                        return false;
                    }

                    {
                        this.a = r2;
                    }

                    public final uzc b() {
                        return this.a;
                    }

                    public final ImmutableMap<String, String> c() {
                        return ImmutableMap.f();
                    }

                    public final String getUri() {
                        return this.a.getUri();
                    }

                    public final String getTitle() {
                        return this.a.getTitle();
                    }

                    public final String getTargetUri() {
                        return this.a.getTargetUri();
                    }

                    public final String getImageUri() {
                        return this.a.getImageUri();
                    }

                    public final String getImageUri(Size size) {
                        return this.a.getImageUri(size);
                    }
                });
            }
        }
        return a2.b(arrayList).a(list).a();
    }
}
