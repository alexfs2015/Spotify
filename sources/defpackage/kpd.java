package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kpd reason: default package */
public final class kpd {

    /* renamed from: kpd$a */
    static class a extends ClickableSpan {
        private final OnClickListener a;

        /* synthetic */ a(OnClickListener onClickListener, byte b) {
            this(onClickListener);
        }

        private a(OnClickListener onClickListener) {
            this.a = onClickListener;
        }

        public final void onClick(View view) {
            this.a.onClick(view);
        }
    }

    public static Spannable a(String str, String str2, OnClickListener onClickListener) {
        SpannableString spannableString = new SpannableString(str);
        a((Spannable) spannableString, str2, (Object) new a(onClickListener, 0));
        return spannableString;
    }

    private static void a(Spannable spannable, String str, Object obj) {
        String obj2 = spannable.toString();
        int indexOf = obj2.indexOf(str);
        if (indexOf >= 0) {
            spannable.setSpan(obj, indexOf, str.length() + indexOf, 34);
        } else {
            spannable.setSpan(obj, 0, obj2.length(), 17);
        }
    }
}
