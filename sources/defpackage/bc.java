package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: bc reason: default package */
public class bc {
    protected View a;
    protected int b = 8388613;
    OnDismissListener c;
    private final Context d;
    private final ax e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private a j;
    private bb k;
    private final OnDismissListener l;

    public bc(Context context, ax axVar, View view, boolean z, int i2) {
        this(context, axVar, view, z, i2, 0);
    }

    public bc(Context context, ax axVar, View view, boolean z, int i2, int i3) {
        this.b = 8388611;
        this.l = new OnDismissListener() {
            public final void onDismiss() {
                bc.this.d();
            }
        };
        this.d = context;
        this.e = axVar;
        this.a = view;
        this.f = z;
        this.g = i2;
        this.h = i3;
    }

    public final void a(boolean z) {
        this.i = z;
        bb bbVar = this.k;
        if (bbVar != null) {
            bbVar.b(z);
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [bb] */
    /* JADX WARNING: type inference failed for: r7v0, types: [bh] */
    /* JADX WARNING: type inference failed for: r1v12, types: [au] */
    /* JADX WARNING: type inference failed for: r7v1, types: [bh] */
    /* JADX WARNING: type inference failed for: r1v13, types: [au] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [bh]
      assigns: [bh, au]
      uses: [bh, bb, au]
      mth insns count: 52
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bb a() {
        /*
            r14 = this;
            bb r0 = r14.k
            if (r0 != 0) goto L_0x0083
            android.content.Context r0 = r14.d
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0021
            r0.getRealSize(r1)
            goto L_0x0024
        L_0x0021:
            r0.getSize(r1)
        L_0x0024:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.d
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x0051
            au r0 = new au
            android.content.Context r2 = r14.d
            android.view.View r3 = r14.a
            int r4 = r14.g
            int r5 = r14.h
            boolean r6 = r14.f
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0063
        L_0x0051:
            bh r0 = new bh
            android.content.Context r8 = r14.d
            ax r9 = r14.e
            android.view.View r10 = r14.a
            int r11 = r14.g
            int r12 = r14.h
            boolean r13 = r14.f
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0063:
            ax r1 = r14.e
            r0.a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.l
            r0.a(r1)
            android.view.View r1 = r14.a
            r0.a(r1)
            bd$a r1 = r14.j
            r0.a(r1)
            boolean r1 = r14.i
            r0.b(r1)
            int r1 = r14.b
            r0.a(r1)
            r14.k = r0
        L_0x0083:
            bb r0 = r14.k
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.a():bb");
    }

    public final boolean b() {
        if (e()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3, boolean z, boolean z2) {
        bb a2 = a();
        a2.c(z2);
        if (z) {
            if ((hx.a(this.b, ip.f(this.a)) & 7) == 5) {
                i2 -= this.a.getWidth();
            }
            a2.b(i2);
            a2.c(i3);
            int i4 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.g = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.d_();
    }

    public final void c() {
        if (e()) {
            this.k.d();
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.k = null;
        OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean e() {
        bb bbVar = this.k;
        return bbVar != null && bbVar.e();
    }

    public final void a(a aVar) {
        this.j = aVar;
        bb bbVar = this.k;
        if (bbVar != null) {
            bbVar.a(aVar);
        }
    }
}
