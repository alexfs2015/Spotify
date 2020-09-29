package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.voice.model.AsrResponse;
import io.reactivex.Flowable;

/* renamed from: vri reason: default package */
public abstract class vri {

    /* renamed from: vri$a */
    public static final class a extends vri {
        public final AsrResponse a;

        a(AsrResponse asrResponse) {
            this.a = (AsrResponse) gcr.a(asrResponse);
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

        public final void a(gcs<c> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<e> gcs5) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5) {
            return gct4.apply(this);
        }
    }

    /* renamed from: vri$b */
    public static final class b extends vri {
        public final AsrResponse a;

        b(AsrResponse asrResponse) {
            this.a = (AsrResponse) gcr.a(asrResponse);
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

        public final void a(gcs<c> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<e> gcs5) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5) {
            return gct3.apply(this);
        }
    }

    /* renamed from: vri$c */
    public static final class c extends vri {
        public final String a;

        c(String str) {
            this.a = (String) gcr.a(str);
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

        public final void a(gcs<c> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<e> gcs5) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5) {
            return gct.apply(this);
        }
    }

    /* renamed from: vri$d */
    public static final class d extends vri {
        public final Flowable<Float> a;

        d(Flowable<Float> flowable) {
            this.a = (Flowable) gcr.a(flowable);
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

        public final void a(gcs<c> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<e> gcs5) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5) {
            return gct2.apply(this);
        }
    }

    /* renamed from: vri$e */
    public static final class e extends vri {
        public final JsonNode a;

        e(JsonNode jsonNode) {
            this.a = (JsonNode) gcr.a(jsonNode);
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

        public final void a(gcs<c> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<e> gcs5) {
            gcs5.accept(this);
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5) {
            return gct5.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<d, R_> gct2, gct<b, R_> gct3, gct<a, R_> gct4, gct<e, R_> gct5);

    public abstract void a(gcs<c> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<a> gcs4, gcs<e> gcs5);

    vri() {
    }

    public static vri a(String str) {
        return new c(str);
    }

    public static vri a(Flowable<Float> flowable) {
        return new d(flowable);
    }

    public static vri a(AsrResponse asrResponse) {
        return new b(asrResponse);
    }

    public static vri b(AsrResponse asrResponse) {
        return new a(asrResponse);
    }

    public static vri a(JsonNode jsonNode) {
        return new e(jsonNode);
    }

    public final boolean a() {
        return this instanceof a;
    }

    public final boolean b() {
        return this instanceof e;
    }
}
