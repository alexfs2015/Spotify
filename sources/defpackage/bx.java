package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bx reason: default package */
public final class bx {
    private static final RectF f = new RectF();
    private static ConcurrentHashMap<String, Method> g = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> h = new ConcurrentHashMap<>();
    public int a = 0;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public int[] e = new int[0];
    private boolean i = false;
    private boolean j = false;
    private TextPaint k;
    private final TextView l;
    private final Context m;

    bx(TextView textView) {
        this.l = textView;
        this.m = this.l.getContext();
    }

    /* access modifiers changed from: 0000 */
    public final void a(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.m.obtainStyledAttributes(attributeSet, a.ag, i2, 0);
        if (obtainStyledAttributes.hasValue(a.al)) {
            this.a = obtainStyledAttributes.getInt(a.al, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(a.ak) ? obtainStyledAttributes.getDimension(a.ak, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(a.ai) ? obtainStyledAttributes.getDimension(a.ai, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(a.ah) ? obtainStyledAttributes.getDimension(a.ah, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(a.aj)) {
            int resourceId = obtainStyledAttributes.getResourceId(a.aj, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!f()) {
            this.a = 0;
        } else if (this.a == 1) {
            if (!this.j) {
                DisplayMetrics displayMetrics = this.m.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a(dimension2, dimension3, dimension);
            }
            d();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (f()) {
            if (i2 == 0) {
                e();
            } else if (i2 == 1) {
                DisplayMetrics displayMetrics = this.m.getResources().getDisplayMetrics();
                a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (d()) {
                    a();
                }
            } else {
                StringBuilder sb = new StringBuilder("Unknown auto-size text type: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3, int i4, int i5) {
        if (f()) {
            DisplayMetrics displayMetrics = this.m.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (d()) {
                a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int[] iArr, int i2) {
        if (f()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.m.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                this.e = a(iArr2);
                if (!c()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.j = false;
            }
            if (d()) {
                a();
            }
        }
    }

    private void a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.e = a(iArr);
            c();
        }
    }

    private boolean c() {
        int length = this.e.length;
        this.j = length > 0;
        if (this.j) {
            this.a = 1;
            int[] iArr = this.e;
            this.c = (float) iArr[0];
            this.d = (float) iArr[length - 1];
            this.b = -1.0f;
        }
        return this.j;
    }

    private static int[] a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void a(float f2, float f3, float f4) {
        String str = "px) is less or equal to (0px)";
        if (f2 <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f2);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f3 <= f2) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f3);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f2);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.c = f2;
            this.d = f3;
            this.b = f4;
            this.j = false;
        } else {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f4);
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    private boolean d() {
        if (!f() || this.a != 1) {
            this.i = false;
        } else {
            if (!this.j || this.e.length == 0) {
                int floor = ((int) Math.floor((double) ((this.d - this.c) / this.b))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round(this.c + (((float) i2) * this.b));
                }
                this.e = a(iArr);
            }
            this.i = true;
        }
        return this.i;
    }

    public final void a() {
        boolean z;
        int i2;
        if (b()) {
            if (this.i) {
                if (this.l.getMeasuredHeight() > 0 && this.l.getMeasuredWidth() > 0) {
                    if (VERSION.SDK_INT >= 29) {
                        z = this.l.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) a((Object) this.l, "getHorizontallyScrolling", (T) Boolean.FALSE)).booleanValue();
                    }
                    if (z) {
                        i2 = 1048576;
                    } else {
                        i2 = (this.l.getMeasuredWidth() - this.l.getTotalPaddingLeft()) - this.l.getTotalPaddingRight();
                    }
                    int height = (this.l.getHeight() - this.l.getCompoundPaddingBottom()) - this.l.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        synchronized (f) {
                            f.setEmpty();
                            f.right = (float) i2;
                            f.bottom = (float) height;
                            float a2 = (float) a(f);
                            if (a2 != this.l.getTextSize()) {
                                a(0, a2);
                            }
                        }
                    }
                }
                return;
            }
            this.i = true;
        }
    }

    private void e() {
        this.a = 0;
        this.c = -1.0f;
        this.d = -1.0f;
        this.b = -1.0f;
        this.e = new int[0];
        this.i = false;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, float f2) {
        Resources resources;
        Context context = this.m;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        a(TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics()));
    }

    private void a(float f2) {
        if (f2 != this.l.getPaint().getTextSize()) {
            this.l.getPaint().setTextSize(f2);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.l.isInLayout() : false;
            if (this.l.getLayout() != null) {
                this.i = false;
                try {
                    Method a2 = a("nullLayouts");
                    if (a2 != null) {
                        a2.invoke(this.l, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.l.requestLayout();
                } else {
                    this.l.forceLayout();
                }
                this.l.invalidate();
            }
        }
    }

    private int a(RectF rectF) {
        int length = this.e.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (a(this.e[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.e[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private void b(int i2) {
        TextPaint textPaint = this.k;
        if (textPaint == null) {
            this.k = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.k.set(this.l.getPaint());
        this.k.setTextSize((float) i2);
    }

    private StaticLayout a(CharSequence charSequence, Alignment alignment, int i2, int i3) {
        if (VERSION.SDK_INT >= 23) {
            return b(charSequence, alignment, i2, i3);
        }
        if (VERSION.SDK_INT >= 16) {
            CharSequence charSequence2 = charSequence;
            StaticLayout staticLayout = new StaticLayout(charSequence2, this.k, i2, alignment, this.l.getLineSpacingMultiplier(), this.l.getLineSpacingExtra(), this.l.getIncludeFontPadding());
            return staticLayout;
        }
        float floatValue = ((Float) b(this.l, "mSpacingMult", Float.valueOf(1.0f))).floatValue();
        float floatValue2 = ((Float) b(this.l, "mSpacingAdd", Float.valueOf(0.0f))).floatValue();
        boolean booleanValue = ((Boolean) b(this.l, "mIncludePad", Boolean.TRUE)).booleanValue();
        StaticLayout staticLayout2 = new StaticLayout(charSequence, this.k, i2, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout2;
    }

    private boolean a(int i2, RectF rectF) {
        CharSequence text = this.l.getText();
        TransformationMethod transformationMethod = this.l.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.l);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.l.getMaxLines() : -1;
        b(i2);
        StaticLayout a2 = a(text, (Alignment) a((Object) this.l, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && ((float) a2.getHeight()) <= rectF.bottom;
    }

    private StaticLayout b(CharSequence charSequence, Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic;
        Builder obtain = Builder.obtain(charSequence, 0, charSequence.length(), this.k, i2);
        Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.l.getLineSpacingExtra(), this.l.getLineSpacingMultiplier()).setIncludePad(this.l.getIncludeFontPadding()).setBreakStrategy(this.l.getBreakStrategy()).setHyphenationFrequency(this.l.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            if (VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = this.l.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) a((Object) this.l, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r2 = new java.lang.StringBuilder("Failed to invoke TextView#");
        r2.append(r3);
        r2.append("() method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T a(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            java.lang.reflect.Method r0 = a(r3)     // Catch:{ Exception -> 0x000e }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x000e }
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x000e }
            goto L_0x001d
        L_0x000c:
            r2 = move-exception
            goto L_0x001e
        L_0x000e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x000c }
            java.lang.String r0 = "Failed to invoke TextView#"
            r2.<init>(r0)     // Catch:{ all -> 0x000c }
            r2.append(r3)     // Catch:{ all -> 0x000c }
            java.lang.String r3 = "() method"
            r2.append(r3)     // Catch:{ all -> 0x000c }
        L_0x001d:
            return r4
        L_0x001e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private static <T> T b(Object obj, String str, T t) {
        try {
            Field b2 = b(str);
            if (b2 == null) {
                return t;
            }
            return b2.get(obj);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            return t;
        }
    }

    private static Method a(String str) {
        try {
            Method method = (Method) g.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    g.put(str, method);
                }
            }
            return method;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            return null;
        }
    }

    private static Field b(String str) {
        try {
            Field field = (Field) h.get(str);
            if (field == null) {
                field = TextView.class.getDeclaredField(str);
                if (field != null) {
                    field.setAccessible(true);
                    h.put(str, field);
                }
            }
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            return null;
        }
    }

    public final boolean b() {
        return f() && this.a != 0;
    }

    private boolean f() {
        return !(this.l instanceof AppCompatEditText);
    }
}
