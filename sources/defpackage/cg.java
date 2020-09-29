package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: cg reason: default package */
public final class cg {
    private static final Mode a = Mode.SRC_IN;
    private static cg b;
    private static final c c = new c(6);
    private WeakHashMap<Context, dw<ColorStateList>> d;
    private dp<String, d> e;
    private dw<String> f;
    private final WeakHashMap<Context, ds<WeakReference<ConstantState>>> g = new WeakHashMap<>(0);
    private TypedValue h;
    private boolean i;
    private e j;

    /* renamed from: cg$a */
    static class a implements d {
        a() {
        }

        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return ac.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: cg$b */
    static class b implements d {
        b() {
        }

        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return rp.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: cg$c */
    static class c extends dt<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(6);
        }

        static int a(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* renamed from: cg$d */
    interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: cg$e */
    interface e {
        ColorStateList a(Context context, int i);

        Mode a(int i);

        Drawable a(cg cgVar, Context context, int i);

        boolean a(Context context, int i, Drawable drawable);

        boolean b(Context context, int i, Drawable drawable);
    }

    /* renamed from: cg$f */
    static class f implements d {
        f() {
        }

        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return rv.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static synchronized cg a() {
        cg cgVar;
        synchronized (cg.class) {
            if (b == null) {
                cg cgVar2 = new cg();
                b = cgVar2;
                if (VERSION.SDK_INT < 24) {
                    cgVar2.a("vector", (d) new f());
                    cgVar2.a("animated-vector", (d) new b());
                    cgVar2.a("animated-selector", (d) new a());
                }
            }
            cgVar = b;
        }
        return cgVar;
    }

    public final synchronized void a(e eVar) {
        this.j = eVar;
    }

    public final synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    public final synchronized void a(Context context) {
        ds dsVar = (ds) this.g.get(context);
        if (dsVar != null) {
            dsVar.c();
        }
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (ca.c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable f2 = gm.f(drawable);
            gm.a(f2, b2);
            Mode a2 = a(i2);
            if (a2 == null) {
                return f2;
            }
            gm.a(f2, a2);
            return f2;
        }
        e eVar = this.j;
        if ((eVar == null || !eVar.a(context, i2, drawable)) && !a(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    private Drawable c(Context context, int i2) {
        int next;
        dp<String, d> dpVar = this.e;
        if (dpVar == null || dpVar.isEmpty()) {
            return null;
        }
        dw<String> dwVar = this.f;
        String str = "appcompat_skip_skip";
        if (dwVar != null) {
            String str2 = (String) dwVar.a(i2, null);
            if (str.equals(str2) || (str2 != null && this.e.get(str2) == null)) {
                return null;
            }
        } else {
            this.f = new dw<>();
        }
        if (this.h == null) {
            this.h = new TypedValue();
        }
        TypedValue typedValue = this.h;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f.c(i2, name);
                    d dVar = (d) this.e.get(name);
                    if (dVar != null) {
                        a3 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (a3 != null) {
                        a3.setChangingConfigurations(typedValue.changingConfigurations);
                        a(context, a2, a3);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (a3 == null) {
            this.f.c(i2, str);
        }
        return a3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, ds<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0045 }
            ds r0 = (defpackage.ds) r0     // Catch:{ all -> 0x0045 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.a(r5, r1)     // Catch:{ all -> 0x0045 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0045 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0045 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0045 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.c     // Catch:{ all -> 0x0045 }
            int r2 = r0.e     // Catch:{ all -> 0x0045 }
            int r4 = defpackage.dr.a(r4, r2, r5)     // Catch:{ all -> 0x0045 }
            if (r4 < 0) goto L_0x0043
            java.lang.Object[] r5 = r0.d     // Catch:{ all -> 0x0045 }
            r5 = r5[r4]     // Catch:{ all -> 0x0045 }
            java.lang.Object r6 = defpackage.ds.a     // Catch:{ all -> 0x0045 }
            if (r5 == r6) goto L_0x0043
            java.lang.Object[] r5 = r0.d     // Catch:{ all -> 0x0045 }
            java.lang.Object r6 = defpackage.ds.a     // Catch:{ all -> 0x0045 }
            r5[r4] = r6     // Catch:{ all -> 0x0045 }
            r4 = 1
            r0.b = r4     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r3)
            return r1
        L_0x0045:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        ds dsVar = (ds) this.g.get(context);
        if (dsVar == null) {
            dsVar = new ds();
            this.g.put(context, dsVar);
        }
        dsVar.b(j2, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized Drawable a(Context context, cu cuVar, int i2) {
        Drawable c2 = c(context, i2);
        if (c2 == null) {
            c2 = cuVar.a(i2);
        }
        if (c2 == null) {
            return null;
        }
        return a(context, i2, false, c2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Context context, int i2, Drawable drawable) {
        e eVar = this.j;
        return eVar != null && eVar.b(context, i2, drawable);
    }

    private void a(String str, d dVar) {
        if (this.e == null) {
            this.e = new dp<>();
        }
        this.e.put(str, dVar);
    }

    private Mode a(int i2) {
        e eVar = this.j;
        if (eVar == null) {
            return null;
        }
        return eVar.a(i2);
    }

    static void a(Drawable drawable, cn cnVar, int[] iArr) {
        if (!ca.c(drawable) || drawable.mutate() == drawable) {
            if (cnVar.d || cnVar.c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = cnVar.d ? cnVar.a : null;
                Mode mode = cnVar.c ? cnVar.b : a;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public static synchronized PorterDuffColorFilter a(int i2, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (cg.class) {
            porterDuffColorFilter = (PorterDuffColorFilter) c.a(Integer.valueOf(c.a(i2, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) c.a(Integer.valueOf(c.a(i2, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable a(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.i     // Catch:{ all -> 0x0085 }
            r1 = 1
            if (r0 != 0) goto L_0x0037
            r4.i = r1     // Catch:{ all -> 0x0085 }
            r0 = 2131230817(0x7f080061, float:1.8077697E38)
            android.graphics.drawable.Drawable r0 = r4.a(r5, r0)     // Catch:{ all -> 0x0085 }
            r2 = 0
            if (r0 == 0) goto L_0x002d
            boolean r3 = r0 instanceof defpackage.rv     // Catch:{ all -> 0x0085 }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0085 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r4.i = r2     // Catch:{ all -> 0x0085 }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x0085 }
            throw r5     // Catch:{ all -> 0x0085 }
        L_0x0037:
            android.graphics.drawable.Drawable r0 = r4.c(r5, r6)     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0072
            android.util.TypedValue r0 = r4.h     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0048
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x0085 }
            r0.<init>()     // Catch:{ all -> 0x0085 }
            r4.h = r0     // Catch:{ all -> 0x0085 }
        L_0x0048:
            android.util.TypedValue r0 = r4.h     // Catch:{ all -> 0x0085 }
            android.content.res.Resources r2 = r5.getResources()     // Catch:{ all -> 0x0085 }
            r2.getValue(r6, r0, r1)     // Catch:{ all -> 0x0085 }
            long r1 = a(r0)     // Catch:{ all -> 0x0085 }
            android.graphics.drawable.Drawable r3 = r4.a(r5, r1)     // Catch:{ all -> 0x0085 }
            if (r3 != 0) goto L_0x0071
            cg$e r3 = r4.j     // Catch:{ all -> 0x0085 }
            if (r3 != 0) goto L_0x0061
            r3 = 0
            goto L_0x0067
        L_0x0061:
            cg$e r3 = r4.j     // Catch:{ all -> 0x0085 }
            android.graphics.drawable.Drawable r3 = r3.a(r4, r5, r6)     // Catch:{ all -> 0x0085 }
        L_0x0067:
            if (r3 == 0) goto L_0x0071
            int r0 = r0.changingConfigurations     // Catch:{ all -> 0x0085 }
            r3.setChangingConfigurations(r0)     // Catch:{ all -> 0x0085 }
            r4.a(r5, r1, r3)     // Catch:{ all -> 0x0085 }
        L_0x0071:
            r0 = r3
        L_0x0072:
            if (r0 != 0) goto L_0x0078
            android.graphics.drawable.Drawable r0 = defpackage.fr.a(r5, r6)     // Catch:{ all -> 0x0085 }
        L_0x0078:
            if (r0 == 0) goto L_0x007e
            android.graphics.drawable.Drawable r0 = r4.a(r5, r6, r7, r0)     // Catch:{ all -> 0x0085 }
        L_0x007e:
            if (r0 == 0) goto L_0x0083
            defpackage.ca.b(r0)     // Catch:{ all -> 0x0085 }
        L_0x0083:
            monitor-exit(r4)
            return r0
        L_0x0085:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList b(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, dw<android.content.res.ColorStateList>> r0 = r3.d     // Catch:{ all -> 0x004d }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.util.WeakHashMap<android.content.Context, dw<android.content.res.ColorStateList>> r0 = r3.d     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004d }
            dw r0 = (defpackage.dw) r0     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.a(r5, r1)     // Catch:{ all -> 0x004d }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x004d }
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 != 0) goto L_0x004b
            cg$e r0 = r3.j     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0020
        L_0x001e:
            r0 = r1
            goto L_0x0027
        L_0x0020:
            cg$e r0 = r3.j     // Catch:{ all -> 0x004d }
            android.content.res.ColorStateList r1 = r0.a(r4, r5)     // Catch:{ all -> 0x004d }
            goto L_0x001e
        L_0x0027:
            if (r0 == 0) goto L_0x004b
            java.util.WeakHashMap<android.content.Context, dw<android.content.res.ColorStateList>> r1 = r3.d     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0034
            java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            r3.d = r1     // Catch:{ all -> 0x004d }
        L_0x0034:
            java.util.WeakHashMap<android.content.Context, dw<android.content.res.ColorStateList>> r1 = r3.d     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x004d }
            dw r1 = (defpackage.dw) r1     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0048
            dw r1 = new dw     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            java.util.WeakHashMap<android.content.Context, dw<android.content.res.ColorStateList>> r2 = r3.d     // Catch:{ all -> 0x004d }
            r2.put(r4, r1)     // Catch:{ all -> 0x004d }
        L_0x0048:
            r1.c(r5, r0)     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r3)
            return r0
        L_0x004d:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0051
        L_0x0050:
            throw r4
        L_0x0051:
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
