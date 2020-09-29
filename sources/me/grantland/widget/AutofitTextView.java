package me.grantland.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;

public class AutofitTextView extends AppCompatTextView implements uue, c {
    private final uud a = new uud(this);
    private wld b;

    public AutofitTextView(Context context) {
        super(context);
        a(null, 0);
    }

    public AutofitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    public AutofitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }

    private void a(AttributeSet attributeSet, int i) {
        this.b = wld.a(this, attributeSet, i).a((c) this);
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        wld wld = this.b;
        if (wld != null && !wld.b) {
            Context context = wld.a.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            wld.b(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        }
    }

    public void setLines(int i) {
        super.setLines(i);
        wld wld = this.b;
        if (wld != null) {
            wld.a(i);
        }
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        wld wld = this.b;
        if (wld != null) {
            wld.a(i);
        }
    }

    public final void a(b bVar) {
        this.a.a(bVar);
    }

    public final b c() {
        return this.a.a;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }
}
