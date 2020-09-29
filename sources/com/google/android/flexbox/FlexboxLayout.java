package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayout extends ViewGroup implements bfa {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private bfd o;
    private List<bfc> p;
    private a q;

    public static class LayoutParams extends MarginLayoutParams implements bfb {
        public static final Creator<LayoutParams> CREATOR = new Creator<LayoutParams>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new LayoutParams[i];
            }
        };
        private int a = 1;
        private float b = 0.0f;
        private float c = 1.0f;
        private int d = -1;
        private float e = -1.0f;
        private int f;
        private int g;
        private int h = 16777215;
        private int i = 16777215;
        private boolean j;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n);
            this.a = obtainStyledAttributes.getInt(a.w, 1);
            this.b = obtainStyledAttributes.getFloat(a.q, 0.0f);
            this.c = obtainStyledAttributes.getFloat(a.r, 1.0f);
            this.d = obtainStyledAttributes.getInt(a.o, -1);
            this.e = obtainStyledAttributes.getFraction(a.p, 1, 1, -1.0f);
            this.f = obtainStyledAttributes.getDimensionPixelSize(a.v, 0);
            this.g = obtainStyledAttributes.getDimensionPixelSize(a.u, 0);
            this.h = obtainStyledAttributes.getDimensionPixelSize(a.t, 16777215);
            this.i = obtainStyledAttributes.getDimensionPixelSize(a.s, 16777215);
            this.j = obtainStyledAttributes.getBoolean(a.x, false);
            obtainStyledAttributes.recycle();
        }

        protected LayoutParams(Parcel parcel) {
            boolean z = false;
            super(0, 0);
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readInt();
            this.e = parcel.readFloat();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            }
            this.j = z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
        }

        public final int a() {
            return this.width;
        }

        public final int b() {
            return this.height;
        }

        public final int c() {
            return this.a;
        }

        public final float d() {
            return this.b;
        }

        public int describeContents() {
            return 0;
        }

        public final float e() {
            return this.c;
        }

        public final int f() {
            return this.d;
        }

        public final int g() {
            return this.f;
        }

        public final int h() {
            return this.g;
        }

        public final int i() {
            return this.h;
        }

        public final int j() {
            return this.i;
        }

        public final boolean k() {
            return this.j;
        }

        public final float l() {
            return this.e;
        }

        public final int m() {
            return this.leftMargin;
        }

        public final int n() {
            return this.topMargin;
        }

        public final int o() {
            return this.rightMargin;
        }

        public final int p() {
            return this.bottomMargin;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f = -1;
        this.o = new bfd(this);
        this.p = new ArrayList();
        this.q = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, i2, 0);
        this.a = obtainStyledAttributes.getInt(a.g, 0);
        this.b = obtainStyledAttributes.getInt(a.h, 0);
        this.c = obtainStyledAttributes.getInt(a.i, 0);
        this.d = obtainStyledAttributes.getInt(a.c, 4);
        this.e = obtainStyledAttributes.getInt(a.b, 5);
        this.f = obtainStyledAttributes.getInt(a.j, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(a.d);
        if (drawable != null) {
            a(drawable);
            b(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(a.e);
        if (drawable2 != null) {
            a(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(a.f);
        if (drawable3 != null) {
            b(drawable3);
        }
        int i3 = obtainStyledAttributes.getInt(a.k, 0);
        if (i3 != 0) {
            this.j = i3;
            this.i = i3;
        }
        int i4 = obtainStyledAttributes.getInt(a.m, 0);
        if (i4 != 0) {
            this.j = i4;
        }
        int i5 = obtainStyledAttributes.getInt(a.l, 0);
        if (i5 != 0) {
            this.i = i5;
        }
        obtainStyledAttributes.recycle();
    }

    private void a() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private void a(int i2, int i3) {
        this.p.clear();
        this.q.a();
        this.o.a(this.q, i2, i3, Integer.MAX_VALUE, 0, -1, null);
        this.p = this.q.a;
        this.o.a(i2, i3, 0);
        if (this.d == 3) {
            for (bfc bfc : this.p) {
                int i4 = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < bfc.h; i5++) {
                    View c2 = c(bfc.o + i5);
                    if (!(c2 == null || c2.getVisibility() == 8)) {
                        LayoutParams layoutParams = (LayoutParams) c2.getLayoutParams();
                        if (this.b != 2) {
                            i4 = Math.max(i4, c2.getMeasuredHeight() + Math.max(bfc.l - c2.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                        } else {
                            i4 = Math.max(i4, c2.getMeasuredHeight() + layoutParams.topMargin + Math.max((bfc.l - c2.getMeasuredHeight()) + c2.getBaseline(), layoutParams.bottomMargin));
                        }
                    }
                }
                bfc.g = i4;
            }
        }
        this.o.b(i2, i3, getPaddingTop() + getPaddingBottom());
        this.o.a(0);
        a(this.a, i2, i3, this.q.b);
    }

    private void a(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int mode = MeasureSpec.getMode(i3);
        int size = MeasureSpec.getSize(i3);
        int mode2 = MeasureSpec.getMode(i4);
        int size2 = MeasureSpec.getSize(i4);
        if (i2 == 0 || i2 == 1) {
            i6 = l() + getPaddingTop() + getPaddingBottom();
            i7 = k();
        } else if (i2 == 2 || i2 == 3) {
            i6 = k();
            i7 = l() + getPaddingLeft() + getPaddingRight();
        } else {
            StringBuilder sb = new StringBuilder("Invalid flex direction: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i7) {
                i5 = View.combineMeasuredStates(i5, 16777216);
            } else {
                size = i7;
            }
            i8 = View.resolveSizeAndState(size, i3, i5);
        } else if (mode == 0) {
            i8 = View.resolveSizeAndState(i7, i3, i5);
        } else if (mode == 1073741824) {
            if (size < i7) {
                i5 = View.combineMeasuredStates(i5, 16777216);
            }
            i8 = View.resolveSizeAndState(size, i3, i5);
        } else {
            StringBuilder sb2 = new StringBuilder("Unknown width mode is set: ");
            sb2.append(mode);
            throw new IllegalStateException(sb2.toString());
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i6) {
                i5 = View.combineMeasuredStates(i5, 256);
                i6 = size2;
            }
            i9 = View.resolveSizeAndState(i6, i4, i5);
        } else if (mode2 == 0) {
            i9 = View.resolveSizeAndState(i6, i4, i5);
        } else if (mode2 == 1073741824) {
            if (size2 < i6) {
                i5 = View.combineMeasuredStates(i5, 256);
            }
            i9 = View.resolveSizeAndState(size2, i4, i5);
        } else {
            StringBuilder sb3 = new StringBuilder("Unknown height mode is set: ");
            sb3.append(mode2);
            throw new IllegalStateException(sb3.toString());
        }
        setMeasuredDimension(i8, i9);
    }

    private void a(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(i2, i3, this.l + i2, i4 + i3);
            this.h.draw(canvas);
        }
    }

    private void a(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            bfc bfc = (bfc) this.p.get(i2);
            for (int i3 = 0; i3 < bfc.h; i3++) {
                int i4 = bfc.o + i3;
                View c2 = c(i4);
                if (!(c2 == null || c2.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) c2.getLayoutParams();
                    if (b(i4, i3)) {
                        a(canvas, z ? c2.getRight() + layoutParams.rightMargin : (c2.getLeft() - layoutParams.leftMargin) - this.l, bfc.b, bfc.g);
                    }
                    if (i3 == bfc.h - 1 && (this.j & 4) > 0) {
                        a(canvas, z ? (c2.getLeft() - layoutParams.leftMargin) - this.l : c2.getRight() + layoutParams.rightMargin, bfc.b, bfc.g);
                    }
                }
            }
            if (d(i2)) {
                b(canvas, paddingLeft, z2 ? bfc.d : bfc.b - this.k, max);
            }
            if (f(i2) && (this.i & 4) > 0) {
                b(canvas, paddingLeft, z2 ? bfc.b - this.k : bfc.d, max);
            }
        }
    }

    private void a(Drawable drawable) {
        if (drawable != this.g) {
            this.g = drawable;
            if (drawable != null) {
                this.k = drawable.getIntrinsicHeight();
            } else {
                this.k = 0;
            }
            a();
            requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r33 - r31
            int r4 = r32 - r30
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List<bfc> r6 = r0.p
            int r6 = r6.size()
            r8 = r5
            r5 = r3
            r3 = 0
        L_0x0020:
            if (r3 >= r6) goto L_0x0228
            java.util.List<bfc> r9 = r0.p
            java.lang.Object r9 = r9.get(r3)
            bfc r9 = (defpackage.bfc) r9
            boolean r10 = r0.d(r3)
            if (r10 == 0) goto L_0x0034
            int r10 = r0.k
            int r5 = r5 - r10
            int r8 = r8 + r10
        L_0x0034:
            int r10 = r0.c
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00c9
            if (r10 == r13) goto L_0x00bf
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00ab
            r7 = 3
            if (r10 == r7) goto L_0x0093
            if (r10 == r15) goto L_0x0079
            r7 = 5
            if (r10 != r7) goto L_0x0063
            int r7 = r9.a()
            if (r7 == 0) goto L_0x005b
            int r10 = r9.e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r7 = r10 / r7
            goto L_0x005c
        L_0x005b:
            r7 = 0
        L_0x005c:
            float r10 = (float) r1
            float r10 = r10 + r7
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r7
            goto L_0x00ce
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0079:
            int r7 = r9.a()
            if (r7 == 0) goto L_0x0088
            int r10 = r9.e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r7 = r10 / r7
            goto L_0x0089
        L_0x0088:
            r7 = 0
        L_0x0089:
            float r10 = (float) r1
            float r12 = r7 / r12
            float r10 = r10 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00ce
        L_0x0093:
            float r10 = (float) r1
            int r7 = r9.a()
            if (r7 == r13) goto L_0x009e
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a0
        L_0x009e:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r9.e
            int r12 = r4 - r12
            float r12 = (float) r12
            float r7 = r12 / r7
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00ce
        L_0x00ab:
            float r7 = (float) r1
            int r10 = r9.e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r10 = r10 + r7
            int r7 = r4 - r2
            float r7 = (float) r7
            int r14 = r9.e
            int r14 = r4 - r14
            float r14 = (float) r14
            float r14 = r14 / r12
            float r12 = r7 - r14
            goto L_0x00cd
        L_0x00bf:
            int r7 = r9.e
            int r7 = r4 - r7
            int r7 = r7 + r2
            float r10 = (float) r7
            int r7 = r9.e
            int r7 = r7 - r1
            goto L_0x00cc
        L_0x00c9:
            float r10 = (float) r1
            int r7 = r4 - r2
        L_0x00cc:
            float r12 = (float) r7
        L_0x00cd:
            r7 = 0
        L_0x00ce:
            float r7 = java.lang.Math.max(r7, r11)
            r14 = 0
        L_0x00d3:
            int r11 = r9.h
            if (r14 >= r11) goto L_0x021a
            int r11 = r9.o
            int r11 = r11 + r14
            android.view.View r17 = r0.c(r11)
            if (r17 == 0) goto L_0x0208
            int r15 = r17.getVisibility()
            r13 = 8
            if (r15 == r13) goto L_0x0208
            android.view.ViewGroup$LayoutParams r13 = r17.getLayoutParams()
            r15 = r13
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r13 = r15.leftMargin
            float r13 = (float) r13
            float r10 = r10 + r13
            int r13 = r15.rightMargin
            float r13 = (float) r13
            float r12 = r12 - r13
            boolean r11 = r0.b(r11, r14)
            if (r11 == 0) goto L_0x0109
            int r11 = r0.l
            float r13 = (float) r11
            float r10 = r10 + r13
            float r12 = r12 - r13
            r18 = r10
            r20 = r11
            r19 = r12
            goto L_0x010f
        L_0x0109:
            r18 = r10
            r19 = r12
            r20 = 0
        L_0x010f:
            int r10 = r9.h
            r13 = 1
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x0122
            int r10 = r0.j
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0124
            int r10 = r0.l
            r21 = r10
            goto L_0x0126
        L_0x0122:
            r16 = 4
        L_0x0124:
            r21 = 0
        L_0x0126:
            int r10 = r0.b
            r12 = 2
            if (r10 != r12) goto L_0x0188
            if (r29 == 0) goto L_0x015e
            bfd r10 = r0.o
            int r11 = java.lang.Math.round(r19)
            int r22 = r17.getMeasuredWidth()
            int r22 = r11 - r22
            int r11 = r17.getMeasuredHeight()
            int r23 = r5 - r11
            int r24 = java.lang.Math.round(r19)
            r11 = r17
            r25 = 2
            r12 = r9
            r26 = 1
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r1
            r1 = r15
            r27 = 4
            r15 = r24
            r16 = r5
            r10.a(r11, r12, r13, r14, r15, r16)
            goto L_0x01d0
        L_0x015e:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            bfd r10 = r0.o
            int r13 = java.lang.Math.round(r18)
            int r11 = r17.getMeasuredHeight()
            int r14 = r5 - r11
            int r11 = java.lang.Math.round(r18)
            int r12 = r17.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r17
            r12 = r9
            r16 = r5
            r10.a(r11, r12, r13, r14, r15, r16)
            goto L_0x01d0
        L_0x0188:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            if (r29 == 0) goto L_0x01b3
            bfd r10 = r0.o
            int r11 = java.lang.Math.round(r19)
            int r12 = r17.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            int r11 = r17.getMeasuredHeight()
            int r16 = r8 + r11
            r11 = r17
            r12 = r9
            r14 = r8
            r10.a(r11, r12, r13, r14, r15, r16)
            goto L_0x01d0
        L_0x01b3:
            bfd r10 = r0.o
            int r13 = java.lang.Math.round(r18)
            int r11 = java.lang.Math.round(r18)
            int r12 = r17.getMeasuredWidth()
            int r15 = r11 + r12
            int r11 = r17.getMeasuredHeight()
            int r16 = r8 + r11
            r11 = r17
            r12 = r9
            r14 = r8
            r10.a(r11, r12, r13, r14, r15, r16)
        L_0x01d0:
            int r10 = r17.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r18 = r18 + r10
            int r10 = r17.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            if (r29 == 0) goto L_0x01f7
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r17
            r12 = r21
            r14 = r20
            r10.a(r11, r12, r13, r14, r15)
            goto L_0x0203
        L_0x01f7:
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r17
            r12 = r20
            r14 = r21
            r10.a(r11, r12, r13, r14, r15)
        L_0x0203:
            r10 = r18
            r12 = r19
            goto L_0x0212
        L_0x0208:
            r23 = r1
            r22 = r14
            r25 = 2
            r26 = 1
            r27 = 4
        L_0x0212:
            int r14 = r22 + 1
            r1 = r23
            r13 = 1
            r15 = 4
            goto L_0x00d3
        L_0x021a:
            r23 = r1
            int r1 = r9.g
            int r8 = r8 + r1
            int r1 = r9.g
            int r5 = r5 - r1
            int r3 = r3 + 1
            r1 = r23
            goto L_0x0020
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.a(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r35 - r33
            int r5 = r5 - r3
            java.util.List<bfc> r3 = r0.p
            int r3 = r3.size()
            r8 = r5
            r5 = r4
            r4 = 0
        L_0x0020:
            if (r4 >= r3) goto L_0x021f
            java.util.List<bfc> r9 = r0.p
            java.lang.Object r9 = r9.get(r4)
            bfc r9 = (defpackage.bfc) r9
            boolean r10 = r0.d(r4)
            if (r10 == 0) goto L_0x0034
            int r10 = r0.l
            int r5 = r5 + r10
            int r8 = r8 - r10
        L_0x0034:
            int r10 = r0.c
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00cc
            if (r10 == r14) goto L_0x00c2
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00ad
            r12 = 3
            if (r10 == r12) goto L_0x0094
            if (r10 == r15) goto L_0x007a
            r12 = 5
            if (r10 != r12) goto L_0x0064
            int r10 = r9.a()
            if (r10 == 0) goto L_0x005b
            int r12 = r9.e
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r10 = r12 / r10
            goto L_0x005c
        L_0x005b:
            r10 = 0
        L_0x005c:
            float r12 = (float) r1
            float r12 = r12 + r10
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r10
            goto L_0x00d1
        L_0x0064:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r10 = r9.a()
            if (r10 == 0) goto L_0x0089
            int r12 = r9.e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r10 = r12 / r10
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            float r12 = (float) r1
            float r13 = r10 / r13
            float r12 = r12 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00d1
        L_0x0094:
            float r12 = (float) r1
            int r7 = r9.a()
            if (r7 == r14) goto L_0x009f
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a1
        L_0x009f:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a1:
            int r10 = r9.e
            int r10 = r6 - r10
            float r10 = (float) r10
            float r7 = r10 / r7
            int r10 = r6 - r2
            float r13 = (float) r10
            r10 = r7
            goto L_0x00d1
        L_0x00ad:
            float r7 = (float) r1
            int r10 = r9.e
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r12 = r7 + r10
            int r7 = r6 - r2
            float r7 = (float) r7
            int r10 = r9.e
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r13 = r7 - r10
            goto L_0x00d0
        L_0x00c2:
            int r7 = r9.e
            int r7 = r6 - r7
            int r7 = r7 + r2
            float r12 = (float) r7
            int r7 = r9.e
            int r7 = r7 - r1
            goto L_0x00cf
        L_0x00cc:
            float r12 = (float) r1
            int r7 = r6 - r2
        L_0x00cf:
            float r13 = (float) r7
        L_0x00d0:
            r10 = 0
        L_0x00d1:
            float r7 = java.lang.Math.max(r10, r11)
            r10 = r13
            r13 = 0
        L_0x00d7:
            int r11 = r9.h
            if (r13 >= r11) goto L_0x0215
            int r11 = r9.o
            int r11 = r11 + r13
            android.view.View r18 = r0.c(r11)
            if (r18 == 0) goto L_0x0209
            int r15 = r18.getVisibility()
            r14 = 8
            if (r15 == r14) goto L_0x0209
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r12 = r12 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r10 = r10 - r14
            boolean r11 = r0.b(r11, r13)
            if (r11 == 0) goto L_0x010d
            int r11 = r0.k
            float r14 = (float) r11
            float r12 = r12 + r14
            float r10 = r10 - r14
            r20 = r10
            r21 = r11
            r19 = r12
            goto L_0x0113
        L_0x010d:
            r20 = r10
            r19 = r12
            r21 = 0
        L_0x0113:
            int r10 = r9.h
            r14 = 1
            int r10 = r10 - r14
            if (r13 != r10) goto L_0x0126
            int r10 = r0.i
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0128
            int r10 = r0.k
            r22 = r10
            goto L_0x012a
        L_0x0126:
            r16 = 4
        L_0x0128:
            r22 = 0
        L_0x012a:
            if (r30 == 0) goto L_0x0188
            if (r31 == 0) goto L_0x0160
            bfd r10 = r0.o
            r17 = 1
            int r11 = r18.getMeasuredWidth()
            int r23 = r8 - r11
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r24 = r11 - r12
            int r25 = java.lang.Math.round(r20)
            r11 = r18
            r12 = r9
            r26 = r13
            r13 = r17
            r27 = 1
            r14 = r23
            r28 = r15
            r23 = 4
            r15 = r24
            r16 = r8
            r17 = r25
            r10.a(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cf
        L_0x0160:
            r26 = r13
            r28 = r15
            r23 = 4
            r27 = 1
            bfd r10 = r0.o
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r14 = r8 - r11
            int r15 = java.lang.Math.round(r19)
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r8
            r10.a(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cf
        L_0x0188:
            r26 = r13
            r28 = r15
            r23 = 4
            r27 = 1
            if (r31 == 0) goto L_0x01b1
            bfd r10 = r0.o
            r13 = 0
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r18.getMeasuredWidth()
            int r16 = r5 + r11
            int r17 = java.lang.Math.round(r20)
            r11 = r18
            r12 = r9
            r14 = r5
            r10.a(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cf
        L_0x01b1:
            bfd r10 = r0.o
            r13 = 0
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r16 = r5 + r11
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r14 = r5
            r10.a(r11, r12, r13, r14, r15, r16, r17)
        L_0x01cf:
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r28
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r19 = r19 + r10
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            if (r31 == 0) goto L_0x01f8
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r22
            r15 = r21
            r10.a(r11, r12, r13, r14, r15)
            goto L_0x0204
        L_0x01f8:
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r21
            r15 = r22
            r10.a(r11, r12, r13, r14, r15)
        L_0x0204:
            r12 = r19
            r10 = r20
            goto L_0x020f
        L_0x0209:
            r26 = r13
            r23 = 4
            r27 = 1
        L_0x020f:
            int r13 = r26 + 1
            r14 = 1
            r15 = 4
            goto L_0x00d7
        L_0x0215:
            int r7 = r9.g
            int r5 = r5 + r7
            int r7 = r9.g
            int r8 = r8 - r7
            int r4 = r4 + 1
            goto L_0x0020
        L_0x021f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.a(boolean, boolean, int, int, int, int):void");
    }

    private void b(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(i2, i3, i4 + i2, this.k + i3);
            this.g.draw(canvas);
        }
    }

    private void b(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            bfc bfc = (bfc) this.p.get(i2);
            for (int i3 = 0; i3 < bfc.h; i3++) {
                int i4 = bfc.o + i3;
                View c2 = c(i4);
                if (!(c2 == null || c2.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) c2.getLayoutParams();
                    if (b(i4, i3)) {
                        b(canvas, bfc.a, z2 ? c2.getBottom() + layoutParams.bottomMargin : (c2.getTop() - layoutParams.topMargin) - this.k, bfc.g);
                    }
                    if (i3 == bfc.h - 1 && (this.i & 4) > 0) {
                        b(canvas, bfc.a, z2 ? (c2.getTop() - layoutParams.topMargin) - this.k : c2.getBottom() + layoutParams.bottomMargin, bfc.g);
                    }
                }
            }
            if (d(i2)) {
                a(canvas, z ? bfc.c : bfc.a - this.l, paddingTop, max);
            }
            if (f(i2) && (this.j & 4) > 0) {
                a(canvas, z ? bfc.a - this.l : bfc.c, paddingTop, max);
            }
        }
    }

    private void b(Drawable drawable) {
        if (drawable != this.h) {
            this.h = drawable;
            if (drawable != null) {
                this.l = drawable.getIntrinsicWidth();
            } else {
                this.l = 0;
            }
            a();
            requestLayout();
        }
    }

    private boolean b(int i2, int i3) {
        return c(i2, i3) ? j() ? (this.j & 1) != 0 : (this.i & 1) != 0 : j() ? (this.j & 2) != 0 : (this.i & 2) != 0;
    }

    private View c(int i2) {
        if (i2 >= 0) {
            int[] iArr = this.m;
            if (i2 < iArr.length) {
                return getChildAt(iArr[i2]);
            }
        }
        return null;
    }

    private boolean c(int i2, int i3) {
        for (int i4 = 1; i4 <= i3; i4++) {
            View c2 = c(i2 - i4);
            if (c2 != null && c2.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean d(int i2) {
        if (i2 >= 0 && i2 < this.p.size()) {
            if (e(i2)) {
                return j() ? (this.i & 1) != 0 : (this.j & 1) != 0;
            }
            if (j()) {
                return (this.i & 2) != 0;
            }
            if ((this.j & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean e(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (((bfc) this.p.get(i3)).a() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean f(int i2) {
        if (i2 >= 0 && i2 < this.p.size()) {
            for (int i3 = i2 + 1; i3 < this.p.size(); i3++) {
                if (((bfc) this.p.get(i3)).a() > 0) {
                    return false;
                }
            }
            if (j()) {
                return (this.i & 4) != 0;
            }
            if ((this.j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public final int a(View view, int i2, int i3) {
        int i4;
        int i5 = 0;
        if (j()) {
            if (b(i2, i3)) {
                i5 = 0 + this.l;
            }
            if ((this.j & 4) <= 0) {
                return i5;
            }
            i4 = this.l;
        } else {
            if (b(i2, i3)) {
                i5 = 0 + this.k;
            }
            if ((this.i & 4) <= 0) {
                return i5;
            }
            i4 = this.k;
        }
        return i5 + i4;
    }

    public final View a(int i2) {
        return getChildAt(i2);
    }

    public final void a(int i2, View view) {
    }

    public final void a(View view, int i2, int i3, bfc bfc) {
        if (b(i2, i3)) {
            if (j()) {
                bfc.e += this.l;
                bfc.f += this.l;
                return;
            }
            bfc.e += this.k;
            bfc.f += this.k;
        }
    }

    public final void a(bfc bfc) {
        if (j()) {
            if ((this.j & 4) > 0) {
                bfc.e += this.l;
                bfc.f += this.l;
            }
        } else if ((this.i & 4) > 0) {
            bfc.e += this.k;
            bfc.f += this.k;
        }
    }

    public final void a(List<bfc> list) {
        this.p = list;
    }

    public final int a_(int i2, int i3, int i4) {
        return getChildMeasureSpec(i2, i3, i4);
    }

    public final int a_(View view) {
        return 0;
    }

    public void addView(View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        this.m = this.o.a(view, i2, layoutParams, this.n);
        super.addView(view, i2, layoutParams);
    }

    public final int b() {
        return getChildCount();
    }

    public final int b(int i2, int i3, int i4) {
        return getChildMeasureSpec(i2, i3, i4);
    }

    public final View b(int i2) {
        return c(i2);
    }

    public final int c() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final int g() {
        return this.b;
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final int h() {
        return this.e;
    }

    public final int i() {
        return this.d;
    }

    public final boolean j() {
        int i2 = this.a;
        return i2 == 0 || i2 == 1;
    }

    public final int k() {
        int i2 = Integer.MIN_VALUE;
        for (bfc bfc : this.p) {
            i2 = Math.max(i2, bfc.e);
        }
        return i2;
    }

    public final int l() {
        int size = this.p.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            bfc bfc = (bfc) this.p.get(i3);
            if (d(i3)) {
                i2 += j() ? this.k : this.l;
            }
            if (f(i3)) {
                i2 += j() ? this.k : this.l;
            }
            i2 += bfc.g;
        }
        return i2;
    }

    public final int m() {
        return this.f;
    }

    public final List<bfc> n() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.h != null || this.g != null) {
            if (this.i != 0 || this.j != 0) {
                int f2 = ip.f(this);
                int i2 = this.a;
                boolean z = false;
                boolean z2 = true;
                if (i2 == 0) {
                    boolean z3 = f2 == 1;
                    if (this.b == 2) {
                        z = true;
                    }
                    a(canvas, z3, z);
                } else if (i2 == 1) {
                    boolean z4 = f2 != 1;
                    if (this.b == 2) {
                        z = true;
                    }
                    a(canvas, z4, z);
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        if (f2 == 1) {
                            z = true;
                        }
                        if (this.b == 2) {
                            z = !z;
                        }
                        b(canvas, z, true);
                    }
                } else {
                    if (f2 != 1) {
                        z2 = false;
                    }
                    if (this.b == 2) {
                        z2 = !z2;
                    }
                    b(canvas, z2, false);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int f2 = ip.f(this);
        int i6 = this.a;
        boolean z2 = false;
        if (i6 == 0) {
            a(f2 == 1, i2, i3, i4, i5);
        } else if (i6 == 1) {
            a(f2 != 1, i2, i3, i4, i5);
        } else if (i6 == 2) {
            if (f2 == 1) {
                z2 = true;
            }
            a(this.b == 2 ? !z2 : z2, false, i2, i3, i4, i5);
        } else if (i6 == 3) {
            if (f2 == 1) {
                z2 = true;
            }
            a(this.b == 2 ? !z2 : z2, true, i2, i3, i4, i5);
        } else {
            StringBuilder sb = new StringBuilder("Invalid flex direction is set: ");
            sb.append(this.a);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        if (this.o.b(this.n)) {
            this.m = this.o.a(this.n);
        }
        int i4 = this.a;
        if (i4 == 0 || i4 == 1) {
            a(i2, i3);
        } else if (i4 == 2 || i4 == 3) {
            this.p.clear();
            this.q.a();
            this.o.a(this.q, i2, i3);
            this.p = this.q.a;
            this.o.a(i2, i3);
            this.o.b(i2, i3, getPaddingLeft() + getPaddingRight());
            this.o.a();
            a(this.a, i2, i3, this.q.b);
        } else {
            StringBuilder sb = new StringBuilder("Invalid value for the flex direction is set: ");
            sb.append(this.a);
            throw new IllegalStateException(sb.toString());
        }
    }
}
