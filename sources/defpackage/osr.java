package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.R;
import com.spotify.paste.widgets.ViewPagerIndicator;

/* renamed from: osr reason: default package */
final class osr extends fxb {
    final int a;
    final ImageView b;
    final TextView c;
    final TextView d;
    final jsw e;
    final ToggleButton f;

    osr(Context context, ViewGroup viewGroup, boolean z) {
        super(LayoutInflater.from(context).inflate(R.layout.playlist_header_content_view, viewGroup, false));
        ViewPager viewPager = (ViewPager) fbp.a(getView().findViewById(R.id.view_pager));
        final View inflate = LayoutInflater.from(context).inflate(R.layout.playlist_header_content_view_first_page, viewPager, false);
        this.b = (ImageView) fbp.a(inflate.findViewById(R.id.cover_art_image));
        this.c = (TextView) fbp.a(inflate.findViewById(16908308));
        this.d = (TextView) fbp.a(inflate.findViewById(16908309));
        this.f = (ToggleButton) fbp.a(inflate.findViewById(R.id.follow_button));
        this.a = vfj.b(12.0f, context.getResources());
        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) fbp.a(getView().findViewById(R.id.page_indicator));
        if (z) {
            this.e = new jsw(context);
            this.e.a(context.getString(R.string.header_playlist_description_playlist_by));
            this.e.a(true);
            viewPagerIndicator.setVisibility(0);
            viewPagerIndicator.a(viewPager);
        } else {
            this.e = null;
        }
        final jsw jsw = this.e;
        viewPager.a((sf) new sf() {
            public final Object a(ViewGroup viewGroup, int i) {
                if (i != 0) {
                    View view = jsw;
                    if (view != null) {
                        if (view.getParent() != viewGroup) {
                            viewGroup.addView(jsw);
                        }
                        return jsw;
                    }
                }
                if (inflate.getParent() != viewGroup) {
                    viewGroup.addView(inflate);
                }
                return inflate;
            }

            public final void a(ViewGroup viewGroup, int i, Object obj) {
                if (i == 0) {
                    viewGroup.removeView(inflate);
                } else {
                    viewGroup.removeView(jsw);
                }
            }

            public final boolean a(View view, Object obj) {
                return view == obj;
            }

            public final int b() {
                return jsw != null ? 2 : 1;
            }
        });
        vfz.a(this.b).b(this.b).a();
    }
}
