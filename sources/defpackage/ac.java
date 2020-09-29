package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ac reason: default package */
public class ac extends af implements gn {
    private b b;
    private f c;
    private int d;
    private int e;
    private boolean f;

    /* renamed from: ac$a */
    static class a extends f {
        private final Animatable a;

        a(Animatable animatable) {
            super(0);
            this.a = animatable;
        }

        public final void a() {
            this.a.start();
        }

        public final void b() {
            this.a.stop();
        }
    }

    /* renamed from: ac$b */
    static class b extends a {
        ds<Long> a;
        private dw<Integer> y;

        static long a(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        b(b bVar, ac acVar, Resources resources) {
            super(bVar, acVar, resources);
            if (bVar != null) {
                this.a = bVar.a;
                this.y = bVar.y;
                return;
            }
            this.a = new ds<>();
            this.y = new dw<>();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.a = this.a.clone();
            this.y = this.y.clone();
        }

        /* access modifiers changed from: 0000 */
        public final int a(int i, int i2, Drawable drawable, boolean z) {
            int a2 = super.a(drawable);
            long a3 = a(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a2;
            this.a.c(a3, Long.valueOf(j2 | j));
            if (z) {
                this.a.c(a(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public final int a(int[] iArr, Drawable drawable, int i) {
            int a2 = super.a(iArr, drawable);
            this.y.b(a2, Integer.valueOf(i));
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public final int a(int[] iArr) {
            int b = super.b(iArr);
            if (b >= 0) {
                return b;
            }
            return super.b(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        public final int a(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.y.a(i, Integer.valueOf(0))).intValue();
        }

        public final Drawable newDrawable() {
            return new ac(this, null);
        }

        public final Drawable newDrawable(Resources resources) {
            return new ac(this, resources);
        }
    }

    /* renamed from: ac$c */
    static class c extends f {
        private final rp a;

        c(rp rpVar) {
            super(0);
            this.a = rpVar;
        }

        public final void a() {
            this.a.start();
        }

        public final void b() {
            this.a.stop();
        }
    }

    /* renamed from: ac$d */
    static class d extends f {
        private final ObjectAnimator a;
        private final boolean b;

        d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(0);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            e eVar = new e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.a);
            ofInt.setInterpolator(eVar);
            this.b = z2;
            this.a = ofInt;
        }

        public final boolean c() {
            return this.b;
        }

        public final void a() {
            this.a.start();
        }

        public final void d() {
            this.a.reverse();
        }

        public final void b() {
            this.a.cancel();
        }
    }

    /* renamed from: ac$e */
    static class e implements TimeInterpolator {
        int a;
        private int[] b;
        private int c;

        e(AnimationDrawable animationDrawable, boolean z) {
            a(animationDrawable, z);
        }

        private int a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.c = numberOfFrames;
            int[] iArr = this.b;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.b = new int[numberOfFrames];
            }
            int[] iArr2 = this.b;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.a = i;
            return i;
        }

        public final float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.a)) + 0.5f);
            int i2 = this.c;
            int[] iArr = this.b;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.a) : 0.0f);
        }
    }

    /* renamed from: ac$f */
    static abstract class f {
        public abstract void a();

        public abstract void b();

        public boolean c() {
            return false;
        }

        public void d() {
        }

        private f() {
        }

        /* synthetic */ f(byte b) {
            this();
        }
    }

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    static {
        ac.class.getSimpleName();
    }

    public ac() {
        this(null, null);
    }

    ac(b bVar, Resources resources) {
        super(null);
        this.d = -1;
        this.e = -1;
        a(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static ac a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            ac acVar = new ac();
            TypedArray a2 = gc.a(resources, theme, attributeSet, defpackage.ag.a.a);
            acVar.setVisible(a2.getBoolean(defpackage.ag.a.c, true), true);
            b bVar = acVar.b;
            if (VERSION.SDK_INT >= 21) {
                bVar.b |= a2.getChangingConfigurations();
            }
            bVar.f = a2.getBoolean(defpackage.ag.a.d, bVar.f);
            bVar.i = a2.getBoolean(defpackage.ag.a.e, bVar.i);
            bVar.p = a2.getInt(defpackage.ag.a.f, bVar.p);
            bVar.q = a2.getInt(defpackage.ag.a.g, bVar.q);
            acVar.setDither(a2.getBoolean(defpackage.ag.a.b, bVar.n));
            acVar.a(resources);
            a2.recycle();
            acVar.b(context, resources, xmlPullParser, attributeSet, theme);
            acVar.onStateChange(acVar.getState());
            return acVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.c != null && (visible || z2)) {
            if (z) {
                this.c.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.c;
        if (fVar != null) {
            fVar.b();
            this.c = null;
            a(this.d);
            this.d = -1;
            this.e = -1;
        }
    }

    /* JADX INFO: used method not loaded: ad.a(int):null, types can be incorrect */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
        if (a(r2) == false) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            ac$b r2 = r0.b
            int r2 = r2.a(r1)
            int r3 = r0.a
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x00ee
            ac$f r3 = r0.c
            if (r3 == 0) goto L_0x0035
            int r6 = r0.d
            if (r2 != r6) goto L_0x001b
        L_0x0018:
            r3 = 1
            goto L_0x00e5
        L_0x001b:
            int r6 = r0.e
            if (r2 != r6) goto L_0x002f
            boolean r6 = r3.c()
            if (r6 == 0) goto L_0x002f
            r3.d()
            int r3 = r0.e
            r0.d = r3
            r0.e = r2
            goto L_0x0018
        L_0x002f:
            int r6 = r0.d
            r3.b()
            goto L_0x0037
        L_0x0035:
            int r6 = r0.a
        L_0x0037:
            r3 = 0
            r0.c = r3
            r3 = -1
            r0.e = r3
            r0.d = r3
            ac$b r3 = r0.b
            int r7 = r3.a(r6)
            int r8 = r3.a(r2)
            if (r8 == 0) goto L_0x00e4
            if (r7 != 0) goto L_0x004f
            goto L_0x00e4
        L_0x004f:
            long r9 = defpackage.ac.b.a(r7, r8)
            ds<java.lang.Long> r11 = r3.a
            r12 = -1
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            java.lang.Object r9 = r11.a(r9, r14)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r10 = (int) r9
            if (r10 >= 0) goto L_0x006a
            goto L_0x00e4
        L_0x006a:
            long r14 = defpackage.ac.b.a(r7, r8)
            ds<java.lang.Long> r9 = r3.a
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            java.lang.Object r9 = r9.a(r14, r11)
            java.lang.Long r9 = (java.lang.Long) r9
            long r14 = r9.longValue()
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            long r14 = r14 & r16
            r16 = 0
            int r9 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r9 == 0) goto L_0x008d
            r9 = 1
            goto L_0x008e
        L_0x008d:
            r9 = 0
        L_0x008e:
            r0.a(r10)
            android.graphics.drawable.Drawable r10 = r18.getCurrent()
            boolean r11 = r10 instanceof android.graphics.drawable.AnimationDrawable
            if (r11 == 0) goto L_0x00c2
            long r7 = defpackage.ac.b.a(r7, r8)
            ds<java.lang.Long> r3 = r3.a
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            java.lang.Object r3 = r3.a(r7, r11)
            java.lang.Long r3 = (java.lang.Long) r3
            long r7 = r3.longValue()
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 & r11
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x00b9
            r3 = 1
            goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            ac$d r7 = new ac$d
            android.graphics.drawable.AnimationDrawable r10 = (android.graphics.drawable.AnimationDrawable) r10
            r7.<init>(r10, r3, r9)
            goto L_0x00d9
        L_0x00c2:
            boolean r3 = r10 instanceof defpackage.rp
            if (r3 == 0) goto L_0x00ce
            ac$c r7 = new ac$c
            rp r10 = (defpackage.rp) r10
            r7.<init>(r10)
            goto L_0x00d9
        L_0x00ce:
            boolean r3 = r10 instanceof android.graphics.drawable.Animatable
            if (r3 == 0) goto L_0x00e4
            ac$a r7 = new ac$a
            android.graphics.drawable.Animatable r10 = (android.graphics.drawable.Animatable) r10
            r7.<init>(r10)
        L_0x00d9:
            r7.a()
            r0.c = r7
            r0.e = r6
            r0.d = r2
            goto L_0x0018
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            if (r3 != 0) goto L_0x00ef
            boolean r2 = r0.a(r2)
            if (r2 == 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r4 = 0
        L_0x00ef:
            android.graphics.drawable.Drawable r2 = r18.getCurrent()
            if (r2 == 0) goto L_0x00fa
            boolean r1 = r2.setState(r1)
            r4 = r4 | r1
        L_0x00fa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac.onStateChange(int[]):boolean");
    }

    private void b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        c(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private int c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int next;
        TypedArray a2 = gc.a(resources, theme, attributeSet, defpackage.ag.a.k);
        int resourceId = a2.getResourceId(defpackage.ag.a.n, -1);
        int resourceId2 = a2.getResourceId(defpackage.ag.a.m, -1);
        int resourceId3 = a2.getResourceId(defpackage.ag.a.l, -1);
        Drawable a3 = resourceId3 > 0 ? cg.a().a(context, resourceId3) : null;
        boolean z = a2.getBoolean(defpackage.ag.a.o, false);
        a2.recycle();
        String str = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (a3 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                a3 = rp.a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                a3 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                a3 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (a3 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(str);
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.b.a(resourceId, resourceId2, a3, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    private int d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int next;
        TypedArray a2 = gc.a(resources, theme, attributeSet, defpackage.ag.a.h);
        int resourceId = a2.getResourceId(defpackage.ag.a.i, 0);
        int resourceId2 = a2.getResourceId(defpackage.ag.a.j, -1);
        Drawable a3 = resourceId2 > 0 ? cg.a().a(context, resourceId2) : null;
        a2.recycle();
        int[] a4 = a(attributeSet);
        String str = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (a3 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                a3 = rv.a(resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                a3 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                a3 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (a3 != null) {
            return this.b.a(a4, a3, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(str);
        throw new XmlPullParserException(sb2.toString());
    }

    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.b.a();
            this.f = true;
        }
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public b b() {
        return new b(this.b, this, null);
    }

    /* access modifiers changed from: 0000 */
    public final void a(b bVar) {
        super.a(bVar);
        if (bVar instanceof b) {
            this.b = (b) bVar;
        }
    }
}
