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

/* renamed from: rrc reason: default package */
public final class rrc extends defpackage.rnw.a<a> {

    /* renamed from: rrc$a */
    static class a extends defpackage.gwi.c.a<View> {
        private TextView b;
        private TextView c;
        private LinearLayout d;
        private gxh<?> e;
        private gxh<?> f;

        a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (TextView) view.findViewById(R.id.subtitle);
            this.d = (LinearLayout) view.findViewById(R.id.children);
        }

        private static void a(String str, TextView textView) {
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
        }

        private static boolean a(hcm hcm) {
            return hcm.children().size() > 1;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            if (iArr.length == 0) {
                hdj.a(this.a, hcm, aVar, iArr);
                return;
            }
            List children = hcm.children();
            if (!children.isEmpty()) {
                hdj.a((View) this.e.b, (hcm) fbp.a(children.get(iArr[0])), aVar);
                if (a(hcm)) {
                    hdj.a((View) this.f.b, (hcm) fbp.a(children.get(iArr[1])), aVar);
                }
            }
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            a(hcm.text().title(), this.b);
            a(hcm.text().subtitle(), this.c);
            if (hcm.children().isEmpty()) {
                this.d.setVisibility(8);
                return;
            }
            hcm hcm2 = (hcm) hcm.children().get(0);
            int resolve = gwm.h.resolve(hcm2);
            if (this.e == null) {
                this.e = gxh.a(resolve, (ViewGroup) this.d, gwm);
                this.d.addView(this.e.b);
            }
            this.e.a(0, hcm2, bVar);
            if (a(hcm)) {
                hcm hcm3 = (hcm) hcm.children().get(1);
                int resolve2 = gwm.h.resolve(hcm3);
                if (this.f == null) {
                    this.f = gxh.a(resolve2, (ViewGroup) this.d, gwm);
                    V v = this.f.b;
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.setMargins(0, v.getContext().getResources().getDimensionPixelSize(R.dimen.small), 0, 0);
                    v.setLayoutParams(layoutParams);
                    this.d.addView(v);
                }
                this.f.a(1, hcm3, bVar);
            }
        }
    }

    public final int b() {
        return R.id.free_tier_home_header;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.free_tier_home_header, viewGroup, false));
    }
}
