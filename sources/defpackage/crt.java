package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

@cfp
/* renamed from: crt reason: default package */
public final class crt extends FrameLayout implements crq {
    final csj a;
    crr b;
    long c;
    String d;
    private final csh e;
    private final FrameLayout f;
    private final dtt g;
    private final long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private long m;
    private Bitmap n;
    private ImageView o;
    private boolean p;

    public crt(Context context, csh csh, int i2, boolean z, dtt dtt, csg csg) {
        super(context);
        this.e = csh;
        this.g = dtt;
        this.f = new FrameLayout(context);
        addView(this.f, new LayoutParams(-1, -1));
        if (csh.e() != null) {
            this.b = csh.e().b.a(context, csh, z, dtt, csg);
            crr crr = this.b;
            if (crr != null) {
                this.f.addView(crr, new LayoutParams(-1, -1, 17));
                if (((Boolean) dqe.f().a(dtg.w)).booleanValue()) {
                    l();
                }
            }
            this.o = new ImageView(context);
            this.h = ((Long) dqe.f().a(dtg.A)).longValue();
            this.l = ((Boolean) dqe.f().a(dtg.y)).booleanValue();
            dtt dtt2 = this.g;
            if (dtt2 != null) {
                dtt2.a("spinner_used", this.l ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
            }
            this.a = new csj(this);
            crr crr2 = this.b;
            if (crr2 != null) {
                crr2.a((crq) this);
            }
            if (this.b == null) {
                a("AdVideoUnderlay Error", "Allocating player failed.");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("null reference");
    }

    public static void a(csh csh) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        csh.a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    public static void a(csh csh, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put(LogMessage.SEVERITY_ERROR, str);
        csh.a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    public static void a(csh csh, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        csh.a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    private final boolean n() {
        return this.o.getParent() != null;
    }

    public final void a() {
        this.a.a();
        cmu.a.post(new crv(this));
    }

    public final void a(float f2) {
        crr crr = this.b;
        if (crr != null) {
            csk csk = crr.c;
            csk.c = f2;
            csk.c();
            crr.i();
        }
    }

    public final void a(int i2, int i3) {
        if (this.l) {
            int max = Math.max(i2 / ((Integer) dqe.f().a(dtg.z)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) dqe.f().a(dtg.z)).intValue(), 1);
            Bitmap bitmap = this.n;
            if (bitmap == null || bitmap.getWidth() != max || this.n.getHeight() != max2) {
                this.n = Bitmap.createBitmap(max, max2, Config.ARGB_8888);
                this.p = false;
            }
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (i4 != 0 && i5 != 0) {
            LayoutParams layoutParams = new LayoutParams(i4, i5);
            layoutParams.setMargins(i2, i3, 0, 0);
            this.f.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void a(String str, String str2) {
        a(LogMessage.SEVERITY_ERROR, "what", str, "extra", str2);
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.e.a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    public final void b() {
        crr crr = this.b;
        if (crr != null && this.m == 0) {
            a("canplaythrough", "duration", String.valueOf(((float) crr.e()) / 1000.0f), "videoWidth", String.valueOf(this.b.g()), "videoHeight", String.valueOf(this.b.h()));
        }
    }

    public final void c() {
        if (this.e.d() != null && !this.j) {
            this.k = (this.e.d().getWindow().getAttributes().flags & 128) != 0;
            if (!this.k) {
                this.e.d().getWindow().addFlags(128);
                this.j = true;
            }
        }
        this.i = true;
    }

    public final void d() {
        a("pause", new String[0]);
        m();
        this.i = false;
    }

    public final void e() {
        a("ended", new String[0]);
        m();
    }

    public final void f() {
        if (this.p && this.n != null && !n()) {
            this.o.setImageBitmap(this.n);
            this.o.invalidate();
            this.f.addView(this.o, new LayoutParams(-1, -1));
            this.f.bringChildToFront(this.o);
        }
        this.a.a = true;
        this.m = this.c;
        cmu.a.post(new crw(this));
    }

    public final void finalize() {
        try {
            this.a.a = true;
            if (this.b != null) {
                crr crr = this.b;
                Executor executor = cqo.a;
                crr.getClass();
                executor.execute(cru.a(crr));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        if (this.i && n()) {
            this.f.removeView(this.o);
        }
        if (this.n != null) {
            long b2 = bkc.l().b();
            if (this.b.getBitmap(this.n) != null) {
                this.p = true;
            }
            long b3 = bkc.l().b() - b2;
            if (cml.a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b3);
                sb.append("ms");
                sb.toString();
                cml.a();
            }
            if (b3 > this.h) {
                cpn.a(5);
                this.l = false;
                this.n = null;
                dtt dtt = this.g;
                if (dtt != null) {
                    dtt.a("spinner_jank", Long.toString(b3));
                }
            }
        }
    }

    public final void h() {
        if (this.b != null) {
            if (!TextUtils.isEmpty(this.d)) {
                this.b.a(this.d);
                return;
            }
            a("no_src", new String[0]);
        }
    }

    public final void i() {
        crr crr = this.b;
        if (crr != null) {
            crr.d();
        }
    }

    public final void j() {
        crr crr = this.b;
        if (crr != null) {
            crr.c.a(true);
            crr.i();
        }
    }

    public final void k() {
        crr crr = this.b;
        if (crr != null) {
            crr.c.a(false);
            crr.i();
        }
    }

    public final void l() {
        crr crr = this.b;
        if (crr != null) {
            TextView textView = new TextView(crr.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.b.a());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f.addView(textView, new LayoutParams(-2, -2, 17));
            this.f.bringChildToFront(textView);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void m() {
        if (this.e.d() != null && this.j && !this.k) {
            this.e.d().getWindow().clearFlags(128);
            this.j = false;
        }
    }

    public final void onWindowVisibilityChanged(int i2) {
        boolean z = true;
        if (i2 == 0) {
            this.a.a();
        } else {
            this.a.a = true;
            this.m = this.c;
            z = false;
        }
        cmu.a.post(new crx(this, z));
    }
}
