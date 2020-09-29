package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.homemix.facepile.FaceView;
import com.spotify.music.features.homemix.models.HomeMixUser;
import com.squareup.picasso.Picasso;

/* renamed from: nud reason: default package */
public final class nud extends u {
    private final ViewGroup a = ((ViewGroup) fbp.a(this.o.findViewById(R.id.root)));
    private final FaceView b = ((FaceView) fbp.a(this.o.findViewById(R.id.face)));
    private final TextView c = ((TextView) fbp.a(this.o.findViewById(R.id.name)));
    /* access modifiers changed from: private */
    public final SwitchCompat d = ((SwitchCompat) fbp.a(this.o.findViewById(R.id.toggle)));
    private final Picasso e;

    /* renamed from: nud$a */
    class a implements OnCheckedChangeListener {
        boolean a;
        private final b c;

        public a(b bVar) {
            this.c = (b) fbp.a(bVar);
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.c.a(this.a);
            } else if (this.c.a()) {
                this.c.b(this.a);
            } else {
                nud.this.d.toggle();
                this.c.b();
            }
            this.a = false;
        }
    }

    /* renamed from: nud$b */
    public interface b {
        void a(boolean z);

        boolean a();

        void b();

        void b(boolean z);
    }

    public nud(Picasso picasso, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_mix_user_toggle_row, viewGroup, false));
        this.e = picasso;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, View view) {
        aVar.a = true;
        nud.this.d.toggle();
    }

    public final void a(HomeMixUser homeMixUser, b bVar) {
        fbp.a(homeMixUser);
        this.b.a(this.e, homeMixUser.getFace());
        this.c.setText(homeMixUser.getShortName());
        a aVar = new a(bVar);
        this.d.setChecked(homeMixUser.isPresent());
        this.d.setOnCheckedChangeListener(aVar);
        this.a.setOnClickListener(new $$Lambda$nud$1vUjDJzGWkl7QG6m0CiOQUVIcXY(aVar));
    }
}
