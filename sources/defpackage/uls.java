package defpackage;

import android.widget.TextView;

/* renamed from: uls reason: default package */
abstract class uls extends ulz {
    uls() {
    }

    /* access modifiers changed from: 0000 */
    public abstract CharSequence a();

    public final void a(TextView textView) {
        textView.setText(a());
    }
}
