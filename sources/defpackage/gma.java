package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: gma reason: default package */
public final class gma {

    /* renamed from: gma$a */
    public interface a {
        boolean onDone();
    }

    public static void a(TextView textView, View view) {
        a(textView, (a) new $$Lambda$gma$iUGX9ZqOiAvKzF68Vx0aq8eWUQ(view));
    }

    public static void a(TextView textView, a aVar) {
        textView.setOnEditorActionListener(new $$Lambda$gma$jtXzWpheuWEsQJIaKlTmfIURfI(aVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(a aVar, TextView textView, int i, KeyEvent keyEvent) {
        boolean z = true;
        boolean z2 = keyEvent != null && keyEvent.getKeyCode() == 66;
        if (i != 6) {
            z = false;
        }
        if (z2 || z) {
            return aVar.onDone();
        }
        return false;
    }
}
