package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.ScannableImageLoadState;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.a;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: uob reason: default package */
public final class uob {
    private static Optional<Participant> a(uns uns) {
        return fdd.f(uns.k(), $$Lambda$uob$Lqsc05FcNktF2xYk7plHOh6P4Zk.INSTANCE);
    }

    private static SocialListeningDeviceModel a(SocialListeningDeviceModel socialListeningDeviceModel) {
        if (socialListeningDeviceModel.a()) {
            return socialListeningDeviceModel;
        }
        uns uns = (uns) socialListeningDeviceModel.b().a(uns.a);
        boolean z = false;
        boolean z2 = uns.i() || socialListeningDeviceModel.d() == ScannableImageLoadState.FAILED_TO_LOAD;
        boolean z3 = uns.k().size() >= 2;
        boolean booleanValue = ((Boolean) socialListeningDeviceModel.c().a(Boolean.FALSE)).booleanValue();
        boolean z4 = booleanValue && !z2 && (uns.d() || uns.e() || socialListeningDeviceModel.d() != ScannableImageLoadState.LOADED);
        a f = socialListeningDeviceModel.f();
        b.a g = socialListeningDeviceModel.e().l().a(booleanValue).a(uns.k()).b(z3).c(z4).d(booleanValue && !z2 && !z4 && socialListeningDeviceModel.d() == ScannableImageLoadState.LOADED).e(booleanValue && !z4 && (z2 || !z3)).f(booleanValue && !z2 && !z4 && z3 && !uns.c()).g(booleanValue && !z2 && !z4 && z3 && uns.c());
        if (booleanValue && z2) {
            z = true;
        }
        return f.a(g.h(z).a()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, a aVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        if (aVar.a) {
            return kng.a(socialListeningDeviceModel.f().a(true).a(), kmt.a(unz.a(true, true)));
        }
        return kng.a(kmt.a(new g()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, b bVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        return kng.a(kmt.a(new d()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, c cVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        return kng.a(kmt.a(new h(), new c()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, d dVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        return kng.a(socialListeningDeviceModel.f().a(true).a(), kmt.a(unz.a(true, true)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, e eVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        SocialListeningDeviceModel a = socialListeningDeviceModel.f().b(Optional.b(Boolean.valueOf(eVar.a))).a();
        ImmutableSet.a j = ImmutableSet.j();
        if (eVar.a) {
            j.b(new c());
            if (a.b().b()) {
                a((uns) a.b().c(), j);
            }
        }
        return kng.a(a(a), j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, f fVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        return kng.a(kmt.a(new c()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, g gVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        return kng.a(kmt.a(new e()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, h hVar) {
        String str;
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        b.a a = socialListeningDeviceModel.e().l().a(Optional.b(Integer.valueOf(hVar.a)));
        uns uns = (uns) socialListeningDeviceModel.b().a(uns.a);
        int i = hVar.a;
        if (uns.j().isEmpty()) {
            str = null;
        } else {
            String a2 = gck.a(uns.j(), fbi.c);
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(16777215 & i);
            objArr[1] = uoo.a(i) ? "black" : "white";
            sb.append(String.format("https://scannables.scdn.co/uri/plain/png/%06X/%s/600/", objArr));
            sb.append(a2);
            str = sb.toString();
        }
        return kng.b(a(socialListeningDeviceModel.f().a(a.b(Optional.c(str)).a()).a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, i iVar) {
        return socialListeningDeviceModel.a() ? kng.e() : socialListeningDeviceModel.d() == ScannableImageLoadState.FAILED_TO_LOAD ? kng.e() : kng.b(a(socialListeningDeviceModel.a(ScannableImageLoadState.FAILED_TO_LOAD)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, j jVar) {
        return socialListeningDeviceModel.a() ? kng.e() : socialListeningDeviceModel.d() == ScannableImageLoadState.LOADED ? kng.e() : kng.b(a(socialListeningDeviceModel.a(ScannableImageLoadState.LOADED)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, k kVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        return kng.a(kmt.a(new c()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, l lVar) {
        if (socialListeningDeviceModel.a() || !socialListeningDeviceModel.b().b() || !((uns) socialListeningDeviceModel.b().c()).b()) {
            return kng.e();
        }
        return kng.a(kmt.a(new f(((uns) socialListeningDeviceModel.b().c()).j())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, m mVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        Optional b = socialListeningDeviceModel.b();
        uns uns = mVar.a;
        SocialListeningDeviceModel a = socialListeningDeviceModel.a(uns);
        ImmutableSet.a j = ImmutableSet.j();
        if (!b.b() || !fbn.a(a((uns) b.c()), a(uns))) {
            a = a.f().a(a.e().l().a(Optional.e()).b(Optional.e()).a()).a(ScannableImageLoadState.NOT_LOADED).a();
            if (((Boolean) a.c().a(Boolean.FALSE)).booleanValue()) {
                a(uns, j);
            }
        }
        return kng.a(a(a.a(uns)), j.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(SocialListeningDeviceModel socialListeningDeviceModel, n nVar) {
        if (socialListeningDeviceModel.a()) {
            return kng.e();
        }
        return kng.a(a(socialListeningDeviceModel.a(ScannableImageLoadState.NOT_LOADED)), kmt.a(new c()));
    }

    public static kng<SocialListeningDeviceModel, unz> a(SocialListeningDeviceModel socialListeningDeviceModel, uoa uoa) {
        SocialListeningDeviceModel socialListeningDeviceModel2 = socialListeningDeviceModel;
        return (kng) uoa.a(new $$Lambda$uob$fguHpAQCGule99vhb_k395T3S7A(socialListeningDeviceModel), new $$Lambda$uob$XoFyDYBICz4rvlfxdLb4GqFJliE(socialListeningDeviceModel), new $$Lambda$uob$ixSzMMrixRcv3NA2cxFR2ebvms(socialListeningDeviceModel), new $$Lambda$uob$XdD7N2JTOwQVJTQ3zQx0ChsBEJA(socialListeningDeviceModel), new $$Lambda$uob$qER52001fLXWtlfqhgTgUEXlvs(socialListeningDeviceModel), new $$Lambda$uob$K86399d2SuPXLGQIDMBN9vSpsU(socialListeningDeviceModel), new $$Lambda$uob$kC26lWIlH7nUQUUNsXu41NTeZDk(socialListeningDeviceModel), new $$Lambda$uob$3EaXuCEhUW0XFkY4vDHKc9lbnxo(socialListeningDeviceModel), new $$Lambda$uob$6mKk22dy80t4wogKRO1y8__wm0k(socialListeningDeviceModel), new $$Lambda$uob$SoupJ8gcH6lUoLwSyGsujlnaBI(socialListeningDeviceModel), new $$Lambda$uob$XTNLI9_o9nT2iVaiADr4125YjuQ(socialListeningDeviceModel), new $$Lambda$uob$3IeUUtHZhpuk9iQyOG8DKjGLL1I(socialListeningDeviceModel), new $$Lambda$uob$cCrIw6RWboTMTqnGxQIX4QDirQ(socialListeningDeviceModel), new $$Lambda$uob$aNeF06eWup3R5uRlVNt3BmEIoU4(socialListeningDeviceModel));
    }

    private static void a(uns uns, ImmutableSet.a<unz> aVar) {
        Optional a = a(uns);
        if (a.b()) {
            aVar.b(unz.a(Optional.c(((Participant) a.c()).imageUrl()), ((Participant) a.c()).displayName()));
        }
    }
}
