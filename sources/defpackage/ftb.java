package defpackage;

import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

/* renamed from: ftb reason: default package */
public final class ftb implements fsq {
    public TextView a;
    public String b;
    private final CharSequence[] c;
    private final OnClickListener d;

    public final int a() {
        return 0;
    }

    public ftb(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
        Assertion.a((Object) charSequenceArr);
        Assertion.a((Object) onClickListener);
        this.c = charSequenceArr;
        this.d = onClickListener;
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Assertion.a((Object) this.c);
        Assertion.a((Object) this.d);
        View inflate = layoutInflater.inflate(R.layout.glue_dialog_content_title_items, viewGroup, true);
        this.a = (TextView) inflate.findViewById(R.id.title);
        String str = this.b;
        if (str != null) {
            this.a.setText(str);
        }
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.list);
        CharSequence[] charSequenceArr = this.c;
        OnClickListener onClickListener = this.d;
        for (int i = 0; i < charSequenceArr.length; i++) {
            TextView textView = (TextView) layoutInflater.inflate(R.layout.glue_dialog_content_title_items_item, linearLayout, false);
            textView.setText(charSequenceArr[i]);
            textView.setOnClickListener(new $$Lambda$ftb$nHidc8UFDu3wUL4B45gFTX5Hd_M(onClickListener, i));
            linearLayout.addView(textView);
        }
    }
}
