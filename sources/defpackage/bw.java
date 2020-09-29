package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: bw reason: default package */
public final class bw {
    final TextView a;
    public cn b;
    public final bx c;
    Typeface d;
    boolean e;
    private cn f;
    private cn g;
    private cn h;
    private cn i;
    private cn j;
    private cn k;
    private int l = 0;
    private int m = -1;

    /* renamed from: bw$a */
    static class a extends defpackage.gb.a {
        private final WeakReference<bw> a;
        private final int b;
        private final int c;

        /* renamed from: bw$a$a reason: collision with other inner class name */
        class C0019a implements Runnable {
            private final WeakReference<bw> a;
            private final Typeface b;

            C0019a(WeakReference<bw> weakReference, Typeface typeface) {
                this.a = weakReference;
                this.b = typeface;
            }

            public final void run() {
                bw bwVar = (bw) this.a.get();
                if (bwVar != null) {
                    Typeface typeface = this.b;
                    if (bwVar.e) {
                        bwVar.a.setTypeface(typeface);
                        bwVar.d = typeface;
                    }
                }
            }
        }

        a(bw bwVar, int i, int i2) {
            this.a = new WeakReference<>(bwVar);
            this.b = i;
            this.c = i2;
        }

        public final void a(int i) {
        }

        public final void a(Typeface typeface) {
            bw bwVar = (bw) this.a.get();
            if (bwVar != null) {
                if (VERSION.SDK_INT >= 28) {
                    int i = this.b;
                    if (i != -1) {
                        typeface = Typeface.create(typeface, i, (this.c & 2) != 0);
                    }
                }
                bwVar.a.post(new C0019a(this.a, typeface));
            }
        }
    }

    public bw(TextView textView) {
        this.a = textView;
        this.c = new bx(this.a);
    }

    private static cn a(Context context, bq bqVar, int i2) {
        ColorStateList b2 = bqVar.b(context, i2);
        if (b2 == null) {
            return null;
        }
        cn cnVar = new cn();
        cnVar.d = true;
        cnVar.a = b2;
        return cnVar;
    }

