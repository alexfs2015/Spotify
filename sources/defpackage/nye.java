package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.R;

/* renamed from: nye reason: default package */
public class nye extends jrd implements a, nyi {
    public nyg T;
    public boolean U;
    private final Handler V = new Handler();
    /* access modifiers changed from: private */
    public ViewPager W;
    private final Runnable X = new Runnable() {
        public final void run() {
            if (nye.this.W.c < ((sf) fbp.a(nye.this.W.b)).b() - 1) {
                nye.this.W.b(nye.this.W.c + 1);
            } else {
                nye.this.W.b(0);
            }
        }
    };
    private nyf Y;
    public a a;
    public goy b;

    private static void a(ViewPager viewPager, final View... viewArr) {
        viewPager.a((sf) new sf() {
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

            public final boolean a(View view, Object obj) {
                return view == obj;
            }

            public final int b() {
                return viewArr.length;
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(nyd<vxi> nyd) {
        T t;
        if (nyd.b) {
            t = null;
        } else {
            nyd.b = true;
            t = nyd.a;
        }
        vxi vxi = (vxi) t;
        if (vxi != null) {
            vxi.a(new $$Lambda$nye$6utbQnPqEyT4c7m7mpYUY0Pshkw(this), $$Lambda$nye$wyQPo4mCxBH8nCs_XQI_Rtrhew.INSTANCE, new $$Lambda$nye$mZ4o1DoDvnNh4VchLMZ5UoERsB4(this), $$Lambda$nye$Obzcvxy6qtNJ4A_fQotPa1a3s.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.b.e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.a(cVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.b();
    }

    public static nye c() {
        Bundle bundle = new Bundle();
        nye nye = new nye();
        nye.g(bundle);
        return nye;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.a.c();
        vxk.a(this);
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.U && this.W != null) {
            this.V.removeCallbacks(this.X);
            this.V.postDelayed(this.X, 4000);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        vxk.a(this);
    }

    public final void A() {
        super.A();
        if (this.U && this.W != null) {
            this.V.removeCallbacks(this.X);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0076, code lost:
        if ("HK".equals(r13.getCountry()) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0089, code lost:
        if ("TW".equals(r13.getCountry()) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        if (defpackage.nyg.a(r14, "en") == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c7, code lost:
        if (r10 == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d1, code lost:
        switch(defpackage.nyg.AnonymousClass1.a[r7.ordinal()]) {
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
        r10.append(defpackage.jua.a(r6));
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
            r5 = 2131430882(0x7f0b0de2, float:1.8483478E38)
            android.view.View r5 = r4.findViewById(r5)
            androidx.viewpager.widget.ViewPager r5 = (androidx.viewpager.widget.ViewPager) r5
            r0.W = r5
            nyg r5 = r0.T
            android.content.Context r6 = r17.o()
            com.spotify.libs.pse.PreSignupExperimentHelper$LocalValuePropVariant r7 = r5.c
            r8 = 2131952954(0x7f13053a, float:1.9542365E38)
            r9 = 2131952956(0x7f13053c, float:1.954237E38)
            r11 = 2131952957(0x7f13053d, float:1.9542371E38)
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
            java.util.Locale r13 = defpackage.jua.a(r6)
            java.lang.String r14 = r13.getLanguage()
            int[] r15 = defpackage.nyg.AnonymousClass1.a
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
            boolean r10 = defpackage.nyg.a(r14, r10)
            if (r10 == 0) goto L_0x0064
            java.lang.String r10 = r13.getCountry()
            java.lang.String r13 = "HK"
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L_0x0064
            goto L_0x00b1
        L_0x0079:
            boolean r10 = defpackage.nyg.a(r14, r10)
            if (r10 == 0) goto L_0x0064
            java.lang.String r10 = r13.getCountry()
            java.lang.String r13 = "TW"
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L_0x0064
            goto L_0x00b1
        L_0x008c:
            java.lang.String r10 = "vi"
            boolean r10 = defpackage.nyg.a(r14, r10)
            goto L_0x00c7
        L_0x0093:
            java.lang.String r10 = "th"
            boolean r10 = defpackage.nyg.a(r14, r10)
            goto L_0x00c7
        L_0x009a:
            java.lang.String r10 = "id"
            boolean r10 = defpackage.nyg.a(r14, r10)
            goto L_0x00c7
        L_0x00a1:
            java.lang.String r10 = "tl"
            boolean r10 = defpackage.nyg.a(r14, r10)
            if (r10 != 0) goto L_0x00b1
            java.lang.String r10 = "en"
            boolean r10 = defpackage.nyg.a(r14, r10)
            if (r10 == 0) goto L_0x0064
        L_0x00b1:
            r10 = 1
            goto L_0x00c7
        L_0x00b3:
            java.lang.String r10 = "ja"
            boolean r10 = defpackage.nyg.a(r14, r10)
            goto L_0x00c7
        L_0x00ba:
            java.lang.String r10 = "pt"
            boolean r10 = defpackage.nyg.a(r14, r10)
            goto L_0x00c7
        L_0x00c1:
            java.lang.String r10 = "de"
            boolean r10 = defpackage.nyg.a(r14, r10)
        L_0x00c7:
            if (r10 == 0) goto L_0x01f6
            int[] r5 = defpackage.nyg.AnonymousClass1.a
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
            r5 = 2131952913(0x7f130511, float:1.9542282E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952914(0x7f130512, float:1.9542284E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952915(0x7f130513, float:1.9542286E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x00f6:
            r5 = 2131952928(0x7f130520, float:1.9542313E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952929(0x7f130521, float:1.9542315E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952930(0x7f130522, float:1.9542317E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0116:
            r5 = 2131952931(0x7f130523, float:1.9542319E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952932(0x7f130524, float:1.954232E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952933(0x7f130525, float:1.9542323E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0136:
            r5 = 2131952925(0x7f13051d, float:1.9542307E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952926(0x7f13051e, float:1.9542309E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952927(0x7f13051f, float:1.954231E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0156:
            r5 = 2131952916(0x7f130514, float:1.9542288E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952917(0x7f130515, float:1.954229E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952918(0x7f130516, float:1.9542292E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0176:
            r5 = 2131952922(0x7f13051a, float:1.95423E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952923(0x7f13051b, float:1.9542302E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952924(0x7f13051c, float:1.9542304E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x0196:
            r5 = 2131952919(0x7f130517, float:1.9542294E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952920(0x7f130518, float:1.9542296E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952921(0x7f130519, float:1.9542298E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x01b6:
            r5 = 2131952907(0x7f13050b, float:1.954227E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952908(0x7f13050c, float:1.9542272E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952909(0x7f13050d, float:1.9542274E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            goto L_0x028e
        L_0x01d6:
            r5 = 2131952910(0x7f13050e, float:1.9542276E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952911(0x7f13050f, float:1.9542278E38)
            java.lang.String r5 = r6.getString(r5)
            r12.add(r5)
            r5 = 2131952912(0x7f130510, float:1.954228E38)
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
            uun r5 = r5.d
            com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier r8 = com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier.START
            com.spotify.music.spotlets.tracker.identifier.EventIdentifier r9 = com.spotify.music.spotlets.tracker.identifier.EventIdentifier.LOCAL_VALUE_PROP_LANGUAGE_MISMATCH
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r7 = r7.name()
            r10.append(r7)
            r7 = 47
            r10.append(r7)
            java.util.Locale r6 = defpackage.jua.a(r6)
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
            r5 = 2131952955(0x7f13053b, float:1.9542367E38)
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
            r7 = 2131624734(0x7f0e031e, float:1.8876656E38)
            android.view.View r7 = r1.inflate(r7, r2, r3)
            java.lang.Object r8 = r12.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            r9 = 2131430881(0x7f0b0de1, float:1.8483475E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setText(r8)
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0295
        L_0x02b9:
            int r1 = r12.size()
            r2 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            r6 = 1
            if (r1 <= r6) goto L_0x02db
            androidx.viewpager.widget.ViewPager r1 = r0.W
            a(r1, r5)
            android.view.View r1 = r4.findViewById(r2)
            com.spotify.paste.widgets.ViewPagerIndicator r1 = (com.spotify.paste.widgets.ViewPagerIndicator) r1
            androidx.viewpager.widget.ViewPager r2 = r0.W
            r1.a(r2)
            nye$3 r2 = new nye$3
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nye.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void a() {
        this.b.d();
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.Y.a.b(new nyd(vxk.a(i, i2, intent)));
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        view.findViewById(R.id.button_signup).setOnClickListener(new $$Lambda$nye$FbvIBrQ7EDwkqlrhykTPsvk57I(this));
        view.findViewById(R.id.button_signup).setOnClickListener(new $$Lambda$nye$XD8OO8BIyCFNgwDMDk2ek0z2V0(this));
        view.findViewById(R.id.button_facebook).setOnClickListener(new $$Lambda$nye$HwbCOnLf7SN8xrhsKq8RdfepAY(this));
        view.findViewById(R.id.button_login).setOnClickListener(new $$Lambda$nye$NZo6ush3NTb_QJhkSkPNSoJHts(this));
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        kf p = p();
        if (p != null) {
            this.Y = (nyf) new lz(aq_(), a.a(ma.a(p))).a(nyf.class);
            this.Y.a.a(this, new $$Lambda$nye$V2Aas4O7wcAzzglcIQdBluMTSVo(this));
            if (bundle != null) {
                gek.a(t(), (a) this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    public void b(String str) {
        if (this.t != null) {
            gek.a((kk) this.t, str, (a) this);
        }
    }

    public final void z() {
        super.z();
        e();
    }
}
