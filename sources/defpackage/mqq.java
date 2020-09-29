package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.features.followfeed.views.FollowRecsView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: mqq reason: default package */
public final class mqq implements gui<FollowRecsView> {
    guz a;
    private final msh b;

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, final gzt gzt, gum gum, b bVar) {
        FollowRecsView followRecsView = (FollowRecsView) view;
        String string = gzt.custom().string("section_title", "");
        gzq[] bundleArray = gzt.custom().bundleArray("artists");
        ArrayList arrayList = new ArrayList(bundleArray.length);
        for (gzq gzq : bundleArray) {
            arrayList.add(new a().a(gzq.string("uri")).b(gzq.string("display_name")).c(gzq.string("image_url")).a());
        }
        followRecsView.a.setText(string);
        followRecsView.c = this.b;
        followRecsView.b.a((a) followRecsView.c);
        AnonymousClass1 r11 = new FollowRecsView.a() {
            public final void a(String str) {
                mqq mqq = mqq.this;
                gzt gzt = gzt;
                String str2 = "artistClick";
                if (gzt.events().containsKey(str2)) {
                    mqq.a.a(guy.a(str2, gzt, Collections.singletonMap("artist_uri", str)));
                }
            }

            public final void b(String str) {
                mqq mqq = mqq.this;
                gzt gzt = gzt;
                String str2 = "followClick";
                if (gzt.events().containsKey(str2)) {
                    mqq.a.a(guy.a(str2, gzt, Collections.singletonMap("artist_uri", str)));
                }
            }
        };
        msh msh = followRecsView.c;
        msh.a.clear();
        msh.a.addAll(arrayList);
        followRecsView.c.d = r11;
        followRecsView.c.e();
        this.a = gum.c;
    }

    public mqq(msh msh) {
        this.b = msh;
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
        return new FollowRecsView(viewGroup.getContext());
    }
}
