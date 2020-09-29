package defpackage;

import com.google.common.base.Optional;
import com.spotify.voice.api.qualifiers.VoiceConsumer;
import io.reactivex.Single;

/* renamed from: wek reason: default package */
public final class wek extends wep {
    private final wen a;
    private final VoiceConsumer b;
    private final Optional<String> c;
    private final Single<Boolean> d;
    private final Optional<String> e;

    public wek(wen wen, VoiceConsumer voiceConsumer, Optional<String> optional, Single<Boolean> single, Optional<String> optional2) {
        if (wen != null) {
            this.a = wen;
            if (voiceConsumer != null) {
                this.b = voiceConsumer;
                if (optional != null) {
                    this.c = optional;
                    if (single != null) {
                        this.d = single;
                        if (optional2 != null) {
                            this.e = optional2;
                            return;
                        }
                        throw new NullPointerException("Null speechLocale");
                    }
                    throw new NullPointerException("Null nftDisabled");
                }
                throw new NullPointerException("Null asrBackend");
            }
            throw new NullPointerException("Null consumer");
        }
        throw new NullPointerException("Null backend");
    }

    public final wen a() {
        return this.a;
    }

    public final VoiceConsumer b() {
        return this.b;
    }

    public final Optional<String> c() {
        return this.c;
    }

    public final Single<Boolean> d() {
        return this.d;
    }

    public final Optional<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wep) {
            wep wep = (wep) obj;
            return this.a.equals(wep.a()) && this.b.equals(wep.b()) && this.c.equals(wep.c()) && this.d.equals(wep.d()) && this.e.equals(wep.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceConfiguration{backend=");
        sb.append(this.a);
        sb.append(", consumer=");
        sb.append(this.b);
        sb.append(", asrBackend=");
        sb.append(this.c);
        sb.append(", nftDisabled=");
        sb.append(this.d);
        sb.append(", speechLocale=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
