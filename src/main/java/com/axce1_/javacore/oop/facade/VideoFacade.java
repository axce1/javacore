package com.axce1_.javacore.oop.facade;


public class VideoFacade {
    public void convertVideo(String fileName, String format) {
        System.out.println("Facade: conversion start");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCodec();
        } else {
            destinationCodec = new MPGE4Codec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
    }
}
