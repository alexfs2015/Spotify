package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.ScannableImageLoadState;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: ubg reason: default package */
public final class ubg {
    public static kjx<SocialListeningDeviceModel, ube> a(SocialListeningDeviceModel socialListeningDeviceModel, ubf ubf) {
        SocialListeningDeviceModel socialListeningDeviceModel2 = socialListeningDeviceModel;
        return (kjx) ubf.a(new $$Lambda$ubg$I4lvUP3DdnBYxtcPmPqE4yiVhoc(socialListeningDeviceModel), new $$Lambda$ubg$OR8UJdwScmZsneYqTcMFcdLfDFo(socialListeningDeviceModel), new $$Lambda$ubg$O0rIpThRJIxYbEROcJ8gsqoM0r0(socialListeningDeviceModel), new $$Lambda$ubg$_tWebItVq_dKZfhYP8SA7soqsg(socialListeningDeviceModel), new $$Lambda$ubg$hCZF1oXoe_vU4bS0PF7qh2bMQCg(socialListeningDeviceModel), new $$Lambda$ubg$MxYhiIgwqxfsN4jH3JPZDXyclOg(socialListeningDeviceModel), new $$Lambda$ubg$iJYM9swb9pk0YtZ0KJ1sllIQNZQ(socialListeningDeviceModel), new $$Lambda$ubg$X3K4Xz6h_8yShXJIcxuDgfXVpI(socialListeningDeviceModel), new $$Lambda$ubg$OiPoiXwB0KVIZcXUbsYXmOqXRaY(socialListeningDeviceModel), new $$Lambda$ubg$3Frxse14rJF93tCOh5pJMKF_i0(socialListeningDeviceModel), new $$Lambda$ubg$YIPeufFutkFM3ZS9H_3VZC2Ahyo(socialListeningDeviceModel), new $$Lambda$ubg$0fYz4c4N5XpaZvozdbdSFfoNMbs(socialListeningDeviceModel), new $$Lambda$ubg$ilhyTqbc_PbendKtRu8hadQKgw(socialListeningDeviceModel), new $$Lambda$ubg$6bUCXPgdi8dG_3X1iOpNhlRNdQ(socialListeningDeviceModel));
    }

    private static void a(uax uax, a<ube> aVar) {
        Optional a = a(uax);
        if (a.b()) {
            aVar.b(ube.a(Optional.c(((Participant) a.c()).imageUrl()), ((Participant) a.c()).displayName()));
        }
    }

    private static SocialListeningDeviceModel a(SocialListeningDeviceModel socialListeningDeviceModel) {
        if (socialListeningDeviceModel.a()) {
            return socialListeningDeviceModel;
        }
        uax uax = (uax) socialListeningDeviceModel.b().a(uax.a);
        boolean z = false;
        boolean z2 = uax.i() || socialListeningDeviceModel.d() == ScannableImageLoadState.FAILED_TO_LOAD;
        boolean z3 = uax.k().size() >= 2;
        boolean booleanValue = ((Boolean) socialListeningDeviceModel.c().a(Boolean.FALSE)).booleanValue();
        boolean z4 = booleanValue && !z2 && (uax.d() || uax.e() || socialListeningDeviceModel.d() != ScannableImageLoadState.LOADED);
        SocialListeningDeviceModel.a f = socialListeningDeviceModel.f();
        b.a g = socialListeningDeviceModel.e().l().a(booleanValue).a(uax.k()).b(z3).c(z4).d(booleanValue && !z2 && !z4 && socialListeningDeviceModel.d() == ScannableImageLoadState.LOADED).e(booleanValue && !z4 && (z2 || !z3)).f(booleanValue && !z2 && !z4 && z3 && !uax.c()).g(booleanValue && !z2 && !z4 && z3 && uax.c());
        if (booleanValue && z2) {
            z = true;
        }
        return f.a(g.h(z).a()).a();
    }

    private static Optional<Participant> a(uax uax) {
        return fcl.f(uax.k(), $$Lambda$ubg$wkt7tnR8kc_ka_UlbwU5d07O18.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, f fVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new c()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, c cVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new h(), new c()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, k kVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new c()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, i iVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        if (socialListeningDeviceModel.d() == ScannableImageLoadState.FAILED_TO_LOAD) {
            return kjx.e();
        }
        return kjx.b(a(socialListeningDeviceModel.a(ScannableImageLoadState.FAILED_TO_LOAD)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, j jVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        if (socialListeningDeviceModel.d() == ScannableImageLoadState.LOADED) {
            return kjx.e();
        }
        return kjx.b(a(socialListeningDeviceModel.a(ScannableImageLoadState.LOADED)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, l lVar) {
        if (socialListeningDeviceModel.a() || !socialListeningDeviceModel.b().b() || !((uax) socialListeningDeviceModel.b().c()).b()) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new f(((uax) socialListeningDeviceModel.b().c()).j())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, a aVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        if (aVar.a) {
            return kjx.a(socialListeningDeviceModel.f().a(true).a(), kjk.a(ube.a(true, true)));
        }
        return kjx.a(kjk.a(new g()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, d dVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        return kjx.a(socialListeningDeviceModel.f().a(true).a(), kjk.a(ube.a(true, true)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, n nVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        return kjx.a(a(socialListeningDeviceModel.a(ScannableImageLoadState.NOT_LOADED)), kjk.a(new c()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, g gVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new e()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, b bVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        return kjx.a(kjk.a(new d()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, e eVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        SocialListeningDeviceModel a = socialListeningDeviceModel.f().b(Optional.b(Boolean.valueOf(eVar.a))).a();
        a j = ImmutableSet.j();
        if (eVar.a) {
            j.b(new c());
            if (a.b().b()) {
                a((uax) a.b().c(), j);
            }
        }
        return kjx.a(a(a), j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, h hVar) {
        String str;
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        b.a a = socialListeningDeviceModel.e().l().a(Optional.b(Integer.valueOf(hVar.a)));
        uax uax = (uax) socialListeningDeviceModel.b().a(uax.a);
        int i = hVar.a;
        if (uax.j().isEmpty()) {
            str = null;
        } else {
            String a2 = gbm.a(uax.j(), far.c);
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(16777215 & i);
            objArr[1] = ubt.a(i) ? "black" : "white";
            sb.append(String.format("https://scannables.scdn.co/uri/plain/png/%06X/%s/600/", objArr));
            sb.append(a2);
            str = sb.toString();
        }
        return kjx.b(a(socialListeningDeviceModel.f().a(a.b(Optional.c(str)).a()).a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(SocialListeningDeviceModel socialListeningDeviceModel, m mVar) {
        if (socialListeningDeviceModel.a()) {
            return kjx.e();
        }
        Optional b = socialListeningDeviceModel.b();
        uax uax = mVar.a;
        SocialListeningDeviceModel a = socialListeningDeviceModel.a(uax);
        a j = ImmutableSet.j();
        if (!b.b() || !faw.a(a((uax) b.c()), a(uax))) {
            a = a.f().a(a.e().l().a(Optional.e()).b(Optional.e()).a()).a(ScannableImageLoadState.NOT_LOADED).a();
            if (((Boolean) a.c().a(Boolean.FALSE)).booleanValue()) {
                a(uax, j);
            }
        }
        return kjx.a(a(a.a(uax)), j.a());
    }
}
