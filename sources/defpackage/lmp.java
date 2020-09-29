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

/* renamed from: lmp reason: default package */
public class lmp extends jor implements jol, b, lmx, lmy, lnp, a, udv {
    public boolean T;
    public lmz U;
    private lnb V;
    private uwh W;
    private RecyclerView X;
    private LoadingView Y;
    private Parcelable Z;
    public lnc a;
    private Button aa;
    public lmt b;

    public final Fragment ae() {
        return this;
    }

    public final String b(Context context) {
        return "";
    }

    public static lmp a(String str, fpt fpt) {
        lmp lmp = new lmp();
        fpu.a((Fragment) lmp, fpt);
        ((Bundle) fay.a(lmp.i)).putString("folder_uri", str);
        return lmp;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [lnb] */
    /* JADX WARNING: type inference failed for: r17v0, types: [lnd] */
    /* JADX WARNING: type inference failed for: r16v0, types: [lnf] */
    /* JADX WARNING: type inference failed for: r17v3, types: [lnd] */
    /* JADX WARNING: type inference failed for: r16v1, types: [lnf] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v3, types: [lnd]
      assigns: [lnd, lnf]
      uses: [lnd, lnb, lnf]
      mth insns count: 244
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
            java.lang.Object r2 = defpackage.fay.a(r2)
            android.content.Context r2 = (android.content.Context) r2
            lnc r3 = r0.a
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
            lng r3 = r3.b
            lnf r4 = new lnf
            wlc<lnp> r7 = r3.a
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r6)
            r17 = r7
            lnp r17 = (defpackage.lnp) r17
            wlc<uxc> r7 = r3.b
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r14)
            r18 = r7
            uxc r18 = (defpackage.uxc) r18
            wlc<uxh> r7 = r3.c
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r13)
            r19 = r7
            uxh r19 = (defpackage.uxh) r19
            wlc<uxn> r7 = r3.d
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r5)
            r20 = r7
            uxn r20 = (defpackage.uxn) r20
            wlc<com.spotify.music.features.addtoplaylist.AddToPlaylistLogger> r7 = r3.e
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r12)
            r21 = r7
            com.spotify.music.features.addtoplaylist.AddToPlaylistLogger r21 = (com.spotify.music.features.addtoplaylist.AddToPlaylistLogger) r21
            wlc<io.reactivex.Scheduler> r7 = r3.f
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r11)
            r22 = r7
            io.reactivex.Scheduler r22 = (io.reactivex.Scheduler) r22
            wlc<hbj> r7 = r3.g
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r10)
            r23 = r7
            hbj r23 = (defpackage.hbj) r23
            wlc<hbc> r7 = r3.h
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r15)
            r24 = r7
            hbc r24 = (defpackage.hbc) r24
            wlc<lmy> r7 = r3.i
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r9)
            r25 = r7
            lmy r25 = (defpackage.lmy) r25
            wlc<lmx> r7 = r3.j
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lng.a(r7, r8)
            r26 = r7
            lmx r26 = (defpackage.lmx) r26
            wlc<lmz> r7 = r3.k
            java.lang.Object r7 = r7.get()
            r8 = 11
            java.lang.Object r7 = defpackage.lng.a(r7, r8)
            r27 = r7
            lmz r27 = (defpackage.lmz) r27
            wlc<lnk> r7 = r3.l
            java.lang.Object r7 = r7.get()
            r8 = 12
            java.lang.Object r7 = defpackage.lng.a(r7, r8)
            r28 = r7
            lnk r28 = (defpackage.lnk) r28
            wlc<lnm> r3 = r3.m
            java.lang.Object r3 = r3.get()
            r7 = 13
            java.lang.Object r3 = defpackage.lng.a(r3, r7)
            r29 = r3
            lnm r29 = (defpackage.lnm) r29
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x01b1
        L_0x00ec:
            lne r3 = r3.a
            lnd r4 = new lnd
            wlc<lnp> r7 = r3.a
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r6)
            r18 = r7
            lnp r18 = (defpackage.lnp) r18
            wlc<uxc> r7 = r3.b
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r14)
            r19 = r7
            uxc r19 = (defpackage.uxc) r19
            wlc<uxh> r7 = r3.c
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r13)
            r20 = r7
            uxh r20 = (defpackage.uxh) r20
            wlc<uxn> r7 = r3.d
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r5)
            r21 = r7
            uxn r21 = (defpackage.uxn) r21
            wlc<com.spotify.music.features.addtoplaylist.AddToPlaylistLogger> r7 = r3.e
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r12)
            r22 = r7
            com.spotify.music.features.addtoplaylist.AddToPlaylistLogger r22 = (com.spotify.music.features.addtoplaylist.AddToPlaylistLogger) r22
            wlc<io.reactivex.Scheduler> r7 = r3.f
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r11)
            r23 = r7
            io.reactivex.Scheduler r23 = (io.reactivex.Scheduler) r23
            wlc<hbj> r7 = r3.g
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r10)
            r24 = r7
            hbj r24 = (defpackage.hbj) r24
            wlc<hbc> r7 = r3.h
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r15)
            r25 = r7
            hbc r25 = (defpackage.hbc) r25
            wlc<lmy> r7 = r3.i
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r9)
            r26 = r7
            lmy r26 = (defpackage.lmy) r26
            wlc<lmz> r7 = r3.j
            java.lang.Object r7 = r7.get()
            java.lang.Object r7 = defpackage.lne.a(r7, r8)
            r27 = r7
            lmz r27 = (defpackage.lmz) r27
            wlc<lmx> r7 = r3.k
            java.lang.Object r7 = r7.get()
            r8 = 11
            java.lang.Object r7 = defpackage.lne.a(r7, r8)
            r28 = r7
            lmx r28 = (defpackage.lmx) r28
            wlc<lnk> r7 = r3.l
            java.lang.Object r7 = r7.get()
            r8 = 12
            java.lang.Object r7 = defpackage.lne.a(r7, r8)
            r29 = r7
            lnk r29 = (defpackage.lnk) r29
            wlc<lnm> r3 = r3.m
            java.lang.Object r3 = r3.get()
            r7 = 13
            java.lang.Object r3 = defpackage.lne.a(r3, r7)
            r30 = r3
            lnm r30 = (defpackage.lnm) r30
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
            r10 = 2131430281(0x7f0b0b89, float:1.8482259E38)
            r9.setId(r10)
            androidx.recyclerview.widget.RecyclerView r9 = r0.X
            r9.setLayoutParams(r8)
            r4.setOrientation(r6)
            r4.setLayoutParams(r8)
            androidx.recyclerview.widget.RecyclerView r8 = r0.X
            r4.addView(r8)
            r4.setVisibility(r5)
            r3.addView(r4)
            uwh r5 = new uwh
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
            defpackage.fzz.a()
            android.widget.Button r8 = defpackage.fzz.a.a(r2)
            r0.aa = r8
            goto L_0x021a
        L_0x0214:
            android.widget.Button r8 = defpackage.fzz.c(r2)
            r0.aa = r8
        L_0x021a:
            r5.setOrientation(r6)
            r8 = 17
            r5.setGravity(r8)
            android.widget.Button r8 = r0.aa
            r9 = 0
            r10 = 16842824(0x1010048, float:2.369376E-38)
            android.graphics.Typeface r9 = defpackage.utw.a(r2, r9, r10)
            r8.setTypeface(r9)
            android.widget.Button r8 = r0.aa
            r9 = 2131427448(0x7f0b0078, float:1.8476513E38)
            r8.setId(r9)
            android.widget.Button r8 = r0.aa
            r9 = 2131951666(0x7f130032, float:1.9539753E38)
            java.lang.String r9 = r0.a(r9)
            r8.setText(r9)
            android.widget.Button r8 = r0.aa
            -$$Lambda$lmp$xHpQnQo4Qj9GfNrRNTxu_UAW7gE r9 = new -$$Lambda$lmp$xHpQnQo4Qj9GfNrRNTxu_UAW7gE
            r9.<init>(r0)
            r8.setOnClickListener(r9)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r10 = -2
            r8.<init>(r9, r10)
            r9 = 1103101952(0x41c00000, float:24.0)
            android.content.Context r10 = r31.o()
            android.content.res.Resources r10 = r10.getResources()
            int r9 = defpackage.uts.b(r9, r10)
            r8.topMargin = r9
            r9 = 1111490560(0x42400000, float:48.0)
            android.content.Context r10 = r31.o()
            android.content.res.Resources r10 = r10.getResources()
            int r9 = defpackage.uts.b(r9, r10)
            r8.bottomMargin = r9
            android.widget.Button r9 = r0.aa
            r5.addView(r9, r8)
            uwh r8 = r0.W
            jlu r9 = new jlu
            r9.<init>(r5, r6)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.a(r9, r5)
            uwh r5 = r0.W
            lmt r8 = r0.b
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
            defpackage.fqb.f()
            fuj r2 = defpackage.fum.a(r2, r3)
            r4 = 2131951676(0x7f13003c, float:1.9539773E38)
            java.lang.String r4 = r0.a(r4)
            r2.a(r4)
            r4 = 2131951675(0x7f13003b, float:1.9539771E38)
            java.lang.String r4 = r0.a(r4)
            r2.b(r4)
            uwh r4 = r0.W
            jlu r5 = new jlu
            android.view.View r2 = r2.getView()
            r5.<init>(r2)
            r4.a(r5, r8)
            uwh r2 = r0.W
            int[] r4 = new int[r6]
            r4[r8] = r8
            r2.a(r4)
            androidx.recyclerview.widget.RecyclerView r2 = r0.X
            uwh r4 = r0.W
            r2.a(r4)
            if (r1 == 0) goto L_0x0307
            java.lang.String r2 = "list"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            r0.Z = r1
        L_0x0307:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmp.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.V.a();
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

    public final void g() {
        super.g();
        this.V.b();
    }

    public final void h() {
        super.h();
        this.V.c();
    }

    public final void a(List<uyz> list) {
        lmt lmt = this.b;
        lmt.a = list;
        lmt.e();
        Parcelable parcelable = this.Z;
        if (parcelable != null) {
            this.X.post(new $$Lambda$lmp$c6SF_ioaelhBdc75sxf_FYoxJKc(this, parcelable));
            this.Z = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Parcelable parcelable) {
        i d = this.X.d();
        if (d != null) {
            d.a(parcelable);
        }
    }

    public final void a(String str, String str2, List<String> list) {
        String n = this.U.n();
        a(AddToPlaylistActivity.a((Context) fay.a(p()), str, str2, list, this.U.q(), n));
    }

    public final void ah() {
        this.W.a(true, 0);
    }

    public final void ai() {
        this.W.a(false, 0);
    }

    public final void a(boolean z) {
        if (z) {
            this.Y.c();
            this.Y.a();
            return;
        }
        this.Y.b();
    }

    public final void ak() {
        a(AddToPlaylistActivity.a((Context) fay.a(p())));
    }

    public final String e() {
        String al = al();
        return !fax.a(al) ? al : lmp.class.toString();
    }

    public final udr ag() {
        return udt.ab;
    }

    public final sih ae_() {
        return ViewUris.aM;
    }

    public final gjf aj() {
        return PageIdentifiers.PLAYLIST_ADDTOPLAYLIST;
    }

    public final void a(uyz uyz, int i) {
        this.V.a(uyz, i);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PLAYLIST_ADDTOPLAYLIST, ViewUris.aM.toString());
    }

    public final String al() {
        return ((Bundle) fay.a(this.i)).getString("folder_uri");
    }

    public final List<String> am() {
        return (List) fav.a((ArrayList) fay.a(((Bundle) fay.a(this.i)).getStringArrayList("item_uris")), new ArrayList(0));
    }
}
