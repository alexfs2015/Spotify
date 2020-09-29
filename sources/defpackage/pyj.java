package defpackage;

import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import java.util.Map;

/* renamed from: pyj reason: default package */
public final class pyj {
    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pyk pyk, a aVar) {
        if (pyk.a() == null) {
            return kng.e();
        }
        if (!aVar.a.getShouldDismiss().booleanValue()) {
            return kng.b(pyk.a(false));
        }
        return kng.a(pyk.a((NoteMessage) null).a(false), kmt.a(new e()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pyk pyk, b bVar) {
        NoteMessage a = pyk.a();
        boolean g = pyk.g();
        if (a == null || g) {
            return kng.e();
        }
        String str = bVar.a;
        Map clickActions = a.getClickActions();
        if (clickActions == null || str.isEmpty()) {
            return kng.a(pyk.a((NoteMessage) null), kmt.a(new e()));
        }
        QuicksilverClickAction quicksilverClickAction = (QuicksilverClickAction) clickActions.get(str);
        if (quicksilverClickAction == null) {
            return kng.a(pyk.a((NoteMessage) null), kmt.a(new e()));
        }
        String str2 = (String) fbp.a(a.getUuid());
        return kng.a(pyk.a(true), kmt.a(new f(quicksilverClickAction, str2)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pyk pyk, c cVar) {
        if (pyk.a() == null) {
            return kng.e();
        }
        return kng.a(pyk.a((NoteMessage) null), kmt.a(new e()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pyk pyk, d dVar) {
        NoteMessage a = pyk.a();
        if (a == null) {
            return kng.e();
        }
        return kng.a(pyk.a((NoteMessage) null), kmt.a(new b(pyk.d(), a, "note-inflation-error"), new e()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pyk pyk, f fVar) {
        NoteMessage a = pyk.a();
        if (pyk.f() || a == null) {
            return kng.e();
        }
        String impressionUrl = a.getImpressionUrl();
        String uuid = a.getUuid();
        if (impressionUrl == null || uuid == null) {
            return kng.e();
        }
        return kng.a(pyk.h().a(true).a(), kmt.a(new a(impressionUrl, uuid)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pyk pyk, h hVar) {
        NoteMessage a = pyk.a();
        if (a == null) {
            return kng.e();
        }
        d dVar = new d(a.getId(), a.getUuid(), hVar.a, hVar.b, hVar.c);
        return kng.a(kmt.a(dVar));
    }

    public static kng<pyk, pyh> a(pyk pyk, pyi pyi) {
        return (kng) pyi.a(new $$Lambda$pyj$4CmvIaJ6QohPFBZCJgJnS0pWaSY(pyk), new $$Lambda$pyj$ymoNPVUo_2Dg21eJNVPF6idjDmQ(pyk), new $$Lambda$pyj$SFnbZDvsR5NsZaWna7q8fLuk(pyk), new $$Lambda$pyj$s0h2wKcficYCCF8X2_zscZfDYI(pyk), new $$Lambda$pyj$Z3d8YMKy90Izuv5UPscyYIPKYE(pyk), new $$Lambda$pyj$k_ak4SHw4vQZXbVmPDn3NrAyfxo(pyk), new $$Lambda$pyj$K_3UIyKga6NbeILlk9Eq5gU9LI(pyk), new $$Lambda$pyj$_IyAWGkGt63YyKIw0wbsuhY7lN4(pyk));
    }
}
