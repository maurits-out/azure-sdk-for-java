// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for output. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata\\.type",
    defaultImpl = Format.class)
@JsonTypeName("Format")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.ImageFormat", value = ImageFormat.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.MultiBitrateFormat", value = MultiBitrateFormat.class)
})
@JsonFlatten
@Fluent
public class Format {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Format.class);

    /*
     * The pattern of the file names for the generated output files. The
     * following macros are supported in the file name: {Basename} - An
     * expansion macro that will use the name of the input video file. If the
     * base name(the file suffix is not included) of the input video file is
     * less than 32 characters long, the base name of input video files will be
     * used. If the length of base name of the input video file exceeds 32
     * characters, the base name is truncated to the first 32 characters in
     * total length. {Extension} - The appropriate extension for this format.
     * {Label} - The label assigned to the codec/layer. {Index} - A unique
     * index for thumbnails. Only applicable to thumbnails. {Bitrate} - The
     * audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of
     * the audio/video codec. {Resolution} - The video resolution. Any
     * unsubstituted macros will be collapsed and removed from the filename.
     */
    @JsonProperty(value = "filenamePattern", required = true)
    private String filenamePattern;

    /**
     * Get the filenamePattern property: The pattern of the file names for the generated output files. The following
     * macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video
     * file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long,
     * the base name of input video files will be used. If the length of base name of the input video file exceeds 32
     * characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate
     * extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for
     * thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails.
     * {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will
     * be collapsed and removed from the filename.
     *
     * @return the filenamePattern value.
     */
    public String filenamePattern() {
        return this.filenamePattern;
    }

    /**
     * Set the filenamePattern property: The pattern of the file names for the generated output files. The following
     * macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video
     * file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long,
     * the base name of input video files will be used. If the length of base name of the input video file exceeds 32
     * characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate
     * extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for
     * thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails.
     * {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will
     * be collapsed and removed from the filename.
     *
     * @param filenamePattern the filenamePattern value to set.
     * @return the Format object itself.
     */
    public Format withFilenamePattern(String filenamePattern) {
        this.filenamePattern = filenamePattern;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filenamePattern() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property filenamePattern in model Format"));
        }
    }
}