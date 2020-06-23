package com.axce1_.javacore.oop.facade;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if(type.equals("mp4")) {
            System.out.println("extarcting mpeg....");
            return new MPGE4Codec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCodec();
        }
    }
}
