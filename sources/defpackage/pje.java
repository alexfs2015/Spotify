package defpackage;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;

/* renamed from: pje reason: default package */
public final class pje implements pjd {
    /* access modifiers changed from: 0000 */
    public TextView a;
    private final a b;
    private final a c;
    private final a d;
    private final a e;

    public pje(a aVar, a aVar2, a aVar3, a aVar4) {
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CharSequence charSequence) {
        this.a.setText(charSequence, BufferType.SPANNABLE);
        this.a.setMaxLines(Integer.MAX_VALUE);
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z, long j) {
        this.b.a(str, j, z);
    }

    public final void a(TextView textView) {
        this.a = (TextView) fbp.a(textView);
    }

    public final void a(phs phs) {
        boolean z = VERSION.SDK_INT > 23;
        SpannableString spannableString = new SpannableString(phs.a().trim());
        String h = phs.h();
        long l = phs.l();
        $$Lambda$pje$OtYF_2BC3v0O7lLyQrNfUP7oHA r6 = new $$Lambda$pje$OtYF_2BC3v0O7lLyQrNfUP7oHA(this, h, phs.k());
        if (r6 != null) {
            ueb ueb = new ueb(l, r6);
            ueb.a((Spannable) spannableString);
            ueb.b(spannableString);
            a aVar = this.b;
            aVar.getClass();
            Spannable a2 = a.a(new $$Lambda$1hY2Sc5UygcN91quFzV9lVo7hEg(aVar)).a(spannableString);
            this.a.setContentDescription(phs.a());
            this.a.setTextIsSelectable(z);
            this.a.setText(a2, BufferType.SPANNABLE);
            this.a.setMovementMethod(LinkMovementMethod.getInstance());
            this.a.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    pje.this.a.removeOnLayoutChangeListener(this);
                    pje pje = pje.this;
                    pje.this.a.setText(pje.a, BufferType.SPANNABLE);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("Method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(2);
        throw new NullPointerException(sb.toString());
    }
}
