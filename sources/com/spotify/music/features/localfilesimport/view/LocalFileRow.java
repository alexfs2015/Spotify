package com.spotify.music.features.localfilesimport.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;

public final class LocalFileRow extends u {
    public final Button a = ((Button) this.o.findViewById(16908289));
    public final TextView b = ((TextView) this.o.findViewById(16908308));
    public final TextView c = ((TextView) this.o.findViewById(16908309));
    public final ImageView d = ((ImageView) this.o.findViewById(16908294));

    /* renamed from: com.spotify.music.features.localfilesimport.view.LocalFileRow$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Activated.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.localfilesimport.view.LocalFileRow$Activated[] r0 = com.spotify.music.features.localfilesimport.view.LocalFileRow.Activated.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.localfilesimport.view.LocalFileRow$Activated r1 = com.spotify.music.features.localfilesimport.view.LocalFileRow.Activated.INACTIVE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.localfilesimport.view.LocalFileRow$Activated r1 = com.spotify.music.features.localfilesimport.view.LocalFileRow.Activated.PARTLY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.localfilesimport.view.LocalFileRow$Activated r1 = com.spotify.music.features.localfilesimport.view.LocalFileRow.Activated.FULLY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.localfilesimport.view.LocalFileRow.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Activated {
        INACTIVE,
        PARTLY,
        FULLY
    }

    public LocalFileRow(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.local_files_import_row, viewGroup, false));
    }

    public final void a(Activated activated) {
        int i = AnonymousClass1.a[activated.ordinal()];
        if (i == 1) {
            this.a.setBackgroundResource(R.drawable.selector);
        } else if (i != 2) {
            if (i == 3) {
                this.a.setBackgroundResource(R.drawable.selector_checked);
            }
        } else {
            this.a.setBackgroundResource(R.drawable.selector_partly_checked);
        }
    }
}
