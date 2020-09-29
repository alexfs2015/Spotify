package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] a = {16842912};
    private boolean b;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ip.a((View) this, (ht) new ht() {
            public final void c(View view, AccessibilityEvent accessibilityEvent) {
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            public final void a(View view, ja jaVar) {
                super.a(view, jaVar);
                jaVar.a(true);
                jaVar.a.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }

    public void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public boolean isChecked() {
        return this.b;
    }

    public void toggle() {
        setChecked(!this.b);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.b) {
            return mergeDrawableStates(super.onCreateDrawableState(i + 1), a);
        }
        return super.onCreateDrawableState(i);
    }
}
