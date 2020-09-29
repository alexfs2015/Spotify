package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: gnp reason: default package */
public final class gnp {

    /* renamed from: gnp$a */
    public interface a {
        boolean onDone();
    }

    public static void a(TextView textView, View view) {
        a(textView, (a) new $$Lambda$gnp$xT3NuzUEu3WxB_SmAGG2UiI5s18(view));
    }

    public static void a(TextView textView, a aVar) {
        textView.setOnEditorActionListener(new $$Lambda$gnp$0bHCWd72WEwU_rJJ1KHRExoNec(aVar));
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
