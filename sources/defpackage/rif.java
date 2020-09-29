package defpackage;

import android.view.View;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: rif reason: default package */
public final class rif {

    /* renamed from: rif$a */
    static class a implements rie {
        private final View a;
        private final Button b;

        public a(View view) {
            this.a = view;
            this.b = (Button) view.findViewById(R.id.button);
        }

        public final Button a() {
            return this.b;
        }

        public final View getView() {
            return this.a;
        }
    }
}
