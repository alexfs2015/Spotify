package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.addtoplaylist.AddToPlaylistActivity;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lqp reason: default package */
public class lqp extends jrd implements jqx, b, lqx, lqy, lrp, a, uqq {
    public boolean T;
    public lqz U;
    private lrb V;
    private vhx W;
    private RecyclerView X;
    private LoadingView Y;
    private Parcelable Z;
    public lrc a;
    private Button aa;
    public lqt b;

    public static lqp a(String str, fqn fqn) {
        lqp lqp = new lqp();
        fqo.a((Fragment) lqp, fqn);
        ((Bundle) fbp.a(lqp.i)).putString("folder_uri", str);
        return lqp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable) {
        i d = this.X.d();
        if (d != null) {
            d.a(parcelable);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.V.a();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [lrb] */
    /* JADX WARNING: type inference failed for: r17v0, types: [lrd] */
    /* JADX WARNING: type inference failed for: r16v0, types: [lrf] */
    /* JADX WARNING: type inference failed for: r17v3, types: [lrd] */
    /* JADX WARNING: type inference failed for: r16v1, types: [lrf] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v3, types: [lrd]
      assigns: [lrd, lrf]
      uses: [lrd, lrb, lrf]
      mth insns count: 241
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.LayoutInflater r32, android.view.ViewGroup r33, android.os.Bundle r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r34
            android.content.Context r2 = r31.n()
            java.lang.Object r2 = defpackage.fbp.a(r2)
            android.content.Context r2 = (android.content.Context) r2
            lrc r3 = r0.a
            java.lang.Boolean r4 = r3.c
            boolean r4 = r4.booleanValue()
            r8 = 10
            r9 = 9
            r10 = 7
            r11 = 6
            r12 = 5
            r13 = 3
            r14 = 2
            r15 = 8
            r5 = 4
            r6 = 1
            if (r4 == 0) goto L_0x00ec
            lrg r3 = r3.b
            lrf r4 = new lrf
            wzi<lrp> r7 = r3.a
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r6)
            r17 = r7
            lrp r17 = (defpackage.lrp) r17
            wzi<vje> r7 = r3.b
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r14)
            r18 = r7
            vje r18 = (defpackage.vje) r18
            wzi<vjj> r7 = r3.c
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r13)
            r19 = r7
            vjj r19 = (defpackage.vjj) r19
            wzi<vjp> r7 = r3.d
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r5)
            r20 = r7
            vjp r20 = (defpackage.vjp) r20
            wzi<com.spotify.music.features.addtoplaylist.AddToPlaylistLogger> r7 = r3.e
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r12)
            r21 = r7
            com.spotify.music.features.addtoplaylist.AddToPlaylistLogger r21 = (com.spotify.music.features.addtoplaylist.AddToPlaylistLogger) r21
            wzi<io.reactivex.Scheduler> r7 = r3.f
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r11)
            r22 = r7
            io.reactivex.Scheduler r22 = (io.reactivex.Scheduler) r22
            wzi<hec> r7 = r3.g
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r10)
            r23 = r7
            hec r23 = (defpackage.hec) r23
            wzi<hdv> r7 = r3.h
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r15)
            r24 = r7
            hdv r24 = (defpackage.hdv) r24
            wzi<lqy> r7 = r3.i
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r9)
            r25 = r7
            lqy r25 = (defpackage.lqy) r25
            wzi<lqx> r7 = r3.j
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lrg.a(r7, r8)
            r26 = r7
            lqx r26 = (defpackage.lqx) r26
            wzi<lqz> r7 = r3.k
            java.lang.Object r7 = r7.get()
            r8 = 11
            java.lang.Object r7 = defpackage.lrg.a(r7, r8)
            r27 = r7
            lqz r27 = (defpackage.lqz) r27
            wzi<lrk> r7 = r3.l
            java.lang.Object r7 = r7.get()
            r8 = 12
            java.lang.Object r7 = defpackage.lrg.a(r7, r8)
            r28 = r7
            lrk r28 = (defpackage.lrk) r28
            wzi<lrm> r3 = r3.m
            java.lang.Object r3 = r3.get()
            r7 = 13
            java.lang.Object r3 = defpackage.lrg.a(r3, r7)
            r29 = r3
            lrm r29 = (defpackage.lrm) r29
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x01b1
        L_0x00ec:
            lre r3 = r3.a
            lrd r4 = new lrd
            wzi<lrp> r7 = r3.a
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r6)
            r18 = r7
            lrp r18 = (defpackage.lrp) r18
            wzi<vje> r7 = r3.b
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r14)
            r19 = r7
            vje r19 = (defpackage.vje) r19
            wzi<vjj> r7 = r3.c
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r13)
            r20 = r7
            vjj r20 = (defpackage.vjj) r20
            wzi<vjp> r7 = r3.d
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r5)
            r21 = r7
            vjp r21 = (defpackage.vjp) r21
            wzi<com.spotify.music.features.addtoplaylist.AddToPlaylistLogger> r7 = r3.e
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r12)
            r22 = r7
            com.spotify.music.features.addtoplaylist.AddToPlaylistLogger r22 = (com.spotify.music.features.addtoplaylist.AddToPlaylistLogger) r22
            wzi<io.reactivex.Scheduler> r7 = r3.f
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r11)
            r23 = r7
            io.reactivex.Scheduler r23 = (io.reactivex.Scheduler) r23
            wzi<hec> r7 = r3.g
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r10)
            r24 = r7
            hec r24 = (defpackage.hec) r24
            wzi<hdv> r7 = r3.h
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r15)
            r25 = r7
            hdv r25 = (defpackage.hdv) r25
            wzi<lqy> r7 = r3.i
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r9)
            r26 = r7
            lqy r26 = (defpackage.lqy) r26
            wzi<lqz> r7 = r3.j
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lre.a(r7, r8)
            r27 = r7
            lqz r27 = (defpackage.lqz) r27
            wzi<lqx> r7 = r3.k
            java.lang.Object r7 = r7.get()
            r8 = 11
            java.lang.Object r7 = defpackage.lre.a(r7, r8)
            r28 = r7
            lqx r28 = (defpackage.lqx) r28
            wzi<lrk> r7 = r3.l
            java.lang.Object r7 = r7.get()
            r8 = 12
            java.lang.Object r7 = defpackage.lre.a(r7, r8)
            r29 = r7
            lrk r29 = (defpackage.lrk) r29
            wzi<lrm> r3 = r3.m
            java.lang.Object r3 = r3.get()
            r7 = 13
            java.lang.Object r3 = defpackage.lre.a(r3, r7)
            r30 = r3
            lrm r30 = (defpackage.lrm) r30
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x01b1:
            r0.V = r4
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            r3.<init>(r2)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r7 = -1
            r4.<init>(r7, r7)
            r3.setLayoutParams(r4)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r2)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r7, r7)
            androidx.recyclerview.widget.RecyclerView r9 = new androidx.recyclerview.widget.RecyclerView
            r9.<init>(r2)
            r0.X = r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.X
            r10 = 2131430271(0x7f0b0b7f, float:1.8482238E38)
            r9.setId(r10)
            androidx.recyclerview.widget.RecyclerView r9 = r0.X
            r9.setLayoutParams(r8)
            r4.setOrientation(r6)
            r4.setLayoutParams(r8)
            androidx.recyclerview.widget.RecyclerView r8 = r0.X
            r4.addView(r8)
            r4.setVisibility(r5)
            r3.addView(r4)
            vhx r5 = new vhx
            r5.<init>()
            r0.W = r5
            androidx.recyclerview.widget.RecyclerView r5 = r0.X
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            r8.<init>(r2)
            r5.a(r8)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r2)
            boolean r8 = r0.T
            if (r8 == 0) goto L_0x0214
            defpackage.gat.a()
            android.widget.Button r8 = defpackage.gat.a.a(r2)
            r0.aa = r8
            goto L_0x021a
        L_0x0214:
            android.widget.Button r8 = defpackage.gat.c(r2)
            r0.aa = r8
        L_0x021a:
            r5.setOrientation(r6)
            r8 = 17
            r5.setGravity(r8)
            android.widget.Button r8 = r0.aa
            r9 = 2131427448(0x7f0b0078, float:1.8476513E38)
            r8.setId(r9)
            android.widget.Button r8 = r0.aa
            r9 = 2131951666(0x7f130032, float:1.9539753E38)
            java.lang.String r9 = r0.a(r9)
            r8.setText(r9)
            android.widget.Button r8 = r0.aa
            -$$Lambda$lqp$008Jz23S0TWo5Loa-ft3OH-Nmfg r9 = new -$$Lambda$lqp$008Jz23S0TWo5Loa-ft3OH-Nmfg
            r9.<init>(r0)
            r8.setOnClickListener(r9)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r10 = -2
            r8.<init>(r9, r10)
            r9 = 1103101952(0x41c00000, float:24.0)
            android.content.Context r10 = r31.o()
            android.content.res.Resources r10 = r10.getResources()
            int r9 = defpackage.vfj.b(r9, r10)
            r8.topMargin = r9
            r9 = 1111490560(0x42400000, float:48.0)
            android.content.Context r10 = r31.o()
            android.content.res.Resources r10 = r10.getResources()
            int r9 = defpackage.vfj.b(r9, r10)
            r8.bottomMargin = r9
            android.widget.Button r9 = r0.aa
            r5.addView(r9, r8)
            vhx r8 = r0.W
            jog r9 = new jog
            r9.<init>(r5, r6)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.a(r9, r5)
            vhx r5 = r0.W
            lqt r8 = r0.b
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.a(r8, r9)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r2)
            r5.setVisibility(r15)
            r8 = 2131099711(0x7f06003f, float:1.7811783E38)
            r5.setBackgroundResource(r8)
            r8 = 0
            r5.setEnabled(r8)
            r5.setClickable(r6)
            r3.addView(r5, r7, r7)
            android.content.Context r5 = r31.n()
            r7 = r32
            com.spotify.music.contentviewstate.view.LoadingView r4 = com.spotify.music.contentviewstate.view.LoadingView.a(r7, r5, r4)
            r0.Y = r4
            com.spotify.music.contentviewstate.view.LoadingView r4 = r0.Y
            r3.addView(r4)
            com.spotify.music.contentviewstate.view.LoadingView r4 = r0.Y
            r4.a(r8)
            com.spotify.music.contentviewstate.view.LoadingView r4 = r0.Y
            r5 = 2131099711(0x7f06003f, float:1.7811783E38)
            r4.setBackgroundResource(r5)
            defpackage.fqv.f()
            fvd r2 = defpackage.fvg.a(r2, r3)
            r4 = 2131951676(0x7f13003c, float:1.9539773E38)
            java.lang.String r4 = r0.a(r4)
            r2.a(r4)
            r4 = 2131951675(0x7f13003b, float:1.9539771E38)
            java.lang.String r4 = r0.a(r4)
            r2.b(r4)
            vhx r4 = r0.W
            jog r5 = new jog
            android.view.View r2 = r2.getView()
            r5.<init>(r2)
            r4.a(r5, r8)
            vhx r2 = r0.W
            int[] r4 = new int[r6]
            r4[r8] = r8
            r2.a(r4)
            androidx.recyclerview.widget.RecyclerView r2 = r0.X
            vhx r4 = r0.W
            r2.a(r4)
            if (r1 == 0) goto L_0x02fa
            java.lang.String r2 = "list"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            r0.Z = r1
        L_0x02fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqp.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void a(String str, String str2, List<String> list) {
        String n = this.U.n();
        a(AddToPlaylistActivity.a((Context) fbp.a(p()), str, str2, list, this.U.q(), n));
    }

    public final void a(List<vlc> list) {
        lqt lqt = this.b;
        lqt.a = list;
        lqt.e();
        Parcelable parcelable = this.Z;
        if (parcelable != null) {
            this.X.post(new $$Lambda$lqp$pDALDxAeeSfMIWo7JzNGZpVm_Yo(this, parcelable));
            this.Z = null;
        }
    }

    public final void a(vlc vlc, int i) {
        this.V.a(vlc, i);
    }

    public final void a(boolean z) {
        if (z) {
            this.Y.c();
            this.Y.a();
            return;
        }
        this.Y.b();
    }

    public final void aP_() {
        super.aP_();
        this.V.b();
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return ViewUris.aL;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PLAYLIST_ADDTOPLAYLIST, ViewUris.aL.toString());
    }

    public final uqm ag() {
        return uqo.ab;
    }

    public final void ah() {
        this.W.a(true, 0);
    }

    public final void ai() {
        this.W.a(false, 0);
    }

    public final gkq aj() {
        return PageIdentifiers.PLAYLIST_ADDTOPLAYLIST;
    }

    public final void ak() {
        a(AddToPlaylistActivity.a((Context) fbp.a(p())));
    }

    public final String al() {
        return ((Bundle) fbp.a(this.i)).getString("folder_uri");
    }

    public final List<String> am() {
        return (List) fbm.a((ArrayList) fbp.a(((Bundle) fbp.a(this.i)).getStringArrayList("item_uris")), new ArrayList(0));
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        String al = al();
        return !fbo.a(al) ? al : lqp.class.toString();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        RecyclerView recyclerView = this.X;
        if (recyclerView != null) {
            i d = recyclerView.d();
            if (d != null) {
                bundle.putParcelable("list", d.d());
            }
        }
    }

    public final void h() {
        super.h();
        this.V.c();
    }
}
