package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.spotify.music.R;

/* renamed from: txx reason: default package */
public final class txx implements txw {
    private final who<a> a;
    private final a b;
    private final a c;
    /* access modifiers changed from: private */
    public TextView d;

    public txx(who<a> who, a aVar, a aVar2) {
        this.a = who;
        this.b = aVar;
        this.c = aVar2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CharSequence charSequence) {
        this.d.setText(charSequence, BufferType.SPANNABLE);
        this.d.setMaxLines(Integer.MAX_VALUE);
        ((a) this.a.get()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        ((a) this.a.get()).a(str);
    }

    public final void a(TextView textView) {
        this.d = (TextView) fbp.a(textView);
    }

    public final void a(String str, String str2) {
        String trim = str.trim();
        String str3 = "";
        if (!fbo.a(trim) && !fbo.a(str2)) {
            if (!fbo.a(str2)) {
                str3 = uiq.a(this.d.getContext().getString(R.string.show_description_by_publisher_annotation, new Object[]{str2}));
            }
            trim = String.format("%s %s", new Object[]{trim, str3});
        } else if (trim == null) {
            trim = str3;
        }
        Spannable a2 = a.a(new $$Lambda$txx$H9TuEJepAQJqAMBbMJswOzI9wto(this)).a(new SpannableString(trim));
        this.d.setContentDescription(str);
        this.d.setText(a2, BufferType.SPANNABLE);
        this.d.setMovementMethod(LinkMovementMethod.getInstance());
        this.d.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                txx.this.d.removeOnLayoutChangeListener(this);
                txx txx = txx.this;
                txx.this.d.setText(txx.d, BufferType.SPANNABLE);
            }
        });
    }
}
