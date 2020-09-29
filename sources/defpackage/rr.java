package defpackage;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: rr reason: default package */
public final class rr {

    /* renamed from: rr$a */
    static class a implements TypeEvaluator<b[]> {
        private b[] a;

        public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            b[] bVarArr = (b[]) obj;
            b[] bVarArr2 = (b[]) obj2;
            if (ge.a(bVarArr, bVarArr2)) {
                if (!ge.a(this.a, bVarArr)) {
                    this.a = ge.a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.a[i].a(bVarArr[i], bVarArr2[i], f);
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }

        a() {
        }
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator a(Context context, Resources resources, Theme theme, int i, float f) {
        String str = "Can't load animation resource ID #0x";
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator a2 = a(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
            if (animation != null) {
                animation.close();
            }
            return a2;
        } catch (XmlPullParserException e) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(Integer.toHexString(i));
            NotFoundException notFoundException = new NotFoundException(sb.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(Integer.toHexString(i));
            NotFoundException notFoundException2 = new NotFoundException(sb2.toString());
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !a(i7)) && (!z2 || !a(i8))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            b[] b = ge.b(string);
            b[] b2 = ge.b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    a aVar = new a();
                    if (b2 == null) {
                        return PropertyValuesHolder.ofObject(str, aVar, new Object[]{b});
                    } else if (ge.a(b, b2)) {
                        propertyValuesHolder = PropertyValuesHolder.ofObject(str, aVar, new Object[]{b, b2});
                    } else {
                        StringBuilder sb = new StringBuilder(" Can't morph from ");
                        sb.append(string);
                        sb.append(" to ");
                        sb.append(string2);
                        throw new InflateException(sb.toString());
                    }
                } else if (b2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, new a(), new Object[]{b2});
                }
            }
            return propertyValuesHolder;
        }
        TypeEvaluator a2 = i == 3 ? rs.a() : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f2, f3});
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f2});
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f});
            }
        } else if (z) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (a(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (a(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i5, i6});
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i5});
            }
        } else if (z2) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (a(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i4});
        }
        PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolder;
        if (propertyValuesHolder2 == null || a2 == null) {
            return propertyValuesHolder2;
        }
        propertyValuesHolder2.setEvaluator(a2);
        return propertyValuesHolder2;
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray typedArray3 = typedArray;
        TypedArray typedArray4 = typedArray2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long a2 = (long) gc.a(typedArray3, xmlPullParser2, "duration", 1, 300);
        long a3 = (long) gc.a(typedArray3, xmlPullParser2, "startOffset", 2, 0);
        int a4 = gc.a(typedArray3, xmlPullParser2, "valueType", 7, 4);
        if (gc.a(xmlPullParser2, "valueFrom") && gc.a(xmlPullParser2, "valueTo")) {
            if (a4 == 4) {
                TypedValue peekValue = typedArray3.peekValue(5);
                boolean z = peekValue != null;
                int i = z ? peekValue.type : 0;
                TypedValue peekValue2 = typedArray3.peekValue(6);
                boolean z2 = peekValue2 != null;
                a4 = ((!z || !a(i)) && (!z2 || !a(z2 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder a5 = a(typedArray3, a4, 5, 6, "");
            if (a5 != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{a5});
            }
        }
        valueAnimator2.setDuration(a2);
        valueAnimator2.setStartDelay(a3);
        valueAnimator2.setRepeatCount(gc.a(typedArray3, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(gc.a(typedArray3, xmlPullParser2, "repeatMode", 4, 1));
        if (typedArray4 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String a6 = gc.a(typedArray4, xmlPullParser2, "pathData", 1);
            if (a6 != null) {
                String a7 = gc.a(typedArray4, xmlPullParser2, "propertyXName", 2);
                String a8 = gc.a(typedArray4, xmlPullParser2, "propertyYName", 3);
                if (a7 == null && a8 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(typedArray2.getPositionDescription());
                    sb.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(sb.toString());
                }
                a(ge.a(a6), objectAnimator, 0.5f * f, a7, a8);
                return;
            }
            objectAnimator.setPropertyName(gc.a(typedArray4, xmlPullParser2, "propertyName", 0));
        }
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00df
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00df
            r3 = 2
            if (r1 != r3) goto L_0x00db
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0042
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = a(r0, r1, r2, r3, r4, r5)
        L_0x003e:
            r3 = r18
            goto L_0x00b3
        L_0x0042:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005c
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003e
        L_0x005c:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0094
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = defpackage.rn.h
            r7 = r22
            android.content.res.TypedArray r6 = defpackage.gc.a(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = defpackage.gc.a(r6, r10, r0, r14, r14)
            r5 = r15
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17 = r6
            r6 = r16
            r7 = r25
            a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b3
        L_0x0094:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c3
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = a(r3, r8, r9, r10, r1)
            if (r1 == 0) goto L_0x00b2
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b2
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b2:
            r14 = 1
        L_0x00b3:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00be
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00be:
            r13.add(r0)
            goto L_0x000e
        L_0x00c3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown animator name: "
            r1.<init>(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00db:
            r3 = r18
            goto L_0x000e
        L_0x00df:
            if (r11 == 0) goto L_0x0108
            if (r13 == 0) goto L_0x0108
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00ed:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ff
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00ed
        L_0x00ff:
            if (r24 != 0) goto L_0x0105
            r11.playTogether(r1)
            goto L_0x0108
        L_0x0105:
            r11.playSequentially(r1)
        L_0x0108:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] a(android.content.Context r23, android.content.res.Resources r24, android.content.res.Resources.Theme r25, org.xmlpull.v1.XmlPullParser r26, android.util.AttributeSet r27) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r4 = 0
        L_0x0007:
            int r5 = r26.getEventType()
            r6 = 3
            r7 = 0
            if (r5 == r6) goto L_0x01e5
            r8 = 1
            if (r5 == r8) goto L_0x01e5
            r9 = 2
            if (r5 == r9) goto L_0x0019
            r26.next()
            goto L_0x0007
        L_0x0019:
            java.lang.String r5 = r26.getName()
            java.lang.String r10 = "propertyValuesHolder"
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x01dc
            int[] r5 = defpackage.rn.i
            r10 = r27
            android.content.res.TypedArray r5 = defpackage.gc.a(r0, r1, r10, r5)
            java.lang.String r11 = "propertyName"
            java.lang.String r11 = defpackage.gc.a(r5, r2, r11, r6)
            r12 = 4
            java.lang.String r13 = "valueType"
            int r9 = defpackage.gc.a(r5, r2, r13, r9, r12)
            r14 = r9
            r13 = 0
        L_0x003c:
            int r15 = r26.next()
            if (r15 == r6) goto L_0x0103
            if (r15 == r8) goto L_0x0103
            java.lang.String r15 = r26.getName()
            java.lang.String r3 = "keyframe"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00fc
            java.lang.String r3 = "value"
            if (r14 != r12) goto L_0x007a
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r26)
            int[] r15 = defpackage.rn.j
            android.content.res.TypedArray r14 = defpackage.gc.a(r0, r1, r14, r15)
            android.util.TypedValue r15 = defpackage.gc.b(r14, r2, r3, r7)
            if (r15 == 0) goto L_0x0067
            r18 = 1
            goto L_0x0069
        L_0x0067:
            r18 = 0
        L_0x0069:
            if (r18 == 0) goto L_0x0075
            int r15 = r15.type
            boolean r15 = a(r15)
            if (r15 == 0) goto L_0x0075
            r15 = 3
            goto L_0x0076
        L_0x0075:
            r15 = 0
        L_0x0076:
            r14.recycle()
            r14 = r15
        L_0x007a:
            android.util.AttributeSet r15 = android.util.Xml.asAttributeSet(r26)
            int[] r8 = defpackage.rn.j
            android.content.res.TypedArray r8 = defpackage.gc.a(r0, r1, r15, r8)
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r12 = "fraction"
            float r12 = defpackage.gc.a(r8, r2, r12, r6, r15)
            android.util.TypedValue r15 = defpackage.gc.b(r8, r2, r3, r7)
            r7 = 4
            if (r15 == 0) goto L_0x0096
            r19 = 1
            goto L_0x0098
        L_0x0096:
            r19 = 0
        L_0x0098:
            if (r14 != r7) goto L_0x00a8
            if (r19 == 0) goto L_0x00a6
            int r15 = r15.type
            boolean r15 = a(r15)
            if (r15 == 0) goto L_0x00a6
            r15 = 3
            goto L_0x00a9
        L_0x00a6:
            r15 = 0
            goto L_0x00a9
        L_0x00a8:
            r15 = r14
        L_0x00a9:
            if (r19 == 0) goto L_0x00ca
            if (r15 == 0) goto L_0x00bf
            r7 = 1
            if (r15 == r7) goto L_0x00b5
            if (r15 == r6) goto L_0x00b5
            r3 = 0
            r7 = 0
            goto L_0x00d6
        L_0x00b5:
            r7 = 0
            int r3 = defpackage.gc.a(r8, r2, r3, r7, r7)
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r12, r3)
            goto L_0x00d6
        L_0x00bf:
            r7 = 0
            r15 = 0
            float r3 = defpackage.gc.a(r8, r2, r3, r7, r15)
            android.animation.Keyframe r3 = android.animation.Keyframe.ofFloat(r12, r3)
            goto L_0x00d6
        L_0x00ca:
            r7 = 0
            if (r15 != 0) goto L_0x00d2
            android.animation.Keyframe r3 = android.animation.Keyframe.ofFloat(r12)
            goto L_0x00d6
        L_0x00d2:
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r12)
        L_0x00d6:
            java.lang.String r12 = "interpolator"
            r15 = 1
            int r12 = defpackage.gc.c(r8, r2, r12, r15, r7)
            r7 = r23
            if (r12 <= 0) goto L_0x00e8
            android.view.animation.Interpolator r12 = defpackage.rq.a(r7, r12)
            r3.setInterpolator(r12)
        L_0x00e8:
            r8.recycle()
            if (r3 == 0) goto L_0x00f8
            if (r13 != 0) goto L_0x00f5
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r13 = r8
        L_0x00f5:
            r13.add(r3)
        L_0x00f8:
            r26.next()
            goto L_0x00fe
        L_0x00fc:
            r7 = r23
        L_0x00fe:
            r7 = 0
            r8 = 1
            r12 = 4
            goto L_0x003c
        L_0x0103:
            r7 = r23
            if (r13 == 0) goto L_0x01c3
            int r3 = r13.size()
            if (r3 <= 0) goto L_0x01c3
            r8 = 0
            java.lang.Object r12 = r13.get(r8)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            int r8 = r3 + -1
            java.lang.Object r8 = r13.get(r8)
            android.animation.Keyframe r8 = (android.animation.Keyframe) r8
            float r15 = r8.getFraction()
            r6 = 1065353216(0x3f800000, float:1.0)
            int r20 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r20 >= 0) goto L_0x013d
            r17 = 0
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0130
            r8.setFraction(r6)
            goto L_0x013d
        L_0x0130:
            int r15 = r13.size()
            android.animation.Keyframe r8 = a(r8, r6)
            r13.add(r15, r8)
            int r3 = r3 + 1
        L_0x013d:
            float r8 = r12.getFraction()
            r15 = 0
            int r17 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0158
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x014e
            r12.setFraction(r15)
            goto L_0x0158
        L_0x014e:
            android.animation.Keyframe r8 = a(r12, r15)
            r12 = 0
            r13.add(r12, r8)
            int r3 = r3 + 1
        L_0x0158:
            android.animation.Keyframe[] r8 = new android.animation.Keyframe[r3]
            r13.toArray(r8)
            r12 = 0
        L_0x015e:
            if (r12 >= r3) goto L_0x01b4
            r13 = r8[r12]
            float r15 = r13.getFraction()
            r6 = 0
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x01ad
            if (r12 != 0) goto L_0x0171
            r13.setFraction(r6)
            goto L_0x01ad
        L_0x0171:
            int r6 = r3 + -1
            if (r12 != r6) goto L_0x017b
            r15 = 1065353216(0x3f800000, float:1.0)
            r13.setFraction(r15)
            goto L_0x01ad
        L_0x017b:
            r15 = 1065353216(0x3f800000, float:1.0)
            int r13 = r12 + 1
            r15 = r12
        L_0x0180:
            if (r13 >= r6) goto L_0x0196
            r21 = r8[r13]
            float r21 = r21.getFraction()
            r17 = 0
            int r21 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r21 >= 0) goto L_0x0198
            int r15 = r13 + 1
            r22 = r15
            r15 = r13
            r13 = r22
            goto L_0x0180
        L_0x0196:
            r17 = 0
        L_0x0198:
            int r6 = r15 + 1
            r6 = r8[r6]
            float r6 = r6.getFraction()
            int r13 = r12 + -1
            r13 = r8[r13]
            float r13 = r13.getFraction()
            float r6 = r6 - r13
            a(r8, r6, r12, r15)
            goto L_0x01af
        L_0x01ad:
            r17 = 0
        L_0x01af:
            int r12 = r12 + 1
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x015e
        L_0x01b4:
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofKeyframe(r11, r8)
            r6 = 3
            if (r14 != r6) goto L_0x01c4
            rs r6 = defpackage.rs.a()
            r3.setEvaluator(r6)
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            if (r3 != 0) goto L_0x01cc
            r6 = 0
            r8 = 1
            android.animation.PropertyValuesHolder r3 = a(r5, r9, r6, r8, r11)
        L_0x01cc:
            if (r3 == 0) goto L_0x01d8
            if (r4 != 0) goto L_0x01d5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01d5:
            r4.add(r3)
        L_0x01d8:
            r5.recycle()
            goto L_0x01e0
        L_0x01dc:
            r7 = r23
            r10 = r27
        L_0x01e0:
            r26.next()
            goto L_0x0007
        L_0x01e5:
            r6 = 0
            if (r4 == 0) goto L_0x01fe
            int r0 = r4.size()
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r0]
        L_0x01ee:
            if (r6 >= r0) goto L_0x01fb
            java.lang.Object r1 = r4.get(r6)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r3[r6] = r1
            int r6 = r6 + 1
            goto L_0x01ee
        L_0x01fb:
            r16 = r3
            goto L_0x0200
        L_0x01fe:
            r16 = 0
        L_0x0200:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static void a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static ObjectAnimator a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static ValueAnimator a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a2 = gc.a(resources, theme, attributeSet, rn.g);
        TypedArray a3 = gc.a(resources, theme, attributeSet, rn.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        a(valueAnimator, a2, a3, f, xmlPullParser);
        int c = gc.c(a2, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(rq.a(context, c));
        }
        a2.recycle();
        if (a3 != null) {
            a3.recycle();
        }
        return valueAnimator;
    }
}
