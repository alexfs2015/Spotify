package defpackage;

/* renamed from: knx reason: default package */
public abstract class knx {

    /* renamed from: knx$a */
    public static final class a extends knx {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "MicrophoneOff{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: knx$b */
    public static final class b extends knx {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "MicrophoneOn{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: knx$c */
    public static final class c extends knx {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "VoiceoverOn{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    knx() {
    }
}
