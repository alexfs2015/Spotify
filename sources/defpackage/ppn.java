package defpackage;

import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import java.util.Map;

/* renamed from: ppn reason: default package */
public final class ppn {
    public static kjx<ppo, ppl> a(ppo ppo, ppm ppm) {
        return (kjx) ppm.a(new $$Lambda$ppn$dEbHJRUrkWq8i8t7GiIEn_uB_Tk(ppo), new $$Lambda$ppn$lMMpTgj8ZT1yH8qV0StweHJTTE(ppo), new $$Lambda$ppn$BTJugI8hBT5CP5cPyG25SgeJMvI(ppo), new $$Lambda$ppn$AApkT8YMbcaQ1rlQpXhF1AMcZow(ppo), new $$Lambda$ppn$5Euz93OxuaNmOrs_QkHReyN9qmo(ppo), new $$Lambda$ppn$CAn1dFkARke2STo3jGfNUTN2R1M(ppo), new $$Lambda$ppn$uguHKPlEpLfZ9YSTeUtmZIwG2JU(ppo), new $$Lambda$ppn$6ZjUmW32ce72B81t246OcfF3FXY(ppo));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ppo ppo, d dVar) {
        NoteMessage a = ppo.a();
        if (a == null) {
            return kjx.e();
        }
        return kjx.a(ppo.a((NoteMessage) null), kjk.a(new b(ppo.d(), a, "note-inflation-error"), new e()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ppo ppo, a aVar) {
        if (ppo.a() == null) {
            return kjx.e();
        }
        if (!aVar.a.getShouldDismiss().booleanValue()) {
            return kjx.b(ppo.a(false));
        }
        return kjx.a(ppo.a((NoteMessage) null).a(false), kjk.a(new e()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ppo ppo, c cVar) {
        if (ppo.a() == null) {
            return kjx.e();
        }
        return kjx.a(ppo.a((NoteMessage) null), kjk.a(new e()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ppo ppo, b bVar) {
        NoteMessage a = ppo.a();
        boolean g = ppo.g();
        if (a == null || g) {
            return kjx.e();
        }
        String str = bVar.a;
        Map clickActions = a.getClickActions();
        if (clickActions == null || str.isEmpty()) {
            return kjx.a(ppo.a((NoteMessage) null), kjk.a(new e()));
        }
        QuicksilverClickAction quicksilverClickAction = (QuicksilverClickAction) clickActions.get(str);
        if (quicksilverClickAction == null) {
            return kjx.a(ppo.a((NoteMessage) null), kjk.a(new e()));
        }
        String str2 = (String) fay.a(a.getUuid());
        return kjx.a(ppo.a(true), kjk.a(new f(quicksilverClickAction, str2)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ppo ppo, h hVar) {
        NoteMessage a = ppo.a();
        if (a == null) {
            return kjx.e();
        }
        d dVar = new d(a.getId(), a.getUuid(), hVar.a, hVar.b, hVar.c);
        return kjx.a(kjk.a(dVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ppo ppo, f fVar) {
        NoteMessage a = ppo.a();
        if (ppo.f() || a == null) {
            return kjx.e();
        }
        String impressionUrl = a.getImpressionUrl();
        String uuid = a.getUuid();
        if (impressionUrl == null || uuid == null) {
            return kjx.e();
        }
        return kjx.a(ppo.h().a(true).a(), kjk.a(new a(impressionUrl, uuid)));
    }
}
