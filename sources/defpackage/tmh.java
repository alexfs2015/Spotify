package defpackage;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.spotify.music.R;

/* renamed from: tmh reason: default package */
public final class tmh implements tmg {
    private final vti<a> a;
    private final a b;
    private final a c;
    /* access modifiers changed from: private */
    public TextView d;

    public tmh(vti<a> vti, a aVar, a aVar2) {
        this.a = vti;
        this.b = aVar;
        this.c = aVar2;
    }

    public final void a(TextView textView) {
        this.d = (TextView) fay.a(textView);
    }

    public final void a(String str, String str2) {
        String trim = str.trim();
        String str3 = "";
        if (!fax.a(trim) && !fax.a(str2)) {
            if (!fax.a(str2)) {
                str3 = twn.a(this.d.getContext().getString(R.string.show_description_by_publisher_annotation, new Object[]{str2}));
            }
            trim = String.format("%s %s", new Object[]{trim, str3});
        } else if (trim == null) {
            trim = str3;
        }
        this.d.setText(a.a(new $$Lambda$tmh$alLWNamdWFdhX0yqqMMcrog(this)).a(new SpannableString(trim)), BufferType.SPANNABLE);
        this.d.setMovementMethod(LinkMovementMethod.getInstance());
        this.d.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                tmh.this.d.removeOnLayoutChangeListener(this);
                tmh tmh = tmh.this;
                tmh.this.d.setText(tmh.d, BufferType.SPANNABLE);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        ((a) this.a.get()).a(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CharSequence charSequence) {
        this.d.setText(charSequence, BufferType.SPANNABLE);
        this.d.setMaxLines(Integer.MAX_VALUE);
        ((a) this.a.get()).a();
    }
}
