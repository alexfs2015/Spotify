package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.R;

public enum HubsGlue2Row implements gwl, hck {
    CALENDAR_ROW("glue2:calendarRow") {
        public final int resolve(hcm hcm) {
            fbp.a(hcm);
            return hcm.text().title() != null && hcm.text().subtitle() != null ? e : c;
        }
    },
    IMAGE_ROW("glue2:imageRow") {
        public final int resolve(hcm hcm) {
            fbp.a(hcm);
            return hcm.text().title() != null && hcm.text().subtitle() != null ? f : d;
        }
    },
    MULTILINE("glue2:text") {
        public final int resolve(hcm hcm) {
            return b;
        }
    },
    VIDEO("glue2:videoRow") {
        public final int resolve(hcm hcm) {
            return g;
        }
    };
    
    public static final int b = 0;
    public static final int c = 0;
    public static final int d = 0;
    public static final int e = 0;
    public static final int f = 0;
    public static final int g = 0;
    private final String mComponentId;

    public static class a implements gwk {
        private SparseArray<gwi<?>> a;

        public a(hab hab, defpackage.gzo.a aVar, defpackage.gzy.a aVar2, b bVar, b bVar2, haj haj) {
            this.a = new SparseArray<>();
            this.a.append(HubsGlue2Row.b, hab);
            this.a.append(HubsGlue2Row.c, aVar);
            this.a.append(HubsGlue2Row.d, aVar2);
            this.a.append(HubsGlue2Row.e, bVar);
            this.a.append(HubsGlue2Row.f, bVar2);
            this.a.append(HubsGlue2Row.g, haj);
        }

        public final gwi<?> getBinder(int i) {
            return (gwi) this.a.get(i);
        }
    }

    static {
        b = R.id.hub_glue2_row_multiline;
        c = R.id.hub_glue2_row_single_line_calendar;
        d = R.id.hub_glue2_row_single_line_image;
        e = R.id.hub_glue2_row_two_line_calendar;
        f = R.id.hub_glue2_row_two_line_image;
        g = R.id.hub_glue2_video_row;
    }

    private HubsGlue2Row(String str) {
        this.mComponentId = (String) fbp.a(str);
    }

    public final String category() {
        return HubsComponentCategory.ROW.mId;
    }

    public final String id() {
        return this.mComponentId;
    }

    public final String toString() {
        return id();
    }
}
