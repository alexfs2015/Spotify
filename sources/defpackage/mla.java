package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

/* renamed from: mla reason: default package */
public final class mla implements gtw {
    public final mmd a;

    /* renamed from: mla$a */
    static class a extends u {
        final TextView a;

        public a(TextView textView) {
            super(textView);
            this.a = textView;
            Context context = this.a.getContext();
            vgl.a(context, this.a, 2132017668);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.device_picker_space_at_not_available_devices);
            this.a.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            this.a.setTextColor(fr.c(context, R.color.glue_row_subtitle_color));
            this.a.setClickable(false);
            this.a.setGravity(17);
        }
    }

    public mla(mmd mmd) {
        this.a = mmd;
    }

    public final int a() {
        return 77;
    }

    public final long a(int i) {
        return 77;
    }

    public final u a(ViewGroup viewGroup, int i) {
        return new a(new TextView(viewGroup.getContext()));
    }

    public final void a(u uVar, int i) {
        if (uVar instanceof a) {
            ((a) uVar).a.setText(uVar.o.getResources().getString(this.a.c));
            return;
        }
        throw new RuntimeException(String.format("Wrong ViewHolder received. Expected: %s Received: %s", new Object[]{a.class.getSimpleName(), uVar.getClass().getSimpleName()}));
    }

    public final int b() {
        return this.a.c != 0 ? 1 : 0;
    }

    public final int[] c() {
        return new int[]{77};
    }
}
