package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fst reason: default package */
final class fst extends fsn implements fss {
    private final TextView a;

    public fst(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R.id.metadata);
        fzy.a(this.a);
        fzy.a(view);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
