package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.spotify.music.R;

/* renamed from: u reason: default package */
public class u extends Dialog implements r {
    private s a;
    private final a b = new a() {
        public final boolean a(KeyEvent keyEvent) {
            return u.this.a(keyEvent);
        }
    };

    public u(Context context, int i) {
        super(context, a(context, i));
        s a2 = a();
        a2.a(a(context, i));
        a2.c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a().k();
        super.onCreate(bundle);
        a().c();
    }

    public void setContentView(int i) {
        a().c(i);
    }

    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    public <T extends View> T findViewById(int i) {
        return a().b(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        a().a((CharSequence) getContext().getString(i));
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().f();
    }

    public final boolean a(int i) {
        return a().d(1);
    }

    public void invalidateOptionsMenu() {
        a().i();
    }

    private s a() {
        if (this.a == null) {
            this.a = s.a((Dialog) this, (r) this);
        }
        return this.a;
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return hy.a(this.b, getWindow().getDecorView(), this, keyEvent);
    }
}
