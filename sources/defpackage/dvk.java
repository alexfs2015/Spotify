package defpackage;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@cfp
/* renamed from: dvk reason: default package */
public final class dvk extends dwb implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    static final String[] a = {"2011", "1009", "3010"};
    private final Object b = new Object();
    private final WeakReference<View> c;
    private final Map<String, WeakReference<View>> d = new HashMap();
    private final Map<String, WeakReference<View>> e = new HashMap();
    private final Map<String, WeakReference<View>> f = new HashMap();
    private dut g;
    private View h;
    private Point i = new Point();
    private Point j = new Point();
    private WeakReference<dlu> k = new WeakReference<>(null);

    public dvk(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        bkc.A();
        crb.a(view, (OnGlobalLayoutListener) this);
        bkc.A();
        crb.a(view, (OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.c = new WeakReference<>(view);
        for (Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.d.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f.putAll(this.d);
        for (Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.e.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
            }
        }
        this.f.putAll(this.e);
        dtg.a(view.getContext());
    }

    private final int a(int i2) {
        int b2;
        synchronized (this.b) {
            dqe.a();
            b2 = cpc.b(this.g.m(), i2);
        }
        return b2;
    }

    private final void a(View view) {
        synchronized (this.b) {
            if (this.g != null) {
                dut f2 = this.g instanceof dus ? ((dus) this.g).f() : this.g;
                if (f2 != null) {
                    f2.c(view);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.dvk r5, defpackage.duy r6) {
        /*
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            java.lang.String[] r1 = a     // Catch:{ all -> 0x003b }
            r2 = 0
        L_0x0006:
            r3 = 3
            if (r2 >= r3) goto L_0x001f
            r3 = r1[r2]     // Catch:{ all -> 0x003b }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r5.f     // Catch:{ all -> 0x003b }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x003b }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x001c
            java.lang.Object r1 = r3.get()     // Catch:{ all -> 0x003b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x003b }
            goto L_0x0020
        L_0x001c:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r2 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0029
            r6.i()     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x0029:
            dvm r2 = new dvm     // Catch:{ all -> 0x003b }
            r2.<init>(r5, r1)     // Catch:{ all -> 0x003b }
            boolean r5 = r6 instanceof defpackage.dus     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x0036
            r6.b(r1, r2)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0036:
            r6.a(r1, r2)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            goto L_0x003f
        L_0x003e:
            throw r5
        L_0x003f:
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvk.a(dvk, duy):void");
    }

    static /* synthetic */ boolean a(dvk dvk, String[] strArr) {
        for (String str : strArr) {
            if (dvk.d.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (dvk.e.get(str2) != null) {
                break;
            }
        }
        return false;
    }

    public final void a() {
        synchronized (this.b) {
            this.h = null;
            this.g = null;
            this.i = null;
            this.j = null;
        }
    }

    public final void a(cbi cbi) {
        int i2;
        View view;
        synchronized (this.b) {
            ViewGroup viewGroup = null;
            a((View) null);
            Object a2 = cbj.a(cbi);
            if (!(a2 instanceof duy)) {
                cpn.a(5);
                return;
            }
            duy duy = (duy) a2;
            if (!duy.b()) {
                cml.a("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view2 = (View) this.c.get();
            if (!(this.g == null || view2 == null)) {
                if (((Boolean) dqe.f().a(dtg.bX)).booleanValue()) {
                    this.g.b(view2, this.f);
                }
            }
            synchronized (this.b) {
                i2 = 0;
                if (this.g instanceof duy) {
                    duy duy2 = (duy) this.g;
                    View view3 = (View) this.c.get();
                    if (!(duy2 == null || duy2.b == null || view3 == null || !bkc.B().c(view3.getContext()))) {
                        clf n = duy2.n();
                        if (n != null) {
                            n.a(false);
                        }
                        dlu dlu = (dlu) this.k.get();
                        if (!(dlu == null || n == null)) {
                            dlu.b((dly) n);
                        }
                    }
                }
            }
            if (!(this.g instanceof dus) || !((dus) this.g).e()) {
                this.g = duy;
                if (duy instanceof dus) {
                    ((dus) duy).a((dut) null);
                }
            } else {
                ((dus) this.g).a((dut) duy);
            }
            String[] strArr = {"1098", "3011"};
            while (true) {
                if (i2 >= 2) {
                    view = null;
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f.get(strArr[i2]);
                if (weakReference != null) {
                    view = (View) weakReference.get();
                    break;
                }
                i2++;
            }
            if (view == null) {
                cpn.a(5);
            } else {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
                if (viewGroup != null) {
                    this.h = duy.a((OnClickListener) this, true);
                    if (this.h != null) {
                        this.f.put("1007", new WeakReference(this.h));
                        this.d.put("1007", new WeakReference(this.h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.h);
                    }
                }
            }
            duy.a(view2, this.d, this.e, (OnTouchListener) this, (OnClickListener) this);
            cmu.a.post(new dvl(this, duy));
            a(view2);
            this.g.b(view2);
            synchronized (this.b) {
                if (this.g instanceof duy) {
                    duy duy3 = (duy) this.g;
                    View view4 = (View) this.c.get();
                    if (!(duy3 == null || duy3.b == null || view4 == null || !bkc.B().c(view4.getContext()))) {
                        dlu dlu2 = (dlu) this.k.get();
                        if (dlu2 == null) {
                            dlu2 = new dlu(view4.getContext(), view4);
                            this.k = new WeakReference<>(dlu2);
                        }
                        dlu2.a((dly) duy3.n());
                    }
                }
            }
        }
    }

    public final void b(cbi cbi) {
        synchronized (this.b) {
            this.g.a((View) cbj.a(cbi));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
            dut r1 = r8.g     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0009:
            java.lang.ref.WeakReference<android.view.View> r1 = r8.c     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0090 }
            r7 = r1
            android.view.View r7 = (android.view.View) r7     // Catch:{ all -> 0x0090 }
            if (r7 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0016:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0090 }
            r5.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r8.i     // Catch:{ all -> 0x0090 }
            int r2 = r2.x     // Catch:{ all -> 0x0090 }
            int r2 = r8.a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r8.i     // Catch:{ all -> 0x0090 }
            int r2 = r2.y     // Catch:{ all -> 0x0090 }
            int r2 = r8.a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r8.j     // Catch:{ all -> 0x0090 }
            int r2 = r2.x     // Catch:{ all -> 0x0090 }
            int r2 = r8.a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r8.j     // Catch:{ all -> 0x0090 }
            int r2 = r2.y     // Catch:{ all -> 0x0090 }
            int r2 = r8.a(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            android.view.View r1 = r8.h     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0087
            android.view.View r1 = r8.h     // Catch:{ all -> 0x0090 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0087
            dut r1 = r8.g     // Catch:{ all -> 0x0090 }
            boolean r1 = r1 instanceof defpackage.dus     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0080
            dut r1 = r8.g     // Catch:{ all -> 0x0090 }
            dus r1 = (defpackage.dus) r1     // Catch:{ all -> 0x0090 }
            dut r1 = r1.f()     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008e
            dut r1 = r8.g     // Catch:{ all -> 0x0090 }
            dus r1 = (defpackage.dus) r1     // Catch:{ all -> 0x0090 }
            dut r2 = r1.f()     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f     // Catch:{ all -> 0x0090 }
        L_0x007b:
            r3 = r9
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0090 }
            goto L_0x008e
        L_0x0080:
            dut r2 = r8.g     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f     // Catch:{ all -> 0x0090 }
            goto L_0x007b
        L_0x0087:
            dut r1 = r8.g     // Catch:{ all -> 0x0090 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r8.f     // Catch:{ all -> 0x0090 }
            r1.a(r9, r2, r5, r7)     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0090:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            goto L_0x0094
        L_0x0093:
            throw r9
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvk.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.b) {
            if (this.g != null) {
                View view = (View) this.c.get();
                if (view != null) {
                    this.g.c(view, this.f);
                }
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.b) {
            if (this.g != null) {
                View view = (View) this.c.get();
                if (view != null) {
                    this.g.c(view, this.f);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.b) {
            if (this.g == null) {
                return false;
            }
            View view2 = (View) this.c.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.i = point;
            if (motionEvent.getAction() == 0) {
                this.j = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.g.a(obtain);
            obtain.recycle();
            return false;
        }
    }
}
