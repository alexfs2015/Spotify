package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import com.spotify.music.features.localfilesimport.model.LocalItem.ImageType;
import com.spotify.music.features.localfilesimport.view.LocalFileRow;
import com.spotify.music.features.localfilesimport.view.LocalFileRow.Activated;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nqv reason: default package */
public final class nqv extends androidx.recyclerview.widget.RecyclerView.a<LocalFileRow> implements gjl {
    public List<LocalItem> a = new ArrayList();
    public final a d;
    public final C0064a e = new C0064a() {
        public final void a() {
            nqv.this.e();
        }
    };
    private final Context f;
    private final Picasso g;

    /* renamed from: nqv$a */
    public interface a {

        /* renamed from: nqv$a$a reason: collision with other inner class name */
        public interface C0064a {
            void a();
        }

        void a(ImmutableList<LocalItem> immutableList, boolean z, C0064a aVar);

        void a(LocalItem localItem, boolean z, C0064a aVar);

        void a(C0064a aVar);

        boolean a();

        boolean a(LocalItem localItem);

        void b(C0064a aVar);

        boolean b(LocalItem localItem);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        final LocalFileRow localFileRow = (LocalFileRow) uVar;
        final LocalItem localItem = (LocalItem) this.a.get(i);
        localFileRow.b.setText(localItem.getTitle());
        String subtitle = localItem.getSubtitle(this.f);
        localFileRow.c.setText(subtitle);
        localFileRow.c.setVisibility(subtitle == null ? 8 : 0);
        AnonymousClass2 r0 = new OnClickListener() {
            public final void onClick(View view) {
                boolean b2 = nqv.this.d.b(localItem);
                nqv.this.d.a(localItem, !b2, nqv.this.e);
                localFileRow.a(b2 ? Activated.INACTIVE : Activated.FULLY);
            }
        };
        localFileRow.a.setOnClickListener(r0);
        localFileRow.o.setOnClickListener(r0);
        Activated activated = this.d.a(localItem) ? Activated.FULLY : this.d.b(localItem) ? Activated.PARTLY : Activated.INACTIVE;
        localFileRow.a(activated);
        jxb.a(this.f, localFileRow.c, localItem.isExplicit());
        String imageUri = localItem.getImageUri();
        ImageView imageView = localFileRow.d;
        ImageType imageType = localItem.getImageType();
        if (imageType != ImageType.NONE) {
            Drawable imagePlaceholder = localItem.getImagePlaceholder(this.f);
            imageView.setVisibility(0);
            if (!fax.a(imageUri)) {
                vsl a2 = this.g.a(!TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
                a2.a(imagePlaceholder);
                a2.b();
                if (imageType == ImageType.ROUND) {
                    a2.a(uvt.a(imageView, uuz.a()));
                } else {
                    a2.a(imageView);
                }
            } else {
                this.g.d(imageView);
                imageView.setImageDrawable(imagePlaceholder);
            }
            return;
        }
        imageView.setVisibility(8);
    }

    public nqv(Context context, a aVar, Picasso picasso) {
        this.f = context;
        this.d = aVar;
        this.d.a(this.e);
        this.g = picasso;
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new LocalFileRow(this.f, viewGroup);
    }
}
