package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.List;

/* renamed from: ria reason: default package */
public final class ria extends defpackage.reu.a<a> {

    /* renamed from: ria$a */
    static class a extends defpackage.gui.c.a<View> {
        private TextView b;
        private TextView c;
        private LinearLayout d;
        private gvh<?> e;
        private gvh<?> f;

        a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (TextView) view.findViewById(R.id.subtitle);
            this.d = (LinearLayout) view.findViewById(R.id.children);
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            if (iArr.length == 0) {
                haq.a(this.a, gzt, aVar, iArr);
                return;
            }
            List children = gzt.children();
            if (!children.isEmpty()) {
                haq.a((View) this.e.b, (gzt) fay.a(children.get(iArr[0])), aVar);
                if (a(gzt)) {
                    haq.a((View) this.f.b, (gzt) fay.a(children.get(iArr[1])), aVar);
                }
            }
        }

        private static void a(String str, TextView textView) {
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
        }

        private static boolean a(gzt gzt) {
            return gzt.children().size() > 1;
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            a(gzt.text().title(), this.b);
            a(gzt.text().subtitle(), this.c);
            if (gzt.children().isEmpty()) {
                this.d.setVisibility(8);
                return;
            }
            gzt gzt2 = (gzt) gzt.children().get(0);
            int resolve = gum.h.resolve(gzt2);
            if (this.e == null) {
                this.e = gvh.a(resolve, (ViewGroup) this.d, gum);
                this.d.addView(this.e.b);
            }
            this.e.a(0, gzt2, bVar);
            if (a(gzt)) {
                gzt gzt3 = (gzt) gzt.children().get(1);
                int resolve2 = gum.h.resolve(gzt3);
                if (this.f == null) {
                    this.f = gvh.a(resolve2, (ViewGroup) this.d, gum);
                    V v = this.f.b;
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.setMargins(0, v.getContext().getResources().getDimensionPixelSize(R.dimen.small), 0, 0);
                    v.setLayoutParams(layoutParams);
                    this.d.addView(v);
                }
                this.f.a(1, gzt3, bVar);
            }
        }
    }

    public final int b() {
        return R.id.free_tier_home_header;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.free_tier_home_header, viewGroup, false));
    }
}
