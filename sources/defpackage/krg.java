package defpackage;

/* renamed from: krg reason: default package */
public abstract class krg {

    /* renamed from: krg$a */
    public static final class a extends krg {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "MicrophoneOff{}";
        }
    }

    /* renamed from: krg$b */
    public static final class b extends krg {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "MicrophoneOn{}";
        }
    }

    /* renamed from: krg$c */
    public static final class c extends krg {
        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "VoiceoverOn{}";
        }
    }

    krg() {
    }
}
