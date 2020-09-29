package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: lzr reason: default package */
public final class lzr implements lzq {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(16908308));
    private final TextView c = ((TextView) this.a.findViewById(16908309));
    private final Button d = ((Button) this.a.findViewById(R.id.empty_view_button));

    public lzr(ViewGroup viewGroup) {
        this.a = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.find_inline_empty, viewGroup, false);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.glue_empty_state_error_state_line_height);
        fzy.b(this.c);
        fzy.a(this.c, dimensionPixelSize);
        fzy.a(this.a);
    }

    private void a(int i) {
        View view = this.a;
        view.setPadding(view.getPaddingLeft(), i, this.a.getPaddingRight(), this.a.getPaddingBottom());
    }

    public final void a() {
        this.d.setVisibility(8);
        a(this.a.getContext().getResources().getDimensionPixelSize(R.dimen.find_inline_empty_padding));
    }

    public final void a(String str) {
        this.b.setText(str);
    }

    public final View b() {
        return this.d;
    }

    public final void b(String str) {
        this.c.setText(str);
    }

    public final void c(String str) {
        this.d.setText(str);
        this.d.setVisibility(0);
        a(this.a.getContext().getResources().getDimensionPixelSize(R.dimen.find_inline_empty_with_button_padding));
    }

    public final View getView() {
        return this.a;
    }
}
