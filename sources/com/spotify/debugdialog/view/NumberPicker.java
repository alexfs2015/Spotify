package com.spotify.debugdialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Locale;

public class NumberPicker extends FrameLayout {
    private float a;
    private float b;
    private float c;
    private SeekBar d;
    /* access modifiers changed from: private */
    public TextView e;
    private TextView f;
    /* access modifiers changed from: private */
    public a g = new a() {
    };

    public interface a {
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void a(float f2, float f3, float f4) {
        this.a = 0.0f;
        this.b = 1.0f;
        this.c = 0.01f;
        this.d.setMax((int) ((this.b - this.a) / this.c));
        a();
    }

    private void b() {
        LayoutInflater.from(getContext()).inflate(R.layout.int_picker, this, true);
        this.d = (SeekBar) findViewById(R.id.seek_bar);
        this.e = (TextView) findViewById(R.id.text);
        this.f = (TextView) findViewById(R.id.title);
        a(0.0f, 1.0f, 0.01f);
        this.d.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                NumberPicker.this.a();
                if (z) {
                    NumberPicker.this.g;
                    NumberPicker.this.d();
                }
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
                NumberPicker.this.g;
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                NumberPicker.this.g;
            }
        });
        this.e.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                NumberPicker.this.e.getViewTreeObserver().removeOnPreDrawListener(this);
                NumberPicker.this.a();
                return true;
            }
        });
    }

    private float c() {
        return ((float) this.d.getProgress()) / ((float) this.d.getMax());
    }

    /* access modifiers changed from: private */
    public float d() {
        float f2 = this.b;
        float f3 = this.a;
        return f3 + ((f2 - f3) * c());
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.e.setText(String.format(Locale.US, "%.2f", new Object[]{Float.valueOf(d())}));
        int b2 = vfj.b(16.0f, getResources());
        this.e.setX((float) ((int) ((((float) ((this.d.getLeft() + this.d.getThumbOffset()) + b2)) + (((float) ((this.d.getMeasuredWidth() - (this.d.getThumbOffset() << 1)) - (b2 << 1))) * c())) - ((float) (this.e.getWidth() / 2)))));
    }
}
