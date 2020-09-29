package defpackage;

import android.view.View;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: qzj reason: default package */
public final class qzj {

    /* renamed from: qzj$a */
    static class a implements qzi {
        private final View a;
        private final Button b;

        public a(View view) {
            this.a = view;
            this.b = (Button) view.findViewById(R.id.button);
        }

        public final View getView() {
            return this.a;
        }

        public final Button a() {
            return this.b;
        }
    }
}
