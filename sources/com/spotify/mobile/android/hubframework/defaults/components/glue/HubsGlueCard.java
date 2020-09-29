package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;

public enum HubsGlueCard implements gwl, hck {
    CATEGORY("glue:categoryCard") {
        public final int resolve(hcm hcm) {
            return Impl.a.mId;
        }
    },
    ENTITY("glue:entityCard") {
        public final int resolve(hcm hcm) {
            return NORMAL.resolve(hcm);
        }
    },
    NORMAL("glue:card") {
        public final int resolve(hcm hcm) {
            fbp.a(hcm);
            Impl impl = gzk.e(hcm) ? ((hcm.text().subtitle() == null || gzk.d(hcm)) && hcm.text().description() == null) ? Impl.d : Impl.e : hcm.text().title() != null ? Impl.c : Impl.b;
            return impl.mId;
        }
    };
    
    private final String mComponentId;

    enum Impl implements gxo {
        public static final Impl a = null;
        public static final Impl b = null;
        public static final Impl c = null;
        public static final Impl d = null;
        public static final Impl e = null;
        /* access modifiers changed from: private */
        public static final Impl[] f = null;
        private static final /* synthetic */ Impl[] g = null;
        final int mId;

        static {
            a = new Impl("CATEGORY", 0, R.id.hub_glue_card_category) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gyn(hubsGlueImageDelegate);
                }
            };
            b = new Impl("NO_TEXT", 1, R.id.hub_glue_card_no_text) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a(hubsGlueImageDelegate);
                }
            };
            c = new Impl("TITLE", 2, R.id.hub_glue_card_title) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate);
                }
            };
            d = new Impl("TITLE_METADATA", 3, R.id.hub_glue_card_title_metadata) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c(hubsGlueImageDelegate);
                }
            };
            e = new Impl("TITLE_SUBTITLE", 4, R.id.hub_glue_card_title_subtitle) {
                public final gxl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new d(hubsGlueImageDelegate);
                }
            };
            g = new Impl[]{a, b, c, d, e};
            f = values();
        }

        private Impl(String str, int i, int i2) {
            this.mId = i2;
        }

        /* synthetic */ Impl(String str, int i, int i2, byte b2) {
            this(str, i, i2);
        }

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) g.clone();
        }

        public final int a() {
            return this.mId;
        }
    }

    public static final class Settings {

        public enum TextLayout {
            public static final TextLayout a = null;
            public static final TextLayout b = null;
            private static TextLayout c;
            private static final /* synthetic */ TextLayout[] d = null;
            /* access modifiers changed from: private */
            public final hcj mAsBundle;
            public final com.spotify.android.glue.components.card.Card.TextLayout mImplementation;
            /* access modifiers changed from: private */
            public final String mValue;

            public static final class a {
                /* access modifiers changed from: private */
                public static final gce<TextLayout> a = null;

                static {
                    a = gce.a(TextLayout.class, $$Lambda$HubsGlueCard$Settings$TextLayout$a$PNLBA5B5oJzpr7klDC1KBGGTLlA.INSTANCE);
                }
            }

            static {
                a = new TextLayout("DEFAULT", 0, "default", com.spotify.android.glue.components.card.Card.TextLayout.DEFAULT);
                c = new TextLayout("DOUBLE_LINE_TITLE", 1, "doubleLineTitle", com.spotify.android.glue.components.card.Card.TextLayout.DOUBLE_LINE_TITLE);
                b = new TextLayout("DOUBLE_LINE_SUBTITLE", 2, "doubleLineSubtitle", com.spotify.android.glue.components.card.Card.TextLayout.DOUBLE_LINE_SUBTITLE);
                d = new TextLayout[]{a, c, b};
            }

            private TextLayout(String str, int i, String str2, com.spotify.android.glue.components.card.Card.TextLayout textLayout) {
                this.mValue = str2;
                this.mImplementation = textLayout;
                this.mAsBundle = HubsImmutableComponentBundle.builder().a("textLayout", this.mValue).a();
            }

            public static TextLayout valueOf(String str) {
                return (TextLayout) Enum.valueOf(TextLayout.class, str);
            }

            public static TextLayout[] values() {
                return (TextLayout[]) d.clone();
            }
        }
    }

    private HubsGlueCard(String str) {
        this.mComponentId = (String) fbp.a(str);
    }

    public static int a() {
        return Impl.e.mId;
    }

    public static gwk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.f);
    }

    public final String category() {
        return HubsComponentCategory.CARD.mId;
    }

    public final String id() {
        return this.mComponentId;
    }

    public final String toString() {
        return id();
    }
}
