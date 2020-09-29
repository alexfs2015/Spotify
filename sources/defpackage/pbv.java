package defpackage;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;

/* renamed from: pbv reason: default package */
public final class pbv implements pbu {
    /* access modifiers changed from: 0000 */
    public TextView a;
    private final a b;
    private final a c;
    private final a d;
    private final a e;

    public pbv(a aVar, a aVar2, a aVar3, a aVar4) {
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    public final void a(TextView textView) {
        this.a = (TextView) fay.a(textView);
    }

    public final void a(paj paj) {
        boolean z = VERSION.SDK_INT > 23;
        SpannableString spannableString = new SpannableString(paj.a().trim());
        String h = paj.h();
        long l = paj.l();
        $$Lambda$pbv$do8ZOBLe9hYUBzhEfZpqafRkso r5 = new $$Lambda$pbv$do8ZOBLe9hYUBzhEfZpqafRkso(this, h, paj.k());
        if (r5 != null) {
            Ctry tryR = new Ctry(l, r5);
            tryR.a((Spannable) spannableString);
            tryR.b(spannableString);
            a aVar = this.b;
            aVar.getClass();
            Spannable a2 = a.a(new $$Lambda$RyJLzF68sKNpLm2VwExydEv8m6Q(aVar)).a(spannableString);
            this.a.setTextIsSelectable(z);
            this.a.setText(a2, BufferType.SPANNABLE);
            this.a.setMovementMethod(LinkMovementMethod.getInstance());
            this.a.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    pbv.this.a.removeOnLayoutChangeListener(this);
                    pbv pbv = pbv.this;
                    pbv.this.a.setText(pbv.a, BufferType.SPANNABLE);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("Method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(2);
        throw new NullPointerException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z, long j) {
        this.b.a(str, j, z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CharSequence charSequence) {
        this.a.setText(charSequence, BufferType.SPANNABLE);
        this.a.setMaxLines(Integer.MAX_VALUE);
        this.b.a();
    }
}
