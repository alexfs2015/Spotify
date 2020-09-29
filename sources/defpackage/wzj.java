package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wzj reason: default package */
public final class wzj {
    public final TextView a;
    public boolean b;
    private final TextPaint c;
    private float d;
    private int e;
    private float f;
    private float g;
    private float h;
    private boolean i;
    private ArrayList<c> j;
    private final TextWatcher k = new b(this, 0);
    private final OnLayoutChangeListener l = new a(this, 0);

    /* renamed from: wzj$a */
    class a implements OnLayoutChangeListener {
        private a() {
        }

        /* synthetic */ a(wzj wzj, byte b) {
            this();
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            wzj.this.a();
        }
    }

    /* renamed from: wzj$b */
    class b extends jzg {
        private b() {
        }

        /* synthetic */ b(wzj wzj, byte b) {
            this();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            wzj.this.a();
        }
    }

    /* renamed from: wzj$c */
    public interface c {
    }

    private wzj(TextView textView) {
        float f2 = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.a = textView;
        this.c = new TextPaint();
        b(textView.getTextSize());
        this.e = textView.getTransformationMethod() instanceof SingleLineTransformationMethod ? 1 : textView.getMaxLines();
        this.f = f2 * 8.0f;
        this.g = this.d;
        this.h = 0.5f;
    }

    private static float a(CharSequence charSequence, TextPaint textPaint, float f2, int i2, float f3, float f4, float f5, DisplayMetrics displayMetrics) {
        int i3;
        int i4;
        float f6;
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint2 = textPaint;
        float f7 = f2;
        int i5 = i2;
        float f8 = f3;
        float f9 = f4;
        while (true) {
            float f10 = (f8 + f9) / 2.0f;
            StaticLayout staticLayout = null;
            textPaint2.setTextSize(TypedValue.applyDimension(0, f10, displayMetrics));
            if (i5 != 1) {
                i3 = 1;
                staticLayout = new StaticLayout(charSequence, textPaint, (int) f7, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                i4 = staticLayout.getLineCount();
            } else {
                i3 = 1;
                i4 = 1;
            }
            if (i4 <= i5 && !a(staticLayout, charSequence2)) {
                if (i4 >= i5) {
                    float f11 = 0.0f;
                    if (i5 == i3) {
                        f6 = textPaint2.measureText(charSequence2, 0, charSequence.length());
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            if (staticLayout.getLineWidth(i6) > f11) {
                                f11 = staticLayout.getLineWidth(i6);
                            }
                        }
                        f6 = f11;
                    }
                    if (f9 - f8 < f5) {
                        return f8;
                    }
                    if (f6 <= f7) {
                        if (f6 >= f7) {
                            return f10;
                        }
                    }
                }
                f8 = f10;
            } else if (f9 - f8 < f5) {
                return f8;
            }
            f9 = f10;
        }
    }

    private wzj a(int i2, float f2) {
        Context context = this.a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        d(TypedValue.applyDimension(i2, f2, system.getDisplayMetrics()));
        return this;
    }

    public static wzj a(TextView textView, AttributeSet attributeSet, int i2) {
        wzj wzj = new wzj(textView);
        boolean z = true;
        if (attributeSet != null) {
            Context context = textView.getContext();
            int i3 = (int) wzj.f;
            float f2 = wzj.h;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.wzk.a.a, i2, 0);
            z = obtainStyledAttributes.getBoolean(defpackage.wzk.a.d, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(defpackage.wzk.a.b, i3);
            float f3 = obtainStyledAttributes.getFloat(defpackage.wzk.a.c, f2);
            obtainStyledAttributes.recycle();
            wzj.a(0, (float) dimensionPixelSize).c(f3);
        }
        wzj.a(z);
        return wzj;
    }

    private wzj a(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (z) {
                this.a.addTextChangedListener(this.k);
                this.a.addOnLayoutChangeListener(this.l);
                a();
            } else {
                this.a.removeTextChangedListener(this.k);
                this.a.removeOnLayoutChangeListener(this.l);
                this.a.setTextSize(0, this.d);
            }
        }
        return this;
    }

    private void a(float f2, float f3) {
        ArrayList<c> arrayList = this.j;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private static void a(TextView textView, TextPaint textPaint, float f2, float f3, int i2, float f4) {
        TextView textView2 = textView;
        TextPaint textPaint2 = textPaint;
        float f5 = f3;
        int i3 = i2;
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        if (width > 0) {
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null) {
                text = transformationMethod.getTransformation(text, textView2);
            }
            CharSequence charSequence = text;
            Context context = textView.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            DisplayMetrics displayMetrics = system.getDisplayMetrics();
            textPaint2.set(textView.getPaint());
            textPaint2.setTextSize(f5);
            textPaint2.setTextSize(TypedValue.applyDimension(0, f5, displayMetrics));
            StaticLayout staticLayout = r1;
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, width, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if ((i3 == 1 && textPaint2.measureText(charSequence, 0, charSequence.length()) > ((float) width)) || staticLayout.getLineCount() > i3 || a(staticLayout, charSequence)) {
                f5 = a(charSequence, textPaint, (float) width, i2, 0.0f, f3, f4, displayMetrics);
            }
            if (f5 < f2) {
                f5 = f2;
            }
            textView2.setTextSize(0, f5);
        }
    }

    private static boolean a(StaticLayout staticLayout, CharSequence charSequence) {
        if (staticLayout == null || charSequence.length() == 0 || staticLayout.getLineCount() <= 1) {
            return false;
        }
        int lineCount = staticLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount - 1; i2++) {
            char charAt = charSequence.charAt(staticLayout.getLineEnd(i2) - 1);
            if (charAt != ' ' && charAt != '-' && charAt != 10) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(float f2, float f3) {
        return Math.abs(f2 - f3) > 1.0E-5f;
    }

    private wzj c(float f2) {
        if (b(this.h, f2)) {
            this.h = f2;
            a();
        }
        return this;
    }

    private void d(float f2) {
        if (b(f2, this.f)) {
            this.f = f2;
            a();
        }
    }

    public final wzj a(float f2) {
        return a(2, 14.0f);
    }

    public final wzj a(int i2) {
        if (this.e != i2) {
            this.e = i2;
            a();
        }
        return this;
    }

    public final wzj a(c cVar) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(cVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        float textSize = this.a.getTextSize();
        this.b = true;
        a(this.a, this.c, this.f, this.g, this.e, this.h);
        this.b = false;
        float textSize2 = this.a.getTextSize();
        if (b(textSize2, textSize)) {
            a(textSize2, textSize);
        }
    }

    public void b(float f2) {
        if (b(this.d, f2)) {
            this.d = f2;
        }
    }
}
