package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.R;
import com.spotify.music.features.missedconnections.MissedConnectionsABFlag;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oat reason: default package */
final class oat extends androidx.recyclerview.widget.RecyclerView.a<a> {
    List<ImmutableMap<String, String>> a = new ArrayList();
    private final Picasso d;
    private final fqn e;
    private final oar f;

    /* renamed from: oat$a */
    static class a extends u {
        final ImageView a;
        final TextView b;
        final TextView c;
        final View d;

        public a(View view) {
            super(view);
            this.d = view;
            this.a = (ImageView) view.findViewById(R.id.artist_image);
            this.b = (TextView) view.findViewById(R.id.artist_name);
            this.c = (TextView) view.findViewById(R.id.recsplanation);
            this.c.setVisibility(8);
        }
    }

    public oat(Picasso picasso, fqn fqn, oar oar) {
        this.d = picasso;
        this.e = fqn;
        this.f = oar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, String str, View view) {
        this.f.a((String) ((ImmutableMap) this.a.get(i)).get("artisturi"), str);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.artist_card, viewGroup, false));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        a aVar = (a) uVar;
        String str = (String) ((ImmutableMap) this.a.get(i)).get("artistname");
        aVar.b.setText(str);
        if (this.e.a(oag.a) == MissedConnectionsABFlag.ENABLED_FULL_TREATMENT) {
            aVar.c.setText((String) ((ImmutableMap) this.a.get(i)).get("firststreamname"));
            aVar.c.setVisibility(0);
        }
        aVar.d.setOnClickListener(new $$Lambda$oat$eTf2jczeqR3QYfVWP4FYZ8mjj4(this, i, str));
        this.d.a((String) ((ImmutableMap) this.a.get(i)).get("artistimage")).a(vhj.a(aVar.a));
        aVar.a.setScaleType(ScaleType.CENTER_CROP);
    }

    public final int b() {
        return this.a.size();
    }
}
