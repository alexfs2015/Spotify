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

/* renamed from: noc reason: default package */
public final class noc extends u {
    private final ViewGroup a = ((ViewGroup) fay.a(this.o.findViewById(R.id.root)));
    private final FaceView b = ((FaceView) fay.a(this.o.findViewById(R.id.face)));
    private final TextView c = ((TextView) fay.a(this.o.findViewById(R.id.name)));
    /* access modifiers changed from: private */
    public final SwitchCompat d = ((SwitchCompat) fay.a(this.o.findViewById(R.id.toggle)));
    private final Picasso e;

    /* renamed from: noc$a */
    class a implements OnCheckedChangeListener {
        boolean a;
        private final b c;

        public a(b bVar) {
            this.c = (b) fay.a(bVar);
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.c.a(this.a);
            } else if (this.c.a()) {
                this.c.b(this.a);
            } else {
                noc.this.d.toggle();
                this.c.b();
            }
            this.a = false;
        }
    }

    /* renamed from: noc$b */
    public interface b {
        void a(boolean z);

        boolean a();

        void b();

        void b(boolean z);
    }

    public noc(Picasso picasso, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_mix_user_toggle_row, viewGroup, false));
        this.e = picasso;
    }

    public final void a(HomeMixUser homeMixUser, b bVar) {
        fay.a(homeMixUser);
        this.b.a(this.e, homeMixUser.getFace());
        this.c.setText(homeMixUser.getShortName());
        a aVar = new a(bVar);
        this.d.setChecked(homeMixUser.isPresent());
        this.d.setOnCheckedChangeListener(aVar);
        this.a.setOnClickListener(new $$Lambda$noc$8uSMG8jRxgUd1gaywv660bYHnCU(aVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, View view) {
        aVar.a = true;
        noc.this.d.toggle();
    }
}
