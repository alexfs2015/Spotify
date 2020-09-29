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

/* renamed from: oli reason: default package */
public final class oli {
    private static final Policy a;
    private static final ListPolicy b;
    private static final Policy c;
    private final olm d;
    private final jwo e;
    private final hgy f;
    private final vje g;
    private final okn h;
    private final hdz i;
    private final olc j;
    private final olk k;
    private Observable<ole> l;

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

    public oli(olm olm, jwo jwo, hgy hgy, vje vje, okn okn, hdz hdz, olc olc, olk olk) {
        this.d = olm;
        this.e = jwo;
        this.f = hgy;
        this.g = vje;
        this.h = okn;
        this.i = hdz;
        this.j = olc;
        this.k = olk;
    }

    private static long a(List<vle> list) {
        long j2 = 17;
        for (vle vle : list) {
            j2 ^= (long) vle.getUri().hashCode();
            vlf b2 = vle.b();
            if (b2 != null) {
                j2 ^= (long) Arrays.hashCode(new Object[]{Boolean.valueOf(b2.inCollection()), Boolean.valueOf(b2.isBanned())});
            }
        }
        return j2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable, String str, fqn fqn) {
        return observable.h(new $$Lambda$oli$C2xP6EV4d4BZlfGAz6lrEpZAj5k(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Boolean bool) {
        AllSongsConfiguration n = this.d.n();
        Optional e2 = n.e();
        return this.i.a(str).a(a.t().f(Optional.b(Boolean.FALSE)).a(n.a()).h(Optional.b(Boolean.valueOf(this.j.a.a.a()))).g(n.c().b() ? Optional.b(Boolean.valueOf(!((Boolean) n.c().c()).booleanValue())) : Optional.b(bool)).i(e2.b() ? vkg.a(0, ((Integer) e2.c()).intValue()) : Optional.e()).a(Optional.b(a)).a(), this.h.a.a(Functions.a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long a(ole ole) {
        ArrayList arrayList = new ArrayList(ole.b());
        arrayList.addAll(ole.c());
        return Long.valueOf(a((List<vle>) arrayList));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ole a(vld vld, List list) {
        a a2 = new a().a(vld.a());
        olk olk = this.k;
        List<vlf> k2 = vld.k();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(k2.size());
        for (vlf vlf : k2) {
            String uri = vlf.getUri();
            if (!hashSet.contains(uri)) {
                hashSet.add(uri);
                arrayList.add(new vle(vlf) {
                    private /* synthetic */ vlf a;

                    {
                        this.a = r2;
                    }

                    public final vkv a() {
                        return null;
                    }

                    public final vlf b() {
                        return this.a;
                    }

                    public final ImmutableMap<String, String> c() {
                        return ImmutableMap.f();
                    }

                    public final String d() {
                        return null;
                    }

                    public final String getHeader() {
                        return null;
                    }

                    public final String getImageUri() {
                        return this.a.getImageUri();
                    }

                    public final String getImageUri(Size size) {
                        return this.a.getImageUri(size);
                    }

                    public final String getTargetUri() {
                        return this.a.getTargetUri();
                    }

                    public final String getTitle() {
                        return this.a.getTitle();
                    }

                    public final String getUri() {
                        return this.a.getUri();
                    }

                    public final boolean isHeader() {
                        return false;
                    }
                });
            }
        }
        return a2.b(arrayList).a(list).a();
    }

    public final Observable<ole> a() {
        if (this.l == null) {
            Observable a2 = this.e.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a());
            String m = this.d.m();
            this.l = Observable.a((ObservableSource<? extends T1>) this.g.b(m, a.t().i(vkg.a(0, 0)).b(true).a(Optional.b(c)).a()), (ObservableSource<? extends T2>) this.f.a().j().h(new $$Lambda$oli$DGuvdcfo1ZGjl82Cr_oMb_2xymo(this, a2, m)), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$oli$Dj9PqX3DvELoHpxds807bS6kz0Y<Object,Object,Object>(this)).a(1).a();
        }
        return this.l;
    }

    public final Observable<Boolean> b() {
        return a().c((Function<? super T, ? extends R>) $$Lambda$oli$xglY1W6kx707AuJ8aOBgy4bP6U4.INSTANCE).a(Functions.a()).b(1).c((Function<? super T, ? extends R>) $$Lambda$oli$8NYdNi18tDSk4fk2N0yiSPVr0xc.INSTANCE);
    }
}
