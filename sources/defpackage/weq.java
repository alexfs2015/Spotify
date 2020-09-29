package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.voice.api.model.AsrResponse;
import io.reactivex.Flowable;

/* renamed from: weq reason: default package */
public abstract class weq {

    /* renamed from: weq$a */
    public static final class a extends weq {
        public final AsrResponse a;

        a(AsrResponse asrResponse) {
            this.a = (AsrResponse) gec.a(asrResponse);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5) {
            return gee4.apply(this);
        }

        public final void a(ged<c> ged, ged<d> ged2, ged<b> ged3, ged<a> ged4, ged<e> ged5) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsrFinalResponse{response=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: weq$b */
    public static final class b extends weq {
        public final AsrResponse a;

        b(AsrResponse asrResponse) {
            this.a = (AsrResponse) gec.a(asrResponse);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5) {
            return gee3.apply(this);
        }

        public final void a(ged<c> ged, ged<d> ged2, ged<b> ged3, ged<a> ged4, ged<e> ged5) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsrIntermediateResponse{response=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: weq$c */
    public static final class c extends weq {
        public final String a;

        c(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5) {
            return gee.apply(this);
        }

        public final void a(ged<c> ged, ged<d> ged2, ged<b> ged3, ged<a> ged4, ged<e> ged5) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Initializing{sessionId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: weq$d */
    public static final class d extends weq {
        public final Flowable<Float> a;

        d(Flowable<Float> flowable) {
            this.a = (Flowable) gec.a(flowable);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5) {
            return gee2.apply(this);
        }

        public final void a(ged<c> ged, ged<d> ged2, ged<b> ged3, ged<a> ged4, ged<e> ged5) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Listening{audioPeaks=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: weq$e */
    public static final class e extends weq {
        public final JsonNode a;

        e(JsonNode jsonNode) {
            this.a = (JsonNode) gec.a(jsonNode);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5) {
            return gee5.apply(this);
        }

        public final void a(ged<c> ged, ged<d> ged2, ged<b> ged3, ged<a> ged4, ged<e> ged5) {
            ged5.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NluResponse{response=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    weq() {
    }

    public static weq a(JsonNode jsonNode) {
        return new e(jsonNode);
    }

    public static weq a(AsrResponse asrResponse) {
        return new b(asrResponse);
    }

    public static weq a(Flowable<Float> flowable) {
        return new d(flowable);
    }

    public static weq a(String str) {
        return new c(str);
    }

    public static weq b(AsrResponse asrResponse) {
        return new a(asrResponse);
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<d, R_> gee2, gee<b, R_> gee3, gee<a, R_> gee4, gee<e, R_> gee5);

    public abstract void a(ged<c> ged, ged<d> ged2, ged<b> ged3, ged<a> ged4, ged<e> ged5);

    public final boolean a() {
        return this instanceof a;
    }

    public final boolean b() {
        return this instanceof e;
    }
}
