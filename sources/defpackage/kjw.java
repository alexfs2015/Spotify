package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.ArcView;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.ArcView.a;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.MinutesListened;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: kjw reason: default package */
public class kjw extends kif {
    private final List<Integer> U = new ArrayList();
    private final List<TextView> V = Lists.a();
    private final List<TextView> X = Lists.a();
    private final ImmutableList<Integer> Y = ImmutableList.a(Integer.valueOf(R.id.year_textview1), Integer.valueOf(R.id.year_textview2), Integer.valueOf(R.id.year_textview3), Integer.valueOf(R.id.year_textview4), Integer.valueOf(R.id.year_textview5));
    private final ImmutableList<Integer> Z = ImmutableList.a(Integer.valueOf(R.id.minute_textview1), Integer.valueOf(R.id.minute_textview2), Integer.valueOf(R.id.minute_textview3), Integer.valueOf(R.id.minute_textview4), Integer.valueOf(R.id.minute_textview5));
    private ArcView aa;
    private TextView ab;

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(MinutesListened minutesListened, MinutesListened minutesListened2) {
        return minutesListened.a() - minutesListened2.a();
    }

    public static kjw a(e eVar) {
        kjw kjw = new kjw();
        Bundle a = a((kfp) eVar);
        a.putString("preview", eVar.c);
        a.putString("caption", eVar.a);
        a.putSerializable("minutes_listened_list", eVar.b);
        kjw.g(a);
        return kjw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{kjv.a(this.aa, this.U, this.X, this.V), kjv.a(this.aa, this.U, this.X, this.V, this.ab)});
        b((Animator) animatorSet);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_minutes_listened, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        this.aa = (ArcView) ip.d(view, (int) R.id.arcview);
        this.ab = (TextView) ip.d(view, (int) R.id.minutes_listened_caption);
        Bundle l = l();
        this.ab.setText(l.getString("caption"));
        ImmutableList immutableList = (ImmutableList) l.getSerializable("minutes_listened_list");
        for (int i = 0; i < immutableList.size(); i++) {
            TextView textView = (TextView) ip.d(view, ((Integer) this.Y.get(i)).intValue());
            String c = ((MinutesListened) immutableList.get(i)).c();
            this.V.add(textView);
            textView.setVisibility(4);
            textView.setText(c);
            TextView textView2 = (TextView) ip.d(view, ((Integer) this.Z.get(i)).intValue());
            textView2.setText(((MinutesListened) immutableList.get(i)).b());
            textView2.setVisibility(4);
            this.X.add(textView2);
            this.U.add(Integer.valueOf(((MinutesListened) immutableList.get(i)).a()));
        }
        int a = ((MinutesListened) Collections.max(immutableList, $$Lambda$kjw$D7El0FQ3yQ4YhTI_2YI_4RNuWrI.INSTANCE)).a();
        ArcView arcView = this.aa;
        ImmutableList a2 = ImmutableList.a((Collection<? extends E>) this.U);
        arcView.a = (float) a;
        for (int i2 = 0; i2 < a2.size(); i2++) {
            arcView.b.add(new a(arcView, 0.0f, 0));
        }
        arcView.invalidate();
    }

    public final void aP_() {
        super.aP_();
        b((String) fbp.a(l().getString("preview")));
        y().post(new $$Lambda$kjw$_KhcQvzmTuYunQVk3onllwVP7ic(this));
    }
}