    private void a(Context context, cp cpVar) {
        this.l = cpVar.a(defpackage.o.a.cP, this.l);
        boolean z = false;
        if (VERSION.SDK_INT >= 28) {
            this.m = cpVar.a(defpackage.o.a.cY, -1);
            if (this.m != -1) {
                this.l = (this.l & 2) | 0;
            }
        }
        if (cpVar.f(defpackage.o.a.cX) || cpVar.f(defpackage.o.a.cZ)) {
            this.d = null;
            int i2 = cpVar.f(defpackage.o.a.cZ) ? defpackage.o.a.cZ : defpackage.o.a.cX;
            int i3 = this.m;
            int i4 = this.l;
            if (!context.isRestricted()) {
                try {
                    Typeface a2 = cpVar.a(i2, this.l, (defpackage.gb.a) new a(this, i3, i4));
                    if (a2 != null) {
                        if (VERSION.SDK_INT < 28 || this.m == -1) {
                            this.d = a2;
                        } else {
                            this.d = Typeface.create(Typeface.create(a2, 0), this.m, (this.l & 2) != 0);
                        }
                    }
                    this.e = this.d == null;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.d == null) {
                String d2 = cpVar.d(i2);
                if (d2 != null) {
                    if (VERSION.SDK_INT < 28 || this.m == -1) {
                        this.d = Typeface.create(d2, this.l);
                    } else {
                        Typeface create = Typeface.create(d2, 0);
                        int i5 = this.m;
                        if ((this.l & 2) != 0) {
                            z = true;
                        }
                        this.d = Typeface.create(create, i5, z);
                        return;
                    }
                }
            }
            return;
        }
        if (cpVar.f(defpackage.o.a.cO)) {
            this.e = false;
            int a3 = cpVar.a(defpackage.o.a.cO, 1);
            if (a3 == 1) {
                this.d = Typeface.SANS_SERIF;
            } else if (a3 == 2) {
                this.d = Typeface.SERIF;
            } else if (a3 == 3) {
                this.d = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (VERSION.SDK_INT < 17 || (drawable5 == null && drawable6 == null)) {
            if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
                if (VERSION.SDK_INT >= 17) {
                    Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
                    if (!(compoundDrawablesRelative[0] == null && compoundDrawablesRelative[2] == null)) {
                        TextView textView = this.a;
                        Drawable drawable7 = compoundDrawablesRelative[0];
                        if (drawable2 == null) {
                            drawable2 = compoundDrawablesRelative[1];
                        }
                        Drawable drawable8 = compoundDrawablesRelative[2];
                        if (drawable4 == null) {
                            drawable4 = compoundDrawablesRelative[3];
                        }
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                        return;
                    }
                }
                Drawable[] compoundDrawables = this.a.getCompoundDrawables();
                TextView textView2 = this.a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            }
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
        TextView textView3 = this.a;
        if (drawable5 == null) {
            drawable5 = compoundDrawablesRelative2[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative2[1];
        }
        if (drawable6 == null) {
            drawable6 = compoundDrawablesRelative2[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative2[3];
        }
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
    }

    private void a(Drawable drawable, cn cnVar) {
        if (drawable != null && cnVar != null) {
            bq.a(drawable, cnVar, this.a.getDrawableState());
        }
    }

    private void a(boolean z) {
        this.a.setAllCaps(z);
    }

    private void b(int i2, float f2) {
        this.c.a(i2, f2);
    }

    public final void a() {
        if (!(this.f == null && this.g == null && this.h == null && this.i == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f);
            a(compoundDrawables[1], this.g);
            a(compoundDrawables[2], this.h);
            a(compoundDrawables[3], this.i);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.j != null || this.k != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.j);
            a(compoundDrawablesRelative[2], this.k);
        }
    }

    public final void a(int i2) {
        this.c.a(i2);
    }

    public final void a(int i2, float f2) {
        if (!jg.d && !this.c.b()) {
            b(i2, f2);
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.c.a(i2, i3, i4, i5);
    }

    public final void a(Context context, int i2) {
        cp a2 = cp.a(context, i2, defpackage.o.a.cM);
        if (a2.f(defpackage.o.a.db)) {
            a(a2.a(defpackage.o.a.db, false));
        }
        if (VERSION.SDK_INT < 23 && a2.f(defpackage.o.a.cQ)) {
            ColorStateList e2 = a2.e(defpackage.o.a.cQ);
            if (e2 != null) {
                this.a.setTextColor(e2);
            }
        }
        if (a2.f(defpackage.o.a.cN) && a2.e(defpackage.o.a.cN, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        a(context, a2);
        if (VERSION.SDK_INT >= 26 && a2.f(defpackage.o.a.da)) {
            String d2 = a2.d(defpackage.o.a.da);
            if (d2 != null) {
                this.a.setFontVariationSettings(d2);
            }
        }
        a2.a.recycle();
        Typeface typeface = this.d;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.l);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.util.AttributeSet r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            android.widget.TextView r2 = r7.a
            android.content.Context r2 = r2.getContext()
            bq r3 = defpackage.bq.b()
            int[] r4 = defpackage.o.a.Y
            r5 = 0
            cp r4 = defpackage.cp.a(r2, r0, r4, r1, r5)
            int r6 = defpackage.o.a.Z
            r8 = -1
            int r6 = r4.g(r6, r8)
            int r9 = defpackage.o.a.ac
            boolean r9 = r4.f(r9)
            if (r9 == 0) goto L_0x0032
            int r9 = defpackage.o.a.ac
            int r9 = r4.g(r9, r5)
            cn r9 = a(r2, r3, r9)
            r7.f = r9
        L_0x0032:
            int r9 = defpackage.o.a.aa
            boolean r9 = r4.f(r9)
            if (r9 == 0) goto L_0x0046
            int r9 = defpackage.o.a.aa
            int r9 = r4.g(r9, r5)
            cn r9 = a(r2, r3, r9)
            r7.g = r9
        L_0x0046:
            int r9 = defpackage.o.a.ad
            boolean r9 = r4.f(r9)
            if (r9 == 0) goto L_0x005a
            int r9 = defpackage.o.a.ad
            int r9 = r4.g(r9, r5)
            cn r9 = a(r2, r3, r9)
            r7.h = r9
        L_0x005a:
            int r9 = defpackage.o.a.ab
            boolean r9 = r4.f(r9)
            if (r9 == 0) goto L_0x006e
            int r9 = defpackage.o.a.ab
            int r9 = r4.g(r9, r5)
            cn r9 = a(r2, r3, r9)
            r7.i = r9
        L_0x006e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L_0x009c
            int r9 = defpackage.o.a.ae
            boolean r9 = r4.f(r9)
            if (r9 == 0) goto L_0x0088
            int r9 = defpackage.o.a.ae
            int r9 = r4.g(r9, r5)
            cn r9 = a(r2, r3, r9)
            r7.j = r9
        L_0x0088:
            int r9 = defpackage.o.a.af
            boolean r9 = r4.f(r9)
            if (r9 == 0) goto L_0x009c
            int r9 = defpackage.o.a.af
            int r9 = r4.g(r9, r5)
            cn r9 = a(r2, r3, r9)
            r7.k = r9
        L_0x009c:
            android.content.res.TypedArray r4 = r4.a
            r4.recycle()
            android.widget.TextView r4 = r7.a
            android.text.method.TransformationMethod r4 = r4.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            r9 = 26
            r11 = 23
            if (r6 == r8) goto L_0x0134
            int[] r13 = defpackage.o.a.cM
            cp r6 = defpackage.cp.a(r2, r6, r13)
            if (r4 != 0) goto L_0x00c8
            int r13 = defpackage.o.a.db
            boolean r13 = r6.f(r13)
            if (r13 == 0) goto L_0x00c8
            int r13 = defpackage.o.a.db
            boolean r13 = r6.a(r13, r5)
            r14 = r13
            r13 = 1
            goto L_0x00ca
        L_0x00c8:
            r13 = 0
            r14 = 0
        L_0x00ca:
            r7.a(r2, r6)
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r11) goto L_0x0107
            int r15 = defpackage.o.a.cQ
            boolean r15 = r6.f(r15)
            if (r15 == 0) goto L_0x00e0
            int r15 = defpackage.o.a.cQ
            android.content.res.ColorStateList r15 = r6.e(r15)
            goto L_0x00e1
        L_0x00e0:
            r15 = 0
        L_0x00e1:
            int r10 = defpackage.o.a.cR
            boolean r10 = r6.f(r10)
            if (r10 == 0) goto L_0x00f0
            int r10 = defpackage.o.a.cR
            android.content.res.ColorStateList r10 = r6.e(r10)
            goto L_0x00f1
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            int r12 = defpackage.o.a.cS
            boolean r12 = r6.f(r12)
            if (r12 == 0) goto L_0x0105
            int r12 = defpackage.o.a.cS
            android.content.res.ColorStateList r12 = r6.e(r12)
            r17 = r15
            r15 = r12
            r12 = r17
            goto L_0x010a
        L_0x0105:
            r12 = r15
            goto L_0x0109
        L_0x0107:
            r10 = 0
            r12 = 0
        L_0x0109:
            r15 = 0
        L_0x010a:
            int r8 = defpackage.o.a.dc
            boolean r8 = r6.f(r8)
            if (r8 == 0) goto L_0x0119
            int r8 = defpackage.o.a.dc
            java.lang.String r8 = r6.d(r8)
            goto L_0x011a
        L_0x0119:
            r8 = 0
        L_0x011a:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r9) goto L_0x012d
            int r11 = defpackage.o.a.da
            boolean r11 = r6.f(r11)
            if (r11 == 0) goto L_0x012d
            int r11 = defpackage.o.a.da
            java.lang.String r11 = r6.d(r11)
            goto L_0x012e
        L_0x012d:
            r11 = 0
        L_0x012e:
            android.content.res.TypedArray r6 = r6.a
            r6.recycle()
            goto L_0x013b
        L_0x0134:
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x013b:
            int[] r6 = defpackage.o.a.cM
            cp r6 = defpackage.cp.a(r2, r0, r6, r1, r5)
            if (r4 != 0) goto L_0x0152
            int r9 = defpackage.o.a.db
            boolean r9 = r6.f(r9)
            if (r9 == 0) goto L_0x0152
            int r9 = defpackage.o.a.db
            boolean r14 = r6.a(r9, r5)
            r13 = 1
        L_0x0152:
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r9 >= r5) goto L_0x0182
            int r5 = defpackage.o.a.cQ
            boolean r5 = r6.f(r5)
            if (r5 == 0) goto L_0x0166
            int r5 = defpackage.o.a.cQ
            android.content.res.ColorStateList r12 = r6.e(r5)
        L_0x0166:
            int r5 = defpackage.o.a.cR
            boolean r5 = r6.f(r5)
            if (r5 == 0) goto L_0x0174
            int r5 = defpackage.o.a.cR
            android.content.res.ColorStateList r10 = r6.e(r5)
        L_0x0174:
            int r5 = defpackage.o.a.cS
            boolean r5 = r6.f(r5)
            if (r5 == 0) goto L_0x0182
            int r5 = defpackage.o.a.cS
            android.content.res.ColorStateList r15 = r6.e(r5)
        L_0x0182:
            int r5 = defpackage.o.a.dc
            boolean r5 = r6.f(r5)
            if (r5 == 0) goto L_0x0190
            int r5 = defpackage.o.a.dc
            java.lang.String r8 = r6.d(r5)
        L_0x0190:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r5 < r9) goto L_0x01a4
            int r5 = defpackage.o.a.da
            boolean r5 = r6.f(r5)
            if (r5 == 0) goto L_0x01a4
            int r5 = defpackage.o.a.da
            java.lang.String r11 = r6.d(r5)
        L_0x01a4:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r5 < r9) goto L_0x01c5
            int r5 = defpackage.o.a.cN
            boolean r5 = r6.f(r5)
            if (r5 == 0) goto L_0x01c5
            int r5 = defpackage.o.a.cN
            r9 = -1
            int r5 = r6.e(r5, r9)
            if (r5 != 0) goto L_0x01c5
            android.widget.TextView r5 = r7.a
            r9 = 0
            r16 = r3
            r3 = 0
            r5.setTextSize(r3, r9)
            goto L_0x01c7
        L_0x01c5:
            r16 = r3
        L_0x01c7:
            r7.a(r2, r6)
            android.content.res.TypedArray r3 = r6.a
            r3.recycle()
            if (r12 == 0) goto L_0x01d6
            android.widget.TextView r3 = r7.a
            r3.setTextColor(r12)
        L_0x01d6:
            if (r10 == 0) goto L_0x01dd
            android.widget.TextView r3 = r7.a
            r3.setHintTextColor(r10)
        L_0x01dd:
            if (r15 == 0) goto L_0x01e4
            android.widget.TextView r3 = r7.a
            r3.setLinkTextColor(r15)
        L_0x01e4:
            if (r4 != 0) goto L_0x01eb
            if (r13 == 0) goto L_0x01eb
            r7.a(r14)
        L_0x01eb:
            android.graphics.Typeface r3 = r7.d
            if (r3 == 0) goto L_0x0201
            int r4 = r7.m
            r5 = -1
            if (r4 != r5) goto L_0x01fc
            android.widget.TextView r4 = r7.a
            int r5 = r7.l
            r4.setTypeface(r3, r5)
            goto L_0x0201
        L_0x01fc:
            android.widget.TextView r4 = r7.a
            r4.setTypeface(r3)
        L_0x0201:
            if (r11 == 0) goto L_0x0208
            android.widget.TextView r3 = r7.a
            r3.setFontVariationSettings(r11)
        L_0x0208:
            if (r8 == 0) goto L_0x0234
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x021a
            android.widget.TextView r3 = r7.a
            android.os.LocaleList r4 = android.os.LocaleList.forLanguageTags(r8)
            r3.setTextLocales(r4)
            goto L_0x0234
        L_0x021a:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r3 < r4) goto L_0x0234
            r3 = 44
            int r3 = r8.indexOf(r3)
            r4 = 0
            java.lang.String r3 = r8.substring(r4, r3)
            android.widget.TextView r4 = r7.a
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)
            r4.setTextLocale(r3)
        L_0x0234:
            bx r3 = r7.c
            r3.a(r0, r1)
            boolean r1 = defpackage.jg.d
            if (r1 == 0) goto L_0x027c
            bx r1 = r7.c
            int r1 = r1.a
            if (r1 == 0) goto L_0x027c
            bx r1 = r7.c
            int[] r1 = r1.e
            int r3 = r1.length
            if (r3 <= 0) goto L_0x027c
            android.widget.TextView r3 = r7.a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0276
            android.widget.TextView r1 = r7.a
            bx r3 = r7.c
            float r3 = r3.c
            int r3 = java.lang.Math.round(r3)
            bx r4 = r7.c
            float r4 = r4.d
            int r4 = java.lang.Math.round(r4)
            bx r5 = r7.c
            float r5 = r5.b
            int r5 = java.lang.Math.round(r5)
            r6 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6)
            goto L_0x027c
        L_0x0276:
            r6 = 0
            android.widget.TextView r3 = r7.a
            r3.setAutoSizeTextTypeUniformWithPresetSizes(r1, r6)
        L_0x027c:
            int[] r1 = defpackage.o.a.ag
            cp r8 = defpackage.cp.a(r2, r0, r1)
            int r0 = defpackage.o.a.ao
            r1 = -1
            int r0 = r8.g(r0, r1)
            r3 = r16
            if (r0 == r1) goto L_0x0293
            android.graphics.drawable.Drawable r0 = r3.a(r2, r0)
            r4 = r0
            goto L_0x0294
        L_0x0293:
            r4 = 0
        L_0x0294:
            int r0 = defpackage.o.a.at
            int r0 = r8.g(r0, r1)
            if (r0 == r1) goto L_0x02a2
            android.graphics.drawable.Drawable r0 = r3.a(r2, r0)
            r5 = r0
            goto L_0x02a3
        L_0x02a2:
            r5 = 0
        L_0x02a3:
            int r0 = defpackage.o.a.ap
            int r0 = r8.g(r0, r1)
            if (r0 == r1) goto L_0x02b1
            android.graphics.drawable.Drawable r0 = r3.a(r2, r0)
            r6 = r0
            goto L_0x02b2
        L_0x02b1:
            r6 = 0
        L_0x02b2:
            int r0 = defpackage.o.a.am
            int r0 = r8.g(r0, r1)
            if (r0 == r1) goto L_0x02c0
            android.graphics.drawable.Drawable r0 = r3.a(r2, r0)
            r9 = r0
            goto L_0x02c1
        L_0x02c0:
            r9 = 0
        L_0x02c1:
            int r0 = defpackage.o.a.aq
            int r0 = r8.g(r0, r1)
            if (r0 == r1) goto L_0x02cf
            android.graphics.drawable.Drawable r0 = r3.a(r2, r0)
            r10 = r0
            goto L_0x02d0
        L_0x02cf:
            r10 = 0
        L_0x02d0:
            int r0 = defpackage.o.a.an
            int r0 = r8.g(r0, r1)
            if (r0 == r1) goto L_0x02de
            android.graphics.drawable.Drawable r0 = r3.a(r2, r0)
            r11 = r0
            goto L_0x02df
        L_0x02de:
            r11 = 0
        L_0x02df:
            r0 = r18
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r9
            r5 = r10
            r6 = r11
            r0.a(r1, r2, r3, r4, r5, r6)
            int r0 = defpackage.o.a.ar
            boolean r0 = r8.f(r0)
            if (r0 == 0) goto L_0x02fd
            int r0 = defpackage.o.a.ar
            android.content.res.ColorStateList r0 = r8.e(r0)
            android.widget.TextView r1 = r7.a
            defpackage.jm.a(r1, r0)
        L_0x02fd:
            int r0 = defpackage.o.a.as
            boolean r0 = r8.f(r0)
            if (r0 == 0) goto L_0x0317
            int r0 = defpackage.o.a.as
            r1 = -1
            int r0 = r8.a(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = defpackage.ca.a(r0, r2)
            android.widget.TextView r2 = r7.a
            defpackage.jm.a(r2, r0)
            goto L_0x0318
        L_0x0317:
            r1 = -1
        L_0x0318:
            int r0 = defpackage.o.a.au
            int r0 = r8.e(r0, r1)
            int r2 = defpackage.o.a.av
            int r2 = r8.e(r2, r1)
            int r3 = defpackage.o.a.aw
            int r3 = r8.e(r3, r1)
            android.content.res.TypedArray r4 = r8.a
            r4.recycle()
            if (r0 == r1) goto L_0x0336
            android.widget.TextView r4 = r7.a
            defpackage.jm.b(r4, r0)
        L_0x0336:
            if (r2 == r1) goto L_0x033d
            android.widget.TextView r0 = r7.a
            defpackage.jm.c(r0, r2)
        L_0x033d:
            if (r3 == r1) goto L_0x0344
            android.widget.TextView r0 = r7.a
            defpackage.jm.d(r0, r3)
        L_0x0344:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw.a(android.util.AttributeSet, int):void");
    }

    public final void a(int[] iArr, int i2) {
        this.c.a(iArr, i2);
    }

    public final void b() {
        if (!jg.d) {
            this.c.a();
        }
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return Math.round(this.c.b);
    }

    public final int e() {
        return Math.round(this.c.c);
    }

    public final int f() {
        return Math.round(this.c.d);
    }

    public final int[] g() {
        return this.c.e;
    }

    public void h() {
        cn cnVar = this.b;
        this.f = cnVar;
        this.g = cnVar;
        this.h = cnVar;
        this.i = cnVar;
        this.j = cnVar;
        this.k = cnVar;
    }
}
