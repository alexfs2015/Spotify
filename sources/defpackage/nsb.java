package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.R;

/* renamed from: nsb reason: default package */
public class nsb extends jor implements a, nsf {
    public nsd T;
    public boolean U;
    private final Handler V = new Handler();
    /* access modifiers changed from: private */
    public ViewPager W;
    private final Runnable X = new Runnable() {
        public final void run() {
            if (nsb.this.W.c < ((sa) fay.a(nsb.this.W.b)).b() - 1) {
                nsb.this.W.b(nsb.this.W.c + 1);
            } else {
                nsb.this.W.b(0);
            }
        }
    };
    private nsc Y;
    public a a;
    public gnj b;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
    }

    public static nsb c() {
        Bundle bundle = new Bundle();
        nsb nsb = new nsb();
        nsb.g(bundle);
        return nsb;
    }

    private static void a(ViewPager viewPager, final View... viewArr) {
        viewPager.a((sa) new sa() {
            public final boolean a(View view, Object obj) {
                return view == obj;
            }

            public final int b() {
                return viewArr.length;
            }

            public final Object a(ViewGroup viewGroup, int i) {
                View view = viewArr[i];
                if (view.getParent() != viewGroup) {
                    viewGroup.addView(view);
                }
                return view;
            }

            public final void a(ViewGroup viewGroup, int i, Object obj) {
                viewGroup.removeView(viewArr[i]);
            }
        });
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ka p = p();
        if (p != null) {
            this.Y = (nsc) new lu(ar_(), a.a(lv.a(p))).a(nsc.class);
            this.Y.a.a(this, new $$Lambda$nsb$bpP40ql_CuqEDe3kjV8F014VbiM(this));
            if (bundle != null) {
                gcz.a(t(), (a) this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.b.f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.a(cVar.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0076, code lost:
        if ("HK".equals(r13.getCountry()) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0089, code lost:
        if ("TW".equals(r13.getCountry()) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        if (defpackage.nsd.a(r14, "en") == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c7, code lost:
        if (r10 == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d1, code lost:
        switch(defpackage.nsd.AnonymousClass1.a[r7.ordinal()]) {
            case 1: goto L_0x01d6;
            case 2: goto L_0x01b6;
            case 3: goto L_0x0196;
            case 4: goto L_0x0176;
            case 5: goto L_0x0156;
            case 6: goto L_0x0136;
            case 7: goto L_0x0116;
            case 8: goto L_0x00f6;
            case 9: goto L_0x00d6;
            default: goto L_0x00d4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d6, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_hk_1));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_hk_2));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_hk_3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f6, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_tw_1));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_tw_2));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_tw_3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0116, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_vn_1));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_vn_2));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_vn_3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0136, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_th_1));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_th_2));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_th_3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0156, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_id_1));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_id_2));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_id_3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0176, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_ph_1));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_ph_2));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_ph_3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0196, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_jp_1));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_jp_2));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_jp_3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01b6, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_br_1));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_br_2));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_br_3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01d6, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_de_1));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_de_2));
        r12.add(r6.getString(com.spotify.music.R.string.local_value_prop_de_3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01f6, code lost:
        r12.add(r6.getString(com.spotify.music.R.string.login_value_prop_millions_of_songs_free));
        r12.add(r6.getString(com.spotify.music.R.string.login_value_prop_listen_to_artists));
        r12.add(r6.getString(com.spotify.music.R.string.login_value_prop_discover));
        r5 = r5.d;
        r8 = com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier.START;
        r9 = com.spotify.music.spotlets.tracker.identifier.EventIdentifier.LOCAL_VALUE_PROP_LANGUAGE_MISMATCH;
        r10 = new java.lang.StringBuilder();
        r10.append(r7.name());
        r10.append('/');
        r10.append(defpackage.jrq.a(r6));
        r5.a(r8, r9, r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0064, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 0
            r4 = 2131624252(0x7f0e013c, float:1.8875678E38)
            android.view.View r4 = r1.inflate(r4, r2, r3)
            r5 = 2131430875(0x7f0b0ddb, float:1.8483463E38)
            android.view.View r5 = r4.findViewById(r5)
            androidx.viewpager.widget.ViewPager r5 = (androidx.viewpager.widget.ViewPager) r5
            r0.W = r5
            nsd r5 = r0.T
            android.content.Context r6 = r17.o()
            com.spotify.libs.pse.PreSignupExperimentHelper$LocalValuePropVariant r7 = r5.c
            r8 = 2131952944(0x7f130530, float:1.9542345E38)
            r9 = 2131952946(0x7f130532, float:1.954235E38)
            r11 = 2131952947(0x7f130533, float:1.9542351E38)
            if (r7 == 0) goto L_0x0231
            com.spotify.libs.pse.PreSignupExperimentHelper$LocalValuePropVariant r7 = r5.c
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 5
            r12.<init>(r13)
            com.spotify.libs.pse.PreSignupExperimentHelper$LocalValuePropVariant r13 = com.spotify.libs.pse.PreSignupExperimentHelper.LocalValuePropVariant.CONTROL
            if (r7 != r13) goto L_0x004f
            java.lang.String r5 = r6.getString(r11)
            r12.add(r5)
            java.lang.String r5 = r6.getString(r9)
            r12.add(r5)
            java.lang.String r5 = r6.getString(r8)
            r12.add(r5)
            goto L_0x028e
        L_0x004f:
            java.util.Locale r13 = defpackage.jrq.a(r6)
            java.lang.String r14 = r13.getLanguage()
            int[] r15 = defpackage.nsd.AnonymousClass1.a
            int r16 = r7.ordinal()
            r15 = r15[r16]
            java.lang.String r10 = "zh"
            switch(r15) {
                case 1: goto L_0x00c1;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b3;
                case 4: goto L_0x00a1;
                case 5: goto L_0x009a;
                case 6: goto L_0x0093;
                case 7: goto L_0x008c;
                case 8: goto L_0x0079;
                case 9: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            r10 = 0
            goto L_0x00c7
        L_0x0066:
            boolean r10 = defpackage.nsd.a(r14, r10)
            if (r10 == 0) goto L_0x0064
            java.lang.String r10 = r13.getCountry()
            java.lang.String r13 = "HK"
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L_0x0064
            goto L_0x00b1
        L_0x0079:
            boolean r10 = defpackage.nsd.a(r14, r10)
            if (r10 == 0) goto L_0x0064
            java.lang.String r10 = r13.getCountry()
            java.lang.String r13 = "TW"
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L_0x0064
            goto L_0x00b1
        L_0x008c:
            java.lang.String r10 = "vi"
            boolean r10 = defpackage.nsd.a(r14, r10)
            goto L_0x00c7
        L_0x0093:
            java.lang.String r10 = "th"
            boolean r10 = defpackage.nsd.a(r14, r10)
            goto L_0x00c7
        L_0x009a:
            java.lang.String r10 = "id"
            boolean r10 = defpackage.nsd.a(r14, r10)
            goto L_0x00c7
        L_0x00a1:
            java.lang.String r10 = "tl"
            boolean r10 = defpackage.nsd.a(r14, r10)
            if (r10 != 0) goto L_0x00b1
            java.lang.String r10 = "en"
            boolean r10 = defpackage.nsd.a(r14, r10)
            if (r10 == 0) goto L_0x0064
        L_0x00b1:
            r10 = 1
            goto L_0x00c7
        L_0x00b3:
            java.lang.String r10 = "ja"
            boolean r10 = defpackage.nsd.a(r14, r10)
            goto L_0x00c7
        L_0x00ba:
            java.lang.String r10 = "pt"
            boolean r10 = defpackage.nsd.a(r14, r10)
            goto L_0x00c7
        L_0x00c1:
            java.lang.String r10 = "de"
            boolean r10 = defpackage.nsd.a(r14, r10)
        L_0x00c7:
            if (r10 == 0) goto L_0x01f6
            int[] r5 = defpackage.nsd.AnonymousClass1.a
            int r7 = r7.ordinal()
            r5 = r5[r7]
            switch(r5) {
                case 1: goto L_0x01d6;
                case 2: goto L_0x01b6;
                case 3: goto L_0x0196;
                case 4: goto L_0x0176;
                case 5: goto L_0x0156;
                case 6: goto L_0x0136;
                case 7: goto L_0x0116;
                case 8: goto L_0x00f6;
                case 9: goto L_0x00d6;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            goto L_0x028e
        L_0x00d6:
            r5 = 2131952903(0x7f130507, float:1.9542262E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952904(0x7f130508, float:1.9542264E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952905(0x7f130509, float:1.9542266E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x00f6:
            r5 = 2131952918(0x7f130516, float:1.9542292E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952919(0x7f130517, float:1.9542294E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952920(0x7f130518, float:1.9542296E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0116:
            r5 = 2131952921(0x7f130519, float:1.9542298E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952922(0x7f13051a, float:1.95423E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952923(0x7f13051b, float:1.9542302E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0136:
            r5 = 2131952915(0x7f130513, float:1.9542286E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952916(0x7f130514, float:1.9542288E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952917(0x7f130515, float:1.954229E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0156:
            r5 = 2131952906(0x7f13050a, float:1.9542268E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952907(0x7f13050b, float:1.954227E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952908(0x7f13050c, float:1.9542272E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0176:
            r5 = 2131952912(0x7f130510, float:1.954228E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952913(0x7f130511, float:1.9542282E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952914(0x7f130512, float:1.9542284E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0196:
            r5 = 2131952909(0x7f13050d, float:1.9542274E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952910(0x7f13050e, float:1.9542276E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952911(0x7f13050f, float:1.9542278E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x01b6:
            r5 = 2131952897(0x7f130501, float:1.954225E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952898(0x7f130502, float:1.9542252E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952899(0x7f130503, float:1.9542254E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x01d6:
            r5 = 2131952900(0x7f130504, float:1.9542256E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952901(0x7f130505, float:1.9542258E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952902(0x7f130506, float:1.954226E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x01f6:
            java.lang.String r10 = r6.getString(r11)
            r12.add(r10)
            java.lang.String r9 = r6.getString(r9)
            r12.add(r9)
            java.lang.String r8 = r6.getString(r8)
            r12.add(r8)
            ujc r5 = r5.d
            com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier r8 = com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier.START
            com.spotify.music.spotlets.tracker.identifier.EventIdentifier r9 = com.spotify.music.spotlets.tracker.identifier.EventIdentifier.LOCAL_VALUE_PROP_LANGUAGE_MISMATCH
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r7 = r7.name()
            r10.append(r7)
            r7 = 47
            r10.append(r7)
            java.util.Locale r6 = defpackage.jrq.a(r6)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r5.a(r8, r9, r6)
            goto L_0x028e
        L_0x0231:
            java.util.ArrayList r12 = new java.util.ArrayList
            r7 = 3
            r12.<init>(r7)
            boolean r10 = r5.a
            if (r10 == 0) goto L_0x0287
            int r5 = r5.b
            r10 = 2
            if (r5 == r10) goto L_0x026e
            if (r5 == r7) goto L_0x0258
            java.lang.String r5 = r6.getString(r11)
            r12.add(r5)
            java.lang.String r5 = r6.getString(r9)
            r12.add(r5)
            java.lang.String r5 = r6.getString(r8)
            r12.add(r5)
            goto L_0x028e
        L_0x0258:
            java.lang.String r5 = r6.getString(r9)
            r12.add(r5)
            java.lang.String r5 = r6.getString(r11)
            r12.add(r5)
            java.lang.String r5 = r6.getString(r8)
            r12.add(r5)
            goto L_0x028e
        L_0x026e:
            java.lang.String r5 = r6.getString(r11)
            r12.add(r5)
            r5 = 2131952945(0x7f130531, float:1.9542347E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            java.lang.String r5 = r6.getString(r9)
            r12.add(r5)
            goto L_0x028e
        L_0x0287:
            java.lang.String r5 = r6.getString(r11)
            r12.add(r5)
        L_0x028e:
            int r5 = r12.size()
            android.view.View[] r5 = new android.view.View[r5]
            r6 = 0
        L_0x0295:
            int r7 = r12.size()
            if (r6 >= r7) goto L_0x02b9
            r7 = 2131624737(0x7f0e0321, float:1.8876662E38)
            android.view.View r7 = r1.inflate(r7, r2, r3)
            java.lang.Object r8 = r12.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            r9 = 2131430874(0x7f0b0dda, float:1.8483461E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setText(r8)
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0295
        L_0x02b9:
            int r1 = r12.size()
            r2 = 2131430081(0x7f0b0ac1, float:1.8481853E38)
            r6 = 1
            if (r1 <= r6) goto L_0x02db
            androidx.viewpager.widget.ViewPager r1 = r0.W
            a(r1, r5)
            android.view.View r1 = r4.findViewById(r2)
            com.spotify.paste.widgets.ViewPagerIndicator r1 = (com.spotify.paste.widgets.ViewPagerIndicator) r1
            androidx.viewpager.widget.ViewPager r2 = r0.W
            r1.a(r2)
            nsb$3 r2 = new nsb$3
            r2.<init>()
            r1.a = r2
            goto L_0x02f2
        L_0x02db:
            androidx.viewpager.widget.ViewPager r1 = r0.W
            r6 = 1
            android.view.View[] r6 = new android.view.View[r6]
            r5 = r5[r3]
            r6[r3] = r5
            a(r1, r6)
            android.view.View r1 = r4.findViewById(r2)
            com.spotify.paste.widgets.ViewPagerIndicator r1 = (com.spotify.paste.widgets.ViewPagerIndicator) r1
            r2 = 8
            r1.setVisibility(r2)
        L_0x02f2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsb.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void z() {
        super.z();
        e();
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.U && this.W != null) {
            this.V.removeCallbacks(this.X);
            this.V.postDelayed(this.X, 4000);
        }
    }

    public final void A() {
        super.A();
        if (this.U && this.W != null) {
            this.V.removeCallbacks(this.X);
        }
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        view.findViewById(R.id.button_signup).setOnClickListener(new $$Lambda$nsb$MVSBjdcvqqp0P2bGB3azPevpVU(this));
        view.findViewById(R.id.button_signup).setOnClickListener(new $$Lambda$nsb$Aofb9o2wWWB6EYvNKHmnZhpQXio(this));
        view.findViewById(R.id.button_facebook).setOnClickListener(new $$Lambda$nsb$WE3LKpe_nXvIfNsGGhwfjllKhiU(this));
        view.findViewById(R.id.button_login).setOnClickListener(new $$Lambda$nsb$BZb0Bc7ewc6BzZljibwFFPo0pgY(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        vke.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.a.c();
        vke.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.b();
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.Y.a.b(new nsa(vke.a(i, i2, intent)));
    }

    public final void a() {
        this.b.d();
    }

    /* access modifiers changed from: private */
    public void a(nsa<vkc> nsa) {
        T t;
        if (nsa.b) {
            t = null;
        } else {
            nsa.b = true;
            t = nsa.a;
        }
        vkc vkc = (vkc) t;
        if (vkc != null) {
            vkc.a(new $$Lambda$nsb$9HnmBDH2HIhCAx9mTXUAN1nozM(this), $$Lambda$nsb$L9zOZpxPt0nq0Vj2vwvKxiyDimU.INSTANCE, new $$Lambda$nsb$D2cMifAIm1Xw6L0sMOkZVCQ9uc(this), $$Lambda$nsb$iqK1G4vEgArVM2b07Sgc20PImb8.INSTANCE);
        }
    }

    public void b(String str) {
        if (this.t != null) {
            gcz.a((kf) this.t, str, (a) this);
        }
    }
}
