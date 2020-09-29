package defpackage;

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: kag reason: default package */
public final class kag {
    private HashMap<jya, List<kah>> a = new HashMap<>();
    private final List<kai> b;
    private final Handler c;
    private final jrp d;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kah kah, kal kal, long j) {
    }

    public kag(List<kai> list, Handler handler, gbd gbd) {
        this.b = list;
        this.c = handler;
        this.d = gbd.a();
    }

    public final void a(jya jya, jxx jxx, apz apz, String str, jyd jyd) {
        ArrayList arrayList = new ArrayList();
        kar kar = new kar(apz);
        for (kai a2 : this.b) {
            Optional a3 = a2.a(jya, jxx, kar, str, jyd);
            if (a3.b()) {
                arrayList.add(a3.c());
            }
        }
        this.a.put(jya, arrayList);
    }

    private void d(Optional<jya> optional) {
        if (optional.b()) {
            this.a.containsKey(optional.c());
        }
    }

    private List<kah> e(Optional<jya> optional) {
        if (optional.b()) {
            List<kah> list = (List) this.a.get(optional.c());
            if (list != null) {
                return list;
            }
        }
        return Collections.emptyList();
    }

    public final void a(jya jya, boolean z) {
        d(Optional.b(jya));
        long a2 = this.d.a();
        for (kah r2 : e(Optional.b(jya))) {
            this.c.post(new $$Lambda$kag$l4oc0JFkmSgW6hTI2A103q8hAXo(r2, z, a2));
        }
    }

    public final void a(Optional<jya> optional) {
        d(optional);
        long a2 = this.d.a();
        for (kah r2 : e(optional)) {
            this.c.post(new $$Lambda$kag$AJm0BANfofAXv5Esi1OqUuQxVc(r2, a2));
        }
    }

    public final void a(Optional<jya> optional, List<jyi> list) {
        d(optional);
        long a2 = this.d.a();
        for (kah r2 : e(optional)) {
            this.c.post(new $$Lambda$kag$GWeyKSIEgHIiI_DaqqfBgNKuTE(r2, list, a2));
        }
    }

    public final void b(Optional<jya> optional) {
        d(optional);
        long a2 = this.d.a();
        for (kah r2 : e(optional)) {
            this.c.post(new $$Lambda$kag$Pb2VwRdoAK0relfQzeqNFwhXvw(r2, a2));
        }
    }

    public final void a(Optional<jya> optional, EncryptionType encryptionType) {
        d(optional);
        long a2 = this.d.a();
        for (kah r2 : e(optional)) {
            this.c.post(new $$Lambda$kag$LB478j4nXOTqbsCArVBii9vJ8c(r2, encryptionType, a2));
        }
    }

    public final void a(Optional<jya> optional, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$kI58FJ738IHNhu2wH1H9jgKj4HA r1 = new $$Lambda$kag$kI58FJ738IHNhu2wH1H9jgKj4HA(kah, j, a2);
            handler.post(r1);
        }
    }

    public final void b(Optional<jya> optional, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$fw3lMrGDDUUbymNUFdTtqSmfDFM r1 = new $$Lambda$kag$fw3lMrGDDUUbymNUFdTtqSmfDFM(kah, j, a2);
            handler.post(r1);
        }
    }

    public final void c(Optional<jya> optional, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$OxtMDC3F4NZX4UMNyaDmIbCQclA r1 = new $$Lambda$kag$OxtMDC3F4NZX4UMNyaDmIbCQclA(kah, j, a2);
            handler.post(r1);
        }
    }

    public final void c(Optional<jya> optional) {
        d(optional);
        long a2 = this.d.a();
        for (kah r2 : e(optional)) {
            this.c.post(new $$Lambda$kag$mjI38awCA2NlMKioFV7R7aRExKs(r2, a2));
        }
    }

    public final void a(Optional<jya> optional, long j, long j2) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$Svzz4gt_NYYwgZ8SUAYJuEHICqE r2 = new $$Lambda$kag$Svzz4gt_NYYwgZ8SUAYJuEHICqE(kah, j, j2, a2);
            handler.post(r2);
        }
    }

    public final void a(Optional<jya> optional, kal kal) {
        long a2 = this.d.a();
        for (kah r2 : e(optional)) {
            this.c.post(new $$Lambda$kag$VsEn_7cbIVevEGQaljpEIqvjU(r2, kal, a2));
        }
    }

    public final void a(Optional<jya> optional, ReasonEnd reasonEnd, long j) {
        a(optional, reasonEnd, jxr.a(), j);
    }

    public final void a(Optional<jya> optional, ReasonEnd reasonEnd, jxr jxr, long j) {
        d(optional);
        long a2 = this.d.a();
        if (optional.b()) {
            List<kah> list = (List) this.a.remove(optional.c());
            if (list != null) {
                for (kah kah : list) {
                    a b2 = jxr.b();
                    Handler handler = this.c;
                    $$Lambda$kag$Dep_uJnWgXJMGO9TU1Wnfb4ISd8 r2 = new $$Lambda$kag$Dep_uJnWgXJMGO9TU1Wnfb4ISd8(kah, jxr, reasonEnd, j, a2, b2);
                    handler.post(r2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kah kah, jxr jxr, ReasonEnd reasonEnd, long j, long j2, a aVar) {
        try {
            kah.a(jxr, reasonEnd, j, j2);
        } finally {
            aVar.a();
        }
    }

    public final void a(Optional<jya> optional, BetamaxException betamaxException, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$k0IupItpAlLaeZ5_sfCq2F6qUTI r1 = new $$Lambda$kag$k0IupItpAlLaeZ5_sfCq2F6qUTI(kah, betamaxException, j, a2);
            handler.post(r1);
        }
    }

    public final void b(Optional<jya> optional, BetamaxException betamaxException, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$spCXy_3FN4A55n2czi6r3WnB7U r1 = new $$Lambda$kag$spCXy_3FN4A55n2czi6r3WnB7U(kah, betamaxException, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<jya> optional, boolean z, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$G_TD7NM4WEjwjWnebm2skjsZdg r1 = new $$Lambda$kag$G_TD7NM4WEjwjWnebm2skjsZdg(kah, z, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<jya> optional, long j, long j2, long j3) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$p99IfA0v8b_yjcnd0BPwE2t50w8 r2 = new $$Lambda$kag$p99IfA0v8b_yjcnd0BPwE2t50w8(kah, j, j2, j3, a2);
            handler.post(r2);
        }
    }

    public final void a(Optional<jya> optional, aqe aqe, long j) {
        aqe aqe2 = aqe;
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            kaf kaf = new kaf(aqe2.c, aqe2.k, aqe2.l, aqe2.m, aqe2.d);
            Handler handler = this.c;
            $$Lambda$kag$gUsDRqJrOKYr5_rSOUgyAhAwv2M r3 = new $$Lambda$kag$gUsDRqJrOKYr5_rSOUgyAhAwv2M(kah, kaf, j, a2);
            handler.post(r3);
        }
    }

    public final void b(Optional<jya> optional, aqe aqe, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            kad kad = new kad(aqe.c, aqe.d);
            Handler handler = this.c;
            $$Lambda$kag$crCUZeIoifAmCjLGClHxiAQgCJU r1 = new $$Lambda$kag$crCUZeIoifAmCjLGClHxiAQgCJU(kah, kad, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<jya> optional, Optional<VideoSurfaceView> optional2, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$OGrfN3sQNbYUunrz9Ui2MmAriSU r1 = new $$Lambda$kag$OGrfN3sQNbYUunrz9Ui2MmAriSU(kah, optional2, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<jya> optional, long j, jyi jyi) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$4pURibWWUNrlw4CIe9No5e3Hbw r1 = new $$Lambda$kag$4pURibWWUNrlw4CIe9No5e3Hbw(kah, jyi, j, a2);
            handler.post(r1);
        }
    }

    public final void d(Optional<jya> optional, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$kGBBOVsR0o_GXPsZB26TQon4vlE r1 = new $$Lambda$kag$kGBBOVsR0o_GXPsZB26TQon4vlE(kah, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<jya> optional, jya jya) {
        d(optional);
        long a2 = this.d.a();
        for (kah r2 : e(optional)) {
            this.c.post(new $$Lambda$kag$iVLNGN1CXlmwxAr7B7Gv_IuqAF4(r2, jya, a2));
        }
    }

    public final void a(Optional<jya> optional, int i) {
        d(optional);
        long a2 = this.d.a();
        for (kah r2 : e(optional)) {
            this.c.post(new $$Lambda$kag$FWf8_YfTW9GI95iG2erQv76nXDg(r2, i, a2));
        }
    }

    public final void a(Optional<jya> optional, long j, float f) {
        d(optional);
        long a2 = this.d.a();
        for (kah kah : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kag$qxQVjkF1L5YKlLQ33okGGfruRRw r1 = new $$Lambda$kag$qxQVjkF1L5YKlLQ33okGGfruRRw(kah, f, j, a2);
            handler.post(r1);
        }
    }
}
