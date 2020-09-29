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

/* renamed from: kcg reason: default package */
public final class kcg {
    private HashMap<kaa, List<kch>> a = new HashMap<>();
    private final List<kci> b;
    private final Handler c;
    private final jtz d;

    public kcg(List<kci> list, Handler handler, gcb gcb) {
        this.b = list;
        this.c = handler;
        this.d = jtp.a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kch kch, jzr jzr, ReasonEnd reasonEnd, long j, long j2, a aVar) {
        try {
            kch.a(jzr, reasonEnd, j, j2);
        } finally {
            aVar.a();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kch kch, kcl kcl, long j) {
    }

    private void d(Optional<kaa> optional) {
        if (optional.b()) {
            this.a.containsKey(optional.c());
        }
    }

    private List<kch> e(Optional<kaa> optional) {
        if (optional.b()) {
            List<kch> list = (List) this.a.get(optional.c());
            if (list != null) {
                return list;
            }
        }
        return Collections.emptyList();
    }

    public final void a(Optional<kaa> optional) {
        d(optional);
        long a2 = this.d.a();
        for (kch r2 : e(optional)) {
            this.c.post(new $$Lambda$kcg$qMypgN31ZSdHeaWmKeb7BoWk8M(r2, a2));
        }
    }

    public final void a(Optional<kaa> optional, int i) {
        d(optional);
        long a2 = this.d.a();
        for (kch r2 : e(optional)) {
            this.c.post(new $$Lambda$kcg$xeEVgaGuKdzofxQIguFi8JADAF0(r2, i, a2));
        }
    }

    public final void a(Optional<kaa> optional, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$g5CCQrW5iov5NBj7RXqApp30pkU r1 = new $$Lambda$kcg$g5CCQrW5iov5NBj7RXqApp30pkU(kch, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<kaa> optional, long j, float f) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$YKsV1WimRB8CyJ6tAf2Foi_VGHg r1 = new $$Lambda$kcg$YKsV1WimRB8CyJ6tAf2Foi_VGHg(kch, f, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<kaa> optional, long j, long j2) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$5D6TkHekG3peL8Evip9PFbq5YE r2 = new $$Lambda$kcg$5D6TkHekG3peL8Evip9PFbq5YE(kch, j, j2, a2);
            handler.post(r2);
        }
    }

