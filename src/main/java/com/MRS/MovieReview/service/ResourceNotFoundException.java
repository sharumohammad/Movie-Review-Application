package com.MRS.MovieReview.service;

 // Adjust the package according to your structure

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}

