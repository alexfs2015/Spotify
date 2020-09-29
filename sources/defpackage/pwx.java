package defpackage;

import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import java.util.Map;

/* renamed from: pwx reason: default package */
public final class pwx {
    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pwy pwy, a aVar) {
        pwz b = pwy.b();
        if (b == null) {
            return kng.e();
        }
        String str = aVar.a;
        Map clickActions = b.a().getClickActions();
        if (clickActions == null || str.isEmpty()) {
            return kng.a(pwy.a((pwz) null), kmt.a(new f()));
        }
        QuicksilverClickAction quicksilverClickAction = (QuicksilverClickAction) clickActions.get(str);
        if (quicksilverClickAction == null) {
            return kng.a(pwy.a((pwz) null), kmt.a(new f()));
        } else if (!quicksilverClickAction.getShouldDismiss().booleanValue()) {
            return kng.a(kmt.a(pwv.a(quicksilverClickAction, (String) fbp.a(b.a().getUuid()))));
        } else {
            return kng.a(pwy.a((pwz) null), kmt.a(pwv.a(quicksilverClickAction, (String) fbp.a(b.a().getUuid())), new f()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pwy pwy, c cVar) {
        pwz b = pwy.b();
        if (b == null) {
            return kng.e();
        }
        return kng.a(pwy.a((pwz) null), kmt.a(pwv.a(b.b(), b.a(), "banner-inflation-error"), new f()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pwy pwy, d dVar) {
        if (!pwy.a() && pwy.b() == null) {
            return kng.b(pwy.a(pwz.a(dVar.b, dVar.a, dVar.c).a()));
        }
        return kng.a(kmt.a(pwv.a(dVar.a, dVar.b, "banner-already-showing")));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pwy pwy, e eVar) {
        pwz b = pwy.b();
        if (b == null || b.c()) {
            return kng.e();
        }
        pwz a = b.e().a(true).a();
        return kng.a(pwy.a(a), kmt.a(new b((String) fbp.a(a.a().getImpressionUrl()), (String) fbp.a(a.a().getUuid())), new d((String) fbp.a(a.a().getId()), a.b(), a.d())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pwy pwy, h hVar) {
        pwz b = pwy.b();
        if (b == null) {
            return kng.e();
        }
        BannerMessage a = b.a();
        e eVar = new e(a.getId(), a.getUuid(), hVar.a, hVar.b, hVar.c);
        return kng.a(kmt.a(eVar));
    }

    public static kng<pwy, pwv> a(pwy pwy, pww pww) {
        return (kng) pww.a(new $$Lambda$pwx$EmOHzadsWkxyYrowowjKQFQAHlQ(pwy), new $$Lambda$pwx$N4k4DrAjoNPhwdahVdvpgoGywOw(pwy), new $$Lambda$pwx$976AeH0wk8yskXASgtmLTFdvEws(pwy), new $$Lambda$pwx$duC4NygBhhiRlr67XnUXxcraRdk(pwy), new $$Lambda$pwx$hg6awu_8jh5AXklcjpjfA0MAfQ(pwy), new $$Lambda$pwx$ZbmokIwF4G0ZaP8iKupNpEDXBM(pwy), new $$Lambda$pwx$zXLc3jsJxLicZjHcH5C_BGkNWfY(pwy), new $$Lambda$pwx$_1hpRzoRsUYFFMf3sSgMu7fumkU(pwy));
    }
}
