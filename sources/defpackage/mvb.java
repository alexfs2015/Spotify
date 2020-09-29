package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.features.followfeed.views.FollowRecsView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: mvb reason: default package */
public final class mvb implements gwi<FollowRecsView> {
    gwz a;
    private final mxi b;

    public mvb(mxi mxi) {
        this.b = mxi;
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        return new FollowRecsView(viewGroup.getContext());
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, final hcm hcm, gwm gwm, b bVar) {
        FollowRecsView followRecsView = (FollowRecsView) view;
        String string = hcm.custom().string("section_title", "");
        hcj[] bundleArray = hcm.custom().bundleArray("artists");
        ArrayList arrayList = new ArrayList(bundleArray.length);
        for (hcj hcj : bundleArray) {
            arrayList.add(new a().a(hcj.string("uri")).b(hcj.string("display_name")).c(hcj.string("image_url")).a());
        }
        followRecsView.a.setText(string);
        followRecsView.c = this.b;
        followRecsView.b.a((a) followRecsView.c);
        AnonymousClass1 r11 = new FollowRecsView.a() {
            public final void a(String str) {
                mvb mvb = mvb.this;
                hcm hcm = hcm;
                String str2 = "artistClick";
                if (hcm.events().containsKey(str2)) {
                    mvb.a.a(gwy.a(str2, hcm, Collections.singletonMap("artist_uri", str)));
                }
            }

            public final void b(String str) {
                mvb mvb = mvb.this;
                hcm hcm = hcm;
                String str2 = "followClick";
                if (hcm.events().containsKey(str2)) {
                    mvb.a.a(gwy.a(str2, hcm, Collections.singletonMap("artist_uri", str)));
                }
            }
        };
        mxi mxi = followRecsView.c;
        mxi.a.clear();
        mxi.a.addAll(arrayList);
        followRecsView.c.d = r11;
        followRecsView.c.e();
        this.a = gwm.c;
    }
}
