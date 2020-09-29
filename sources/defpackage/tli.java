package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: tli reason: default package */
public final class tli implements tlh {
    private fuo a;

    /* renamed from: tli$a */
    public interface a {

        /* renamed from: tli$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static /* synthetic */ void a() {
            }
        }

        void onErrorStateButtonClick();

        static {
            $$Lambda$tli$a$heMF4njKxlwFfUQWMJooL90Snoo r0 = $$Lambda$tli$a$heMF4njKxlwFfUQWMJooL90Snoo.INSTANCE;
        }
    }

    public final void a(Context context, ViewGroup viewGroup, a aVar) {
        String string = context.getString(R.string.podcast_error_state_generic_title);
        String string2 = context.getString(R.string.podcast_error_state_generic_subtitle);
        String string3 = context.getString(R.string.podcast_error_state_generic_button_text);
        this.a = fus.b(context, viewGroup);
        this.a.a((CharSequence) string);
        this.a.b((CharSequence) string2);
        this.a.getView().setBackgroundColor(0);
        this.a.c((CharSequence) string3);
        this.a.V_().setOnClickListener(new $$Lambda$tli$6di6TUf3djaOJRxRuuzN6QOI2yE(aVar));
        View view = this.a.getView();
        view.setVisibility(8);
        view.setId(R.id.podcast_error_view);
        viewGroup.addView(view);
    }

    public final void a() {
        fuo fuo = this.a;
        if (fuo != null) {
            ((fuo) fay.a(fuo)).getView().setVisibility(0);
        }
    }

    public final void b() {
        fuo fuo = this.a;
        if (fuo != null) {
            ((fuo) fay.a(fuo)).getView().setVisibility(8);
        }
    }
}
