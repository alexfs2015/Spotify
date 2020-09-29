package me.grantland.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;

public class AutofitTextView extends AppCompatTextView implements vfv, c {
    private final vfu a = new vfu(this);
    private wzj b;

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
        this.b = wzj.a(this, attributeSet, i).a((c) this);
    }

    public final void a(b bVar) {
        this.a.a(bVar);
    }

    public final b c() {
        return this.a.a;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.b();
    }

    public void setLines(int i) {
        super.setLines(i);
        wzj wzj = this.b;
        if (wzj != null) {
            wzj.a(i);
        }
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        wzj wzj = this.b;
        if (wzj != null) {
            wzj.a(i);
        }
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        wzj wzj = this.b;
        if (wzj != null && !wzj.b) {
            Context context = wzj.a.getContext();
            Resources system = Resources.getSystem();
            if (context != null) {
                system = context.getResources();
            }
            wzj.b(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
        }
    }
}
