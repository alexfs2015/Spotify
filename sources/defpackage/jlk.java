package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: jlk reason: default package */
public class jlk {
    private final pgr a;
    private final fpt b;
    private final SubView c;
    private defpackage.jkn.a d = new a();
    public final sih f;
    jkr g;
    public jkn h;
    jlq i;
    public Offer j;
    public final Reason k;
    public final String l;
    public final String m;
    boolean n;
    public String o;

    /* renamed from: jlk$a */
    public class a implements defpackage.jkn.a {
        protected a() {
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v4, types: [android.text.SpannableStringBuilder] */
        /* JADX WARNING: type inference failed for: r0v35 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.spotify.mobile.android.ui.activity.upsell.model.Offer r10) {
            /*
                r9 = this;
                jlk r0 = defpackage.jlk.this
                r0.j = r10
                com.spotify.mobile.android.ui.activity.upsell.model.Offer r0 = r0.j
                jlk r1 = defpackage.jlk.this
                jlq r1 = r1.i
                java.lang.String r2 = "7-day-trial"
                java.lang.String r3 = ""
                if (r0 == 0) goto L_0x0037
                java.lang.String r0 = r0.adTargetingKey()
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0032
                java.lang.ref.WeakReference<android.content.Context> r0 = r1.a
                java.lang.Object r0 = r0.get()
                android.content.Context r0 = (android.content.Context) r0
                if (r0 == 0) goto L_0x0030
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131953359(0x7f1306cf, float:1.9543187E38)
                java.lang.String r0 = r0.getString(r1)
                goto L_0x003b
            L_0x0030:
                r0 = r3
                goto L_0x003b
            L_0x0032:
                java.lang.String r0 = r1.a()
                goto L_0x003b
            L_0x0037:
                java.lang.String r0 = r1.a()
            L_0x003b:
                jlk r1 = defpackage.jlk.this
                jkr r1 = r1.g
                r1.b(r0)
                jlk r0 = defpackage.jlk.this
                jkr r0 = r0.g
                r1 = 0
                r0.d(r1)
                jlk r0 = defpackage.jlk.this
                com.spotify.mobile.android.ui.activity.upsell.model.Offer r0 = r0.j
                jlk r4 = defpackage.jlk.this
                jlq r4 = r4.i
                java.lang.String r5 = "trial_30_days"
                if (r0 == 0) goto L_0x0095
                java.lang.String r6 = r0.adTargetingKey()
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0073
                java.lang.ref.WeakReference<android.content.Context> r0 = r4.a
                java.lang.Object r0 = r0.get()
                android.content.Context r0 = (android.content.Context) r0
                if (r0 != 0) goto L_0x006b
                goto L_0x0095
            L_0x006b:
                r2 = 2131953358(0x7f1306ce, float:1.9543185E38)
                java.lang.String r0 = r0.getString(r2)
                goto L_0x0096
            L_0x0073:
                java.lang.String r0 = r0.adTargetingKey()
                boolean r0 = r5.equals(r0)
                if (r0 == 0) goto L_0x0093
                java.lang.ref.WeakReference<android.content.Context> r0 = r4.a
                java.lang.Object r0 = r0.get()
                android.content.Context r0 = (android.content.Context) r0
                if (r0 == 0) goto L_0x0095
                android.content.res.Resources r0 = r0.getResources()
                r2 = 2131953356(0x7f1306cc, float:1.954318E38)
                java.lang.String r0 = r0.getString(r2)
                goto L_0x0096
            L_0x0093:
                r0 = 0
                goto L_0x0096
            L_0x0095:
                r0 = r3
            L_0x0096:
                boolean r2 = defpackage.fax.a(r0)
                if (r2 != 0) goto L_0x00ab
                jlk r2 = defpackage.jlk.this
                jkr r2 = r2.g
                r2.c(r0)
                jlk r0 = defpackage.jlk.this
                jkr r0 = r0.g
                r0.e(r1)
                goto L_0x00b4
            L_0x00ab:
                jlk r0 = defpackage.jlk.this
                jkr r0 = r0.g
                r2 = 8
                r0.e(r2)
            L_0x00b4:
                jlk r0 = defpackage.jlk.this
                com.spotify.mobile.android.ui.activity.upsell.model.Offer r0 = r0.j
                jlk r2 = defpackage.jlk.this
                jlq r2 = r2.i
                if (r0 == 0) goto L_0x012f
                java.lang.String r0 = r0.adTargetingKey()
                java.lang.String r4 = "premium"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x00d0
                boolean r4 = r5.equals(r0)
                if (r4 == 0) goto L_0x012f
            L_0x00d0:
                java.lang.ref.WeakReference<android.content.Context> r4 = r2.a
                java.lang.Object r4 = r4.get()
                android.content.Context r4 = (android.content.Context) r4
                if (r4 != 0) goto L_0x00db
                goto L_0x012f
            L_0x00db:
                r6 = 2131953361(0x7f1306d1, float:1.954319E38)
                java.lang.String r4 = r4.getString(r6)
                java.lang.ref.WeakReference<android.content.Context> r2 = r2.a
                java.lang.Object r2 = r2.get()
                android.content.Context r2 = (android.content.Context) r2
                if (r2 != 0) goto L_0x00f1
                android.text.SpannableString r0 = android.text.SpannableString.valueOf(r3)
                goto L_0x0121
            L_0x00f1:
                android.text.SpannableString r3 = new android.text.SpannableString
                r6 = 2131953360(0x7f1306d0, float:1.9543189E38)
                java.lang.String r6 = r2.getString(r6)
                r3.<init>(r6)
                boolean r0 = r5.equals(r0)
                if (r0 == 0) goto L_0x010b
                r0 = 2131954002(0x7f130952, float:1.954449E38)
                java.lang.String r0 = r2.getString(r0)
                goto L_0x0112
            L_0x010b:
                r0 = 2131953901(0x7f1308ed, float:1.9544286E38)
                java.lang.String r0 = r2.getString(r0)
            L_0x0112:
                jls r2 = new jls
                r2.<init>(r0)
                int r0 = r3.length()
                r5 = 17
                r3.setSpan(r2, r1, r0, r5)
                r0 = r3
            L_0x0121:
                android.text.SpannableStringBuilder r2 = android.text.SpannableStringBuilder.valueOf(r4)
                java.lang.String r3 = " "
                android.text.SpannableStringBuilder r2 = r2.append(r3)
                android.text.SpannableStringBuilder r3 = r2.append(r0)
            L_0x012f:
                jlk r0 = defpackage.jlk.this
                jkr r0 = r0.g
                r0.a(r3)
                jlk r0 = defpackage.jlk.this
                boolean r0 = r0.n
                if (r0 == 0) goto L_0x017e
                jlk r0 = defpackage.jlk.this
                r0.n = r1
                jkn r0 = r0.h
                jlk r1 = defpackage.jlk.this
                java.lang.String r4 = r1.o
                jlk r1 = defpackage.jlk.this
                com.spotify.mobile.android.ui.activity.upsell.Reason r1 = r1.k
                jlk r2 = defpackage.jlk.this
                java.lang.String r6 = r2.l
                jlk r2 = defpackage.jlk.this
                java.lang.String r7 = r2.m
                jlk r2 = defpackage.jlk.this
                sih r2 = r2.f
                defpackage.jlr.a(r1, r6, r7)
                java.lang.String r3 = java.lang.String.valueOf(r10)
                java.lang.String r5 = r1.mAdSlotName
                java.lang.String r8 = r2.toString()
                hay$bj r10 = new hay$bj
                r2 = r10
                r2.<init>(r3, r4, r5, r6, r7, r8)
                com.google.common.base.Optional r10 = com.google.common.base.Optional.b(r10)
                boolean r1 = r10.b()
                if (r1 == 0) goto L_0x017e
                jki r0 = r0.a
                java.lang.Object r10 = r10.c()
                haw r10 = (defpackage.haw) r10
                r0.a(r10)
            L_0x017e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jlk.a.a(com.spotify.mobile.android.ui.activity.upsell.model.Offer):void");
        }

        public void a(String str) {
            jlk.this.g.d(8);
            jlk.this.g.e(8);
            jlk.this.g.a("");
        }
    }

    public jlk(Reason reason, String str, boolean z, jkr jkr, jkn jkn, jlq jlq, sih sih, SubView subView, String str2, pgr pgr, fpt fpt) {
        this.i = (jlq) fay.a(jlq);
        this.h = (jkn) fay.a(jkn);
        this.k = (Reason) fay.a(reason);
        this.n = z;
        this.m = (String) fay.a(str2);
        this.c = (SubView) fay.a(subView);
        this.l = (String) fay.a(str);
        this.g = (jkr) fay.a(jkr);
        this.f = (sih) fay.a(sih);
        this.a = pgr;
        this.b = fpt;
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.h.a(this.d);
    }

    public void a() {
        String str = this.h.i;
        if ("TH".equals(str)) {
            this.h.a("https://www.spotify.com/th-th/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        } else if ("PH".equals(str)) {
            this.h.a("https://www.spotify.com/ph/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        } else if ("ID".equals(str)) {
            this.h.a("https://www.spotify.com/id/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        } else if ("MY".equals(str)) {
            this.h.a("https://www.spotify.com/my-en/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        } else if ("IN".equals(str) && pgr.h(this.b)) {
            this.h.a("https://www.spotify.com/in/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        } else if (!"VN".equals(str) || !pgr.i(this.b)) {
            this.h.a(this.k, this.o, this.l, this.f, this.c, this.j, this.m);
        } else {
            this.h.a("https://www.spotify.com/vn-vi/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        }
    }

    public void a(SessionState sessionState) {
        this.o = sessionState.productType();
        this.h.a(sessionState);
        b();
    }
}
