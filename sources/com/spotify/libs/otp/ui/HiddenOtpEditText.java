package com.spotify.libs.otp.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.widget.AppCompatEditText;

public class HiddenOtpEditText extends AppCompatEditText {
    /* access modifiers changed from: 0000 */
    public a a;

    public interface a {
        boolean onDelete(HiddenOtpEditText hiddenOtpEditText);
    }

    class b extends InputConnectionWrapper {
        public b(InputConnection inputConnection) {
            super(inputConnection, true);
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            if (HiddenOtpEditText.this.a == null || i <= 0) {
                return false;
            }
            HiddenOtpEditText.this.a.onDelete(HiddenOtpEditText.this);
            return true;
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getAction() != 0 || !HiddenOtpEditText.this.a(keyEvent.getKeyCode())) {
                return super.sendKeyEvent(keyEvent);
            }
            return true;
        }
    }

    public HiddenOtpEditText(Context context) {
        super(context);
    }

    public HiddenOtpEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HiddenOtpEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    public boolean a(int i) {
        a aVar = this.a;
        if (aVar == null || i != 67) {
            return false;
        }
        return aVar.onDelete(this);
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipRect(0, 0, 0, 0);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new b(super.onCreateInputConnection(editorInfo));
    }

    public void onDraw(Canvas canvas) {
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (a(i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