    public final void a(Optional<kaa> optional, long j, long j2, long j3) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$vMlBZJq5kAETL2Y_LWLFhdUU8b8 r2 = new $$Lambda$kcg$vMlBZJq5kAETL2Y_LWLFhdUU8b8(kch, j, j2, j3, a2);
            handler.post(r2);
        }
    }

    public final void a(Optional<kaa> optional, long j, kai kai) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$vusShOi5t3iGSpC_Iphkj_T3sg r1 = new $$Lambda$kcg$vusShOi5t3iGSpC_Iphkj_T3sg(kch, kai, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<kaa> optional, aqv aqv, long j) {
        aqv aqv2 = aqv;
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            kcf kcf = new kcf(aqv2.c, aqv2.k, aqv2.l, aqv2.m, aqv2.d);
            Handler handler = this.c;
            $$Lambda$kcg$hb2dqDxkqod2_K625kiQ6xPfs r3 = new $$Lambda$kcg$hb2dqDxkqod2_K625kiQ6xPfs(kch, kcf, j, a2);
            handler.post(r3);
        }
    }

    public final void a(Optional<kaa> optional, Optional<VideoSurfaceView> optional2, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$oY9q4KGNjzFlP1wLvIYPQD21LxI r1 = new $$Lambda$kcg$oY9q4KGNjzFlP1wLvIYPQD21LxI(kch, optional2, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<kaa> optional, EncryptionType encryptionType) {
        d(optional);
        long a2 = this.d.a();
        for (kch r2 : e(optional)) {
            this.c.post(new $$Lambda$kcg$EVyVbSXw8XtruDFeLvKvPYjDJVE(r2, encryptionType, a2));
        }
    }

    public final void a(Optional<kaa> optional, ReasonEnd reasonEnd, long j) {
        a(optional, reasonEnd, jzr.a(), j);
    }

    public final void a(Optional<kaa> optional, ReasonEnd reasonEnd, jzr jzr, long j) {
        d(optional);
        long a2 = this.d.a();
        if (optional.b()) {
            List<kch> list = (List) this.a.remove(optional.c());
            if (list != null) {
                for (kch kch : list) {
                    a b2 = jzr.b();
                    Handler handler = this.c;
                    $$Lambda$kcg$hc6SsIiVfQuMoUUIbb8OrfnH5BA r2 = new $$Lambda$kcg$hc6SsIiVfQuMoUUIbb8OrfnH5BA(kch, jzr, reasonEnd, j, a2, b2);
                    handler.post(r2);
                }
            }
        }
    }

    public final void a(Optional<kaa> optional, BetamaxException betamaxException, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$4ZrFoyZuZfEcEX2hTHJ_Rzrq1WY r1 = new $$Lambda$kcg$4ZrFoyZuZfEcEX2hTHJ_Rzrq1WY(kch, betamaxException, j, a2);
            handler.post(r1);
        }
    }

    public final void a(Optional<kaa> optional, List<kai> list) {
        d(optional);
        long a2 = this.d.a();
        for (kch r2 : e(optional)) {
            this.c.post(new $$Lambda$kcg$IOQjjjb0qxI1POruy1WAIV54dpQ(r2, list, a2));
        }
    }

    public final void a(Optional<kaa> optional, kaa kaa) {
        d(optional);
        long a2 = this.d.a();
        for (kch r2 : e(optional)) {
            this.c.post(new $$Lambda$kcg$6lExuIXn4upmyBcCydFu3HvdLw(r2, kaa, a2));
        }
    }

    public final void a(Optional<kaa> optional, kcl kcl) {
        long a2 = this.d.a();
        for (kch r2 : e(optional)) {
            this.c.post(new $$Lambda$kcg$SabXlaozXe3RiHtRMlgeMvx6xsw(r2, kcl, a2));
        }
    }

    public final void a(Optional<kaa> optional, boolean z, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$ep5FiFu_dlY2XemZDNXQuKy8rz8 r1 = new $$Lambda$kcg$ep5FiFu_dlY2XemZDNXQuKy8rz8(kch, z, j, a2);
            handler.post(r1);
        }
    }

    public final void a(kaa kaa, jzx jzx, aqq aqq, String str, kad kad) {
        ArrayList arrayList = new ArrayList();
        kcr kcr = new kcr(aqq);
        for (kci createEventObserver : this.b) {
            Optional createEventObserver2 = createEventObserver.createEventObserver(kaa, jzx, kcr, str, kad);
            if (createEventObserver2.b()) {
                arrayList.add(createEventObserver2.c());
            }
        }
        this.a.put(kaa, arrayList);
    }

    public final void a(kaa kaa, boolean z) {
        d(Optional.b(kaa));
        long a2 = this.d.a();
        for (kch r2 : e(Optional.b(kaa))) {
            this.c.post(new $$Lambda$kcg$7Dpltt3c3G65rZCFCxwukf4iRKc(r2, z, a2));
        }
    }

    public final void b(Optional<kaa> optional) {
        d(optional);
        long a2 = this.d.a();
        for (kch r2 : e(optional)) {
            this.c.post(new $$Lambda$kcg$yXjKxCL0cdYOEulGlumLi11iJM(r2, a2));
        }
    }

    public final void b(Optional<kaa> optional, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$yQhtztq0q4Yjw2d86AMyaXXX88 r1 = new $$Lambda$kcg$yQhtztq0q4Yjw2d86AMyaXXX88(kch, j, a2);
            handler.post(r1);
        }
    }

    public final void b(Optional<kaa> optional, aqv aqv, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            kcd kcd = new kcd(aqv.c, aqv.d);
            Handler handler = this.c;
            $$Lambda$kcg$6TGPyVLFsGxfCFMIRnlzCzy9XJU r1 = new $$Lambda$kcg$6TGPyVLFsGxfCFMIRnlzCzy9XJU(kch, kcd, j, a2);
            handler.post(r1);
        }
    }

    public final void b(Optional<kaa> optional, BetamaxException betamaxException, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$fGWkK9NR9CfwdykP6JRNDaiRxg4 r1 = new $$Lambda$kcg$fGWkK9NR9CfwdykP6JRNDaiRxg4(kch, betamaxException, j, a2);
            handler.post(r1);
        }
    }

    public final void c(Optional<kaa> optional) {
        d(optional);
        long a2 = this.d.a();
        for (kch r2 : e(optional)) {
            this.c.post(new $$Lambda$kcg$eV_KtVO9N7bD_7PLAwlfgglpsDw(r2, a2));
        }
    }

    public final void c(Optional<kaa> optional, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$almw6SVP3sBlFSCLCl4VA6UTc r1 = new $$Lambda$kcg$almw6SVP3sBlFSCLCl4VA6UTc(kch, j, a2);
            handler.post(r1);
        }
    }

    public final void d(Optional<kaa> optional, long j) {
        d(optional);
        long a2 = this.d.a();
        for (kch kch : e(optional)) {
            Handler handler = this.c;
            $$Lambda$kcg$_hz0NmDCLhtrBn6tIfSkpLnZvs r1 = new $$Lambda$kcg$_hz0NmDCLhtrBn6tIfSkpLnZvs(kch, j, a2);
            handler.post(r1);
        }
    }
}
