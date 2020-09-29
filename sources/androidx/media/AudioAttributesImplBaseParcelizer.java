package androidx.media;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(rx rxVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = rxVar.b(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = rxVar.b(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = rxVar.b(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = rxVar.b(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, rx rxVar) {
        rxVar.a(audioAttributesImplBase.a, 1);
        rxVar.a(audioAttributesImplBase.b, 2);
        rxVar.a(audioAttributesImplBase.c, 3);
        rxVar.a(audioAttributesImplBase.d, 4);
    }
}
