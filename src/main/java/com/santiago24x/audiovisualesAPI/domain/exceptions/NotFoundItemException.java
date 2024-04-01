package com.santiago24x.audiovisualesAPI.domain.exceptions;

/**
 * Custom exception class for when an item is not found.
 */
public class NotFoundItemException extends RuntimeException {

    public NotFoundItemException(String message){
        super(message);
    }
}
