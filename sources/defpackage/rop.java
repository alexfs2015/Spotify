package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.shortcut.ShortcutInstallerService;
import java.util.List;

/* renamed from: rop reason: default package */
public final class rop {
    final ror a;
    private final utg b;
    private final fzt c;
    private final ujp d;
    private final Context e;
    private final sso f;

    public rop(sso sso, Context context, ujp ujp, fzt fzt, ror ror, utg utg) {
        this.f = sso;
        this.e = context;
        this.d = ujp;
        this.c = (fzt) fbp.a(fzt);
        this.a = (ror) fbp.a(ror);
        this.b = utg;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.d.a(this.e, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        this.a.a(str, (List<String>) Lists.a((E[]) new String[]{str2}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3) {
        ShortcutInstallerService.a(this.e, str, str2, str3, this.f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4) {
        this.a.a(str, str2, str3, str4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z) {
        this.a.a(str, !z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.a.a(str);
    }

    public final void a(final String str, fzn fzn, roq roq, rou rou) {
        String str2 = roq.f;
        if (str2 == null) {
            str2 = rou.b().name();
        }
        String str3 = roq.g;
        String str4 = str3 != null ? str3 : str;
        String str5 = (String) jvi.a(roq.d, rou.a());
        String str6 = "";
        String str7 = (String) jvi.a(roq.e, str6);
        final String str8 = (String) jvi.a(roq.h, str6);
        String str9 = (String) jvi.a(roq.i, str6);
        fzn.a(utg.a(str2, str4, true), rou.b(), false, true);
        fzn.b(str5);
        fzn.c(str7);
        boolean z = roq.a;
        $$Lambda$rop$dGAwe4soVPLNd28aoBHX7Wubrs r4 = new $$Lambda$rop$dGAwe4soVPLNd28aoBHX7Wubrs(this, str, z);
        if (rou.j()) {
            this.c.c(fzn, z, r4);
            this.c.d(fzn, z, r4);
        } else {
            this.c.a(fzn, z, (fzk) r4);
            this.c.b(fzn, z, r4);
        }
        if (rou.d()) {
            final boolean z2 = roq.b;
            this.c.a(fzn, z2, rou.h(), (fzk) new fzk() {
                public final void onClick() {
                    rop.this.a.b(str, !z2);
                }
            });
        }
        if (rou.e()) {
            this.c.b(fzn, new fzk() {
                public final void onClick() {
                    rop.this.a.b(str8);
                }
            });
        }
        if (rou.i()) {
            this.c.a(fzn, str, (fzk) new $$Lambda$rop$Gq8jClff2JxPHGmbQtaf1AJjm68(this, str));
        }
        if (rou.f()) {
            this.c.c(fzn, new fzk() {
                public final void onClick() {
                    rop.this.a.c(str);
                }
            });
        }
        if (rou.k()) {
            final boolean z3 = roq.c;
            this.c.e(fzn, z3, new fzk() {
                public final void onClick() {
                    rop.this.a.a(!z3);
                }
            });
        }
        if (rou.g()) {
            this.c.d(fzn, new $$Lambda$rop$DUCaYoetHHSEhPlc_5JYaqr9LI(this, str));
        }
        fzt fzt = this.c;
        $$Lambda$rop$Art05h8yLo63SpiNZIegdkyTUtE r1 = new $$Lambda$rop$Art05h8yLo63SpiNZIegdkyTUtE(this, str4, str2, str5, str7);
        fzt.a(fzn, r1);
        if (rou.m()) {
            this.c.e(fzn, new $$Lambda$rop$5NjcxN_czqqK93Ce2llPW51uW8(this, str, str5, str2));
        }
        if (rou.l() && !TextUtils.isEmpty(str9)) {
            this.c.f(fzn, new $$Lambda$rop$QlwWjYh4pikM7Vsy2dCwrvJJIsU(this, str, str9));
        }
    }
}
