package com.spotify.mobile.android.spotlets.eventshub.concertentity;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;

public final class TicketInfoViewHolder {
    public final Context a;
    public TextView b;
    public TextView c;
    public LinearLayout d;
    public final boolean e;

    public enum Partner {
        TICKETMASTER("ticketmaster", "Ticketmaster", Type.b),
        SONGKICK("songkick", "Songkick", Type.a),
        AXS("axs", "AXS", Type.a),
        UNKNOWN("", "", Type.c);
        
        private static final Partner[] e = null;
        /* access modifiers changed from: private */
        public final String mName;
        private final String mPartnerId;
        /* access modifiers changed from: private */
        public final Type mType;

        public enum Type {
            public static final Type a = null;
            public static final Type b = null;
            public static final Type c = null;
            private static final /* synthetic */ Type[] d = null;

            static {
                a = new Type("AGGREGATOR", 0);
                b = new Type("VENDOR", 1);
                c = new Type("UNKNOWN", 2);
                d = new Type[]{a, b, c};
            }

            private Type(String str, int i) {
            }

            public static Type valueOf(String str) {
                Class<Type> cls = Type.class;
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) d.clone();
            }
        }

        static {
            e = values();
        }

        private Partner(String str, String str2, Type type) {
            this.mPartnerId = str;
            this.mName = str2;
            this.mType = type;
        }

        public static Partner a(String str) {
            Partner[] partnerArr;
            for (Partner partner : e) {
                if (partner.mPartnerId.equals(str)) {
                    return partner;
                }
            }
            return UNKNOWN;
        }
    }

    public TicketInfoViewHolder(Context context, boolean z) {
        this.a = context;
        this.e = z;
        boolean z2 = this.e;
        Context context2 = this.a;
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setGravity(1);
        if (z2) {
            linearLayout.setOrientation(1);
        } else {
            linearLayout.setOrientation(0);
        }
        int dimension = (int) context2.getResources().getDimension(R.dimen.concert_entity_subtitle_text_bottom_margin);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, dimension);
        linearLayout.setLayoutParams(layoutParams);
        this.d = linearLayout;
    }
}
