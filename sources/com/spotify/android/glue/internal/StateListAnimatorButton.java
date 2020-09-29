package com.spotify.android.glue.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.spotify.music.R;

public class StateListAnimatorButton extends AppCompatButton implements vfv {
    private vfu a;
    private c b = new b(this, 0);
    private fud c;

    class a implements c {
        private float a;
        private float b;

        private a() {
            this.a = 1.0f;
            this.b = 1.0f;
        }

        /* synthetic */ a(StateListAnimatorButton stateListAnimatorButton, byte b2) {
            this();
        }

        public final float a() {
            return this.a;
        }

        public final void a(float f) {
            this.a = f;
            ip.d(StateListAnimatorButton.this);
        }

        public final void a(Canvas canvas) {
            canvas.save();
            canvas.translate(((float) StateListAnimatorButton.this.getWidth()) / 2.0f, ((float) StateListAnimatorButton.this.getHeight()) / 2.0f);
            canvas.scale(this.a, this.b);
            canvas.translate(((float) (-StateListAnimatorButton.this.getWidth())) / 2.0f, ((float) (-StateListAnimatorButton.this.getHeight())) / 2.0f);
            StateListAnimatorButton.super.onDraw(canvas);
            canvas.restore();
        }

        public final float b() {
            return this.b;
        }

        public final void b(float f) {
            this.b = f;
            ip.d(StateListAnimatorButton.this);
        }
    }

    class b implements c {
        private b() {
        }

        /* synthetic */ b(StateListAnimatorButton stateListAnimatorButton, byte b) {
            this();
        }

        public final float a() {
            return StateListAnimatorButton.super.getScaleX();
        }

        public final void a(float f) {
            StateListAnimatorButton.super.setScaleX(f);
        }

        public final void a(Canvas canvas) {
            StateListAnimatorButton.super.onDraw(canvas);
        }

        public final float b() {
            return StateListAnimatorButton.super.getScaleY();
        }

        public final void b(float f) {
            StateListAnimatorButton.super.setScaleY(f);
        }
    }

    interface c {
        float a();

        void a(float f);

        void a(Canvas canvas);

        float b();

        void b(float f);
    }

    public StateListAnimatorButton(Context context) {
        super(context);
        a((AttributeSet) null, 0);
    }

    public StateListAnimatorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    public StateListAnimatorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }

    private void a(AttributeSet attributeSet, int i) {
        boolean z;
        this.a = new vfu(this);
        vfz.c(this).a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.glueFullBleed});
            try {
                z = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            z = false;
        }
        this.b = z ? new a(this, 0) : new b(this, 0);
        this.c = new fud(this, fug.a(R.drawable.glue_button_colored, R.drawable.glue_button_bordered));
        this.c.a(attributeSet, i);
    }

    public final void a(defpackage.b bVar) {
        this.a.a(bVar);
    }

    public final defpackage.b c() {
        return this.a.a;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        fud fud = this.c;
        if (fud != null) {
            fud.b();
        }
        vfu vfu = this.a;
        if (vfu != null) {
            vfu.a();
        }
    }

    public float getScaleX() {
        c cVar = this.b;
        return cVar != null ? cVar.a() : super.getScaleX();
    }

    public float getScaleY() {
        c cVar = this.b;
        return cVar != null ? cVar.b() : super.getScaleY();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        vfu vfu = this.a;
        if (vfu != null) {
            vfu.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.b.a(canvas);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fud fud = this.c;
        if (fud != null) {
            fud.a = -1;
            fud.a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fud fud = this.c;
        if (fud != null) {
            fud.a = i;
            fud.a();
        }
    }

    public void setScaleX(float f) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(f);
        } else {
            super.setScaleX(f);
        }
    }

    public void setScaleY(float f) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.b(f);
        } else {
            super.setScaleY(f);
        }
    }
}
