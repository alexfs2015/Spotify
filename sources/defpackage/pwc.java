package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.paste.widgets.internal.PasteLinearLayout;

/* renamed from: pwc reason: default package */
public final class pwc extends u implements pwb, vhw {
    public final ToggleButton a = ((ToggleButton) this.o.findViewById(16908289));
    public final TextView b = ((TextView) this.o.findViewById(16908308));
    public final TextView c = ((TextView) this.o.findViewById(16908309));
    public final View d = this.o.findViewById(R.id.drag_handle);
    private final PasteLinearLayout e = ((PasteLinearLayout) this.o);

    public pwc(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.player_queue_row, viewGroup, false));
        this.a.getBackground().mutate();
        vfz.b(this.o).b(this.a, this.d).a(this.b, this.c).a();
    }

    public final void a(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    public final void aA_() {
        this.o.setBackgroundResource(R.color.cat_grayscale_15_40);
    }

    public final void b() {
        this.o.setBackgroundResource(R.color.cat_clear);
    }

    public final void c(boolean z) {
        this.e.c(z);
    }

    public final void d(boolean z) {
        this.a.setEnabled(z);
        this.a.setFocusable(z);
    }
}
